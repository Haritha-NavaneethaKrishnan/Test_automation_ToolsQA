package stepDefinition.Elements.WebTable;


import Pages.BasePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EditUser {

    private final BasePage Pages;

    public EditUser(BasePage pages) {
        Pages = pages;
    }
    

    @Given("User is in the Web page Table")
    public void userIsInTheWebPageTable() {
        Pages.WebTablesPage.verifyWebTablePage();
    }

    @And("User clicks on the edit icon")
    public void userClicksOnTheEditIcon() {
        Pages.WebTablesPage.editRecord();
    }

    @And("User makes changes in any field")
    public void userMakesChangesInAnyField() {
        Pages.WebTablesPage.editLastName();
    }

    @When("User clicks the submit button")
    public void userClicksTheSubmitButton() {
        Pages.WebTablesPage.clickOnSubmit();
    }

    @Then("User updated changes should be visible in the table")
    public void userUpdatedChangesShouldBeVisibleInTheTable() {
        Pages.WebTablesPage.verifyUpdatedValue();
    }
}

