package cucumberTest;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import io.appium.java_client.android.AndroidDriver;
import org.junit.runner.RunWith;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.ITestContext;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import page.Constants;
import page.InstanceDriver;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by buddyarifin on 1/31/17.
 */

@CucumberOptions(
        monochrome = true,
        features = "src/test/java/features",
        plugin = {"pretty", "html:target/cucumber-html-report"}
)
public class CukesRunnerTest extends AbstractTestNGCucumberTests {
    public AndroidDriver driver;

    private void prepareAndroidForAppium(String udid) throws MalformedURLException, Exception {
        File appDir = new File(Constants.apkDir);
        File app = new File(appDir, Constants.APP_NAME);
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("device", Constants.DEVICE);

        capabilities.setCapability("appPackage", Constants.APP_PACKAGE);
        capabilities.setCapability("appActivity", Constants.APP_ACTIVITY);

        capabilities.setCapability("deviceName", Constants.DEVICE_NAME);
        capabilities.setCapability("platformName", Constants.PLATFORM_NAME);
        capabilities.setCapability("newCommandTimeout", Constants.NEW_COMMAND_TIMEOUT);
        //capabilities.setCapability("udid", udid);

        //No Reset Apps
        capabilities.setCapability("noReset", Constants.IS_NO_RESET);
        capabilities.setCapability("fullReset", Constants.IS_FULL_RESET);

        //No Keyboard Layout
        capabilities.setCapability("unicodeKeyboard", Constants.IS_UNIKODE_KEYBOARD_ENABLED);

        //other caps
        capabilities.setCapability("app", app.getAbsolutePath());
        driver =  new AndroidDriver(new URL(Constants.hubIP), capabilities);
        System.out.println("SESSION CREATED : "+ driver.getSessionId().toString() + " " + udid + " ");
    }

    @Parameters({"udid"})
    @BeforeClass(alwaysRun = true)
    public void setUp(@Optional String udid, ITestContext ctx) throws Exception{
        System.out.println("Setup");
        prepareAndroidForAppium(udid);
        ctx.setAttribute("WebDriver", this.driver);
    }

    @AfterClass(alwaysRun = true)
    public void tearDown() throws Exception {
        System.out.println("Teardown");
        driver.quit();
    }
}
