package com.nextBase.step_definitions;

import com.nextBase.pages.AppreciationPage;
import com.nextBase.pages.BasePage;
import com.nextBase.utilities.ConfigurationReader;
import io.cucumber.java.en.And;
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

/*
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

 */

    //------2nd Scenario------------//

    @When("user clicks Add More button")
    public void userClicksAddMoreButton() {
        appreciationPage.addMoreButton.click();
    }

    @And("user clicks Employees and departments")
    public void userClicksEmployeesAndDepartments() {
        appreciationPage.employeesAndDepartments.click();
    }

    @Then("user should see multiple contacts and add one of them")
    public void userShouldSeeMultipleContactsAndAddOneOfThem() {
        appreciationPage.helpdesk22User.click();
    }

    //------3rd Scenario------------//

    @When("user clicks link icon")
    public void userClicksLinkIcon() {
        appreciationPage.linkIcon.click();
    }

    @When("user paste link url to link bar")
    public void userPasteLinkUrlToLinkBar() {
        ConfigurationReader.getProperty("linkURL");
    }

    @And("user clicks to Save button")
    public void userClicksToSaveButton() {
        appreciationPage.saveVideoLink.click();
    }

    @Then("user should see link url under Appreciation")
    public void userShouldSeeLinkUrlUnderAppreciation() {
    }

    //------4th Scenario------------//

    @When("user clicks Insert video icon")
    public void userClicksInsertVideoIcon() {
        appreciationPage.insertVideoIcon.click();
    }

    @And("user clicks video source bar")
    public void userClicksVideoSourceBar() {
        appreciationPage.videoLinkBar.click();
    }

    @And("user insert video link and click save")
    public void userInsertVideoLinkAndClickSave() {
        //insert video link
        appreciationPage.saveVideoLink.click();
    }

    @Then("user should see saved video under Appreciation")
    public void userShouldSeeSavedVideoUnderAppreciation() {
    }

    //------5th Scenario------------//














}
