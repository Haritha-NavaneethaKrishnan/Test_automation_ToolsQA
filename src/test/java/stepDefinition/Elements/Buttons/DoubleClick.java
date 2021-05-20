package stepDefinition.Elements.Buttons;

import Pages.BasePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DoubleClick{

    private final BasePage Pages;

    public DoubleClick(BasePage pages) {
        Pages = pages;
    }


    @Given("User is in Buttons Page")
    public void userIsInButtonsPage() {
        Pages.Buttons.verifyButtonsPage();
    }

    @When("User double clicks on first button")
    public void userDoubleClicksOnFirstButton() {
        Pages.Buttons.DoubleClickBtn();
    }

    @Then("User click action should be displayed below third button")
    public void userClickActionShouldBeDisplayedBelowThirdButton() {
        Pages.Buttons.DoubleClickMsg();
    }
}

