package stepDefinition.AlertsFramesWindows.BrowserWindow;

import Pages.BasePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NewWindow {

    private final BasePage Pages;

    public NewWindow(BasePage pages) {
        Pages = pages;
    }

    @Given("User in Browser Windows Page")
    public void userInBrowserWindowsPage() {
        Pages.BrowserWindows.verifyBrowserWindowPage();
    }


    @When("User clicks on the New Window Button")
    public void userClicksOnTheNewWindowButton() {
        Pages.BrowserWindows.clickOnNewWindowBtn();
    }

    @Then("New window should be opened")
    public void newWindowShouldBeOpened() {
        Pages.BrowserWindows.newWindowOpens();
    }
}