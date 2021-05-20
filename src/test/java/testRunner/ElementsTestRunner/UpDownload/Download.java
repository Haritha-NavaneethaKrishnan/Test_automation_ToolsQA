package testRunner.ElementsTestRunner.UpDownload;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/ElementsFeature/Download and Upload/Download.feature",monochrome = true,glue = {"stepDefinition"})
public class Download extends AbstractTestNGCucumberTests {
}
