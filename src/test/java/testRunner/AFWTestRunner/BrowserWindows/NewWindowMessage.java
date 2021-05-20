package testRunner.AFWTestRunner.BrowserWindows;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/AlertsFramesWindowsFeature/BrowserWindows/NewWindowMessage.feature",monochrome = true,glue="stepDefinition")
public class NewWindowMessage extends AbstractTestNGCucumberTests {
}
