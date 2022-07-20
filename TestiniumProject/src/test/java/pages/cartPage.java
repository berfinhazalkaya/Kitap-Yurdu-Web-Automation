package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.ElementHelper;

public class cartPage {
    By shoppingCartTitle = By.cssSelector("div[id='cart_module'] h1");
    By valueField = By.cssSelector("input[value='1']");
    By refreshButton = By.cssSelector("i[title='Güncelle']");
    By message = By.cssSelector("#swal2-title");
    By messageCrossButton = By.cssSelector("button[aria-label='Close this dialog']");
    By checkBox = By.cssSelector("#select-all-cart");
    By crossButton = By.cssSelector("i[title='Kaldır']");
    By shoppingCartButton = By.cssSelector("h4[class='common-sprite']");
    By emptyShoppingCartMessage = By.cssSelector(".empty");

    WebDriver driver;
    WebDriverWait wait;
    ElementHelper elementHelper;

    public cartPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
        this.elementHelper = new ElementHelper(driver);
    }

    public void checkMyShoppingCartTitle() {
        elementHelper.checkElementVisible(shoppingCartTitle);
    }

    public void deleteNumberOfProducts() {
        elementHelper.waitBySeconds(2);
        WebElement webElement = driver.findElement(By.cssSelector("input[value='1']"));
        webElement.sendKeys(Keys.chord(Keys.CONTROL, "a"), Keys.DELETE);
        elementHelper.waitBySeconds(2);
    }

    public void writeInValueField(String number) {
        elementHelper.sendKey(valueField, number);
        elementHelper.waitBySeconds(2);
    }

    public void clickRefreshButton() {
        elementHelper.click(refreshButton,7);
        elementHelper.waitBySeconds(3);
    }

    public void checkTheMessageIsDisplayed() {
        elementHelper.checkElementVisible(message);
    }

    public void clickMessageCrossButton() { elementHelper.click(messageCrossButton,5); }

    public void clickCheckBoxButton() {elementHelper.click(checkBox,5); }

    public void clickCrossButton() {
        elementHelper.click(crossButton,7);
    }

    public void checkTheCartIsEmpty() {
        elementHelper.click(shoppingCartButton,5);
        String text = wait.until(ExpectedConditions.visibilityOf(driver.findElement(emptyShoppingCartMessage))).getText();
        System.out.println(text);
    }
}
