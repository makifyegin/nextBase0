package com.nextBase.step_definitions;

import com.nextBase.pages.LoginPage;
import com.nextBase.utilities.ConfigurationReader;
import com.nextBase.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.util.concurrent.TimeUnit;

import java.util.concurrent.TimeUnit;

public class Login_StepDefinitions {

    LoginPage LoginPage = new LoginPage();

    @When("user clicks to login button")
    public void user_clicks_to_login_button() {
        LoginPage.loginButton.click();
    }


//    @When("user enters username {string} password {string} and logins")
//    public void userEntersUsernamePasswordAndLogins(String arg0, String arg1) {
//        LoginPage.usernameInput.sendKeys(arg0);
//        LoginPage.passwordInput.sendKeys(arg1);
//        LoginPage.loginButton.click();
//    }


    @When("user enters username {string}")
    public void userEntersUsername(String arg0) {
        LoginPage.usernameInput.sendKeys(arg0);
    }

    @And("user enters password {string}")
    public void userEntersPassword(String arg0) {
        LoginPage.passwordInput.sendKeys(arg0);
    }

    @Then("user should see the {string}")
    public void userShouldSeeThe(String arg0) {
        Assert.assertTrue(Driver.getDriver().getTitle().contains(arg0));
    }


//    @Then("user should see the dashboard")
//    public void user_should_see_the_dashboard() {
//        System.out.println("User should see the dashboard");
//
//    }

}
