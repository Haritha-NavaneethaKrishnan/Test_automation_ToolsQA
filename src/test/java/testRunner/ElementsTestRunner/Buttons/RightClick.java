package testRunner.ElementsTestRunner.Buttons;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features = "src/test/resources/ElementsFeature/Buttons/RightClick.feature",monochrome = true,glue={"stepDefinition"})
public class RightClick extends AbstractTestNGCucumberTests {
}
