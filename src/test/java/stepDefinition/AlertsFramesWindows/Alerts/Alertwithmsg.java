package stepDefinition.AlertsFramesWindows.Alerts;

import Pages.BasePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Alertwithmsg {

    private final BasePage Pages;

    public Alertwithmsg(BasePage pages) {
        Pages = pages;
    }


    @Given("User is in the Alerts Page")
    public void userIsInTheAlertsPage() {
        Pages.AlertsPage.InAlertsPage();
    }

    @When("User clicks on the third button")
    public void userClicksOnTheThirdButton() {
        Pages.AlertsPage.clickOnConfirmButton();
    }

    @Then("User clicked button name should be viewed near third button")
    public void userClickedButtonNameShouldBeViewedNearThirdButton() {
        Pages.AlertsPage.resposeAlert();
    }
}