package Pages.Elements;

import Pages.TestBase;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class ElementsHomePage extends TestBase {
    private WebDriver driver;
    private WebDriverWait wait;
    public ElementsHomePage(WebDriver driver, WebDriverWait wait)
    {
        super(driver);
        this.driver = driver;
        this.wait = wait;
    }

    @FindBy(xpath = "//div[@class='card-body']//h5[contains(text(),'Elements')]")
    WebElement elementsCard;

    @FindBy(xpath = "//div[contains(text(),'Elements')]")
    WebElement elementsHeader;
    public void verifyToolsQAHP()
    {
        Assert.assertTrue(driver.getTitle().contains("ToolsQA"));
    }

    public void clickOnElementsHomePage() throws InterruptedException {
        scrollIntoView(elementsCard,driver);
        wait.until(ExpectedConditions.elementToBeClickable(elementsCard));
        Thread.sleep(1000);
        elementsCard.click();
    }

    public static void scrollIntoView(WebElement element, WebDriver driver)
    {
        JavascriptExecutor js = ((JavascriptExecutor)driver);
        js.executeScript("arguments[0].scrollIntoView(true);", element);
    }


    public void verifyElementsPage()
    {
        wait.until(ExpectedConditions.elementToBeClickable(elementsHeader));
        Assert.assertTrue(elementsHeader.isDisplayed());
    }
}
