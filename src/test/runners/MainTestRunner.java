package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/features"},
        glue = {"steps/", "java1/"},
        plugin = {"html:target/cukes", "json:target/cucumber-template-report.json", "junit:target/cucumber-template-report.xml", "pretty"},
        tags = {"@test," +
                "@test1," +
                "@test2," +
                "@test3"}
)

public class MainTestRunner {
}