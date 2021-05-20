package testRunner.ElementsTestRunner.Buttons;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/ElementsFeature/Buttons/DoubleClick.feature",monochrome = true,glue={"stepDefinition"})
public class DoubleClick extends AbstractTestNGCucumberTests {
}
