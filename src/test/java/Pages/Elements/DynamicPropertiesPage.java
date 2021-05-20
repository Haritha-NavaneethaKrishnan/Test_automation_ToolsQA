package Pages.Elements;

import Pages.TestBase;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class DynamicPropertiesPage extends TestBase {
    private WebDriver driver;
    private WebDriverWait wait;
    public DynamicPropertiesPage(WebDriver driver, WebDriverWait wait)
    {
        super(driver);
        this.driver = driver;
        this.wait = wait;
    }

    @FindBy(xpath = "//li[@id='item-8']//span[@class='text' and contains(text(),'Dynamic Properties')]")
    WebElement dynamicPropertiesOptn;

    @FindBy(xpath = "//div[contains(text(),'Dynamic Properties')]")
    WebElement dpHeader;

    @FindBy(xpath = "//button[@id='visibleAfter']")
    WebElement afterSec;
    public void verifyDPPage()
    {
        scrollIntoView(dynamicPropertiesOptn,driver);
        wait.until(ExpectedConditions.visibilityOf(dynamicPropertiesOptn));
        dynamicPropertiesOptn.click();

        Assert.assertTrue(dpHeader.isDisplayed());

    }

    public static void scrollIntoView(WebElement element, WebDriver driver)
    {
        JavascriptExecutor js = ((JavascriptExecutor)driver);
        js.executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public void waitForFiveSeconds() throws InterruptedException {
        Thread.sleep(5000);
    }

    public void verifyChangesDone()
    {

        wait.until(ExpectedConditions.elementToBeClickable(afterSec));

        Assert.assertTrue(afterSec.isDisplayed());

        driver.navigate().to("https://demoqa.com/");
    }
}
