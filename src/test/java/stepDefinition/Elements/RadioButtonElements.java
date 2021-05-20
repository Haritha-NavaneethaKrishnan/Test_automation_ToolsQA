package stepDefinition.Elements;

import Pages.BasePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RadioButtonElements {

    private final BasePage Pages;

    public RadioButtonElements(BasePage pages) {
        Pages = pages;
    }


    @Given("User is in Radio Button Page")
    public void userIsInRadioButtonPage() {
        Pages.RadioButtonPage.verifyRadioButtonPage();
    }

    @When("User selects the yes option")
    public void userSelectsTheYesOption() {
        Pages.RadioButtonPage.selectOption();
    }

    @Then("User should be able to view You have selected Yes")
    public void userShouldBeAbleToViewYouHaveSelectedYes() {
        Pages.RadioButtonPage.verifySelectedOption();
    }
}