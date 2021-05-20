package Pages.Elements;

import Pages.TestBase;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.Set;

public class WebTablesPage extends TestBase {
    private WebDriver driver;
    private WebDriverWait wait;
    public WebTablesPage(WebDriver driver, WebDriverWait wait)
    {
        super(driver);
        this.driver = driver;
        this.wait = wait;
    }

    @FindBy(xpath = "//li[@id='item-3']//span[@class='text' and contains(text(),'Web Tables')]")
    WebElement webTablesOptn;

    @FindBy(xpath = "//button[@id='addNewRecordButton']")
    WebElement addBtn ;

    @FindBy(xpath = "//input[@id='firstName']")
    WebElement firstName ;

    @FindBy(xpath = "//input[@id='lastName']")
    WebElement lastName;

    @FindBy(xpath = "//input[@id='userEmail']")
    WebElement email;

    @FindBy(xpath = "//input[@id='age']")
    WebElement age;

    @FindBy(xpath = "//input[@id='salary']")
    WebElement sal;

    @FindBy(xpath = "//input[@id='department']")
    WebElement dept;

    @FindBy(xpath = "//button[@id='submit']")
    WebElement submit;

    @FindBy(xpath = "//div[@class='action-buttons']//span[@title='Edit' and @id='edit-record-1']")
    WebElement editBtn;

    @FindBy(xpath = "//input[@id='searchBox']")
    WebElement searchBox;

    @FindBy(xpath = "//div[@class='action-buttons']//span[@title='Delete' and @id='delete-record-1']")
    WebElement deleteIcon;

    @FindBy(xpath = "//div[contains(text(),'Web Tables')]")
    WebElement WebTablesHeader;

    @FindBy(xpath = "//div[contains(text(),'Haritha')]")
    WebElement userName;

    @FindBy(xpath = "//div[@class='rt-tr-group']//div[@class='rt-tr -odd']//div[contains(text(),'Alden')]")
    WebElement checkRow;

    @FindBy(xpath = "//div[@class='rt-tr-group']//div[@class='rt-tr -odd']//div[contains(text(),'Vega Harry')]")
    WebElement updatedLastName;
    public void verifyWebTablesPage()
    {
        wait.until(ExpectedConditions.visibilityOf(webTablesOptn));
        scrollIntoView(webTablesOptn,driver);
        wait.until(ExpectedConditions.elementToBeClickable(webTablesOptn));
        webTablesOptn.click();

        Assert.assertTrue(WebTablesHeader.isDisplayed());

    }

    public static void scrollIntoView(WebElement element, WebDriver driver)
    {
        JavascriptExecutor js = ((JavascriptExecutor)driver);
        js.executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public void clickOnAddButton()
    {
        scrollIntoView(addBtn,driver);
        wait.until(ExpectedConditions.elementToBeClickable(addBtn));
        addBtn.click();

    }

    public void enterName(String FirstName) throws InterruptedException {
        wait.until(ExpectedConditions.elementToBeClickable(firstName));
        Thread.sleep(1000);
        firstName.click();

        firstName.sendKeys(FirstName);
    }

    public void enterLName(String LastName)
    {
        wait.until(ExpectedConditions.elementToBeClickable(lastName));
        lastName.click();

        lastName.sendKeys(LastName);

    }

    public void enterEmail(String Email)
    {
        wait.until(ExpectedConditions.elementToBeClickable(email));
        email.click();

        email.sendKeys(Email);
    }

    public void enterAge(String Age)
    {
        wait.until(ExpectedConditions.elementToBeClickable(age));
        age.click();

        age.sendKeys(Age);
    }

    public void enterSalary(String salary)
    {
        wait.until(ExpectedConditions.elementToBeClickable(sal));
        sal.click();

        sal.sendKeys(salary);
    }

    public void enterDept(String Dept)
    {
        wait.until(ExpectedConditions.elementToBeClickable(dept));
        dept.click();

        dept.sendKeys(Dept);
    }

    public void clickOnSubmit()
    {
        wait.until(ExpectedConditions.elementToBeClickable(submit));
        submit.click();
    }

    public void verifyUserAdded()
    {
        if(firstName.getText().equals(userName.getText())) {
            Assert.assertTrue(userName.isDisplayed());
        }
    }

    public void verifyWebTablePage()
    {
        scrollIntoView(WebTablesHeader,driver);
        Assert.assertTrue(WebTablesHeader.isDisplayed());
    }

    public void editRecord()
    {
        scrollIntoView(editBtn,driver);
        wait.until(ExpectedConditions.elementToBeClickable(editBtn));
        editBtn.click();
    }

    public void editLastName()
    {
        wait.until(ExpectedConditions.elementToBeClickable(lastName));
        lastName.click();
        lastName.click();
        lastName.sendKeys(" Harry");
    }

    public void verifyUpdatedValue()
    {
        Assert.assertEquals(updatedLastName.getText(),"Vega Harry");
    }


    public void deleteUser()
    {
        wait.until(ExpectedConditions.elementToBeClickable(deleteIcon));
        deleteIcon.click();
    }

    public void deletedRowNotFound()
    {

        Assert.assertNotSame("Cierra","checkRow.getText()");
    }
}
