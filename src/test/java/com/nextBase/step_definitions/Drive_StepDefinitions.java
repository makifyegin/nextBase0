package com.nextBase.step_definitions;

import com.nextBase.pages.BasePage;
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

    @Given("{string} is on Drive page")
    public void userIsOnDrivePage(String userType) throws InterruptedException {
        drivePage.drive.click();
    }
    @Given("HR is on Drive page")
    public void hr_is_on_drive_page() throws InterruptedException {
        BasePage.loginAsHR();
        drivePage.drive.click();
    }
    @Given("Helpdesk is on Drive page")
    public void helpdesk_is_on_drive_page() {
        BasePage.loginAsHelpdesk();
        drivePage.drive.click();
    }
    @Given("Marketing is on Drive page")
    public void marketing_is_on_drive_page() {
        BasePage.loginAsMarketing();
        drivePage.drive.click();
    }
    @When("user clicks My Drive")
    public void userClicksMyDrive() {
        drivePage.myDrive.click();
    }

    @Then("verify that user displays My Drive")
    public void verifyThatUserDisplaysMyDrive() {

        Assert.assertTrue(Driver.getDriver().getTitle().contains("My Drive"));

    }

    @When("user clicks All Documents")
    public void userClicksAllDocuments() {
        drivePage.allDocuments.click();
    }



    @Then("verify that user displays All Documents")
    public void verifyThatUserDisplaysAllDocuments() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("All Documents"));
    }


}
