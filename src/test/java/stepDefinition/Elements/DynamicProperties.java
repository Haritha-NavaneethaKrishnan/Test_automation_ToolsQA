package stepDefinition.Elements;

import Pages.BasePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DynamicProperties {

    private final BasePage Pages;

    public DynamicProperties(BasePage pages) {
        Pages = pages;
    }


    @Given("User is in Dynamic Properties Page")
    public void userIsInDynamicPropertiesPage() {
        Pages.DynamicPropertiesPage.verifyDPPage();
    }

    @When("User stays on the same page for {int} seconds")
    public void userStaysOnTheSamePageForSeconds(int arg0) throws InterruptedException {
        Pages.DynamicPropertiesPage.waitForFiveSeconds();
    }

    @Then("User should be able to view the button after {int} seconds")
    public void userShouldBeAbleToViewTheButtonAfterSeconds(int arg0) {
        Pages.DynamicPropertiesPage.verifyChangesDone();
    }
}