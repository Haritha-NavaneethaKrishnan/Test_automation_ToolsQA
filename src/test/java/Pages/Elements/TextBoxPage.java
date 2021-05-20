package Pages.Elements;

import Pages.TestBase;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class TextBoxPage extends TestBase {
    private WebDriver driver;
    private WebDriverWait wait;
    public TextBoxPage(WebDriver driver, WebDriverWait wait)
    {
        super(driver);
        this.driver = driver;
        this.wait = wait;
    }

    @FindBy(xpath = "//li[@id='item-0']//span[@class='text' and contains(text(),'Text Box')]")
    WebElement textBoxOption;

    @FindBy(xpath = "//input[@id='userName']")
    WebElement fullNameIF;

    @FindBy(xpath = "//input[@id='userEmail']")
    WebElement emailIF;

    @FindBy(xpath = "//textarea[@id='currentAddress']")
    WebElement currAddress;

    @FindBy(xpath = "//textarea[@id='permanentAddress']")
    WebElement permanentAddress;

    @FindBy(xpath = "//button[@id='submit']")
    WebElement submitBtn;

    @FindBy(xpath = "//p[@id='name']")
    WebElement nameField;

    @FindBy(xpath = "//p[@id='email']")
    WebElement emailField;

    @FindBy(xpath = "//p[@id='currentAddress']")
    WebElement currentAdd;

    @FindBy(css = "#permanentAddress")
    WebElement permanentAdd;

    public void navigateToTextBoxPage()
    {
        scrollIntoView(textBoxOption,driver);
        wait.until(ExpectedConditions.visibilityOf(textBoxOption));
        textBoxOption.click();
    }

    public void fullNameInputField(String fullName)
    {
        wait.until(ExpectedConditions.elementToBeClickable(fullNameIF));
        fullNameIF.click();

        fullNameIF.sendKeys(fullName);
    }

    public void emailInputField(String email)
    {
        wait.until(ExpectedConditions.elementToBeClickable(emailIF));
        emailIF.click();

        emailIF.sendKeys(email);
    }

    public void currAddressField(String currAdd)
    {
        wait.until(ExpectedConditions.elementToBeClickable(currAddress));
        currAddress.click();

        currAddress.sendKeys(currAdd);
    }

    public void perAddressField(String perAdd)
    {
        scrollIntoView(permanentAdd,driver);
        wait.until(ExpectedConditions.elementToBeClickable(permanentAddress));

        permanentAddress.click();

        permanentAddress.sendKeys(perAdd);
    }

    public static void scrollIntoView(WebElement element, WebDriver driver)
    {
        JavascriptExecutor js = ((JavascriptExecutor)driver);
        js.executeScript("arguments[0].scrollIntoView(true);", element);
    }
    public void clickOnSubmitBtn()
    {
        wait.until(ExpectedConditions.elementToBeClickable(submitBtn));

        submitBtn.click();
    }

    public void verifyEnteredValues()
    {
        String name[] = nameField.getText().split(":");
        String email[] = emailField.getText().split(":");
        String currAd[] = currentAdd.getText().split(":");
        String permanentAd[] = permanentAdd.getText().split(":");

        boolean checkName = name.toString().isEmpty();
        Assert.assertFalse(checkName);
        boolean checkEmail = email.toString().isEmpty();
        Assert.assertFalse(checkEmail);
        boolean checkCurAd = currAd.toString().isEmpty();
        Assert.assertFalse(checkCurAd);
        boolean pAd = permanentAd.toString().isEmpty();
        Assert.assertFalse(pAd);
    }
}
