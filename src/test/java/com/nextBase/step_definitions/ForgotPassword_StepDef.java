package com.nextBase.step_definitions;

import com.nextBase.pages.ForgotPasswordPage;
import com.nextBase.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class ForgotPassword_StepDef {

    ForgotPasswordPage ForgotPasswordPage = new ForgotPasswordPage();

    @When("user clicks on <Forgot password?> link")
    public void user_be_clicks_on_forgot_password_link() {
    ForgotPasswordPage.ForgotPasswordLink.click();
    }

    @Then("user will land on the <Forgot password?> page")
    public void user_will_land_on_the_forgot_password_page() {
        Assert.assertEquals("Get Password", Driver.getDriver().getTitle());

    }}
