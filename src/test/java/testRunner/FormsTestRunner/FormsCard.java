package testRunner.FormsTestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/FormsFeature/FormsCard.feature",monochrome = true,glue={"stepDefinition"})
public class FormsCard extends AbstractTestNGCucumberTests {
}
