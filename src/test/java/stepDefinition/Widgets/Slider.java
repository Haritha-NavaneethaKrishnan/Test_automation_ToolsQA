package stepDefinition.Widgets;

import Pages.BasePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Slider {

    private final BasePage Pages;

    public Slider(BasePage pages) {
        Pages = pages;
    }


    @Given("User is in Slider Page")
    public void userIsInSliderPage() {
        Pages.Slider.verifySliderPage();
    }

    @When("User drags the slider")
    public void userDragsTheSlider() {
        Pages.Slider.slidetheSlider();
    }

    @Then("The changes should be seen in the slider")
    public void theChangesShouldBeSeenInTheSlider() {
        Pages.Slider.getValueOfSlider();
    }
}