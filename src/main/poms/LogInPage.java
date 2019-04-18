package poms;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.BasePage;

public class LogInPage extends BasePage {
  public LogInPage() {
    super();
  }

  @FindBy(css = "[name='UserName']")
  private WebElement loginInput;

  @FindBy(css = "[name='Password']")
  private WebElement passwordInput;

  @FindBy(css = "[type='submit']")
  private WebElement submitBtn;

  public void logIn(String login, String password) {
    loginInput.sendKeys(login);
    passwordInput.sendKeys(password);
    submitBtn.click();
  }
}