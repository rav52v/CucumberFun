package test.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/features"},
        glue = {"test.steps/", "test.java/"},
        plugin = {"pretty"},
        tags = {"@test"}
)

public class MainTestRunner {


}