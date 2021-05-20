package stepDefinition.Elements.Links;


import Pages.BasePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OpenInNewTabLinks {

    private final BasePage Pages;

    public OpenInNewTabLinks(BasePage pages) {
        Pages = pages;
    }

    @Given("User is in Links Page")
    public void userIsInLinksPage() {
        Pages.LinksPage.verifyLinkPage();
    }

    @When("User clicks on the first link")
    public void userClicksOnTheFirstLink() {
        Pages.LinksPage.clickOnSimpleLink();
    }

    @Then("User should be navigated to the Home Page")
    public void userShouldBeNavigatedToTheHomePage() {
        Pages.LinksPage.verifyHomePageAfterSimpleLinkClick();
    }
}

