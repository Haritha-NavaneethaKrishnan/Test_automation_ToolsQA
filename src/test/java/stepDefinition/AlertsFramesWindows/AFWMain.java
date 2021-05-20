package stepDefinition.AlertsFramesWindows;

import Pages.BasePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AFWMain {

    private final BasePage Pages;

    public AFWMain(BasePage pages) {
        Pages = pages;
    }

    @Given("User is in Home Page")
    public void userIsInHomePage() {
        Pages.AFWMainPage.verifyToolsQAHP();
    }

    @When("User clicks on Alerts,Frames and Windows Card")
    public void userClicksOnAlertsFramesAndWindowsCard() {
        Pages.AFWMainPage.clickOnAFWHomePage();
    }

    @Then("User should be navigated to Alert,Frames and Windows Page")
    public void userShouldBeNavigatedToAlertFramesAndWindowsPage() {
        Pages.AFWMainPage.verifyAFWPage();
    }
}