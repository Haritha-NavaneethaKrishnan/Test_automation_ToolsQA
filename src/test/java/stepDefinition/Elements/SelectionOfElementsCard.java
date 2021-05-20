package stepDefinition.Elements;//package stepDefinition.BookStoreApplication;
import Pages.BasePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SelectionOfElementsCard {

    private final BasePage Pages;

    public SelectionOfElementsCard(BasePage pages) {
        Pages = pages;
    }

    @Given("User is in Tools QA Home Page")
    public void userIsInToolsQAHomePage() {
        Pages.ElementsHomePage.verifyToolsQAHP();
    }



    @When("User clicks on Elements Card")
    public void userClicksOnElementsCard() throws InterruptedException {
        Pages.ElementsHomePage.clickOnElementsHomePage();
    }


    @Then("User should be navigated to Elements Page")
    public void userShouldBeNavigatedToElementsPage() {
        Pages.ElementsHomePage.verifyElementsPage();
    }
}