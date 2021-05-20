package stepDefinition.Widgets;

import Pages.BasePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Autocomplete {

    private final BasePage Pages;

    public Autocomplete(BasePage pages) {
        Pages = pages;
    }

    @Given("User is in Auto Complete Page")
    public void userIsInAutoCompletePage() {
        Pages.AutoCompletePage.verifyAutoCompletePage();
    }


    @When("User enters the color name")
    public void userEntersTheColorName() {
        Pages.AutoCompletePage.entercolors();
    }

    @Then("The entered color should be displayed")
    public void theEnteredColorShouldBeDisplayed() {
        Pages.AutoCompletePage.verifyaddedColors();
    }
}
