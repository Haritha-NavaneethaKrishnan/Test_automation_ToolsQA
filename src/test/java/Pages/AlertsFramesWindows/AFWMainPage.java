package Pages.AlertsFramesWindows;

import Pages.TestBase;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class AFWMainPage extends TestBase {
    private WebDriver driver;
    private WebDriverWait wait;
    public AFWMainPage(WebDriver driver, WebDriverWait wait)
    {
        super(driver);
        this.driver = driver;
        this.wait = wait;
    }

    @FindBy(xpath = "//div[@class='card-body']//h5[contains(text(),'Alerts, Frame & Windows')]")
    WebElement afwCard;

    @FindBy(xpath = "//div[contains(text(),'Alerts, Frame & Windows')]")
    WebElement afwHeader;

    public void verifyToolsQAHP()
    {
        Assert.assertTrue(driver.getTitle().contains("ToolsQA"));
    }

    public void clickOnAFWHomePage()
    {
        scrollIntoView(afwCard,driver);
        wait.until(ExpectedConditions.elementToBeClickable(afwCard));
        afwCard.click();
    }

    public static void scrollIntoView(WebElement element, WebDriver driver)
    {
        JavascriptExecutor js = ((JavascriptExecutor)driver);
        js.executeScript("arguments[0].scrollIntoView(true);", element);
    }


    public void verifyAFWPage()
    {
        wait.until(ExpectedConditions.elementToBeClickable(afwHeader));
        Assert.assertTrue(afwHeader.isDisplayed());
    }
}
