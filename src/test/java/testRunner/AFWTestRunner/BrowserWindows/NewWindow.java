package testRunner.AFWTestRunner.BrowserWindows;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/AlertsFramesWindowsFeature/BrowserWindows/NewWindow.feature",monochrome = true,glue = {"stepDefinition"})
public class NewWindow extends AbstractTestNGCucumberTests {
}
