package testRunner.AFWTestRunner.Alerts;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/AlertsFramesWindowsFeature/Alerts/PromptBox.feature",monochrome = true,glue = {"stepDefinition"})
public class PromptBox extends AbstractTestNGCucumberTests {
}
