package java1;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utils.BasePage;

import java.util.concurrent.TimeUnit;

import static utils.WebDriverProvider.closeDriver;
import static utils.WebDriverProvider.getDriver;


public class BaseTest extends BasePage {

  @Before
  public void beforeTest() {
    getDriver().manage()
            .window()
            .maximize();
    getDriver().manage()
            .timeouts()
            .implicitlyWait(IMPLICITLY_WAIT_TIME, TimeUnit.SECONDS);
    getDriver().manage()
            .timeouts()
            .pageLoadTimeout(PAGE_LOAD_TIME, TimeUnit.SECONDS);
  }

  @After
  public void afterTest(Scenario scenario) throws InterruptedException {
    if (scenario.isFailed()) {
      scenario.embed(((TakesScreenshot) getDriver()).getScreenshotAs(OutputType.BYTES), "image/png");
    }
    Thread.sleep(2000);
    closeDriver();
  }
}
