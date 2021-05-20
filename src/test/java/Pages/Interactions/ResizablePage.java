package Pages.Interactions;

import Pages.TestBase;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class ResizablePage extends TestBase {
    private WebDriver driver;
    private WebDriverWait wait;

    public ResizablePage(WebDriver driver, WebDriverWait wait) {
        super(driver);
        this.driver = driver;
        this.wait = wait;
    }

    @FindBy(xpath = "//li[@id='item-2']//span[@class='text' and contains(text(),'Resizable')]")
    WebElement resizableOpn;

    @FindBy(xpath = "//div[@id='resizableBoxWithRestriction']//span[@class='react-resizable-handle react-resizable-handle-se']")
    WebElement resizeIcon;

    @FindBy(xpath = "//div[contains(text(),'Resizable')]")
    WebElement ResizableHeader;
    public void verifyResizablePage()
    {
        scrollIntoView(resizableOpn,driver);
        wait.until(ExpectedConditions.elementToBeClickable(resizableOpn));
        resizableOpn.click();

        Assert.assertTrue(ResizableHeader.isDisplayed());
    }

    public static void scrollIntoView(WebElement element, WebDriver driver)
    {
        JavascriptExecutor js = ((JavascriptExecutor)driver);
        js.executeScript("arguments[0].scrollIntoView(true);", element);
    }


    public void resizeFunctionality()
    {
        resize(resizeIcon,100,50);
    }

    public void resize(WebElement elementToResize, int xOffset, int yOffset) {
        try {
            if (elementToResize.isDisplayed()) {
                Actions action = new Actions(driver);
                action.clickAndHold(elementToResize).moveByOffset(xOffset, yOffset).release().build().perform();
            }
        } catch (StaleElementReferenceException e) {

        } catch (NoSuchElementException e) {

        } catch (Exception e) {

        }
    }


    public void resizeDone()
    {
        Assert.assertTrue(resizeIcon.isDisplayed());
    }


}
