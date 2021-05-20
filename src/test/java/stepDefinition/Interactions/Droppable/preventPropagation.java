package stepDefinition.Interactions.Droppable;

import Pages.BasePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class preventPropagation {

    private final BasePage Pages;

    public preventPropagation(BasePage pages) {
        Pages = pages;
    }


    @Given("User in the Droppable Page")
    public void userInTheDroppablePage() {
        Pages.Droppable.InDroppablePage();
    }

    @When("User performs prevent propagation of drag and drop action")
    public void userPerformsPreventPropagationOfDragAndDropAction() {
        Pages.Droppable.prePropagationDragDrop();
    }

    @Then("The acceptable item should be dropped inside droppable location")
    public void theAcceptableItemShouldBeDroppedInsideDroppableLocation() {
        Pages.Droppable.prePropagationDD();
    }
}
