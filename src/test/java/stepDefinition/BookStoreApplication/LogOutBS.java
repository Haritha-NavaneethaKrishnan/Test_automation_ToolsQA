package stepDefinition.BookStoreApplication;

import Pages.BasePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LogOutBS {

    private final BasePage Pages;

    public LogOutBS(BasePage pages) {
        Pages = pages;
    }


    @Given("User is in the Profile Page")
    public void userIsInTheProfilePage() {
      Pages.BSLogoutPage.verifyProfilePage();
    }

    @When("User clicks on the Logout button")
    public void userClicksOnTheLogoutButton() {
        Pages.BSLogoutPage.clickOnLogoutBtn();
    }

    @Then("User logs out of the Book Store Application")
    public void userLogsOutOfTheBookStoreApplication() {
        Pages.BSLogoutPage.verifyLogout();
    }

}