package testRunner.InteractionsTestRunner.Draggable;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/InteractionsFeature/Draggable/cursorStyle.feature",monochrome = true,glue = {"stepDefinition"})
public class cursorStyle extends AbstractTestNGCucumberTests {
}
