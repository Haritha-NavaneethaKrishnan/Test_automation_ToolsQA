package stepDefinition.AlertsFramesWindows.Alerts;

import Pages.BasePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Promptbox {

    private final BasePage Pages;

    public Promptbox(BasePage pages) {
        Pages = pages;
    }
    

    @Given("User is in  Alerts Page")
    public void userIsInAlertsPage() {
        Pages.AlertsPage.InAlertsPage();
    }

    @When("User clicks on the fourth button")
    public void userClicksOnTheFourthButton() {
        Pages.AlertsPage.clickOnPromptBtn();
    }

    @Then("User entered value in prompt box should be displayed near fourth Click Me button")
    public void userEnteredValueInPromptBoxShouldBeDisplayedNearFourthClickMeButton() {
        Pages.AlertsPage.handlePrompt();
    }
}
