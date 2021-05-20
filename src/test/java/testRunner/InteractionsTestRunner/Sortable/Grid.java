package testRunner.InteractionsTestRunner.Sortable;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/InteractionsFeature/Sortable/Grid.feature",monochrome = true,glue = {"stepDefinition"})
public class Grid extends AbstractTestNGCucumberTests {
}
