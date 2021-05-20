package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


public class TestBase {

    protected final WebDriver driver;

    public TestBase(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
        this.driver = driver;
    }
}
