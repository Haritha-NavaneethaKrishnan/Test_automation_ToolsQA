package Pages.Widgets;

import Pages.TestBase;
import io.cucumber.java.bs.A;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MenuPage extends TestBase {
    private WebDriver driver;
    private WebDriverWait wait;
    public MenuPage(WebDriver driver, WebDriverWait wait)
    {
        super(driver);
        this.driver = driver;
        this.wait = wait;
    }

    @FindBy(xpath = "//li[@id='item-7']//span[@class='text' and contains(text(),'Menu')]")
    WebElement MenuOpn;

    @FindBy(xpath = "//a[contains(text(),'Main Item 2')]")
    WebElement menu;

    @FindBy(xpath = "//div[contains(text(),'Menu')]")
    WebElement menuHeader;
    public void MenuPage()
    {
        scrollIntoView(MenuOpn,driver);
        wait.until(ExpectedConditions.elementToBeClickable(MenuOpn));
        MenuOpn.click();
        Assert.assertTrue(menuHeader.isDisplayed());
    }

    public static void scrollIntoView(WebElement element, WebDriver driver)
    {
        JavascriptExecutor js = ((JavascriptExecutor)driver);
        js.executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public void hoverOverMenu()
    {
        Actions actions = new Actions(driver);

        actions.moveToElement(menu).build().perform();

    }

    public void menuValidate()
    {
       Assert.assertTrue(menu.isDisplayed());

        driver.navigate().to("https://demoqa.com/");
    }
}
