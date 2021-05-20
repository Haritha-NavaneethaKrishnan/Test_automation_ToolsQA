package testRunner.BookApplicationTestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/BookStoreApplicationFeature/SelectBookOne.feature",monochrome = true,glue = {"stepDefinition"})
public class BSFirstBook extends AbstractTestNGCucumberTests {
}
