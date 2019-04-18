package steps;


import cucumber.api.java.en.When;
import poms.LogInPage;


public class InputSteps {

  private LogInPage loginPage = new LogInPage();


  @When("^User sign in using login: (.+) and password: (.+)")
  public void signIn(String login, String password) {
    loginPage.logIn(login, password);
  }
}

