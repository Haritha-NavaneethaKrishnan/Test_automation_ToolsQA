package stepDefinition.Elements.UploadDownload;



import Pages.BasePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Upload {

    private final BasePage Pages;

    public Upload(BasePage pages) {
        Pages = pages;
    }



    @Given("User in Upload and Downloads Page")
    public void userInUploadAndDownloadsPage() {
        Pages.UploadDownloadPage.uploadDownloadPage();
    }

    @When("User clicks on Upload button")
    public void userClicksOnUploadButton() {
        Pages.UploadDownloadPage.uploadItem();
    }

    @Then("The selected content should get uploaded")
    public void theSelectedContentShouldGetUploaded() throws InterruptedException {
        Pages.UploadDownloadPage.verifyItemUploaded();
    }
}