package stepDefinition.Widgets;

import Pages.BasePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Menu {

    private final BasePage Pages;

    public Menu(BasePage pages) {
        Pages = pages;
    }


    @Given("User is in Menu Page")
    public void userIsInMenuPage() {
        Pages.MenuPage.MenuPage();
    }

    @When("User Hovers over menu")
    public void userHoversOverMenu() {
        Pages.MenuPage.hoverOverMenu();
    }

    @Then("User should be able to view the dropdown list of the menu")
    public void userShouldBeAbleToViewTheDropdownListOfTheMenu() {
        Pages.MenuPage.menuValidate();
    }
}