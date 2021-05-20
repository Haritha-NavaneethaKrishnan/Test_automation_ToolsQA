package Pages.AlertsFramesWindows;

import Pages.TestBase;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class AlertsPage extends TestBase {

    Alert alert2;
    private WebDriver driver;
    private WebDriverWait wait;
    public AlertsPage(WebDriver driver, WebDriverWait wait)
    {
        super(driver);
        this.driver = driver;
        this.wait = wait;
    }
    @FindBy(xpath = "//li[@id='item-1']//span[@class='text' and contains(text(),'Alerts')]")
    WebElement alerts;

    @FindBy(xpath = "//button[@id='alertButton']")
    WebElement firstBtn;

    @FindBy(xpath = "//button[@id='timerAlertButton']")
    WebElement secondBtn;

    @FindBy(xpath = "//button[@id='confirmButton']")
    WebElement thirdBtn;

    @FindBy(xpath = "//button[@id='promtButton']")
    WebElement fourthBtn;

    @FindBy(xpath = "//span[@id='confirmResult']")
    WebElement res;

    @FindBy(xpath = "//span[@id='promptResult']")
    WebElement prompTres;

    @FindBy(xpath = "//div[contains(text(),'Alerts')]")
    WebElement alertsHeader;
    public void verifyAlertsPage()
    {
        scrollIntoView(alerts,driver);
        wait.until(ExpectedConditions.elementToBeClickable(alerts));
        alerts.click();

        Assert.assertTrue(alertsHeader.isDisplayed());
    }

    public static void scrollIntoView(WebElement element, WebDriver driver)
    {
        JavascriptExecutor js = ((JavascriptExecutor)driver);
        js.executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public void clickOnSimpleAlert()
    {
        scrollIntoView(firstBtn,driver);
        wait.until(ExpectedConditions.elementToBeClickable(firstBtn));
        firstBtn.click();

    }

    public void simpleAlert()
    {
        try {
            wait.until(ExpectedConditions.alertIsPresent());
            Alert alert = driver.switchTo().alert();
            Assert.assertTrue(alert.getText().equals("You clicked a button"));
            alert.accept();
        } catch (Exception e) {

        }
    }

    public void InAlertsPage()
    {
        wait.until(ExpectedConditions.visibilityOf(alertsHeader));
        Assert.assertTrue(alertsHeader.isDisplayed());
    }

    public void clickOntimerAlert() throws InterruptedException {

        wait.until(ExpectedConditions.elementToBeClickable(secondBtn));
        secondBtn.click();

        Thread.sleep(5000);
    }

    public void timerAlert()
    {
        try {
        wait.until(ExpectedConditions.alertIsPresent());
        Alert alert = driver.switchTo().alert();
        Assert.assertEquals(alert.getText(),"This alert appeared after 5 seconds");
        alert.accept();
    } catch (Exception e) {

    }
    }

    public void clickOnConfirmButton()
    {
        wait.until(ExpectedConditions.elementToBeClickable(thirdBtn));
        thirdBtn.click();
    }

    public void resposeAlert()
    {
        try {
            wait.until(ExpectedConditions.alertIsPresent());
            Alert alert = driver.switchTo().alert();
            alert.dismiss();
        } catch (Exception e) {

        }
        Assert.assertTrue(res.getText().contains("You selected Cancel"));
    }


    public void clickOnPromptBtn()
    {

        wait.until(ExpectedConditions.elementToBeClickable(fourthBtn));
        fourthBtn.click();
    }

    public void handlePrompt()
    {
        try {
            wait.until(ExpectedConditions.alertIsPresent());
            Alert alert = driver.switchTo().alert();
            alert.sendKeys("Haritha");
            alert.accept();
            Assert.assertTrue(prompTres.getText().contains("You entered Haritha"));
        } catch (Exception e) {

        }
    }
}
