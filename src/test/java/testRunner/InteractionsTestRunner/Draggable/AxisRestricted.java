package testRunner.InteractionsTestRunner.Draggable;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/InteractionsFeature/Draggable/AxisRestricted.feature",monochrome = true,glue = {"stepDefinition"})
public class AxisRestricted extends AbstractTestNGCucumberTests {
}
