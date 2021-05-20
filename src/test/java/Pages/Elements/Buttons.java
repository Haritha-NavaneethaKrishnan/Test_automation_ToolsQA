package Pages.Elements;

import Pages.TestBase;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Buttons extends TestBase {
    private WebDriver driver;
    private WebDriverWait wait;
    public Buttons(WebDriver driver, WebDriverWait wait)
    {
        super(driver);
        this.driver = driver;
        this.wait = wait;
    }

    @FindBy(xpath = "//li[@id='item-4']//span[@class='text' and contains(text(),'Buttons')]")
    WebElement buttonsOptn;

    @FindBy(xpath = "//button[@id='doubleClickBtn']")
    WebElement doubleClick;

    @FindBy(xpath = "//button[@id='rightClickBtn']")
    WebElement rightClick;

    @FindBy(xpath = "//div[@class='mt-4']//button[@id='25FCI' and contains(text(),'Click Me')]")
    WebElement dynamicClick;

    @FindBy(xpath = "//p[@id='doubleClickMessage']")
    WebElement dcMsg;

    @FindBy(xpath = "//p[@id='rightClickMessage']")
    WebElement rcMsg;

    @FindBy(xpath = "//p[@id='dynamicClickMessage']")
    WebElement cMsg;

    @FindBy(xpath = "//div[contains(text(),'Buttons')]")
    WebElement buttonsHeader;
    public void verifyButtonsPage()
    {
        wait.until(ExpectedConditions.visibilityOf(buttonsOptn));
        scrollIntoView(buttonsOptn,driver);
        wait.until(ExpectedConditions.elementToBeClickable(buttonsOptn));
        buttonsOptn.click();

        Assert.assertTrue(buttonsHeader.isDisplayed());

    }

    public static void scrollIntoView(WebElement element, WebDriver driver)
    {
        JavascriptExecutor js = ((JavascriptExecutor)driver);
        js.executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public void DoubleClickBtn()
    {
        Actions actions = new Actions(driver);
        actions.doubleClick(doubleClick).perform();
    }

    public void DoubleClickMsg()
    {
        Assert.assertEquals(dcMsg.getText() , "You have done a double click");

    }

    public void RightClickBtn()
    {
        Actions action = new Actions(driver);
        action.contextClick(rightClick).perform();
    }

    public void RightClickMsg()
    {
        Assert.assertEquals(rcMsg.getText() , "You have done a right click");

    }

    public void Click()
    {
        scrollIntoView(doubleClick,driver);

        Actions action = new Actions(driver);
        action.moveToElement(dynamicClick).build().perform();
        dynamicClick.click();
    }

    public void ClickMsg()
    {
        Assert.assertEquals(cMsg.getText() , "You have done a dynamic click");

    }
}
