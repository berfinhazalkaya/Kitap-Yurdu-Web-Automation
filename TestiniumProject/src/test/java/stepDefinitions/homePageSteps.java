package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.homePage;
import util.DriverFactory;

public class homePageSteps {

pages.homePage homePage = new homePage(DriverFactory.getDriver());

    @Given("go to url")
    public void goToUrl() { homePage.goToUrl(); }

    @Then("check {string} title")
    public void checkTitle(String homePageTitle) { homePage.checkHomePageTitle(homePageTitle); }

    @When("write {string} in search box")
    public void writeInSearchBox(String roman) { homePage.writeRoman(roman); }

    @When("click enter button")
    public void clickEnterButton() { homePage.clickEnterButton(); }
}
