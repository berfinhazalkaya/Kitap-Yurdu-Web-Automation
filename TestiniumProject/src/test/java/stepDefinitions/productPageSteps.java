package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.productPage;
import util.DriverFactory;

public class productPageSteps {

pages.productPage productPage = new productPage(DriverFactory.getDriver());

    @Then("check product page")
    public void checkProductPage() {
        productPage.checkProductPage();
    }

    @When("click random product")
    public void clickRandomProduct() { productPage.clickRandomProduct(); }
}
