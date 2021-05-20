package testRunner.AFWTestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/AlertsFramesWindowsFeature/Frames.feature",monochrome = true,glue={"stepDefinition"})
public class Frames extends AbstractTestNGCucumberTests {
}
