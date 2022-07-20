package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.ElementHelper;

public class productDetailPage {

    By productImage = By.cssSelector("#js-book-cover");
    By addToCartButton = By.cssSelector("a[id='button-cart'] span");
    By valueInCartIcon = By.xpath("//span[@id='cart-items']");
    By myShoppingCartButton = By.cssSelector("h4[class='common-sprite']");
    By goToCartButton = By.cssSelector("#js-cart");


    WebDriver driver;
    WebDriverWait wait;
    ElementHelper elementHelper;

    public productDetailPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
        this.elementHelper = new ElementHelper(driver);
    }

    public void checkProductDetailPage() { elementHelper.checkElementVisible(productImage);
    }

    public void clickAddToCart() {
        elementHelper.click(addToCartButton,3);
    }

    public void checkValueInCartIcon() {
        elementHelper.checkElementVisible(valueInCartIcon);
    }

    public void clickMyShoppingCartButton() {
        elementHelper.click(myShoppingCartButton,10);
    }

    public void clickGoToCartButton() {
        elementHelper.click(goToCartButton,10);
    }
}
