package stepDefinition.Interactions.Draggable;

import Pages.BasePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class containerRestricted {

    private final BasePage Pages;

    public containerRestricted(BasePage pages) {
        Pages = pages;
    }
    

    @Given("User in the Draggable Page")
    public void userInTheDraggablePage() {
        Pages.DraggablePage.InDragabblePage();
    }

    @When("User performs container restricted drag")
    public void userPerformsContainerRestrictedDrag() {
        Pages.DraggablePage.containerRestricted();
    }

    @Then("The elements should be dragged within the container")
    public void theElementsShouldBeDraggedWithinTheContainer() {
        Pages.DraggablePage.contResDrag();
    }
}