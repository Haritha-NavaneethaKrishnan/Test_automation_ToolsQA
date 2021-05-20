package stepDefinition.Interactions;

import Pages.BasePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Resizable {

    private final BasePage Pages;

    public Resizable(BasePage pages) {
        Pages = pages;
    }


    @Given("User is in Resizable Page")
    public void userIsInResizablePage() {
        Pages.ResizablePage.verifyResizablePage();
    }

    @When("User drags the frame")
    public void userDragsTheFrame() {
        Pages.ResizablePage.resizeFunctionality();
    }

    @Then("The size of the frame should be changed")
    public void theSizeOfTheFrameShouldBeChanged() {
        Pages.ResizablePage.resizeDone();
    }
}