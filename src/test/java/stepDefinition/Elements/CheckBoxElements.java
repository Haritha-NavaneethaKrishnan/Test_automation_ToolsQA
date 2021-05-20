package stepDefinition.Elements;

import Pages.BasePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class CheckBoxElements {

    private final BasePage Pages;

    public CheckBoxElements(BasePage pages) {
        Pages = pages;
    }


    @Given("User is in Check Box Page")
    public void userIsInCheckBoxPage() {
        Pages.CheckBoxPage.verifyCheckBoxPage();
    }

    @And("User clicks on the drop down arrow of Home Option")
    public void userClicksOnTheDropDownArrowOfHomeOption() {
        Pages.CheckBoxPage.clickOndropdown();
    }

    @And("User checks the wanted Options")
    public void userChecksTheWantedOptions() {
        Pages.CheckBoxPage.clickOnCheckbox();
    }
    @When("User user clicks the minus button")
    public void userUserClicksTheMinusButton() {
        Pages.CheckBoxPage.clickOnMinusButton();
    }


    @Then("The selected checkboxes should be mentioned under You have selected tag")
    public void theSelectedCheckboxesShouldBeMentionedUnderYouHaveSelectedTag() {
        Pages.CheckBoxPage.verifyCheckedCheckbox();
    }
}