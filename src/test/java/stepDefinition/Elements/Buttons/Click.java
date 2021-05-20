package stepDefinition.Elements.Buttons;


import Pages.BasePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Click {

    private final BasePage Pages;

    public Click(BasePage pages) {
        Pages = pages;
    }


    @Given("User in the Buttons Page")
    public void userInTheButtonsPage() {
        Pages.Buttons.verifyButtonsPage();
    }

    @When("User clicks on third button")
    public void userClicksOnThirdButton() {
        Pages.Buttons.Click();
    }

    @Then("User click action should be displayed")
    public void userClickActionShouldBeDisplayed() {
        Pages.Buttons.ClickMsg();
    }
}
