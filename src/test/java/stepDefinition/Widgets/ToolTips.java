package stepDefinition.Widgets;

import Pages.BasePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ToolTips {

    private final BasePage Pages;

    public ToolTips(BasePage pages) {
        Pages = pages;
    }


    @Given("User is in Tool Tips Page")
    public void userIsInToolTipsPage() {
Pages.ToolTipsPage.ToolTipsPage();
    }

    @When("User hovers over the element")
    public void userHoversOverTheElement() {
Pages.ToolTipsPage.hoverOverElements();
    }

    @Then("User should see the hover message")
    public void userShouldSeeTheHoverMessage() {
        Pages.ToolTipsPage.hoveringValidated();
    }
}