package com.nextBase.step_definitions;

import com.nextBase.pages.BasePage;
import com.nextBase.pages.DrivePage;
import com.nextBase.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Drive_StepDefinitions {

    DrivePage drivePage= new DrivePage();

    @Given("{string} is on Home page")
    public void userIsOnHomePage(String userType) throws InterruptedException {
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