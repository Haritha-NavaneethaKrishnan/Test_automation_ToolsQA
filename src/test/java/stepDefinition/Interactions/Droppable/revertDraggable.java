package stepDefinition.Interactions.Droppable;

import Pages.BasePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class revertDraggable {

    private final BasePage Pages;

    public revertDraggable(BasePage pages) {
        Pages = pages;
    }


    @Given("User in Droppable Page")
    public void userInDroppablePage() {
        Pages.Droppable.InDroppablePage();
    }

    @When("User performs revert drag action")
    public void userPerformsRevertDragAction() {
        Pages.Droppable.revertDD();
    }

    @Then("The revertable item is reverted back")
    public void theRevertableItemIsRevertedBack() {
        Pages.Droppable.notRevertDD();
    }

    @And("Non-revertable item is dropped")
    public void nonRevertableItemIsDropped() {
        Pages.Droppable.revertDgDg();
    }


}