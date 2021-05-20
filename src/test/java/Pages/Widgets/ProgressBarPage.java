package Pages.Widgets;

import Pages.TestBase;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class ProgressBarPage extends TestBase {
    private WebDriver driver;
    private WebDriverWait wait;
    public ProgressBarPage(WebDriver driver, WebDriverWait wait)
    {
        super(driver);
        this.driver = driver;
        this.wait = wait;
    }

    @FindBy(xpath = "//li[@id='item-4']//span[@class='text' and contains(text(),'Progress Bar')]")
    WebElement pBarOpn;

    @FindBy(xpath = "//button[@id='startStopButton']")
    WebElement startStopBtn;

    @FindBy(xpath = "//div[contains(text(),'Progress Bar')]")
    WebElement ProgressBarHeader;

    @FindBy(xpath = "//div[@id='progressBar']")
    WebElement progressBar;
    public void verifyOnProgressBarPage()
    {
        scrollIntoView(pBarOpn,driver);
        wait.until(ExpectedConditions.elementToBeClickable(pBarOpn));
        pBarOpn.click();
        Assert.assertTrue(ProgressBarHeader.isDisplayed());
    }

    public static void scrollIntoView(WebElement element, WebDriver driver)
    {
        JavascriptExecutor js = ((JavascriptExecutor)driver);
        js.executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public void clickOnStartbtn()
    {
        //scrollIntoView(startStopBtn,driver);
        startStopBtn.click();
    }

    public void progressChanges() throws InterruptedException {
        scrollIntoView(progressBar,driver);
        Assert.assertTrue(progressBar.isDisplayed());
        Thread.sleep(2000);
        Assert.assertTrue(startStopBtn.isDisplayed());
        startStopBtn.click();
    }

}
