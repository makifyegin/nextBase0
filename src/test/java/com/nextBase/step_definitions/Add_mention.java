package com.nextBase.step_definitions;

import com.github.javafaker.Faker;
import com.nextBase.pages.NEXT889;
import com.nextBase.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Add_mention {

    NEXT889 next889 = new NEXT889();


    @When("User mentions about hr76@cybertekschool.com")
    public void user_mentions_about_helpdesk2_cybertekschool_com() {

        Faker faker = new Faker();
        String title = faker.artist().name();
        next889.postTitle.sendKeys(title);
        next889.addMentionIcon.click();
        next889.employeeTagAndDepartmentTag.click();
        next889.hr76CybertekSchoolUser.click();
        next889.sendButton.click();
    }

    @Then("User should be able to see chosen email address under the Message tab")
    public void user_should_be_able_to_see_chosen_email_address_under_the_message_tab() {

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),5);
        wait.until(ExpectedConditions.invisibilityOf(next889.mention));

        String expectedResult = "hr76@cybertekschool.com";
        String actualResult = next889.mention.getText();
        System.out.println("actualResult = " + actualResult);
        Assert.assertEquals(expectedResult,actualResult);

    }


}
