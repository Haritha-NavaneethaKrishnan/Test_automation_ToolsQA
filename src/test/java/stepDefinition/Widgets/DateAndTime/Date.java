package stepDefinition.Widgets.DateAndTime;

import Pages.BasePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Date {

    private final BasePage Pages;

    public Date(BasePage pages) {
        Pages = pages;
    }


    @Given("User is in Date Picker Page")
    public void userIsInDatePickerPage() {
        Pages.DateAndTime.verifyDatePicker();
    }

    @When("User set the date")
    public void userSetTheDate() {
        Pages.DateAndTime.dateSet();
    }

    @Then("The set date should be displayed")
    public void theSetDateShouldBeDisplayed() {
        Pages.DateAndTime.setDate();
    }
}
