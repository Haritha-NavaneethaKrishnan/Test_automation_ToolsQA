package stepDefinition.Widgets;

import Pages.BasePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Tabs {

    private final BasePage Pages;

    public Tabs(BasePage pages) {
        Pages = pages;
    }


    @Given("User is in Tabs Page")
    public void userIsInTabsPage() {
        Pages.Tabs.verifyTabsPage();
    }

    @When("User clicks on each tab")
    public void userClicksOnEachTab() {
        Pages.Tabs.clickOnTabs();
    }

    @Then("Particular content should be displayed")
    public void particularContentShouldBeDisplayed() {
        Pages.Tabs.verifytabsActions();
    }
}
