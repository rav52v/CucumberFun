package main.poms;

import main.utils.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GoogleTranslatePage extends BasePage {
    public GoogleTranslatePage() {
        super();
    }

    @FindBy (id = "source")
    public WebElement textInput;
}
