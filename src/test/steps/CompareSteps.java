package test.steps;

import cucumber.api.java.en.Then;
import main.poms.MyAccountPage;
import org.junit.jupiter.api.Assertions;


public class CompareSteps {
    private MyAccountPage myAccPage = new MyAccountPage();

    @Then("^Check if something$")
    public void checkIfSomething() {
      Assertions.assertTrue(myAccPage.returnBtn().isDisplayed());
    }
}
