package testRunner.ElementsTestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/ElementsFeature/TextBoxFunctionality.feature",monochrome = true,glue = {"stepDefinition"})
public class TextBoxEle extends AbstractTestNGCucumberTests {
}
