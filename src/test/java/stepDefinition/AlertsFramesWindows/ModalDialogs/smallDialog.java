package stepDefinition.AlertsFramesWindows.ModalDialogs;

import Pages.BasePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.PageFactory;

public class smallDialog {

    private final BasePage Pages;

    public smallDialog(BasePage pages) {
        Pages = pages;
    }

    @Given("User is in Modal Dialogs Page")
    public void userIsInModalDialogsPage() {
        Pages.ModalDialogsPage.verifyMDPage();
    }

    @When("User clicks on the small modal button")
    public void userClicksOnTheSmallModalButton() {
        Pages.ModalDialogsPage.clickOnSmallDialog();
    }

    @Then("User should see a small dialog box")
    public void userShouldSeeASmallDialogBox() {
        Pages.ModalDialogsPage.verifySmallDialogBox();
    }
}