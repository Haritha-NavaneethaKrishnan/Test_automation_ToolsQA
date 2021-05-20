package Pages.Widgets;

import Pages.TestBase;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutoCompletePage extends TestBase {
    private WebDriver driver;
    private WebDriverWait wait;
    public AutoCompletePage(WebDriver driver, WebDriverWait wait)
    {
        super(driver);
        this.driver = driver;
        this.wait = wait;
    }

    @FindBy(xpath = "//li[@id='item-1']//span[@class='text' and contains(text(),'Auto Complete')]")
    WebElement autocompleteOpn;

    @FindBy(xpath = "//div[@id='autoCompleteMultipleContainer']")
    WebElement addColor;

    @FindBy(xpath = "//div[contains(text(),'Auto Complete')]")
    WebElement autoCompleteHeader;

    @FindBy(xpath = "//div[@id='autoCompleteMultiple']")
    WebElement colorAvailable;
    public void verifyAutoCompletePage()
    {
        scrollIntoView(autocompleteOpn,driver);
        wait.until(ExpectedConditions.elementToBeClickable(autocompleteOpn));
        autocompleteOpn.click();

        Assert.assertTrue(autoCompleteHeader.isDisplayed());
    }

    public static void scrollIntoView(WebElement element, WebDriver driver)
    {
        JavascriptExecutor js = ((JavascriptExecutor)driver);
        js.executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public void entercolors()
    {
        scrollIntoView(addColor,driver);
        String scolor = "Green";
        selectDateByJS(driver,addColor,scolor );
    }

    public static void selectDateByJS(WebDriver driver ,WebElement element , String color)
    {
        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("arguments[0].setAttribute('value','"+color+"');",element);
    }

    public void verifyaddedColors()
    {
        Assert.assertTrue(colorAvailable.isDisplayed());
    }
}
