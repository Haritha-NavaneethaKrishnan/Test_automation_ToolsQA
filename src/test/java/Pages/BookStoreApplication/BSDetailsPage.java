package Pages.BookStoreApplication;

import Pages.TestBase;
import com.sun.deploy.util.SyncAccess;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import javax.swing.*;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane;

public class BSDetailsPage extends TestBase {

    private WebDriver driver;
    private WebDriverWait wait;
    public BSDetailsPage(WebDriver driver, WebDriverWait wait)
    {
        super(driver);
        this.driver = driver;
        this.wait = wait;
    }

    @FindBy(xpath = "//div[contains(text(),'Book Store')]")
    WebElement header;


    @FindBy(xpath = "//input[@id='searchBox']")
    WebElement searchBox;


    @FindBy(xpath = "//a[contains(text(),'Git Pocket Guide')]")
    WebElement bookOne;

    @FindBy(xpath = "//a[contains(text(),'Speaking JavaScript')]")
    WebElement bookTwo;

    @FindBy(xpath = "//div[@class='mt-2 fullButtonWrap row']//div[@class='text-right fullButton']//button[@id='addNewRecordButton']")
    WebElement addToCollection;

    @FindBy(xpath = "//div[@class='mt-2 fullButtonWrap row']//div[@class='text-left fullButton']//button[@id='addNewRecordButton']")
    WebElement backToBS;

    @FindBy(xpath = "//span[contains(text(),'Profile')]")
    WebElement ProfileBtn;

    @FindBy(xpath = "//button[@id='gotoStore']")
     WebElement goToBSBtn;

    @FindBy(xpath = "//a[contains(text(),'Learning JavaScript')]")
    WebElement bookThree;

    @FindBy(xpath = "//div[@class='text-right button di']//button[@id='submit']")
    WebElement deleteAllBtn;

    @FindBy(xpath = "//button[@id='closeSmallModal-ok']")
    WebElement alertOkBtn;

    @FindBy(xpath = "//div[contains(text(),'Profile')]")
    WebElement ProfileHeader;

    @FindBy(xpath = "//div[@class='rt-tbody']")
    WebElement noBooks;

    @FindBy(xpath = "//div[@class='rt-tr-group']//div[@class='rt-tr -odd']//div[@class='action-buttons']//span[@class='mr-2']")
    WebElement BookOne;

    @FindBy(xpath = "//div[@class='rt-tr-group']//div[@class='rt-tr -even']//div[@class='action-buttons']//span[@class='mr-2']")
    WebElement BookTwo;

    @FindBy(xpath = "//div[@class='rt-tr-group']//div[@class='rt-tr -odd']//div[@class='action-buttons']//span[@class='mr-2' and @id='see-book-Learning JavaScript Design Patterns']")
    WebElement BookThree;

    @FindBy(xpath = "//li[@id='item-3']//span[@class='text' and contains(text(),'Profile')]")
    WebElement ProfileOption;
    public void verifyBookStorePage()
    {
        wait.until(ExpectedConditions.visibilityOf(header));

        Assert.assertTrue(header.getText().contains("Book Store Application"));

    }


    public void selectBook(String bookName)
    {
        //scrollIntoView(searchBox,driver);
        wait.until(ExpectedConditions.visibilityOf(searchBox));
        searchBox.click();
        searchBox.sendKeys(bookName);
    }

    public void clickOnBook()
    {
        if(bookOne.getText().equals("Git Pocket Guide"))
        {
            bookOne.click();
        }

    }

    public void clickOnSecondBook()
    {
        if(bookTwo.getText().equals("Speaking JavaScript"))
        {
            bookTwo.click();
        }
    }

    public void clickOnThirdBook()
    {
        if(bookThree.getText().equals("Learning JavaScript Design Patterns"))
        {
            bookThree.click();
        }
    }

    public void clickOnAddToCollection() {
        scrollPage(driver);
        scrollIntoView(addToCollection,driver);
        wait.until(ExpectedConditions.elementToBeClickable(addToCollection));
        addToCollection.click();


    }

    public static void scrollIntoView(WebElement element, WebDriver driver)
    {
        JavascriptExecutor js = ((JavascriptExecutor)driver);
        js.executeScript("arguments[0].scrollIntoView(true);", element);
    }



    public void clickOnBackToBSbtn()
    {
        try {
            Assert.assertTrue(backToBS.isDisplayed());
            backToBS.click();
            Alert alert = driver.switchTo().alert();
            alert.accept();
        }
        catch (Exception e)
        {

        }
    }

    public void verifySelectedBookInProfilePage() throws InterruptedException {
        Thread.sleep(2000);
        scrollPage(driver);
        wait.until(ExpectedConditions.elementToBeClickable(ProfileOption));
        ProfileOption.click();

        wait.until(ExpectedConditions.visibilityOf(BookOne));
        Assert.assertTrue(BookOne.isDisplayed());

        driver.navigate().back();
    }

    public void clickOnBackToBSbtnTwo()
    {
        scrollIntoView(backToBS,driver);
        Assert.assertTrue(backToBS.isDisplayed());
        backToBS.click();
    }

    public void selectNextBook()
    {
        Assert.assertEquals(header.getText() , "Book Store" , "You're in Book Store , Select next book");
    }

    public void verifySecBookInProfilePage() throws InterruptedException {
        Thread.sleep(2000);
        scrollPage(driver);
        wait.until(ExpectedConditions.elementToBeClickable(ProfileOption));
        ProfileOption.click();

        wait.until(ExpectedConditions.visibilityOf(BookTwo));
        Assert.assertTrue(BookTwo.isDisplayed());

        driver.navigate().back();
    }
    public void afterSelectionOfSecBook()
    {
        Assert.assertTrue(header.isDisplayed());
    }

    public void selectProfileOption()
    {
        scrollIntoView(ProfileBtn,driver);
        wait.until(ExpectedConditions.elementToBeClickable(ProfileBtn));
        ProfileBtn.click();
    }


    public void clickonGoToBS()
    {
        wait.until(ExpectedConditions.visibilityOf(goToBSBtn));
        scrollIntoView(goToBSBtn,driver);
        wait.until(ExpectedConditions.elementToBeClickable(goToBSBtn));
        goToBSBtn.click();
    }

    public void verifyThirdBookInProfilePage() throws InterruptedException {
        Thread.sleep(2000);
        scrollIntoView(BookThree,driver);
        wait.until(ExpectedConditions.visibilityOf(BookThree));
        Assert.assertTrue(BookThree.isDisplayed());
    }
    public void verifyProfilePage()
    {
        Assert.assertTrue(ProfileHeader.isDisplayed());
    }

    public void deleteAllBooks()
    {
        scrollPage(driver);
        wait.until(ExpectedConditions.visibilityOf(deleteAllBtn));
        deleteAllBtn.click();
        alertOkBtn.click();
        try {
            wait.until(ExpectedConditions.alertIsPresent());
            Alert alert = driver.switchTo().alert();
            alert.accept();
            Assert.assertTrue(alert.getText().contains("All Books deleted."));
        } catch (Exception e) {

        }
    }

    public static void scrollPage(WebDriver driver)
    {
        JavascriptExecutor js = ((JavascriptExecutor)driver);
        js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
    }

    public void verifyNoBooksInBS()
    {
        String noData = noBooks.getText();
        Assert.assertFalse(noData.isEmpty());
    }


}
