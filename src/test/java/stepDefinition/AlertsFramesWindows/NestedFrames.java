package stepDefinition.AlertsFramesWindows;

import Pages.BasePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.PageFactory;

public class NestedFrames {

    private final BasePage Pages;

    public NestedFrames(BasePage pages) {
        Pages = pages;
    }


    @Given("User in Nested Frames Page")
    public void userInNestedFramesPage() {
        Pages.NestedFrames.verifyOnNestedFramesPage();
    }


    @When("User inspects the Nested Frames")
    public void userInspectsTheNestedFrames() {
        Pages.NestedFrames.getNumberofFrames();
    }

    @Then("User should be able to view the parent and child frames in nested form")
    public void userShouldBeAbleToViewTheParentAndChildFramesInNestedForm() {
        Pages.NestedFrames.verifyIfNestedFramesPresent();
    }
}