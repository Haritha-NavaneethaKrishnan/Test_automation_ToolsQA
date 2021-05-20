package stepDefinition.AlertsFramesWindows.Alerts;

import Pages.BasePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Alertafter5sec {

    private final BasePage Pages;

    public Alertafter5sec(BasePage pages) {
        Pages = pages;
    }


    @Given("User in the Alerts Page")
    public void userInTheAlertsPage() {
        Pages.AlertsPage.InAlertsPage();
    }

    @When("User click on the second button")
    public void userClickOnTheSecondButton() throws InterruptedException {
        Pages.AlertsPage.clickOntimerAlert();
    }

    @Then("User should be able to see the alert after {int} seconds")
    public void userShouldBeAbleToSeeTheAlertAfterSeconds(int arg0) {
        Pages.AlertsPage.timerAlert();
    }
}
