package com.nextBase.step_definitions;

import com.nextBase.pages.DrivePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Drive_StepDefinitions {

    DrivePage drivePage= new DrivePage();

    @Given("<User> is on Drive page")
    public void userIsOnDrivePage() {


    }

    @Given("HR is on Drive page")
    public void hr_is_on_drive_page() {

    }

    @Given("Helpdesk is on Drive page")
    public void helpdesk_is_on_drive_page() {

    }

    @Given("Marketing is on Drive page")
    public void marketing_is_on_drive_page() {

    }


    @When("user clicks My Drive")
    public void userClicksMyDrive() {
        drivePage.myDrive.click();

    }

    @And("user clicks All Documents")
    public void userClicksAllDocuments() {
        drivePage.allDocuments.click();
    }

    @Then("verify that user displays My Drive")
    public void verifyThatUserDisplaysMyDrive() {

    }

    @Then("verify that user displays All Documents")
    public void verifyThatUserDisplaysAllDocuments() {
    }




}
