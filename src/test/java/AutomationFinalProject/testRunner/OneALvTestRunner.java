package AutomationFinalProject.testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty"},
        features = {"src/test/java/AutomationFinalProject/Website1ALv.feature"},
        glue = {"AutomationFinalProject.stepDefinitions"},
        tags = "@SmokeTests")
public class OneALvTestRunner {
}
