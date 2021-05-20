package Pages.Elements;

import Pages.TestBase;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.ArrayList;

public class LinksPage extends TestBase {

    ArrayList<String> tabs2;
    private WebDriver driver;
    private WebDriverWait wait;
    public LinksPage(WebDriver driver, WebDriverWait wait)
    {
        super(driver);
        this.driver = driver;
        this.wait = wait;
    }

    @FindBy(xpath = "//li[@id='item-5']//span[@class='text' and contains(text(),'Links')]")
    WebElement linksOptn;

    @FindBy(xpath = "//a[@id='simpleLink']")
    WebElement simpleLink;

    @FindBy(xpath = "//a[@id='created']")
    WebElement created;

    @FindBy(xpath = "//a[@id='no-content']")
    WebElement noContent;

    @FindBy(xpath = "//a[@id='moved']")
    WebElement moved;

    @FindBy(xpath = "//a[@id='bad-request']")
    WebElement badRequest;

    @FindBy(xpath = "//a[@id='unauthorized']")
    WebElement unAuthorized;

    @FindBy(xpath = "//a[@id='forbidden']")
    WebElement forbidden;

    @FindBy(xpath = "//a[@id='invalid-url']")
    WebElement notFound;


    @FindBy(xpath = "//div[contains(text(),'Links')]")
    WebElement linksHeader;

    @FindBy(xpath = "//p[@id='linkResponse']")
    WebElement response;
    public void verifyLinkPage()
    {
        wait.until(ExpectedConditions.visibilityOf(linksOptn));
        scrollIntoView(linksOptn,driver);
        wait.until(ExpectedConditions.elementToBeClickable(linksOptn));
        linksOptn.click();

        Assert.assertTrue(linksHeader.isDisplayed());
    }

    public static void scrollIntoView(WebElement element, WebDriver driver)
    {
        JavascriptExecutor js = ((JavascriptExecutor)driver);
        js.executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public void clickOnSimpleLink()
    {
        wait.until(ExpectedConditions.elementToBeClickable(simpleLink));

        simpleLink.click();


    }

    public void verifyHomePageAfterSimpleLinkClick()
    {
        tabs2 = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(1));

        Assert.assertTrue(driver.getTitle().contains("ToolsQA"));

        driver.close();

        driver.switchTo().window(tabs2.get(0));
    }

    public void clickOnOptions() throws InterruptedException {
        Thread.sleep(1000);
        wait.until(ExpectedConditions.elementToBeClickable(created));

        created.click();
        noContent.click();
        moved.click();
        badRequest.click();
        unAuthorized.click();
        forbidden.click();
    }



    public void statusOfClick()
    {

        Assert.assertTrue(notFound.isDisplayed());
        notFound.click();
        Assert.assertTrue(response.isDisplayed());
    }
}
