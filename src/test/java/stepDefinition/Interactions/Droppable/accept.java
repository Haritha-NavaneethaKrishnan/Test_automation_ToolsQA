package stepDefinition.Interactions.Droppable;

import Pages.BasePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class accept {

    private final BasePage Pages;

    public accept(BasePage pages) {
        Pages = pages;
    }


    @Given("User is in the Droppable Page")
    public void userIsInTheDroppablePage() {
        Pages.Droppable.InDroppablePage();
    }

    @When("User performs accept drag and drop action")
    public void userPerformsAcceptDragAndDropAction() {
        Pages.Droppable.acceptDragDrop();
    }

    @Then("The acceptable item should be dropped inside desired location")
    public void theAcceptableItemShouldBeDroppedInsideDesiredLocation() {
        Pages.Droppable.doneAcceptDD();
    }
}