package Pages.Forms;

import Pages.TestBase;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class FormsPage extends TestBase {
    private WebDriver driver;
    private WebDriverWait wait;
    public FormsPage(WebDriver driver, WebDriverWait wait)
    {
        super(driver);
        this.driver = driver;
        this.wait = wait;
    }

    @FindBy(xpath = "//div[@class='card-body']//h5[contains(text(),'Forms')]")
    WebElement formsCard;

    @FindBy(xpath = "//div[contains(text(),'Forms')]")
    WebElement formsHeader;

    public void verifyToolsQAHP()
    {
        Assert.assertTrue(driver.getTitle().contains("ToolsQA"));
    }

    public void clickOnFormsHomePage()
    {
        scrollIntoView(formsCard,driver);
        wait.until(ExpectedConditions.elementToBeClickable(formsCard));
        formsCard.click();
    }

    public static void scrollIntoView(WebElement element, WebDriver driver)
    {
        JavascriptExecutor js = ((JavascriptExecutor)driver);
        js.executeScript("arguments[0].scrollIntoView(true);", element);
    }


    public void verifyFormsPage()
    {
        Assert.assertTrue(formsHeader.isDisplayed());
    }
}
