package testRunner.InteractionsTestRunner.Draggable;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/InteractionsFeature/Draggable/simple.feature",monochrome = true,glue = {"stepDefinition"})
public class simple extends AbstractTestNGCucumberTests {
}
