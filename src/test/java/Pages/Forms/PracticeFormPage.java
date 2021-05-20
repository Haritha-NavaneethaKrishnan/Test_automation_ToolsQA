package Pages.Forms;

import Pages.TestBase;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.io.DataOutput;
import java.nio.charset.StandardCharsets;

public class PracticeFormPage extends TestBase {
    private WebDriver driver;
    private WebDriverWait wait;
    public PracticeFormPage(WebDriver driver, WebDriverWait wait)
    {
        super(driver);
        this.driver = driver;
        this.wait = wait;
    }

    @FindBy(xpath = "//li[@id='item-0']//span[@class='text' and contains(text(),'Practice Form')]")
    WebElement practiceFormOption;

    @FindBy(xpath = "//input[@id='firstName']")
    WebElement firstN;

    @FindBy(xpath = "//input[@id='lastName']")
    WebElement lastN;

    @FindBy(xpath = "//input[@id='userEmail']")
    WebElement email;

    @FindBy(xpath = "//label[contains(text(),'Female')]")
    WebElement gender;

    @FindBy(xpath = "//input[@id='userNumber']")
    WebElement phoneNum;

    @FindBy(xpath = "//input[@id='dateOfBirthInput']")
    WebElement DOBirth;

    @FindBy(xpath = "//div[@class='subjects-auto-complete__control css-yk16xz-control']//div[@class='subjects-auto-complete__value-container subjects-auto-complete__value-container--is-multi css-1hwfws3']")
    WebElement subName;

    @FindBy(xpath = "//label[contains(text(),'Reading')]")
    WebElement hobby1;

    @FindBy(xpath = "//label[contains(text(),'Music')]")
    WebElement hobby2;

    @FindBy(xpath = "//input[@id='uploadPicture']")
    WebElement uploadPicture;

    @FindBy(xpath = "//textarea[@id='currentAddress']")
    WebElement currAdd;

    @FindBy(xpath = "//div[@id='stateCity-wrapper']//div[@id='state']")
    WebElement state;

    @FindBy(xpath = "//div[@id='stateCity-wrapper']//div[@id='city']")
    WebElement city;

    @FindBy(xpath = "//button[@id='submit']")
    WebElement subBtn;

    @FindBy(xpath = "//button[@id='closeLargeModal']")
    WebElement close;

    @FindBy(xpath = "//div[contains(text(),'Practice Form')]")
    WebElement PracticeFormHeader;

    @FindBy(xpath = "//div[contains(text(),'Forms')]")
    WebElement FormsHeader;

    @FindBy(xpath = "//div[@id='example-modal-sizes-title-lg']")
    WebElement formSubmission;
    public void FormsPage()
    {
        Assert.assertTrue(FormsHeader.isDisplayed());
    }

    public void navigateToPracticeForm()
    {
        wait.until(ExpectedConditions.visibilityOf(practiceFormOption));
        scrollIntoView(practiceFormOption,driver);
        wait.until(ExpectedConditions.elementToBeClickable(practiceFormOption));
        practiceFormOption.click();

        Assert.assertTrue(PracticeFormHeader.isDisplayed());

    }

    public static void scrollIntoView(WebElement element, WebDriver driver)
    {
        JavascriptExecutor js = ((JavascriptExecutor)driver);
        js.executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public void enterName(String fName , String lName)
    {
        scrollIntoView(firstN,driver);
        firstN.click();
        firstN.sendKeys(fName);

        wait.until(ExpectedConditions.elementToBeClickable(lastN));
        lastN.click();
        lastN.sendKeys(lName);
    }

    public void enterEmail(String Email)
    {
        scrollIntoView(email,driver);
        wait.until(ExpectedConditions.elementToBeClickable(email));
        email.click();
        email.sendKeys(Email);
    }

    public void chooseGender()
    {
        wait.until(ExpectedConditions.elementToBeClickable(gender));

        gender.click();
    }

    public void enterPhoneNo(String pn)
    {
        wait.until(ExpectedConditions.elementToBeClickable(phoneNum));

        phoneNum.click();
        phoneNum.sendKeys(pn);
    }

    public void enterDOB(String dob)
    {

        wait.until(ExpectedConditions.elementToBeClickable(DOBirth));
        scrollIntoView(DOBirth,driver);
        DOBirth.click();
        DOBirth.click();
        DOBirth.sendKeys(dob);
        //selectDateByJS(driver, DOBirth , dob);
    }

    public static void selectDateByJS(WebDriver driver ,WebElement element , String date)
    {
        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("arguments[0].setAttribute('value','"+date+"');",element);
    }

    public void enterSubjetName(String sName)
    {
        //scrollIntoView(subName,driver);
        wait.until(ExpectedConditions.elementToBeClickable(subName));

        subName.click();

        subName.sendKeys(sName);

        subName.click();
    }

    public void selectHobby()
    {
        wait.until(ExpectedConditions.elementToBeClickable(hobby1));

        hobby1.click();

        hobby2.click();
    }

    public void uploadPic()
    {
        wait.until(ExpectedConditions.visibilityOf(uploadPicture));
        scrollIntoView(uploadPicture,driver);

        uploadPicture.sendKeys("C:\\Users\\hnavane\\IdeaProjects\\FinalAssessment\\src\\test\\java\\UploadItem\\sampleFile.jpeg");
    }

    public void address(String add)
    {
        wait.until(ExpectedConditions.visibilityOf(currAdd));

        currAdd.click();

        currAdd.sendKeys(add);
    }

    public void selectStateandCity()
    {
        wait.until(ExpectedConditions.elementToBeClickable(state));
        Select select = new Select(state);

        state.click();
        select.selectByVisibleText("Uttar Pradesh");

        wait.until(ExpectedConditions.elementToBeClickable(city));

        city.click();
        select.selectByValue("Agra");
    }

    public void clickOnSubmit()
    {
        wait.until(ExpectedConditions.visibilityOf(subBtn));

        subBtn.click();
    }

    public void verifyEnteredDetailsDisplayed()
    {

        Assert.assertTrue(formSubmission.isDisplayed());
        scrollIntoView(close,driver);
        close.click();
        driver.navigate().to("https://demoqa.com/");
    }

}
