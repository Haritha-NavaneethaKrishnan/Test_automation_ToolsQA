package Pages.Widgets;

import Pages.TestBase;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToolTipsPage extends TestBase {
    private WebDriver driver;
    private WebDriverWait wait;
    public ToolTipsPage(WebDriver driver, WebDriverWait wait)
    {
        super(driver);
        this.driver = driver;
        this.wait = wait;
    }

    @FindBy(xpath = "//li[@id='item-6']//span[@class='text' and contains(text(),'Tool Tips')]")
    WebElement toolTipsOpn;

    @FindBy(xpath = "//button[@id='toolTipButton']")
    WebElement ele1;

    @FindBy(xpath = "//div[contains(text(),'Tool Tips')]")
    WebElement toolTipsHeader;

    public void ToolTipsPage()
    {
        scrollIntoView(toolTipsOpn,driver);
        wait.until(ExpectedConditions.elementToBeClickable(toolTipsOpn));
        toolTipsOpn.click();
        Assert.assertTrue(toolTipsHeader.isDisplayed());
    }

    public static void scrollIntoView(WebElement element, WebDriver driver)
    {
        JavascriptExecutor js = ((JavascriptExecutor)driver);
        js.executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public void hoverOverElements()
    {
        Actions actions = new Actions(driver);

        actions.moveToElement(ele1).build().perform();
    }

    public void hoveringValidated()
    {
        wait.until(ExpectedConditions.visibilityOf(ele1));
        Assert.assertTrue(ele1.isDisplayed());
    }
}
