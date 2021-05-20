package testRunner.WidgetTestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/WidgetsFeature/Menu.feature",monochrome = true,glue = {"stepDefinition"})
public class Menu extends AbstractTestNGCucumberTests {
}
