package Pages.AlertsFramesWindows;

import Pages.TestBase;
import io.cucumber.java.bs.A;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NestedFrames extends TestBase {
    int countIframesInPage ;
    private WebDriver driver;
    private WebDriverWait wait;
    public NestedFrames(WebDriver driver, WebDriverWait wait)
    {
        super(driver);
        this.driver = driver;
        this.wait = wait;
    }
    @FindBy(xpath = "//li[@id='item-3']//span[@class='text' and contains(text(),'Nested Frames')]")
    WebElement nestedFrames;

    @FindBy(xpath = "//iframe[@id='frame1']")
    WebElement frameOne;
    @FindBy(xpath = "//iframe[@id='frame2']")
    WebElement frameTwo;

    @FindBy(xpath = "//div[contains(text(),'Sample Nested Iframe page. There are nested iframe')]")
    WebElement heading;

    @FindBy(xpath = "//div[contains(text(),'Nested Frames')]")
    WebElement nestedFrameHeader;
    public void verifyOnNestedFramesPage()
    {
        scrollPage(driver);
        scrollIntoView(nestedFrames,driver);
        wait.until(ExpectedConditions.visibilityOf(nestedFrames));

        wait.until(ExpectedConditions.elementToBeClickable(nestedFrames));
        nestedFrames.click();

        Assert.assertTrue(nestedFrameHeader.isDisplayed());
    }

    public static void scrollPage(WebDriver driver)
    {
        JavascriptExecutor js = ((JavascriptExecutor)driver);
        js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
    }

    public static void scrollIntoView(WebElement element, WebDriver driver)
    {
        JavascriptExecutor js = ((JavascriptExecutor)driver);
        js.executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public void getNumberofFrames()
    {
        driver. findElements(By. tagName("iframe")). size();

        driver.switchTo().frame(frameOne);

        driver.switchTo().frame(0);

        driver.switchTo().defaultContent();


    }

    public void verifyIfNestedFramesPresent()
    {

        boolean sizeVal = false;
        if(countIframesInPage <0)
        {
            Assert.assertFalse(sizeVal);
        }
        else
        {
            sizeVal= true;
            Assert.assertTrue(sizeVal);
        }
        Assert.assertTrue(heading.isDisplayed());
    }
}
