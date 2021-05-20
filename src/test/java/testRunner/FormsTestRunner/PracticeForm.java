package testRunner.FormsTestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/FormsFeature/PracticeForm.feature",monochrome = true,glue = {"stepDefinition"})
public class PracticeForm extends AbstractTestNGCucumberTests {
}
