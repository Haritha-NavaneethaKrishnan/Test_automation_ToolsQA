package testRunner.AFWTestRunner.Alerts;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/AlertsFramesWindowsFeature/Alerts/simpleAlert.feature",monochrome = true,glue={"stepDefinition"})
public class simpleAlert extends AbstractTestNGCucumberTests {
}
