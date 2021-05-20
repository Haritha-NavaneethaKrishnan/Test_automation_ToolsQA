package testRunner.WidgetTestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/WidgetsFeature/ToolTips.feature",monochrome = true,glue = {"stepDefinition"})
public class ToolTips extends AbstractTestNGCucumberTests {

}
