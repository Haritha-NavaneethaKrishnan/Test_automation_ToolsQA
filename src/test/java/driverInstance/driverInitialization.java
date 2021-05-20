package driverInstance;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class driverInitialization {
    public static WebDriver getDriverInstance() {
        WebDriver driver = null;
        System.setProperty("webdriver.chrome.driver", "src/driver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get("https://demoqa.com/");
        return driver;
    }

    public static WebDriverWait waitInstance(WebDriver driver)
    {
        WebDriverWait wait = new WebDriverWait(driver,30);
        return wait;
    }
}