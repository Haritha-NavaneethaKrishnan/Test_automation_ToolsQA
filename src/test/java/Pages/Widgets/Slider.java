package Pages.Widgets;

import Pages.TestBase;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Slider extends TestBase {
    private WebDriver driver;
    private WebDriverWait wait;
    public Slider(WebDriver driver, WebDriverWait wait)
    {
        super(driver);
        this.driver = driver;
        this.wait = wait;
    }

    @FindBy(xpath = "//li[@id='item-3']//span[@class='text' and contains(text(),'Slider')]")
    WebElement SliderOpn;

    @FindBy(xpath = "//span[@class='range-slider__wrap']//div[@class='range-slider__tooltip range-slider__tooltip--auto range-slider__tooltip--bottom']")
    WebElement sliderIcon;

    @FindBy(xpath = "//input[@id='sliderValue']")
    WebElement value;

    @FindBy(xpath = "//div[contains(text(),'Slider')]")
    WebElement SliderHeader;
    public void verifySliderPage()
    {
        scrollIntoView(SliderOpn,driver);
        wait.until(ExpectedConditions.elementToBeClickable(SliderOpn));
        SliderOpn.click();
        Assert.assertTrue(SliderHeader.isDisplayed());
    }

    public static void scrollIntoView(WebElement element, WebDriver driver)
    {
        JavascriptExecutor js = ((JavascriptExecutor)driver);
        js.executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public void slidetheSlider()
    {
        Actions action = new Actions(driver);
        action.dragAndDropBy(sliderIcon , 136 , 1479);
    }

    public void getValueOfSlider()
    {
        wait.until(ExpectedConditions.visibilityOf(value));
        Assert.assertTrue(value.isDisplayed());
        value.click();

    }
}
