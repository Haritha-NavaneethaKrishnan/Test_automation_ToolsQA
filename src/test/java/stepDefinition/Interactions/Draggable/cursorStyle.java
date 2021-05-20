package stepDefinition.Interactions.Draggable;

import Pages.BasePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class cursorStyle {

    private final BasePage Pages;

    public cursorStyle(BasePage pages) {
        Pages = pages;
    }


    @Given("User in Draggable Page")
    public void userInDraggablePage() {
        Pages.DraggablePage.InDragabblePage();
    }

    @When("User performs cursor style drag")
    public void userPerformsCursorStyleDrag() {
        Pages.DraggablePage.cursorStyle();
    }

    @Then("The elements is dragged in cursor-style")
    public void theElementsIsDraggedInCursorStyle() {
        Pages.DraggablePage.curStyleDrag();
    }
}