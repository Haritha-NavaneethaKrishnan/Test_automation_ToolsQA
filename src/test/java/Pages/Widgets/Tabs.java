package Pages.Widgets;

import Pages.TestBase;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Tabs extends TestBase {
    private WebDriver driver;
    private WebDriverWait wait;
    public Tabs(WebDriver driver, WebDriverWait wait)
    {
        super(driver);
        this.driver = driver;
        this.wait = wait;
    }

    @FindBy(xpath = "//li[@id='item-5']//span[@class='text' and contains(text(),'Tabs')]")
    WebElement TabsOpn;

    @FindBy(xpath = "//a[@id='demo-tab-what']")
    WebElement tab1;

    @FindBy(xpath = "//a[@id='demo-tab-origin']")
    WebElement tab2;

    @FindBy(xpath = "//a[@id='demo-tab-use']")
    WebElement tab3;

    @FindBy(xpath = "//div[contains(text(),'Tabs')]")
    WebElement TabsHeader;
    public void verifyTabsPage()
    {
        scrollIntoView(TabsOpn,driver);
        wait.until(ExpectedConditions.elementToBeClickable(TabsOpn));
        TabsOpn.click();
        Assert.assertTrue(TabsHeader.isDisplayed());
    }

    public static void scrollIntoView(WebElement element, WebDriver driver)
    {
        JavascriptExecutor js = ((JavascriptExecutor)driver);
        js.executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public void clickOnTabs()
    {
        tab1.click();

        wait.until(ExpectedConditions.elementToBeClickable(tab2));

        tab2.click();

    }

    public void verifytabsActions()
    {

        wait.until(ExpectedConditions.elementToBeClickable(tab3));

        Assert.assertTrue(tab3.isDisplayed());
    }
}
