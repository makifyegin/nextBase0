package com.nextBase.step_definitions;

import com.nextBase.pages.DrivePage;
import com.nextBase.utilities.BrowserUtils;
import com.nextBase.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Drive_StepDefinitions {

    DrivePage drivePage= new DrivePage();

    @Given("<User> is on Drive page")
    public void userIsOnDrivePage() {
        drivePage.drive.click();
    }

    @Given("HR is on Drive page")
    public void hr_is_on_drive_page() {
        drivePage.drive.click();
    }

    @Given("Helpdesk is on Drive page")
    public void helpdesk_is_on_drive_page() {
        drivePage.drive.click();
    }

    @Given("Marketing is on Drive page")
    public void marketing_is_on_drive_page() {
        drivePage.drive.click();
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

        BrowserUtils.verifyTitle("My Drive");
        System.out.println(Driver.getDriver().getTitle());

    }

    @Then("verify that user displays All Documents")
    public void verifyThatUserDisplaysAllDocuments() {

        BrowserUtils.verifyTitle("All Documents");
        System.out.println(Driver.getDriver().getTitle());
    }




}
