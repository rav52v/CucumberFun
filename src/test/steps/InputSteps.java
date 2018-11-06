package test.steps;

import cucumber.api.Scenario;
import cucumber.api.java.en.When;
import main.poms.LogInPage;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import static main.utils.WebDriverProvider.getDriver;

public class InputSteps {

    private LogInPage loginPage = new LogInPage();


    @When("^User sign in using login: (.+) and password: (.+)")
    public void signIn(String login, String password) {
        loginPage.logIn(login, password);
        Scenario scenario;
        scenario.embed(((TakesScreenshot)getDriver()).getScreenshotAs(OutputType.BYTES), "image/png");
    }
}
