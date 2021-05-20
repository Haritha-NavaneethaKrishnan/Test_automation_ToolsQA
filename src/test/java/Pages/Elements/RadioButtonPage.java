package Pages.Elements;

import Pages.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class RadioButtonPage extends TestBase {
    private WebDriver driver;
    private WebDriverWait wait;
    public RadioButtonPage(WebDriver driver, WebDriverWait wait)
    {
        super(driver);
        this.driver = driver;
        this.wait = wait;
    }
    @FindBy(xpath = "//li[@id='item-2']//span[@class='text' and contains(text(),'Radio Button')]")
    WebElement radioBtnOption;

    @FindBy(xpath = "//label[@for='yesRadio']")
    WebElement yesOptn;

    @FindBy(xpath = "//label[contains(text(),'Yes')]")
    WebElement yes;

    @FindBy(xpath = "//div[contains(text(),'Radio Button')]")
    WebElement radioButtonHeader;
    public void verifyRadioButtonPage()
    {
        wait.until(ExpectedConditions.visibilityOf(radioBtnOption));
        radioBtnOption.click();

        Assert.assertTrue(radioButtonHeader.isDisplayed());
    }

    public void selectOption()
    {
        wait.until(ExpectedConditions.elementToBeClickable(yesOptn));
        yesOptn.click();

    }

    public void verifySelectedOption()
    {

        Assert.assertEquals(yesOptn.getText() , "Yes");

        Assert.assertNotSame(yesOptn.getText(),"Impressive" , "The option selected is not same!");
    }
}
