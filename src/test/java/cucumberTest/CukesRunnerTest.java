package cucumberTest;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.junit.runner.RunWith;

/**
 * Created by buddyarifin on 1/31/17.
 */



@RunWith(Cucumber.class)
@CucumberOptions(
        monochrome = true,
        features = "src/test/java/features",
        plugin = {"pretty", "html:target/cucumber-html-report"}
)
public class CukesRunnerTest extends AbstractTestNGCucumberTests {
}
