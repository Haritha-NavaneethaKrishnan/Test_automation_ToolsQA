package testRunner.AFWTestRunner.ModalDialogs;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/AlertsFramesWindowsFeature/Model Dialogs/smallModel.feature",monochrome = true,glue = {"stepDefinition"})
public class smallDialog extends AbstractTestNGCucumberTests {
}
