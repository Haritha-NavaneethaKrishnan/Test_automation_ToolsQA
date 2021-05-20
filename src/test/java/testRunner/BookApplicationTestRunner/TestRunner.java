package testRunner.BookApplicationTestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/BookStoreApplicationFeature/BookStoreLogin.feature",monochrome = true,glue = {"stepDefinition"})
public class TestRunner extends AbstractTestNGCucumberTests {
}
