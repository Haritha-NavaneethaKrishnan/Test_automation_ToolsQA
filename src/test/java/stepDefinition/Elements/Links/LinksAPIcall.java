package stepDefinition.Elements.Links;



import Pages.BasePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LinksAPIcall {

    private final BasePage Pages;

    public LinksAPIcall(BasePage pages) {
        Pages = pages;
    }
    
    @Given("User in Links Page")
    public void userInLinksPage() {
        Pages.LinksPage.verifyLinkPage();
    }

    @When("User clicks on any option under Links will send api call")
    public void userClicksOnAnyOptionUnderLinksWillSendApiCall() throws InterruptedException {
        Pages.LinksPage.clickOnOptions();
    }


    @Then("The status for the particular option should be displayed")
    public void theStatusForTheParticularOptionShouldBeDisplayed() {
        Pages.LinksPage.statusOfClick();
    }
}



