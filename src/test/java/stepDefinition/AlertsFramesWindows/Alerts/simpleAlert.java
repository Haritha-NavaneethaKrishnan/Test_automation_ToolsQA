package stepDefinition.AlertsFramesWindows.Alerts;

import Pages.BasePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class simpleAlert {

    private final BasePage Pages;

    public simpleAlert(BasePage pages) {
        Pages = pages;
    }
    

    @Given("User in Alerts Page")
    public void userInAlertsPage() {
        Pages.AlertsPage.verifyAlertsPage();
    }


    @When("User click on the first button")
    public void userClickOnTheFirstButton() {
        Pages.AlertsPage.clickOnSimpleAlert();
    }

    @Then("User should see the alert box")
    public void userShouldSeeTheAlertBox() {
        Pages.AlertsPage.simpleAlert();
    }
}