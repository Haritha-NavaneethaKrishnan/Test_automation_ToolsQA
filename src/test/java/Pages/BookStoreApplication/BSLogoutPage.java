package Pages.BookStoreApplication;

import Pages.TestBase;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;


public class BSLogoutPage extends TestBase {
    private WebDriver driver;
    private WebDriverWait wait;

    public BSLogoutPage(WebDriver driver, WebDriverWait wait) {
        super(driver);
        this.driver = driver;
        this.wait = wait;
    }

    @FindBy(xpath = "//button[@id='submit']")
    WebElement logoutBtn;

    @FindBy(xpath = "//a//img[@src='/images/Toolsqa.jpg']")
    WebElement homePage;

    @FindBy(xpath = "//div[contains(text(),'Profile')]")
    WebElement profileHeader;

    @FindBy(xpath = "//div[contains(text(),'Login')]")
    WebElement loginHeader;

    @FindBy(xpath = "//button[@id='login']")
    WebElement loginBtn;
    public void verifyProfilePage()
    {
        Assert.assertTrue(profileHeader.isDisplayed(),"You're in Profile Page");
    }

    public void clickOnLogoutBtn()
    {
        wait.until(ExpectedConditions.elementToBeClickable(logoutBtn));
        logoutBtn.click();
    }

    public void verifyLogout()
    {
        Assert.assertTrue(loginHeader.isDisplayed());

        homePage.click();

    }

}
