package ExtentReports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class ExtentReporting {

    ExtentReports extent;

    ExtentSparkReporter sparkReporter ;

    @BeforeSuite
    public void BeforeSuite()
    {
        extent = new ExtentReports();

        sparkReporter = new ExtentSparkReporter("extentReport.html");

        extent.attachReporter(sparkReporter);
    }
    @AfterSuite

    public void AfterSuite()
    {
        extent.flush();
    }

    @Test
    public void extentReport1()
    {
        ExtentTest test = extent.createTest("TC1_ExtentReports1");
        WebDriver driver = null;
        System.setProperty("webdriver.chrome.driver", "src/driver/chromedriver.exe");
        test.log(Status.INFO, "Launching chrome Browser");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get("https://demoqa.com/");
        test.pass("Success");
    }

}
