package stepDefinition.BookStoreApplication;

import Pages.BasePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SelectFirstBook {

    private final BasePage Pages;

    public SelectFirstBook(BasePage pages) {
        Pages = pages;
    }


    @Given("User is in BookStore after successful Login")
    public void userIsInBookStoreAfterSuccessfulLogin() {
        Pages.BSDetailsPage.verifyBookStorePage();
    }


    @And("User enters the book name {string} in search field")
    public void userEntersTheBookNameBooknameInSearchField(String bookName) {
        Pages.BSDetailsPage.selectBook(bookName);
    }

    @And("User clicks on the first wanted book")
    public void userclicksOnTheFirstWantedBook() {
        Pages.BSDetailsPage.clickOnBook();
    }


    @And("User clicks on add to your collection button")
    public void userClicksOnAddToYourCollectionButton() throws InterruptedException {
        Pages.BSDetailsPage.clickOnAddToCollection();
    }

    @When("User clicks on the Back To Store Button")
    public void userClicksOnTheBackToStoreButton() {
        Pages.BSDetailsPage.clickOnBackToBSbtn();
    }

    @Then("User selected book should be found in Profile Page")
    public void userSelectedBookShouldBeFoundInProfilePage() throws InterruptedException {
        Pages.BSDetailsPage.verifySelectedBookInProfilePage();
    }
}
