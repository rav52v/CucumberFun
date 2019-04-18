package steps;

import cucumber.api.java.en.Then;
import org.junit.jupiter.api.Assertions;
import poms.MyAccountPage;


public class CompareSteps {
  private MyAccountPage myAccPage = new MyAccountPage();

  @Then("^Check if something$")
  public void checkIfSomething() {
    Assertions.assertTrue(myAccPage.returnBtn().isDisplayed());
  }
}
