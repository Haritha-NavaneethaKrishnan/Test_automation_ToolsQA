package Pages.AlertsFramesWindows;

import Pages.TestBase;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Frames extends TestBase {
    int size ;
    private WebDriver driver;
    private WebDriverWait wait;
    public Frames(WebDriver driver, WebDriverWait wait)
    {
        super(driver);
        this.driver = driver;
        this.wait = wait;
    }

    @FindBy(xpath = "//li[@id='item-2']//span[@class='text' and contains(text(),'Frames')]")
    WebElement frames;

    @FindBy(xpath = "//div[contains(text(),'Frames')]")
    WebElement framesHeader;
    public void onFramesPage()
    {
        wait.until(ExpectedConditions.visibilityOf(frames));
        scrollIntoView(frames,driver);
        wait.until(ExpectedConditions.elementToBeClickable(frames));
        frames.click();

        Assert.assertTrue(framesHeader.isDisplayed());
    }

    public static void scrollIntoView(WebElement element, WebDriver driver)
    {
        JavascriptExecutor js = ((JavascriptExecutor)driver);
        js.executeScript("arguments[0].scrollIntoView(true);", element);
    }



    public void iframesFound()
    {
        driver.findElements(By.tagName("iframe")).size();

        driver.switchTo().frame(0);

        driver.switchTo().defaultContent();

        driver.switchTo().frame(1);

        driver.switchTo().defaultContent();

    }

    public void verifyIfIframePresent()
    {
        boolean sizeVal = false;
        if(size<0)
        {
            Assert.assertFalse(sizeVal);
        }
        else
        {
            sizeVal=true;
            Assert.assertTrue(sizeVal);
        }
    }
}
