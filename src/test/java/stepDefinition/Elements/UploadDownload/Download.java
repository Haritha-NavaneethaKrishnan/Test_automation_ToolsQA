package stepDefinition.Elements.UploadDownload;



import Pages.BasePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Download {

    private final BasePage Pages;

    public Download(BasePage pages) {
        Pages = pages;
    }

    @Given("User is in Upload and Downloads Page")
    public void userIsInUploadAndDownloadsPage() {
        Pages.UploadDownloadPage.uploadDownloadPage();
    }

    @When("User clicks on Download button")
    public void userClicksOnDownloadButton() {
        Pages.UploadDownloadPage.clickOnDownloadBtn();
    }

    @Then("The content should get downloaded")
    public void theContentShouldGetDownloaded() {
        Pages.UploadDownloadPage.verifyitemDownloaded();
    }
}