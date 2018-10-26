package test.java;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import main.utils.BasePage;

import java.util.concurrent.TimeUnit;

import static main.utils.WebDriverProvider.*;

public class BaseTest extends BasePage {

    @Before
    public void beforeTest(){
        getDriver().manage()
                .window()
                .maximize();
        getDriver().get(LINK_ADDRESS);
        getDriver().manage()
                .timeouts()
                .implicitlyWait(IMPLICITLY_WAIT_TIME, TimeUnit.SECONDS);
        getDriver().manage()
                .timeouts()
                .pageLoadTimeout(PAGE_LOAD_TIME, TimeUnit.SECONDS);
    }

    @After
    public void afterTest() throws InterruptedException {
        Thread.sleep(3000);
        closeDriver();
    }
}
