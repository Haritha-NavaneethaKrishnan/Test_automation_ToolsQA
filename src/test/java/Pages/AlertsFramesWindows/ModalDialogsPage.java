package Pages.AlertsFramesWindows;

import Pages.TestBase;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ModalDialogsPage extends TestBase {
    private WebDriver driver;
    private WebDriverWait wait;
    public ModalDialogsPage(WebDriver driver, WebDriverWait wait)
    {
        super(driver);
        this.driver = driver;
        this.wait = wait;
    }

    @FindBy(xpath = "//li[@id='item-4']//span[@class='text' and contains(text(),'Modal Dialogs')]")
    WebElement MDclick;

    @FindBy(xpath = "//button[@id='showSmallModal']")
    WebElement smallDialog;

    @FindBy(xpath = "//div[@class='modal-content']//div[@class='modal-body']")
    WebElement smallContent;

    @FindBy(xpath = "//button[@id='showLargeModal']")
    WebElement largeDialog;

    @FindBy(xpath = "//div[@class='modal-content']//div[@class='modal-body']//p")
    WebElement largeContent;

    @FindBy(xpath = "//button[@id='closeSmallModal']")
    WebElement sClose;

    @FindBy(xpath = "//button[@id='closeLargeModal']")
    WebElement lClose;

    @FindBy(xpath = "//div[contains(text(),'Modal Dialogs')]")
    WebElement ModalDialogsHeader;
    public void verifyMDPage()
    {
        scrollIntoView(MDclick,driver);
        //wait.until(ExpectedConditions.visibilityOf(MDclick));

        wait.until(ExpectedConditions.elementToBeClickable(MDclick));
        MDclick.click();

        Assert.assertTrue(ModalDialogsHeader.isDisplayed());
    }

    public static void scrollIntoView(WebElement element, WebDriver driver)
    {
        JavascriptExecutor js = ((JavascriptExecutor)driver);
        js.executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public void clickOnSmallDialog()
    {
        scrollIntoView(smallDialog,driver);
        wait.until(ExpectedConditions.elementToBeClickable(smallDialog));

        smallDialog.click();

    }

    public void verifySmallDialogBox()
    {
        wait.until(ExpectedConditions.visibilityOf(smallContent));

       Assert.assertTrue(smallContent.isDisplayed());

        sClose.click();
    }


    public void InMDPage()
    {
        scrollIntoView(ModalDialogsHeader,driver);
        Assert.assertTrue(ModalDialogsHeader.isDisplayed());;
    }

    public void clickOnLargeDialog()
    {
        scrollIntoView(largeDialog,driver);
        wait.until(ExpectedConditions.elementToBeClickable(largeDialog));

        largeDialog.click();
    }

    public void verifyLargeDialogBox()
    {
        wait.until(ExpectedConditions.visibilityOf(largeContent));

        Assert.assertTrue(largeContent.isDisplayed());

        Assert.assertTrue(lClose.isEnabled());
        lClose.click();
        driver.navigate().to("https://demoqa.com/");
    }



}
