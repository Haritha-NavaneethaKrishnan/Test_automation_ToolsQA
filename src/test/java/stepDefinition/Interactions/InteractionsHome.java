package stepDefinition.Interactions;

import Pages.BasePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class InteractionsHome {

    private final BasePage Pages;

    public InteractionsHome(BasePage pages) {
        Pages = pages;
    }



    @Given("User in QA Home Page")
    public void userInQAHomePage() {
        Pages.InteractionsHomePage.verifyToolsQAHP();
    }

    @When("User clicks on the Interactions Card")
    public void userClicksOnTheInteractionsCard() {
        Pages.InteractionsHomePage.clickOnInteractionsCard();
    }

    @Then("User should be navigated to Interactions Home Page")
    public void userShouldBeNavigatedToInteractionsHomePage() {
        Pages.InteractionsHomePage.verifyInteractionsPage();
    }
}

