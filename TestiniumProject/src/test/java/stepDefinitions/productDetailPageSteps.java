package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.productDetailPage;
import util.DriverFactory;

public class productDetailPageSteps {

pages.productDetailPage productDetailPage = new productDetailPage(DriverFactory.getDriver());

    @Then("check product detail page")
    public void checkProductDetailPage() { productDetailPage.checkProductDetailPage(); }

    @When("click add to shopping cart button")
    public void clickAddToShoppingCartButton() { productDetailPage.clickAddToCart(); }

    @Then("check value in cart icon")
    public void checkValueInCartIcon() { productDetailPage.checkValueInCartIcon(); }

    @When("click my shopping cart button")
    public void clickMyShoppingCartButton() {
        productDetailPage.clickMyShoppingCartButton();
    }

    @When("click go to cart button")
    public void clickGoToCartButton() {
        productDetailPage.clickGoToCartButton();
    }
}
