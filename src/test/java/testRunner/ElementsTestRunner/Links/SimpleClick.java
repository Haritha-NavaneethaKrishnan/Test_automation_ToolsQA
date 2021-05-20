package testRunner.ElementsTestRunner.Links;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/ElementsFeature/Links/LinksOpenInNewTab.feature",monochrome = true,glue = {"stepDefinition"})
public class SimpleClick extends AbstractTestNGCucumberTests {
}
