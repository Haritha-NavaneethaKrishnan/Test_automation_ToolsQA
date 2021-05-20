package Pages.Elements;

import Pages.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Iterator;
import java.util.List;

public class BrokenLinksImagesPage extends TestBase {
    public static int size ;
    String url="";
    private WebDriver driver;
    private WebDriverWait wait;
    public BrokenLinksImagesPage(WebDriver driver, WebDriverWait wait)
    {
        super(driver);
        this.driver = driver;
        this.wait = wait;
    }

    @FindBy(xpath = "//li[@id='item-6']//span[@class='text' and contains(text(),'Broken Links - Images')]")
    WebElement brokenLinks;

    @FindBy(xpath = "//div[contains(text(),'Broken Links')]")
    WebElement brokenlinksHeader;
    public void verifyBrokenLinksPages()
    {
        wait.until(ExpectedConditions.visibilityOf(brokenLinks));
        scrollIntoView(brokenLinks,driver);
        wait.until(ExpectedConditions.elementToBeClickable(brokenLinks));
        brokenLinks.click();

        Assert.assertTrue(brokenlinksHeader.isDisplayed());
    }

    public static void scrollIntoView(WebElement element, WebDriver driver)
    {
        JavascriptExecutor js = ((JavascriptExecutor)driver);
        js.executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public void findTheBrokenLinks() {
        List<WebElement> allURLs = driver.findElements(By.tagName("a"));

        Iterator<WebElement> iterator = allURLs.iterator();
        while (iterator.hasNext()) {
            url = iterator.next().getText();
            verifyLinks(url);
        }
    }


        public static void verifyLinks (String linkUrl){
            try {
                URL url = new URL(linkUrl);
                HttpURLConnection httpURLConnect = (HttpURLConnection) url.openConnection();
                httpURLConnect.setConnectTimeout(5000);
                httpURLConnect.connect();
                if (httpURLConnect.getResponseCode() >= 400) {
                    size++;
                    //System.out.println(linkUrl + " - " + httpURLConnect.getResponseMessage() + "is a broken link");
                }
            } catch (Exception e) {
            }
        }

    public void brokenLinks()
    {
        boolean sizeVal = false;
        if(size>0)
        {
            sizeVal = true;
            Assert.assertTrue(sizeVal);
        }
    }
}
