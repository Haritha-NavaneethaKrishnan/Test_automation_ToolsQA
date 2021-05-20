package Pages.Widgets;

import Pages.TestBase;
import io.cucumber.java.eo.Se;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;

public class DateAndTime extends TestBase {
    private WebDriver driver;
    private WebDriverWait wait;

    public DateAndTime(WebDriver driver, WebDriverWait wait) {
        super(driver);
        this.driver = driver;
        this.wait = wait;
    }
    @FindBy(xpath = "//li[@id='item-2']//span[@class='text' and contains(text(),'Date Picker')]")
    WebElement datePickerOpn;

    @FindBy(xpath = "//input[@id='datePickerMonthYearInput']")
    WebElement date;

    @FindBy(xpath = "//input[@id='dateAndTimePickerInput']")
    WebElement dateTime;

    @FindBy(xpath = "//div[contains(text(),'Date Picker')]")
    WebElement DatePickerHeader;

    @FindBy(xpath = "//div[@class='react-datepicker__day react-datepicker__day--005 react-datepicker__day--weekend react-datepicker__day--outside-month' and text()=5]")
    WebElement date1;

    @FindBy(xpath = "//li[text()='12:00']")
    WebElement time;

    @FindBy(xpath = "//div[@class='react-datepicker__day react-datepicker__day--007 react-datepicker__day--outside-month' and text()='7']")
    WebElement Date;
    public void verifyDatePicker()
    {
        scrollIntoView(datePickerOpn,driver);
        wait.until(ExpectedConditions.elementToBeClickable(datePickerOpn));
        datePickerOpn.click();

        Assert.assertTrue(DatePickerHeader.isDisplayed());
    }

    public static void scrollIntoView(WebElement element, WebDriver driver)
    {
        JavascriptExecutor js = ((JavascriptExecutor)driver);
        js.executeScript("arguments[0].scrollIntoView(true);", element);
    }


    public void setDate()
    {
        Actions actions = new Actions(driver);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView()",date);
        wait.until(ExpectedConditions.elementToBeClickable(date));
        date.click();

        wait.until(ExpectedConditions.visibilityOf(Date));
        actions.moveToElement(Date).build().perform();

        wait.until(ExpectedConditions.elementToBeClickable(Date));
        Date.click();

    }

    public void dateSet()
    {
        Assert.assertTrue(date.isDisplayed());
    }

    public void InDatePickerPage()
    {
        Assert.assertTrue(DatePickerHeader.isDisplayed());
    }

    public void setDateAndTime()
    {
        Actions actions = new Actions(driver);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView()",dateTime);
        wait.until(ExpectedConditions.elementToBeClickable(dateTime));
        dateTime.click();
        wait.until(ExpectedConditions.visibilityOf(date1));
        actions.moveToElement(date1).build().perform();
        wait.until(ExpectedConditions.elementToBeClickable(date1));
        date1.click();
        actions.moveToElement(time).build().perform();
        wait.until(ExpectedConditions.elementToBeClickable(time));
        time.click();
    }

    public void dateAndTimeSet()
    {
        Assert.assertTrue(dateTime.isDisplayed());
    }
}
