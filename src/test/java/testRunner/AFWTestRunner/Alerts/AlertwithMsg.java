package testRunner.AFWTestRunner.Alerts;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/AlertsFramesWindowsFeature/Alerts/AlertwithMsg.feature",monochrome = true,glue={"stepDefinition"})
public class AlertwithMsg extends AbstractTestNGCucumberTests {
}
