package steps;

import cucumber.api.java.en.Given;

import static utils.WebDriverProvider.getDriver;


public class BrowserSteps {
  @Given("^Open (.+) page$")
  public void getUrl(String url) {
    getDriver().get(url);
    System.out.println("Open link: " + url);
  }
}
