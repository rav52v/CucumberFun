package test.steps;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import main.poms.LogInPage;

import java.util.List;

public class InputSteps {

    private LogInPage loginPage = new LogInPage();


    @When("^User sign in using login: (.+) and password: (.+)")
    public void signIn(String login, String password) {
        loginPage.logIn(login, password);
    }
}

