package Runners;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(

        features = "src/main/resources/features/",
        glue = "StepDefinition",
        tags = "@automate",
        plugin = {"pretty",
                "html:target/cucumber-reports/cucumber-pretty-testing.html",
                "json:target/cucumber-reports/cucumber-pretty-testing.json",
                "rerun:target/cucumber-reports/rerun.txt"

        }
)
public class TestRunner {
//Empty class
}
