package com.nextBase.step_definitions;

import com.nextBase.pages.AppreciationPage;
import com.nextBase.pages.BasePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Appreciation_StepDefinition {

    AppreciationPage appreciationPage= new AppreciationPage();

    @Given("{string} is on Home page and clicks Appreciation button from More  dropdown menu")
    public void isOnHomePageAndClicksAppreciationButtonFromMoreDropdownMenu(String userType) throws InterruptedException {

        switch (userType.toLowerCase()){
            case "hr":
                BasePage.loginAsHR();
                break;
            case "helpdesk":
                BasePage.loginAsHelpdesk();
                break;
            case "marketing":
                BasePage.loginAsMarketing();
                break;
        }

        appreciationPage.moreButton.click();
        appreciationPage.appreciationButton.click();
    }


    //***look here missing part
    @When("user clicks upload files icon")
    public void user_clicks_upload_files_icon() {
        appreciationPage.uploadFilesIcon.click();

    }

    @When("user clicks Upload files and images")
    public void user_clicks_upload_files_and_images() {
        appreciationPage.uploadFilesAndImagesButton.click();
    }
    @Then("user should see Pictures files")
    public void user_should_see_pictures_files() {

    }


}
