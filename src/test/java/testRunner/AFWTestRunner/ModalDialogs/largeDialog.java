package testRunner.AFWTestRunner.ModalDialogs;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/AlertsFramesWindowsFeature/Model Dialogs/largeModal.feature",monochrome = true,glue={"stepDefinition"})
public class largeDialog extends AbstractTestNGCucumberTests {
}
