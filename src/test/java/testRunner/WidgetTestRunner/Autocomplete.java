package testRunner.WidgetTestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/WidgetsFeature/autoComplete.feature",monochrome = true,glue={"stepDefinition"})
public class Autocomplete extends AbstractTestNGCucumberTests {
}
