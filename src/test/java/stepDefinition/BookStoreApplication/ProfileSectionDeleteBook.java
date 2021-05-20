package stepDefinition.BookStoreApplication;

import Pages.BasePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProfileSectionDeleteBook {

    private final BasePage Pages;

    public ProfileSectionDeleteBook(BasePage pages) {
        Pages = pages;
    }

    @Given("User is in Profile page")
    public void userIsInProfilePage() {
        Pages.BSDetailsPage.verifyProfilePage();
    }

    @When("User clicks on Delete All Books Button")
    public void userClicksOnDeleteAllBooksButton() {
        Pages.BSDetailsPage.deleteAllBooks();
    }

    @Then("All the books in Book Store gets deleted")
    public void allTheBooksInBookStoreGetsDeleted() {
        Pages.BSDetailsPage.verifyNoBooksInBS();
    }
}