package cucumberTest;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import net.lightbody.bmp.BrowserMobProxyServer;
import net.lightbody.bmp.client.ClientUtil;
import net.lightbody.bmp.core.har.Har;
import net.lightbody.bmp.proxy.CaptureType;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.io.IOException;
import java.net.Inet4Address;
import java.net.UnknownHostException;
import java.util.concurrent.TimeUnit;

/**
 * Created by buddyarifin on 1/31/17.
 */
public class BaseAcceptanceTest {

    protected static WebDriver driver;
    protected BrowserMobProxyServer proxy;

    @Before
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/mac/chromedriver");

        proxy = new BrowserMobProxyServer();
        proxy.start(9090);

        Proxy seleniumProxy = ClientUtil.createSeleniumProxy(proxy);
        try {
            String hostIp = Inet4Address.getLocalHost().getHostAddress();
            seleniumProxy.setHttpProxy(hostIp + ":" + proxy.getPort());
            seleniumProxy.setSslProxy(hostIp + ":" + proxy.getPort());
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }

        DesiredCapabilities seleniumCapabilities = new DesiredCapabilities();
        seleniumCapabilities.setCapability(CapabilityType.PROXY, seleniumProxy);
        ChromeOptions options = new ChromeOptions();
        options.merge(seleniumCapabilities);

        // enable more detailed HAR capture, if desired (see CaptureType for the complete list)
        proxy.enableHarCaptureTypes(CaptureType.REQUEST_CONTENT, CaptureType.RESPONSE_CONTENT);
        proxy.newHar("buddyGanteng");

        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();


    }

    @After
    public void teardown() throws IOException {
        Har har = proxy.getHar();

        File filehar = new File("/Users/buddyarifin/test.har");
        har.writeTo(filehar);

        driver.quit();
        proxy.stop();
    }
}
