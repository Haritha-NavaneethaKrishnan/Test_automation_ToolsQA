package Pages.BookStoreApplication;

import Pages.TestBase;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.ArrayList;

public class BSLoginPage extends TestBase {
    public WebDriver driver;
    public WebDriverWait wait;
    public BSLoginPage(WebDriver driver, WebDriverWait wait)
    {
        super(driver);
        this.driver = driver;
        this.wait = wait;
    }

    @FindBy(xpath = "//div[@class='card-body']//h5[contains(text(),'Book Store Application')]")
    WebElement BookStoreAppCard;

    @FindBy(css = "#login")
    WebElement login;

    @FindBy(xpath = "//button[@id='login']")
    WebElement loginBtn;

    @FindBy(xpath = "//input[@id='userName']")
    WebElement userName;

    @FindBy(xpath = "//input[@id='password']")
    WebElement passWord;

    @FindBy(xpath = "//div[contains(text(),'Book Store')]")
    WebElement BookStoreHeader;

    @FindBy(xpath = "//label[@id='userName-value']")
    WebElement logoutBtn;
    public void verifyHomePage()
    {
        String HomePage = driver.getTitle();
        Assert.assertEquals(HomePage , "ToolsQA" , "Yahoo! You're in Tools QA site...");
    }


    public void clickOnBookStoreCard() {
        scrollIntoView(BookStoreAppCard, driver);

        wait.until(ExpectedConditions.visibilityOf(BookStoreAppCard));
        BookStoreAppCard.click();

    }
    public static void scrollIntoView(WebElement element, WebDriver driver) {
        JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("arguments[0].scrollIntoView(true);", element);
    }


    public void clickOnLoginBtn()  {
        wait.until(ExpectedConditions.visibilityOf(login));
        scrollIntoView(login,driver);
        login.click();
    }

    public void enterEmailID(String email)
    {
        userName.sendKeys(email);
    }

    public void enterPassword(String password)
    {
        passWord.sendKeys(password);
    }

    public void clickOnLoginToEnter()
    {
        Assert.assertTrue(loginBtn.isDisplayed());

        loginBtn.click();
    }

    public void verifyAfterLoginFunc()
    {
        Assert.assertTrue(BookStoreHeader.isDisplayed());
    }
}