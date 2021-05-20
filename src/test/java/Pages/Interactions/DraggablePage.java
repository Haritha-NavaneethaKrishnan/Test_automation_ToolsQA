package Pages.Interactions;

import Pages.TestBase;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class DraggablePage extends TestBase {
    private WebDriver driver;
    private WebDriverWait wait;
    public DraggablePage(WebDriver driver, WebDriverWait wait)
    {
        super(driver);
        this.driver = driver;
        this.wait = wait;
    }

    @FindBy(xpath = "//li[@id='item-4']//span[@class='text' and contains(text(),'Dragabble')]")
    WebElement dragOpn;

    @FindBy(xpath = "//div[@id='dragBox']")
    WebElement simpleDrag;

    @FindBy(xpath = "//a[@id='draggableExample-tab-axisRestriction']")
    WebElement axisRes;

    @FindBy(xpath = "//div[@id='restrictedX']")
    WebElement xAxis;

    @FindBy(xpath = "//div[@id='restrictedY']")
    WebElement yAxis;

    @FindBy(xpath = "//a[@id='draggableExample-tab-containerRestriction']")
    WebElement contRes;

    @FindBy(xpath = "//div[contains(text(),\"I'm contained within the box\")]")
    WebElement contEle;

    @FindBy(xpath = "//a[@id='draggableExample-tab-cursorStyle']")
    WebElement cursorStyle;

    @FindBy(xpath = "//div[@id='cursorCenter']")
    WebElement box1;

    @FindBy(xpath = "//div[@id='cursorTopLeft']")
    WebElement box2;

    @FindBy(xpath = "//div[contains(text(),'Dragabble')]")
    WebElement DragabbleHeader;
    public void verifyDraggablePage()
    {
        scrollIntoView(dragOpn,driver);
        wait.until(ExpectedConditions.elementToBeClickable(dragOpn));
        dragOpn.click();
        Assert.assertTrue(DragabbleHeader.isDisplayed());
    }

    public static void scrollIntoView(WebElement element, WebDriver driver)
    {
        JavascriptExecutor js = ((JavascriptExecutor)driver);
        js.executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public void simpleDrag()
    {
        Actions actions=new Actions(driver);
        actions.dragAndDropBy(simpleDrag, 60, 70).build().perform();
    }

    public void simpleDragDone()
    {
        Assert.assertTrue(simpleDrag.isDisplayed());
    }

    public void InDragabblePage()
    {
        Assert.assertTrue(DragabbleHeader.isDisplayed());
    }

    public void axisRestricted()
    {
        axisRes.click();

        Actions action1=new Actions(driver);
        action1.dragAndDropBy(xAxis, 90, 0).build().perform();
        Actions action2=new Actions(driver);
        action2.dragAndDropBy(yAxis,0,-50);

    }


    public void axisResDragDone()
    {
        Assert.assertTrue(xAxis.isDisplayed());
        Assert.assertTrue(yAxis.isDisplayed());
    }

    public void containerRestricted()
    {
        contRes.click();
        Actions action3=new Actions(driver);
        action3.dragAndDropBy(contEle,794 , 400);

    }

    public void contResDrag()
    {
        Assert.assertTrue(contEle.isDisplayed());
    }

    public void cursorStyle()
    {
        cursorStyle.click();

        Actions action4=new Actions(driver);

        action4.clickAndHold(box1)
                .moveToElement(box2)
                .release()
                .build()
                .perform();

    }

    public void curStyleDrag()
    {
        Assert.assertTrue(cursorStyle.isDisplayed());
        driver.navigate().to("https://demoqa.com/");
    }

}
