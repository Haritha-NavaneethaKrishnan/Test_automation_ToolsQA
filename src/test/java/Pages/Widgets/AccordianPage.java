package Pages.Widgets;

import Pages.TestBase;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AccordianPage extends TestBase {
    private WebDriver driver;
    private WebDriverWait wait;
    public AccordianPage(WebDriver driver, WebDriverWait wait)
    {
        super(driver);
        this.driver = driver;
        this.wait = wait;
    }
    @FindBy(xpath = "//li[@id='item-0']//span[@class='text' and contains(text(),'Accordian')]")
    WebElement AccordianOpn;


    @FindBy(xpath = "//div[@id='section1Heading']")
    WebElement clickContent;

    @FindBy(xpath = "//div[contains(text(),'Alerts')]")
    WebElement accordianHeader;
    public void verifyAccordianPage()
    {
        scrollIntoView(AccordianOpn,driver);
        wait.until(ExpectedConditions.elementToBeClickable(AccordianOpn));
        AccordianOpn.click();
        Assert.assertTrue(accordianHeader.isDisplayed());
    }

    public static void scrollIntoView(WebElement element, WebDriver driver)
    {
        JavascriptExecutor js = ((JavascriptExecutor)driver);
        js.executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public void clickOnParticularContent()
    {
        wait.until(ExpectedConditions.elementToBeClickable(clickContent));
        clickContent.click();
    }

    public void clickToclose()
    {
        Assert.assertTrue(clickContent.isDisplayed());
        clickContent.click();
        clickContent.click();
    }
}
