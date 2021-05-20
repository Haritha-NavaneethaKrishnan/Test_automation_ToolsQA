package Pages.AlertsFramesWindows;

import Pages.TestBase;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

public class BrowserWindows extends TestBase {

    ArrayList<String> tabs;
    String parentId1, parentId2;
    String childId1,childId2;
    String mainwindow,mwindow;
    private WebDriver driver;
    private WebDriverWait wait;
    public BrowserWindows(WebDriver driver, WebDriverWait wait)
    {
        super(driver);
        this.driver = driver;
        this.wait = wait;
    }
    @FindBy(xpath = "//li[@id='item-0']//span[@class='text' and contains(text(),'Browser Windows')]")
    WebElement browserWindows;

    @FindBy(xpath = "//button[@id='tabButton']")
    WebElement newTabBtn;

    @FindBy(xpath = "//button[@id='windowButton']")
    WebElement newWindowBtn;

    @FindBy(xpath = "//button[@id='messageWindowButton']")
    WebElement newWindowMsgBtn;

    @FindBy(xpath = "//div[contains(text(),'Browser Windows')]")
    WebElement BWHeader;

    @FindBy(xpath = "//h1[@id='sampleHeading']")
    WebElement newTabHeading;

    public void verifyBrowserWindow()
    {
        scrollIntoView(browserWindows,driver);
        wait.until(ExpectedConditions.elementToBeClickable(browserWindows));
        browserWindows.click();

        Assert.assertTrue(BWHeader.isDisplayed());
    }

    public static void scrollIntoView(WebElement element, WebDriver driver)
    {
        JavascriptExecutor js = ((JavascriptExecutor)driver);
        js.executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public void clickOnNewTabBtn()
    {
        wait.until(ExpectedConditions.elementToBeClickable(newTabBtn));

        newTabBtn.click();
    }

    public void newTabOpens()
    {
        tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));

        Assert.assertEquals(newTabHeading.getText(), "This is a sample page");

        driver.close();

        driver.switchTo().window(tabs.get(0));
    }


    public void verifyBrowserWindowPage()
    {

        Assert.assertTrue(BWHeader.isDisplayed());
    }

    public void clickOnNewWindowBtn()
    {
        wait.until(ExpectedConditions.elementToBeClickable(newWindowBtn));

        newWindowBtn.click();


    }

    public void newWindowOpens() {
        mainwindow = driver.getWindowHandle();
        Set<String> s2 = driver.getWindowHandles();
        Iterator<String> i1 = s2.iterator();

        while (i1.hasNext()) {
            String ChildWindow = i1.next();
            if (!mainwindow.equalsIgnoreCase(ChildWindow)) {
                driver.switchTo().window(ChildWindow);
                Assert.assertEquals(newTabHeading.getText(), "This is a sample page");
            }
        }
        driver.close();

        driver.switchTo().window(mainwindow);
    }

    public void NewWindowMsg()
    {
        wait.until(ExpectedConditions.elementToBeClickable(newWindowMsgBtn));

        newWindowMsgBtn.click();
    }

    public void newWindowwithMsgOpens()
    {
        mwindow = driver.getWindowHandle();
        Set<String> s1 = driver.getWindowHandles();
        Iterator<String> i1 = s1.iterator();

        while (i1.hasNext()) {
            String ChildWindow = i1.next();
            if (!mwindow.equalsIgnoreCase(ChildWindow)) {
                driver.switchTo().window(ChildWindow);
                Assert.assertFalse(ChildWindow.contains("Knowledge increases by sharing but not by saving. Please share this website with your friends and in your organization."));
            }
        }
        driver.close();

        driver.switchTo().window(mwindow);
    }

}
