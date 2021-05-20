package testRunner.AFWTestRunner.BrowserWindows;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/AlertsFramesWindowsFeature/BrowserWindows/NewTab.feature",monochrome = true,glue={"stepDefinition"})
public class NewTab extends AbstractTestNGCucumberTests {
}
