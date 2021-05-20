package testRunner.ElementsTestRunner.WebTables;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/ElementsFeature/WebTables/DeleteUser.feature",monochrome = true,glue = {"stepDefinition"})
public class DeleteUserWebTables extends AbstractTestNGCucumberTests {
}
