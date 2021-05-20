package stepDefinition.AlertsFramesWindows.ModalDialogs;

import Pages.BasePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.PageFactory;

public class largeDialog {

    private final BasePage Pages;

    public largeDialog(BasePage pages) {
        Pages = pages;
    }


    @Given("User in Modal Dialogs Page")
    public void userInModalDialogsPage() {
        Pages.ModalDialogsPage.InMDPage();
    }

    @When("User clicks on the large modal button")
    public void userClicksOnTheLargeModalButton() {
        Pages.ModalDialogsPage.clickOnLargeDialog();
    }

    @Then("User should see a large dialog box")
    public void userShouldSeeALargeDialogBox() {
        Pages.ModalDialogsPage.verifyLargeDialogBox();
    }
}