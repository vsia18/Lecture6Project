package AutomationFinalProject.testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty"},
        features = {"/Users/veronikaivanova/IdeaProjects/Lecture6Project/src/test/resources/features"},
        glue = {"AutomationFinalProject.stepDefinitions"},
        tags = "@WIP4")
public class OneALvTestRunner {
}
