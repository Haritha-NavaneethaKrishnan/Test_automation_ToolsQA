package testRunner.WidgetTestRunner.DateAndTime;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/WidgetsFeature/DateAndTime/Date.feature",monochrome = true,glue = {"stepDefinition"})
public class Date extends AbstractTestNGCucumberTests {
}
