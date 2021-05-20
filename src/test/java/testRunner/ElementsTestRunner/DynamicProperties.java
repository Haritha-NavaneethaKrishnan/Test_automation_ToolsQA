package testRunner.ElementsTestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/ElementsFeature/DynamicProperties.feature",monochrome = true,glue = {"stepDefinition"})
public class DynamicProperties extends AbstractTestNGCucumberTests {
}
