package Pages.Interactions;

import Pages.TestBase;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.List;

public class Selectable extends TestBase {

    private WebDriver driver;
    private WebDriverWait wait;

    public Selectable(WebDriver driver, WebDriverWait wait) {
        super(driver);
        this.driver = driver;
        this.wait = wait;
    }

    @FindBy(xpath = "//li[@id='item-1']//span[@class='text' and contains(text(),'Selectable')]")
    WebElement selectableOpn;

    @FindBy(xpath = "//a[@id='demo-tab-list']")
    WebElement listTab;

    @FindBy(xpath = "//ul[@id='verticalListContainer']//li[contains(text(),'Cras justo odio')]")
    WebElement litem1;

    @FindBy(xpath = "//ul[@id='verticalListContainer']//li[contains(text(),'Morbi leo risus')]")
    WebElement litem2;


    @FindBy(xpath = "//a[@id='demo-tab-grid']")
    WebElement gridTab;

    @FindBy(xpath = "//li[contains(text(),'One')]")
    WebElement gitem1;

    @FindBy(xpath = "//li[contains(text(),'Five')]")
    WebElement gitem2;

    @FindBy(xpath = "//li[contains(text(),'Nine')]")
    WebElement gitem3;

    @FindBy(xpath = "//div[contains(text(),'Selectable')]")
    WebElement SelectableHeader;
    public void verifySelectablePage()
    {
        scrollIntoView(selectableOpn,driver);
        wait.until(ExpectedConditions.elementToBeClickable(selectableOpn));
        selectableOpn.click();

        Assert.assertTrue(SelectableHeader.isDisplayed());
    }

    public static void scrollIntoView(WebElement element, WebDriver driver)
    {
        JavascriptExecutor js = ((JavascriptExecutor)driver);
        js.executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public void selectItemsList()
    {
        List<WebElement> list=driver.findElements(By.xpath("//div[@class='tab-content']//div[@id='demo-tabpane-list']//ul//li"));


        for(int i=0;i<list.size();i++)
        {
            if(list.get(i).getText().equals("Cras justo odio")|| list.get(i).getText().equals("Morbi leo risus")) {
                list.get(i).click();
            }
        }
    }

    public void itemsSelected()
    {
        Assert.assertTrue(litem1.isEnabled());
        Assert.assertTrue(litem2.isEnabled());
    }

    public void InSelectablePage()
    {
        Assert.assertTrue(SelectableHeader.isDisplayed());
    }

    public void selectItemsGrid()
    {
        gridTab.click();

        wait.until(ExpectedConditions.elementToBeClickable(gitem1));

        gitem1.click();

        wait.until(ExpectedConditions.elementToBeClickable(gitem2));
        gitem2.click();

        wait.until(ExpectedConditions.elementToBeClickable(gitem3));
        gitem3.click();
    }

    public void itemsSelectedGrid()
    {
        Assert.assertTrue(gitem1.isEnabled());
        Assert.assertTrue(gitem2.isEnabled());
        Assert.assertTrue(gitem3.isEnabled());
    }
}
