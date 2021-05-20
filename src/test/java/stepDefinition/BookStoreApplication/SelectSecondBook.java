package stepDefinition.BookStoreApplication;

import Pages.BasePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SelectSecondBook {

    private final BasePage Pages;

    public SelectSecondBook(BasePage pages) {
        Pages = pages;
    }


    @Given("User is in BookStore after selection of First Book")
    public void userIsInBookStoreAfterSelectionOfFirstBook() {
        Pages.BSDetailsPage.selectNextBook();
    }

    @And("User enters the second book name {string} in search field")
    public void userEntersTheSecondBookNameBooknameInSearchField(String bookName) {
        Pages.BSDetailsPage.selectBook(bookName);
    }

    @And("User clicks on the second wanted book")
    public void userclickOnTheSecondWantedBook() {
        Pages.BSDetailsPage.clickOnSecondBook();
    }

    @And("User clicks on the add to your collection button")
    public void userClicksOnTheAddToYourCollectionButton() {
        Pages.BSDetailsPage.clickOnAddToCollection();
    }

    @When("User clicks on  Back To Store Button")
    public void userClicksOnBackToStoreButton() {
        Pages.BSDetailsPage.clickOnBackToBSbtnTwo();
    }

    @Then("User selected book should be found in the Profile Page")
    public void userSelectedBookShouldBeFoundInTheProfilePage() throws InterruptedException {
        Pages.BSDetailsPage.verifySecBookInProfilePage();
    }
}