package Pages.Elements;

import Pages.TestBase;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.io.IOException;

public class UploadDownloadPage extends TestBase {
    private WebDriver driver;
    private WebDriverWait wait;
    public UploadDownloadPage(WebDriver driver, WebDriverWait wait)
    {
        super(driver);
        this.driver = driver;
        this.wait = wait;
    }
    @FindBy(xpath = "//li[@id='item-7']//span[@class='text' and contains(text(),'Upload and Download')]")
    WebElement udBtn;

    @FindBy(xpath = "//a[@id='downloadButton']")
    WebElement downloadBtn;

    @FindBy(xpath = "//input[@id='uploadFile']")
    WebElement uploadBtn;

    @FindBy(xpath = "//div[contains(text(),'Upload and Download')]")
    WebElement UPHeader;

    @FindBy(xpath = "//p[@id='uploadedFilePath']")
    WebElement filePath;
    public void uploadDownloadPage()
    {
        scrollIntoView(udBtn,driver);
        wait.until(ExpectedConditions.visibilityOf(udBtn));
        udBtn.click();

        Assert.assertTrue(UPHeader.isDisplayed());

    }

    public static void scrollIntoView(WebElement element, WebDriver driver)
    {
        JavascriptExecutor js = ((JavascriptExecutor)driver);
        js.executeScript("arguments[0].scrollIntoView(true);", element);
    }


    public void clickOnDownloadBtn()
    {
        wait.until(ExpectedConditions.visibilityOf(downloadBtn));

        downloadBtn.click();
    }

    public void verifyitemDownloaded()
    {
        String sourceLocation = downloadBtn.getAttribute("href");
        String wget_command = "cmd /c C:\\Wget\\wget.exe -P D: " + sourceLocation;

        try {
            Process exec = Runtime.getRuntime().exec(wget_command);
            int exitVal = exec.waitFor();
        } catch (InterruptedException | IOException ex) {

        }
    }

    public void uploadItem()
    {
        wait.until(ExpectedConditions.visibilityOf(uploadBtn));
        uploadBtn.sendKeys("C:\\Users\\hnavane\\IdeaProjects\\FinalAssessment\\src\\test\\java\\UploadItem\\sampleFile.jpeg");
    }

    public void verifyItemUploaded() throws InterruptedException {
        Thread.sleep(1000);
        Assert.assertTrue(filePath.isDisplayed());
    }
}
