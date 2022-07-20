package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import util.ConfigReader;
import util.ElementHelper;
import java.util.Properties;

public class homePage {

    By searchBox = By.cssSelector("#search-input");
    By enterButton = By.cssSelector(".common-sprite.button-search");

    WebDriver driver;
    WebDriverWait wait;
    Properties properties;
    ElementHelper elementHelper;

    public homePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
        this.elementHelper = new ElementHelper(driver);
    }

    public void goToUrl() {
        properties = ConfigReader.getProperties();
        String url = properties.getProperty("url");
        driver.get(url);
    }

    public void checkHomePageTitle(String homePageTitle) {
        Assert.assertTrue(driver.getTitle().contains("Kitap"));
        System.out.println("Home Page Title is : " + driver.getTitle());
    }

    public void writeRoman(String roman) {
        elementHelper.sendKey(searchBox,roman);
    }

    public void clickEnterButton() { elementHelper.click(enterButton,10);
    }
}
