package testRunner.ElementsTestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/ElementsFeature/BrokenLinksImages.feature",monochrome = true,glue = {"stepDefinition"})
public class BrokenLinks extends AbstractTestNGCucumberTests {
}
