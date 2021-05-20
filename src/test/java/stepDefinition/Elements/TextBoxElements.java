package stepDefinition.Elements;

import Pages.BasePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TextBoxElements {

    private final BasePage Pages;

    public TextBoxElements(BasePage pages) {
        Pages = pages;
    }
    
    @Given("User is in Text Box Page")
    public void userIsInTextBoxPage() {
        Pages.TextBoxPage.navigateToTextBoxPage();
    }

    @And("User enters the name <{string}> in Full Name input field")
    public void userEntersTheNameInFullNameInputField(String arg0) {
        Pages.TextBoxPage.fullNameInputField(arg0);
    }

    @And("User enters the valid email address <{string}> in email input field")
    public void userEntersTheValidEmailAddressInEmailInputField(String arg0) {
        Pages.TextBoxPage.emailInputField(arg0);
    }

    @And("User enters the current address <{string}> in current address input field")
    public void userEntersTheCurrentAddressInCurrentAddressInputField(String arg0) {
        Pages.TextBoxPage.currAddressField(arg0);
    }

    @And("User User enters the permanent address <{string}> in permanent address input field")
    public void userUserEntersThePermanentAddressInPermanentAddressInputField(String arg0) {
        Pages.TextBoxPage.perAddressField(arg0);
    }

    @When("User clicks on the submit button")
    public void userClicksOnTheSubmitButton() {
        Pages.TextBoxPage.clickOnSubmitBtn();
    }

    @Then("User entered details should be viewed below the submit button")
    public void userEnteredDetailsShouldBeViewedBelowTheSubmitButton() {
        Pages.TextBoxPage.verifyEnteredValues();
    }
}