package com.nextBase.step_definitions;

import com.nextBase.pages.AppreciationPage;
import com.nextBase.pages.BasePage;
import com.nextBase.utilities.BrowserUtils;
import com.nextBase.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

public class Negative_Appreciation_StepDefinitions {

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

//    -----------1nd Scenario------------//

//    @When("user clicks upload files icon")
//    public void user_clicks_upload_files_icon() {
//        appreciationPage.uploadFilesIcon.click();
//
//    }

//    @When("user clicks Upload files and images")
//    public void user_clicks_upload_files_and_images() {
//
//        //appreciationPage.uploadFilesAndImagesButton.click();
//    }

    @And("user upload application instead of file")
    public void userUploadApplicationInsteadOfFile() {
        Driver.getDriver().findElement(By.xpath("//input[@name='bxu_files[]']"))
                .sendKeys("C:\\Users\\44739\\OneDrive\\Desktop\\Project Check");
        BrowserUtils.sleep(2);

        //appreciationPage.sendButton.click();

    }

    @Then("verify that user can upload application")
    public void verifyThatUserCanUploadApplication() {
    }





}
