package stepDefinition.Widgets;

import Pages.BasePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProgressBar {

    private final BasePage Pages;

    public ProgressBar(BasePage pages) {
        Pages = pages;
    }



    @Given("User is in Progress Bar Page")
    public void userIsInProgressBarPage() {
        Pages.ProgressBarPage.verifyOnProgressBarPage();
    }

    @When("User clicks on the start button")
    public void userClicksOnTheStartButton() {
        Pages.ProgressBarPage.clickOnStartbtn();
    }

    @Then("User should be able to view the changes in Progress bar")
    public void userShouldBeAbleToViewTheChangesInProgressBar() throws InterruptedException {
        Pages.ProgressBarPage.progressChanges();
    }
}
