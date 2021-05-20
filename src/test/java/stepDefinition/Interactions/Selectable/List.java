package stepDefinition.Interactions.Selectable;

import Pages.BasePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class List {

    private final BasePage Pages;

    public List(BasePage pages) {
        Pages = pages;
    }



    @Given("User is in Selectable Page")
    public void userIsInSelectablePage() {
        Pages.Selectable.verifySelectablePage();
    }

    @When("User clicks on the specific items under List")
    public void userClicksOnTheSpecificItemsUnderList() {
        Pages.Selectable.selectItemsList();
    }

    @Then("The selected list items should be highlighted")
    public void theSelectedListItemsShouldBeHighlighted() {
        Pages.Selectable.itemsSelected();
    }
}