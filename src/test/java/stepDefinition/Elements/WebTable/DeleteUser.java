package stepDefinition.Elements.WebTable;

import Pages.BasePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DeleteUser {

    private final BasePage Pages;

    public DeleteUser(BasePage pages) {
        Pages = pages;
    }


    @Given("User in the Web page Table")
    public void userInTheWebPageTable() {
        Pages.WebTablesPage.verifyWebTablePage();
    }

    @When("User clicks on the delete icon")
    public void userClicksOnTheDeleteIcon() {
        Pages.WebTablesPage.deleteUser();
    }

    @Then("User deleted row should not be viewed in the Table")
    public void userDeletedRowShouldNotBeViewedInTheTable() {
        Pages.WebTablesPage.deletedRowNotFound();
    }
}
