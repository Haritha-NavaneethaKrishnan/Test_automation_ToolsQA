package testRunner.AFWTestRunner.Alerts;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/AlertsFramesWindowsFeature/Alerts/AlertAfter5sec.feature",monochrome = true,glue={"stepDefinition"})
public class AlertAfter5sec extends AbstractTestNGCucumberTests {
}
