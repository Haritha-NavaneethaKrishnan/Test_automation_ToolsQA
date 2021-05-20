package stepDefinition.Interactions.Draggable;

import Pages.BasePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AxisRestricted {

    private final BasePage Pages;

    public AxisRestricted(BasePage pages) {
        Pages = pages;
    }
    

    @Given("User is in the Draggable Page")
    public void userIsInTheDraggablePage() {
        Pages.DraggablePage.InDragabblePage();
    }

    @When("User performs axis drag")
    public void userPerformsAxisDrag() {
        Pages.DraggablePage.axisRestricted();
    }

    @Then("The elements should be dragged to the particular axis")
    public void theElementsShouldBeDraggedToTheParticularAxis() {
        Pages.DraggablePage.axisResDragDone();
    }
}