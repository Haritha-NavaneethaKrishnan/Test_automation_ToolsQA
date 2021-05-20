package testRunner.AFWTestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/AlertsFramesWindowsFeature/NestedFrames.feature",monochrome = true,glue={"stepDefinition"})
public class NestedFrames extends AbstractTestNGCucumberTests {
}
