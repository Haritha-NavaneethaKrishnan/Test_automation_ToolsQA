package testRunner.InteractionsTestRunner.Selectable;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/InteractionsFeature/Selectable/List.feature",monochrome = true,glue = {"stepDefinition"})
public class List extends AbstractTestNGCucumberTests {
}
