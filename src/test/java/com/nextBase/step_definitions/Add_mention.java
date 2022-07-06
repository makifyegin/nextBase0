package com.nextBase.step_definitions;

import com.nextBase.pages.NEXT889;
import com.nextBase.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

public class Add_mention {

    NEXT889 next889 = new NEXT889();


    @When("User mentions about helpdesk2@cybertekschool.com")
    public void user_mentions_about_helpdesk2_cybertekschool_com() {
        next889.addMentionIcon.click();
        next889.employeeTagAndDepartmentTag.click();
        next889.helpdesk22CybertekSchoolUser.click();
        next889.sendButton.click();
    }

    @Then("User should be able to see chosen email address under the Message tab")
    public void user_should_be_able_to_see_chosen_email_address_under_the_message_tab() {

        Assert.assertTrue(next889.mention.isDisplayed());

    }


}
