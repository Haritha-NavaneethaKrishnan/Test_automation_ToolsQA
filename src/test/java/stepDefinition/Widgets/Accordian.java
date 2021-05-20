package stepDefinition.Widgets;

import Pages.BasePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Accordian {

    private final BasePage Pages;

    public Accordian(BasePage pages) {
        Pages = pages;
    }


    @Given("User is in Accordian Page")
    public void userIsInAccordianPage() {
        Pages.AccordianPage.verifyAccordianPage();
    }

    @When("User clicks on any section")
    public void userClicksOnAnySection() {
        Pages.AccordianPage.clickOnParticularContent();
    }

    @Then("The particular selected section should expand")
    public void theParticularSelectedSectionShouldExpand() {
        Pages.AccordianPage.clickToclose();
    }
}