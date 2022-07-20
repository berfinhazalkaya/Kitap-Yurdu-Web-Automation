package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.ElementHelper;


public class productPage {

    By searchHeadingTitle = By.cssSelector("div[class='search-heading-cr'] span:nth-child(1)");

    WebDriver driver;
    WebDriverWait wait;
    ElementHelper elementHelper;

    public productPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
        this.elementHelper = new ElementHelper(driver);
    }

    public void checkProductPage() {
        elementHelper.checkElementVisible(searchHeadingTitle);
    }

    public void clickRandomProduct() {
        elementHelper.selectRandomProduct(By.cssSelector(".name > a"));
        elementHelper.waitBySeconds(2);
    }
}
