package stepDefinition.Widgets.DateAndTime;

import Pages.BasePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DateAndTime {

    private final BasePage Pages;

    public DateAndTime(BasePage pages) {
        Pages = pages;
    }

    @Given("User is in the Date Picker Page")
    public void userIsInTheDatePickerPage() {
        Pages.DateAndTime.InDatePickerPage();
    }

    @When("User set the date and time")
    public void userSetTheDateAndTime() {
        Pages.DateAndTime.setDateAndTime();
    }

    @Then("The set date and time should be displayed")
    public void theSetDateAndTimeShouldBeDisplayed() {
        Pages.DateAndTime.dateAndTimeSet();
    }
}