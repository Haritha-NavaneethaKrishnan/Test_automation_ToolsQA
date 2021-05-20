package stepDefinition.Elements;
import Pages.BasePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BrokenLinks {

    private final BasePage Pages;

    public BrokenLinks(BasePage pages) {
        Pages = pages;
    }


    @Given("User is in Broken Links-Images Page")
    public void userIsInBrokenLinksImagesPage() {
        Pages.BrokenLinksImagesPage.verifyBrokenLinksPages();
    }

    @When("The broken images and links are found")
    public void theBrokenImagesAndLinksAreFound() {
        Pages.BrokenLinksImagesPage.findTheBrokenLinks();
    }

    @Then("The Broken links are verified")
    public void theBrokenLinksAreVerified() {
        Pages.BrokenLinksImagesPage.brokenLinks();
    }
}