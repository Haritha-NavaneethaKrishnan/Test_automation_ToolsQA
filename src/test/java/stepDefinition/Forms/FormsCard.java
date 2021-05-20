package stepDefinition.Forms;
import Pages.BasePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FormsCard {

    private final BasePage Pages;

    public FormsCard(BasePage pages) {
        Pages = pages;
    }


    @Given("User in Tools QA Home Page")
    public void userInToolsQAHomePage() {
        Pages.FormsPage.verifyToolsQAHP();
    }

    @When("User clicks on Forms Card")
    public void userClicksOnFormsCard() {
        Pages.FormsPage.clickOnFormsHomePage();
    }

    @Then("User should be navigated to Forms Page")
    public void userShouldBeNavigatedToFormsPage() {
        Pages.FormsPage.verifyFormsPage();
    }
}