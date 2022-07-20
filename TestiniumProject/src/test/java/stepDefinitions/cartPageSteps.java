package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.cartPage;
import util.DriverFactory;

public class cartPageSteps {

pages.cartPage cartPage = new cartPage(DriverFactory.getDriver());

    @Then("check my shopping cart title")
    public void checkMyShoppingCartTitle() { cartPage.checkMyShoppingCartTitle(); }

    @When("delete number of products")
    public void deleteNumberOfProducts() { cartPage.deleteNumberOfProducts(); }

    @When("write {string} in value field")
    public void writeInValueField(String number) {
        cartPage.writeInValueField(number);
    }

    @When("click refresh button")
    public void clickRefreshButton() {
        cartPage.clickRefreshButton();
    }

    @Then("check the message is displayed")
    public void checkTheMessageIsDisplayed() { cartPage.checkTheMessageIsDisplayed(); }

    @When("click message cross button")
    public void clickMessageCrossButton() { cartPage.clickMessageCrossButton(); }

    @When("click check box button")
    public void clickCheckBoxButton() { cartPage.clickCheckBoxButton(); }

    @When("click cross button")
    public void clickCrossButton() {
        cartPage.clickCrossButton();
    }

    @Then("check the cart is empty")
    public void checkTheCartIsEmpty() {
        cartPage.checkTheCartIsEmpty();
    }


}
