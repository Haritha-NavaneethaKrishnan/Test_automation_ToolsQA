package stepDefinition.Interactions.Draggable;

import Pages.BasePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class simple {

    private final BasePage Pages;

    public simple(BasePage pages) {
        Pages = pages;
    }


    @Given("User is in Draggable Page")
    public void userIsInDraggablePage() {
        Pages.DraggablePage.verifyDraggablePage();
    }

    @When("User performs simple drag")
    public void userPerformsSimpleDrag() {
        Pages.DraggablePage.simpleDrag();
    }

    @Then("The elements should be dragged to the location")
    public void theElementsShouldBeDraggedToTheLocation() {
        Pages.DraggablePage.simpleDragDone();
    }
}