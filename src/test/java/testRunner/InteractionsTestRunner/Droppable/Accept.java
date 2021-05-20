package testRunner.InteractionsTestRunner.Droppable;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/InteractionsFeature/Droppable/Accept.feature",monochrome = true,glue = {"stepDefinition"})
public class Accept extends AbstractTestNGCucumberTests {
}
