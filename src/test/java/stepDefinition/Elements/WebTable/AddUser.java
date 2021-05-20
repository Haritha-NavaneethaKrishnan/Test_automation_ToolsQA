package stepDefinition.Elements.WebTable;

import Pages.BasePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddUser {

    private final BasePage Pages;

    public AddUser(BasePage pages) {
        Pages = pages;
    }

    @Given("User is in Web Table Page")
    public void userIsInWebTablePage() {
        Pages.WebTablesPage.verifyWebTablesPage();
    }

    @And("User clicks on Add button")
    public void userClicksOnAddButton() {
        Pages.WebTablesPage.clickOnAddButton();
        
    }

    @And("User enters the First Name <{string}>")
    public void userEntersTheFirstName(String arg0) throws InterruptedException {
        Pages.WebTablesPage.enterName(arg0);
        
    }

    @And("User enters the Last Name <{string}>")
    public void userEntersTheLastName(String arg0) {
        Pages.WebTablesPage.enterLName(arg0);
    }

    @And("User enters the email address <{string}>")
    public void userEntersTheEmailAddress(String arg0) {
        Pages.WebTablesPage.enterEmail(arg0);
    }

    @And("User enters the age <{string}>")
    public void userEntersTheAge(String arg0) {
        Pages.WebTablesPage.enterAge(arg0);
    }

    @And("User enters the salary details <{string}>")
    public void userEntersTheSalaryDetails(String arg0) {
        Pages.WebTablesPage.enterSalary(arg0);
    }

    @And("User enters the department <{string}>")
    public void userEntersTheDepartment(String arg0) {
        Pages.WebTablesPage.enterDept(arg0);
    }

    @When("User clicks on submit button")
    public void userClicksOnSubmitButton() {
        Pages.WebTablesPage.clickOnSubmit();
    }

    @Then("New user should be added to the Table")
    public void newUserShouldBeAddedToTheTable() {
        Pages.WebTablesPage.verifyUserAdded();
    }
}
