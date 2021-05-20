package Pages.Interactions;

import Pages.TestBase;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class InteractionsHomePage extends TestBase {
    private WebDriver driver;
    private WebDriverWait wait;
    public InteractionsHomePage(WebDriver driver, WebDriverWait wait)
    {
        super(driver);
        this.driver = driver;
        this.wait = wait;
    }

    @FindBy(xpath = "//div[@class='card-body']//h5[contains(text(),'Interactions')]")
    WebElement interactionsCard;

    @FindBy(xpath = "//div[contains(text(),'Interactions')]")
    WebElement interactionsHeader;
    public void verifyToolsQAHP()
    {
        Assert.assertTrue(driver.getTitle().contains("ToolsQA"));
    }

    public void clickOnInteractionsCard()
    {
        scrollIntoView(interactionsCard,driver);
        wait.until(ExpectedConditions.elementToBeClickable(interactionsCard));
        interactionsCard.click();
    }

    public static void scrollIntoView(WebElement element, WebDriver driver)
    {
        JavascriptExecutor js = ((JavascriptExecutor)driver);
        js.executeScript("arguments[0].scrollIntoView(true);", element);
    }


    public void verifyInteractionsPage()
    {
        Assert.assertTrue(interactionsHeader.isDisplayed());
    }
}


