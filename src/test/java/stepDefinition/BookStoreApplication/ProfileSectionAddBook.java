package stepDefinition.BookStoreApplication;

import Pages.BasePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProfileSectionAddBook {

    private final BasePage Pages;

    public ProfileSectionAddBook(BasePage pages) {
        Pages = pages;
    }
    

    @Given("User is in Book Store Page")
    public void userIsInBookStorePage() {
        Pages.BSDetailsPage.afterSelectionOfSecBook();
    }

    @And("User navigates to Profile page")
    public void userNavigatesToProfilePage() {
        Pages.BSDetailsPage.selectProfileOption();
    }

    @And("User clicks on Go To Book Store button")
    public void userClicksOnGoToBookStoreButton() {
        Pages.BSDetailsPage.clickonGoToBS();
    }

    @And("User enters the third book name {string} in search field")
    public void userEntersTheThirdBookNameInSearchField(String arg0) {
        Pages.BSDetailsPage.selectBook(arg0);
    }

    @And("User clicks on the third wanted book")
    public void userClicksOnTheThirdWantedBook() {
        Pages.BSDetailsPage.clickOnThirdBook();
    }
    @And("clicks on add to your collection button")
    public void clicksOnAddToYourCollectionButton() {
        Pages.BSDetailsPage.clickOnAddToCollection();
    }

    @And("User clicks on Back to book store button")
    public void userClicksOnBackToBookStoreButton() {
        Pages.BSDetailsPage.clickOnBackToBSbtnTwo();
    }

    @When("User navigates to the Profile Page")
    public void userNavigatesToTheProfilePage() {
        Pages.BSDetailsPage.selectProfileOption();
    }


    @Then("User should be able to view the selected book in Profile Page")
    public void userShouldBeAbleToViewTheSelectedBookInProfilePage() throws InterruptedException {
        Pages.BSDetailsPage.verifyThirdBookInProfilePage();
    }
}
