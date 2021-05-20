package testRunner.ElementsTestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/ElementsFeature/ElementsCard.feature",monochrome = true,glue = {"stepDefinition"})
public class ElementsCard extends AbstractTestNGCucumberTests {
}
