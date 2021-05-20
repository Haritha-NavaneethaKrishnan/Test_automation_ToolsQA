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

import java.util.List;

public class CheckBoxPage extends TestBase {

    private WebDriver driver;
    private WebDriverWait wait;
    public CheckBoxPage(WebDriver driver, WebDriverWait wait)
    {
        super(driver);
        this.driver = driver;
        this.wait = wait;
    }

    @FindBy(xpath = "//li[@id='item-1']//span[@class='text' and contains(text(),'Check Box')]")
    WebElement checkBoxOption;

    @FindBy(xpath = "//span[@class='rct-text']//button[@type='button']")
    WebElement dropdownBtn;

    @FindBy(xpath = "//div[@class='rct-options']//button[@title='Collapse all']")
    WebElement minusBtn;

    @FindBy(xpath = "//div[@id='result']")
    WebElement result;

    @FindBy(xpath = "//div[contains(text(),'Check Box')]")
    WebElement checkBoxHeader;
    public void verifyCheckBoxPage()
    {
        wait.until(ExpectedConditions.visibilityOf(checkBoxOption));
        checkBoxOption.click();

        Assert.assertTrue(checkBoxHeader.isDisplayed());
    }

    public void clickOndropdown()
    {
        scrollIntoView(dropdownBtn,driver);
        dropdownBtn.click();
    }
    public static void scrollIntoView(WebElement element, WebDriver driver)
    {
        JavascriptExecutor js = ((JavascriptExecutor)driver);
        js.executeScript("arguments[0].scrollIntoView(true);", element);
    }
    public void clickOnCheckbox()
    {
        List<WebElement> list = driver.findElements(By.xpath("//div[@id='tree-node']//ol//ol//label"));

        boolean sizeValue = true;

        if(list.size()<0)
        {
            sizeValue = false;
        }
         Assert.assertTrue(sizeValue);

        for(int i=0;i<list.size();i++)
        {

            if(list.get(i).getText().equals("Desktop"))
            list.get(i).click();
            else if(list.get(i).getText().equals(("Downloads")))
            {
                list.get(i).click();
            }
        }
    }

    public void clickOnMinusButton()
    {
        scrollIntoView(minusBtn,driver);
        wait.until(ExpectedConditions.elementToBeClickable(minusBtn));
        minusBtn.click();
    }

    public void verifyCheckedCheckbox()
    {
        wait.until(ExpectedConditions.elementToBeClickable(result));
        String res[] = result.getText().split(":");
        boolean checkSelected = res[1].toString().isEmpty();
        Assert.assertFalse(checkSelected);

    }
}
