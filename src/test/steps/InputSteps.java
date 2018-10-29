package test.steps;

import cucumber.api.java.en.When;
import main.poms.LogInPage;

public class InputSteps {

    private LogInPage a = new LogInPage();


    @When("^User sign in using login: (.+) and password: (.+)")
    public void signIn(String login, String password) {
        a.logIn(login, password);
    }
}
