package Pages.Interactions;

import Pages.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.List;

public class SortablePage extends TestBase {
    private WebDriver driver;
    private WebDriverWait wait;
    public SortablePage(WebDriver driver, WebDriverWait wait)
    {
        super(driver);
        this.driver = driver;
        this.wait = wait;
    }

    @FindBy(xpath = "//li[@id='item-0']//span[@class='text' and contains(text(),'Sortable')]")
    WebElement sortableOpn;

    @FindBy(xpath = "//div[@class='tab-content']//div[@id='demo-tabpane-list']//div[@class='vertical-list-container mt-4']//div[@class='list-group-item list-group-item-action' and contains(text(),'Two')]")
    WebElement lItem1;

    @FindBy(xpath = "//div[@class='tab-content']//div[@id='demo-tabpane-list']//div[@class='vertical-list-container mt-4']//div[@class='list-group-item list-group-item-action' and contains(text(),'Five')]")
    WebElement lItem2;

    @FindBy(xpath = "//div[@class='tab-content']//div[@id='demo-tabpane-list']//div[@class='vertical-list-container mt-4']//div[@class='list-group-item list-group-item-action' and contains(text(),'One')]")
    WebElement afterSortList;

    @FindBy(xpath = "//a[@id='demo-tab-grid']")
    WebElement gridTab;

    @FindBy(xpath = "//div[@class='create-grid']//div[@class='list-group-item list-group-item-action' and contains(text(),'One')]")
    WebElement gItem1;

    @FindBy(xpath = "//div[@class='create-grid']//div[@class='list-group-item list-group-item-action' and contains(text(),'Five')]")
    WebElement gItem2;

    @FindBy(xpath = "//div[@class='create-grid']//div[@class='list-group-item list-group-item-action' and contains(text(),'Two')]")
    WebElement afterSortGrid;

    @FindBy(xpath = "//div[contains(text(),'Sortable')]")
    WebElement SortableHeader;

    public void verifySortablePage()
    {
        scrollIntoView(sortableOpn,driver);
        wait.until(ExpectedConditions.elementToBeClickable(sortableOpn));
        sortableOpn.click();

        Assert.assertTrue(SortableHeader.isDisplayed());
    }

    public static void scrollIntoView(WebElement element, WebDriver driver)
    {
        JavascriptExecutor js = ((JavascriptExecutor)driver);
        js.executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public void selectItemList()
    {
        Actions action = new Actions(driver);

        action.clickAndHold(lItem1)
                .moveToElement(lItem2)
                .release()
                .build()
                .perform();
    }

    public void verifySortedList()
    {
        List<WebElement> list = driver.findElements(By.xpath("//div[@class='vertical-list-container mt-4']//div"));

        for(int i=0;i<list.size();i++)
        {
            if(list.get(i).getText().equals("Two"))
                Assert.assertTrue(afterSortGrid.isDisplayed());
            break;
        }

    }

    public void InSortablePage()
    {
        Assert.assertTrue(SortableHeader.isDisplayed());
    }

    public void selectItemGrid()
    {
        gridTab.click();

        Actions action1 = new Actions(driver);


        action1.clickAndHold(gItem1)
                .moveToElement(gItem2)
                .release()
                .build()
                .perform();
    }

    public void verifySortedGrid()
    {
        Assert.assertTrue(gItem1.isDisplayed());
    }
}
