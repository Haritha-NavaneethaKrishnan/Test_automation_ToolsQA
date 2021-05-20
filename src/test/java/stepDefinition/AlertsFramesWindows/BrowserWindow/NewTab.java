package stepDefinition.AlertsFramesWindows.BrowserWindow;

import Pages.BasePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NewTab {

    private final BasePage Pages;

    public NewTab(BasePage pages) {
        Pages = pages;
    }


    @Given("User is in Browser Windows Page")
    public void userIsInBrowserWindowsPage() {
        Pages.BrowserWindows.verifyBrowserWindow();
    }

    @When("User clicks on the New Tab Button")
    public void userClicksOnTheNewTabButton() {
        Pages.BrowserWindows.clickOnNewTabBtn();
    }

    @Then("New tab should open")
    public void newTabShouldOpen() {
        Pages.BrowserWindows.newTabOpens();
    }

}