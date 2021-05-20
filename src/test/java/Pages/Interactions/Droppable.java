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

public class Droppable extends TestBase {
    private WebDriver driver;
    private WebDriverWait wait;
    public Droppable(WebDriver driver, WebDriverWait wait)
    {
        super(driver);
        this.driver = driver;
        this.wait = wait;
    }

    @FindBy(xpath = "//li[@id='item-3']//span[@class='text' and contains(text(),'Droppable')]")
    WebElement dropOpn;

    @FindBy(xpath = "//div[@id='draggable']")
    WebElement simpleDrag;

    @FindBy(xpath = "//div[@id='simpleDropContainer']//div[@id='droppable']")
    WebElement simpleDrop;

    @FindBy(xpath = "//a[@id='droppableExample-tab-accept']")
    WebElement acceptTab;

    @FindBy(xpath = "//div[@id='acceptable']")
    WebElement acceptDrag;

    @FindBy(xpath = "//div[@id='acceptDropContainer']//div[@id='droppable']")
    WebElement acceptDrop;

    @FindBy(xpath = "//a[@id='droppableExample-tab-preventPropogation']")
    WebElement preProTab;

    @FindBy(xpath = "//div[@id='dragBox']")
    WebElement pDrag;

    @FindBy(xpath = "//div[@id='greedyDropBoxInner']")
    WebElement pDrop;

    @FindBy(xpath = "//a[@id='droppableExample-tab-revertable']")
    WebElement revertDrag;

    @FindBy(xpath = "//div[@id='revertable']")
    WebElement rDrag;

    @FindBy(xpath = "//div[@id='notRevertable']")
    WebElement notRDrag;

    @FindBy(xpath = "//div[@id='revertableDropContainer']//div[@id='droppable']")
    WebElement rDrop;

    @FindBy(xpath = "//div[contains(text(),'Droppable')]")
    WebElement DroppableHeader;
    public void verifyDroppablePage()
    {
        scrollIntoView(dropOpn,driver);
        wait.until(ExpectedConditions.elementToBeClickable(dropOpn));
        dropOpn.click();

        Assert.assertTrue(DroppableHeader.isDisplayed());
    }

    public static void scrollIntoView(WebElement element, WebDriver driver)
    {
        JavascriptExecutor js = ((JavascriptExecutor)driver);
        js.executeScript("arguments[0].scrollIntoView(true);", element);
    }


    public void simpleDragDrop()
    {
        Actions action = new Actions(driver);


        action.clickAndHold(simpleDrag)
                .moveToElement(simpleDrop)
                .release()
                .build()
                .perform();
    }

    public void doneSimpleDD()
    {
        Assert.assertTrue(simpleDrop.isEnabled());
    }

    public void InDroppablePage()
    {
        Assert.assertTrue(DroppableHeader.isDisplayed());

    }

    public void acceptDragDrop()
    {
        acceptTab.click();
        Actions action1 = new Actions(driver);
        action1.clickAndHold(acceptDrag)
                .moveToElement(acceptDrop)
                .release()
                .build()
                .perform();
    }

    public void doneAcceptDD()
    {
        Assert.assertTrue(acceptDrop.isEnabled());

    }

    public void prePropagationDragDrop()
    {
        preProTab.click();
        Actions action2 = new Actions(driver);
        action2.clickAndHold(pDrag)
                .moveToElement(pDrop)
                .release()
                .build()
                .perform();

    }

    public void prePropagationDD()
    {
        Assert.assertTrue(pDrop.isEnabled());
    }

    public void revertDD()
    {
        revertDrag.click();
        Actions action3 = new Actions(driver);
        action3.clickAndHold(rDrag)
                .moveToElement(rDrop)
                .release()
                .build()
                .perform();

    }

    public void notRevertDD()
    {
        Actions action4 = new Actions(driver);
        action4.clickAndHold(notRDrag)
                .moveToElement(rDrop)
                .release()
                .build()
                .perform();
    }

    public void revertDgDg()
    {
        Assert.assertTrue(rDrop.isEnabled());

    }
}
