package test.steps;

import cucumber.api.java.en.When;
import main.poms.GoogleTranslatePage;

public class ClickSteps {

    private GoogleTranslatePage googlePage;

    public ClickSteps() {
        googlePage = new GoogleTranslatePage();
    }

    @When("^Click field (.+)")
    public void clickFieldXxx(String fieldName) {
        googlePage.textInput.sendKeys("aaaaa");
    }
}
