package stepDefinition.Interactions.Selectable;

import Pages.BasePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Grid {

    private final BasePage Pages;

    public Grid(BasePage pages) {
        Pages = pages;
    }



    @Given("User is in the Selectable Page")
    public void userIsInTheSelectablePage() {
        Pages.Selectable.InSelectablePage();
    }

    @When("User clicks on the specific items under Grid")
    public void userClicksOnTheSpecificItemsUnderGrid() {
        Pages.Selectable.selectItemsGrid();
    }

    @Then("The selected grid items should be highlighted")
    public void theSelectedGridItemshouldBeHighlighted() {
        Pages.Selectable.itemsSelectedGrid();
    }
}