package Pages.Widgets;

import Pages.TestBase;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class WidgetsHome extends TestBase {
    private WebDriver driver;
    private WebDriverWait wait;
    public WidgetsHome(WebDriver driver, WebDriverWait wait)
    {
        super(driver);
        this.driver = driver;
        this.wait = wait;
    }

    @FindBy(xpath = "//div[@class='card-body']//h5[contains(text(),'Widgets')]")
    WebElement widgetsCard;

    @FindBy(xpath = "//div[contains(text(),'Widgets')]")
    WebElement widgetsHeader;
    public void verifyToolsQAHP()
    {
        Assert.assertTrue(driver.getTitle().contains("ToolsQA"));
    }

    public void clickOnWidgetCard()
    {
        scrollIntoView(widgetsCard,driver);
        wait.until(ExpectedConditions.elementToBeClickable(widgetsCard));
        widgetsCard.click();


    }

    public static void scrollIntoView(WebElement element, WebDriver driver)
    {
        JavascriptExecutor js = ((JavascriptExecutor)driver);
        js.executeScript("arguments[0].scrollIntoView(true);", element);
    }


    public void verifyWidgetsPage()
    {
        Assert.assertTrue(widgetsHeader.isDisplayed());
    }
}
