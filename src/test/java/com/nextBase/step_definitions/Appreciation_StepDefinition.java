package com.nextBase.step_definitions;

import com.github.javafaker.Business;
import com.github.javafaker.Faker;
import com.github.javafaker.HarryPotter;
import com.nextBase.pages.AppreciationPage;
import com.nextBase.pages.BasePage;
import com.nextBase.utilities.BrowserUtils;
import com.nextBase.utilities.ConfigurationReader;
import com.nextBase.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Appreciation_StepDefinition {

    AppreciationPage appreciationPage= new AppreciationPage();

//    @Given("{string} is on Home page and clicks Appreciation button from More  dropdown menu")
//    public void isOnHomePageAndClicksAppreciationButtonFromMoreDropdownMenu(String userType) throws InterruptedException {
//
//        switch (userType.toLowerCase()){
//            case "hr":
//                BasePage.loginAsHR();
//                break;
//            case "helpdesk":
//                BasePage.loginAsHelpdesk();
//                break;
//            case "marketing":
//                BasePage.loginAsMarketing();
//                break;
//        }
//
//        appreciationPage.moreButton.click();
//        appreciationPage.appreciationButton.click();
//
//
//    }

    //-----------1nd Scenario-----DONE-------//

    @When("user clicks upload files icon")
    public void user_clicks_upload_files_icon() {
        appreciationPage.uploadFilesIcon.click();

    }

    @When("user clicks Upload files and images")
    public void user_clicks_upload_files_and_images() {

        //appreciationPage.uploadFilesAndImagesButton.click();
    }

    @Then("verify that user can upload file and images from local computer")
    public void verifyThatUserCanUploadFileAndImagesFromLocalComputer() {

        Driver.getDriver().findElement(By.xpath("//input[@name='bxu_files[]']"))
                .sendKeys("C:\\Users\\44739\\OneDrive\\Desktop\\Zoom.lnk");
        BrowserUtils.sleep(2);

        appreciationPage.sendButton.click();

    }

    //------2nd Scenario----DONE--------//


    @When("user clicks Add More button")
    public void userClicksAddMoreButton() {
        appreciationPage.addMoreButton.click();
    }

    @And("user clicks Employees and departments")
    public void userClicksEmployeesAndDepartments() {
        appreciationPage.employeesAndDepartments.click();
    }

    @And("user should see multiple contacts and add one of them")
    public void userShouldSeeMultipleContactsAndAddOneOfThem() {
        appreciationPage.helpDesk22.click();
        appreciationPage.closeUserTab.click();
        Faker faker= new Faker();
        Business business = faker.business();
        Driver.getDriver().switchTo().frame(0);
        appreciationPage.passingMessageForAddingUser.sendKeys(business.toString());
        Driver.getDriver().switchTo().parentFrame();
    }

    @Then("send added user to Activity Stream and verify if it's displayed or not")
    public void sendAddedUserToActivityStreamAndVerifyIfItSDisplayedOrNot() {
        appreciationPage.sendButton.click();
        WebElement addedUser= Driver.getDriver().findElement(By.xpath("(//a[@class='feed-add-post-destination-new'])[1]"));
        System.out.println("addedUser.isDisplayed() = " + addedUser.isDisplayed());
    }

    //------3rd Scenario------DONE------//

//    @When("user clicks link icon")
//    public void userClicksLinkIcon() {
//        appreciationPage.linkIcon.click();
//    }

    @When("user paste link url to link bar")
    public void userPasteLinkUrlToLinkBar() {
        Faker faker= new Faker();
        appreciationPage.linkURLBar.sendKeys(faker.internet().url());
    }

    @And("user clicks to Save button")
    public void userClicksToSaveButton() {
        appreciationPage.saveVideoLink.click();
    }

    @And("send link to Appreciation page")
    public void sendLinkToAppreciationPage() {
        appreciationPage.sendButton.click();
    }

    //------4th Scenario--------DONE----//

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
        appreciationPage.videoLinkBar.sendKeys(ConfigurationReader.getProperty("vimeo.url"));
        BrowserUtils.waitForVisibility(By.xpath("//table/tbody/tr/td[.='Video size:']"),20);
        appreciationPage.saveVideoLink.click();
    }

    @Then("user should see saved video under Appreciation")
    public void userShouldSeeSavedVideoUnderAppreciation() {
        appreciationPage.sendButton.click();

        Driver.getDriver().switchTo().frame(0);
        WebElement visibleVideo= Driver.getDriver().findElement(By.xpath("//div[@class='vp-overlay-bg']"));
        System.out.println("visibleVideo.isDisplayed() = " + visibleVideo.isDisplayed());
        Driver.getDriver().switchTo().parentFrame();

    }


    //------5th Scenario------done------//


    Faker faker= new Faker();

    @When("user clicks quote text icon")
    public void userClicksQuoteTextIcon() {
        appreciationPage.quoteIcon.click();
        Driver.getDriver().switchTo().frame(0);
    }

    @And("user types quote in text bar")
    public void userTypesQuoteInTextBar() {
        HarryPotter harryPotter = faker.harryPotter();
        appreciationPage.quoteInputBar.sendKeys(harryPotter.quote());
        Driver.getDriver().switchTo().parentFrame();
    }

    @Then("user should send quote")
    public void userShouldSendQuote() {
        appreciationPage.sendButton.click();
    }


    //------6th Scenario------done------//

    @When("user clicks Add Mention icon")
    public void userClicksAddMentionIcon() {
        appreciationPage.addMentionIcon.click();
    }


    @And("user clicks Employees and departments button")
    public void userClicksEmployeesAndDepartmentsButton() {
        appreciationPage.employeesAndDepartments.click();
    }

    @Then("user should click one user from the list and send appreciation")
    public void userShouldClickOneUserFromTheListAndSendAppreciation() {
        BrowserUtils.sleep(2);
        appreciationPage.helpdesk23User.click();
        BrowserUtils.sleep(2);
        appreciationPage.sendButton.click();
    }




}
