package stepDefinition.Elements.Buttons;

import Pages.BasePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RightClick {

    private final BasePage Pages;

    public RightClick(BasePage pages) {
        Pages = pages;
    }

    @Given("User is in the Buttons Page")
    public void userIsInTheButtonsPage() {
        Pages.Buttons.verifyButtonsPage();
    }

    @When("User right clicks on second button")
    public void userRightClicksOnSecondButton() {
        Pages.Buttons.RightClickBtn();
    }

    @Then("User click action should be displayed below the third button")
    public void userClickActionShouldBeDisplayedBelowTheThirdButton() {
        Pages.Buttons.RightClickMsg();
    }
}
