package stepDefinition.Interactions.Sortable;

import Pages.BasePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class List {

    private final BasePage Pages;

    public List(BasePage pages) {
        Pages = pages;
    }

    @Given("User is in the Sortable Page")
    public void userIsInTheSortablePage() {
        Pages.SortablePage.verifySortablePage();
    }

    @When("User clicks on specific item under List")
    public void userClicksOnSpecificItemUnderList() {
        Pages.SortablePage.selectItemList();
    }

    @Then("Items in the list should be sorted")
    public void itemsInTheListShouldBeSorted() {
        Pages.SortablePage.verifySortedList();
    }
}
