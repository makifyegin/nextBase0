package com.nextBase.step_definitions;

import com.nextBase.pages.LoginPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class IncorrectCredentials_StepDef {

    LoginPage IncorrectCredentials = new LoginPage();


    @Then("user should not see dashboard instead this notice message : {string}")
    public void user_should_not_see_dashboard_instead_this_notice_message(String string) {
        Assert.assertTrue(IncorrectCredentials.errorMessage.isDisplayed());
    }

    @When("user enters {string}")
    public void userEnters(String arg0) {
    }
}
