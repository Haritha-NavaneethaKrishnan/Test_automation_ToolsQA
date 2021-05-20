package stepDefinition.Widgets;

import Pages.BasePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class WidgetsHome {

    private final BasePage Pages;

    public WidgetsHome(BasePage pages) {
        Pages = pages;
    }


    @Given("User in demo QA Home page")
    public void userInDemoQAHomePage() {
        Pages.WidgetsHome.verifyToolsQAHP();
    }

    @When("User clicks on the Widgets card")
    public void userClicksOnTheWidgetsCard() {
        Pages.WidgetsHome.clickOnWidgetCard();
    }

    @Then("User should be navigated to Widget Home Page")
    public void userShouldBeNavigatedToWidgetHomePage() {
        Pages.WidgetsHome.verifyWidgetsPage();
    }
}