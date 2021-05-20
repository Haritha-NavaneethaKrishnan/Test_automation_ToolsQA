package stepDefinition.AlertsFramesWindows.BrowserWindow;

import Pages.BasePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NewWindowMessage {

    private final BasePage Pages;

    public NewWindowMessage(BasePage pages) {
        Pages = pages;
    }


    @Given("User in the Browser Windows Page")
    public void userInTheBrowserWindowsPage() {
        Pages.BrowserWindows.verifyBrowserWindowPage();
    }

    @When("User clicks on the New Window Message Button")
    public void userClicksOnTheNewWindowMessageButton() {
        Pages.BrowserWindows.NewWindowMsg();
    }

    @Then("New window with message should be opened")
    public void newWindowWithMessageShouldBeOpened() {
        Pages.BrowserWindows.newWindowwithMsgOpens();
    }
}