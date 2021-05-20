package testRunner.BookApplicationTestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/BookStoreApplicationFeature/ProfileSectionAddBook.feature",monochrome = true,glue = {"stepDefinition"})
public class ProfileSectionAddBook extends AbstractTestNGCucumberTests {
}
