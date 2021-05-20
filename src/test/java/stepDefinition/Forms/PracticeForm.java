package stepDefinition.Forms;
import Pages.BasePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PracticeForm {

    private final BasePage Pages;

    public PracticeForm(BasePage pages) {
        Pages = pages;
    }


    @Given("User in Forms Page")
    public void userInFormsPage() {
        Pages.PracticeFormPage.FormsPage();
    }

    @And("User navigates to Practice form page")
    public void userNavigatesToPracticeFormPage() {
        Pages.PracticeFormPage.navigateToPracticeForm();
    }


    @And("Enter the first name <{string}> and last name <{string}>")
    public void enterTheFirstNameAndLastName(String arg0, String arg1) {
        Pages.PracticeFormPage.enterName(arg0, arg1);
    }


    @And("Fill the valid email address <{string}>")
    public void fillTheValidEmailAddress(String arg0) {
        Pages.PracticeFormPage.enterEmail(arg0);
    }

    @And("choose the gender")
    public void chooseTheGender() {
        Pages.PracticeFormPage.chooseGender();
    }

    @And("Enter the Mobile number <{string}>")
    public void enterTheMobileNumber(String arg0) {
        Pages.PracticeFormPage.enterPhoneNo(arg0);
    }

    @And("Enter the Date of Birth <{string}>")
    public void enterTheDateOfBirth(String arg0) {
        Pages.PracticeFormPage.enterDOB(arg0);
    }


    @And("Enter the subject name <{string}>")
    public void enterTheSubjectName(String arg0) {
        Pages.PracticeFormPage.enterSubjetName(arg0);
    }

    @And("Choose the hobbies")
    public void chooseTheHobbies() {
        Pages.PracticeFormPage.selectHobby();
    }

    @And("Upload a picture")
    public void uploadAPicture() {
        Pages.PracticeFormPage.uploadPic();
    }

    @And("Give the current Address details <{string}>")
    public void giveTheCurrentAddressDetails(String arg0) {
        Pages.PracticeFormPage.address(arg0);
    }

    @And("Select the State and City")
    public void selectTheStateAndCity() {
        Pages.PracticeFormPage.selectStateandCity();
    }

    @When("User clicks the Submit button")
    public void userClicksTheSubmitButton() {
        Pages.PracticeFormPage.clickOnSubmit();
    }

    @Then("User should be able to view the entered details in a form")
    public void userShouldBeAbleToViewTheEnteredDetailsInAForm() {
        Pages.PracticeFormPage.verifyEnteredDetailsDisplayed();
    }
}