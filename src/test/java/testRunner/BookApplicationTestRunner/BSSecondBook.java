package testRunner.BookApplicationTestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/BookStoreApplicationFeature/SelectBookTwo.feature",monochrome = true,glue = {"stepDefinition"})
public class BSSecondBook extends AbstractTestNGCucumberTests {
}
