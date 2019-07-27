package Runner;

import cucumber.api.CucumberOptions;
import cucumber.runtime.StepDefinition;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
        @CucumberOptions(
                features="C:/Users/chanyama/IdeaProjects/comlearningCucumberBDD/src/main/java/Features",
                glue = {"C:/Users/chanyama/IdeaProjects/comlearningCucumberBDD/src/main/java/stepDefinitions"}
                       )


public class TestRunner {

}
