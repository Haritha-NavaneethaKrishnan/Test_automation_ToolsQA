package stepDefinition.AlertsFramesWindows;

import Pages.BasePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.PageFactory;

public class Frames {

    private final BasePage Pages;

    public Frames(BasePage pages) {
        Pages = pages;
    }


    @Given("User is in Frames Page")
    public void userIsInFramesPage() {
        Pages.Frames.onFramesPage();
    }
    @When("User scrolls down to the end of page")
    public void userScrollsDownToTheEndOfPage() {
        Pages.Frames.iframesFound();
    }
    @Then("User should see two iframes in Frames Page")
    public void userShouldSeeTwoIframesInFramesPage() {
        Pages.Frames.verifyIfIframePresent();
    }
}