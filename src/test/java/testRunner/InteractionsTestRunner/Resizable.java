package testRunner.InteractionsTestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/InteractionsFeature/resizable.feature",monochrome = true,glue = {"stepDefinition"})
public class Resizable extends AbstractTestNGCucumberTests {
}
