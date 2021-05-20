package stepDefinition.BookStoreApplication;
import Pages.BasePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class BookStoreLogin {

    private final BasePage Pages;

    public BookStoreLogin(BasePage pages) {
        Pages = pages;
    }

    @Given("User is in Tools QA site")
    public void userIsInToolsQASite() {
        Pages.BSLoginPage.verifyHomePage();
    }

    @And("Book Store Application card is clicked")
    public void bookStoreApplicationCardIsClicked()  {
        Pages.BSLoginPage.clickOnBookStoreCard();
    }

    @And("User clicks on the Login Button")
    public void userClicksOnTheLoginButton()  {
        Pages.BSLoginPage.clickOnLoginBtn();
    }

    @And("User enters the valid email ID {string}")
    public void userEntersTheValidEmailIDEmail(String email) {
        Pages.BSLoginPage.enterEmailID(email);
    }

    @And("User enters valid password {string}")
    public void userEntersValidPasswordPassword(String password) {
        Pages.BSLoginPage.enterPassword(password);
    }

    @When("User clicks on Login Button")
    public void userClicksOnLoginButton() {
        Pages.BSLoginPage.clickOnLoginToEnter();
    }

    @Then("User navigates to Book Store page")
    public void userNavigatesToBookStorePage() {

        Pages.BSLoginPage.verifyAfterLoginFunc();
    }
}


