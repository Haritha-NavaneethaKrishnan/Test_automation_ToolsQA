package stepDefinition.Interactions.Droppable;

import Pages.BasePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class simple {

    private final BasePage Pages;

    public simple(BasePage pages) {
        Pages = pages;
    }
    

    @Given("User is in Droppable Page")
    public void userIsInDroppablePage() {
        Pages.Droppable.verifyDroppablePage();
    }

    @When("User performs simple drag and drop action")
    public void userPerformsSimpleDragAndDropAction() {
        Pages.Droppable.simpleDragDrop();
    }

    @Then("The dragged item should be dropped inside desired location")
    public void theDraggedItemShouldBeDroppedInsideDesiredLocation() {
        Pages.Droppable.doneSimpleDD();
    }
}