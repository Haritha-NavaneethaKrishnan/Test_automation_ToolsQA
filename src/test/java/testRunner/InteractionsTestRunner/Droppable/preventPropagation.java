package testRunner.InteractionsTestRunner.Droppable;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/InteractionsFeature/Droppable/preventPropagation.feature",monochrome = true,glue = {"stepDefinition"})
public class preventPropagation extends AbstractTestNGCucumberTests {
}
