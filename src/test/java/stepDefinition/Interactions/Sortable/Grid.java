package stepDefinition.Interactions.Sortable;

import Pages.BasePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Grid {

    private final BasePage Pages;

    public Grid(BasePage pages) {
        Pages = pages;
    }

    @Given("User in Sortable Page")
    public void userInSortablePage() {
        Pages.SortablePage.InSortablePage();
    }

    @When("User clicks on specific item under Grid")
    public void userClicksOnSpecificItemUnderGrid() {
        Pages.SortablePage.selectItemGrid();
    }

    @Then("Items in the grid should be sorted")
    public void itemsInTheGridShouldBeSorted() {
        Pages.SortablePage.verifySortedGrid();
    }
}