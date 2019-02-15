package main.poms;

import main.utils.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends BasePage {
    public MyAccountPage() {
        super();
    }

    @FindBy (xpath = "//*[@id='details']/table/tbody/tr[7]/td/input")
    private WebElement logoutBtn;


    public void logout(){
        logoutBtn.click();
    }

    public WebElement returnBtn() {
        return logoutBtn;
    }
}