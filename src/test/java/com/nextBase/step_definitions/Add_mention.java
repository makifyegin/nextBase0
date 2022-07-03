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

    @Given("User is on nextBase LoginPage")
    public void user_is_on_next_base_login_page() {
        Driver.getDriver().get("https://qa.nextbasecrm.com/");


    }

    @When("user enters firstname")
    public void userEntersFirstname() {
        next889.usernameInput.sendKeys("hr2@cybertekschool.com");
    }

    @And("user enters password")
    public void user_enters_password() {
        next889.passwordInput.sendKeys("UserUser");
    }

    @When("user clicks to login button")
    public void user_clicks_to_login_button() {
        next889.loginButton.click();
    }



    @Then("user should see CRM")
    public void user_should_see_crm() {
        String expectedUrl = "https://qa.nextbasecrm.com/stream/?login=yes";
        String actualUrl = Driver.getDriver().getCurrentUrl();
    }


    @When("User clicks add on message icon in the message box")
    public void user_clicks_add_on_message_icon_in_the_message_box() {
        next889.addMentionIcon.click();


    }

    @When("User clicks on employee and department tab")
    public void user_clicks_on_employee_and_department_tab() {
        next889.employeeTagAndDepartmentTag.click();

    }

    @When("User clicks hr1@cybertekschool.com email")
    public void user_clicks_hr1_cybertekschool_com_email() {
        Driver.getDriver().manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        next889.hr1CybertekSchoolUser.click();
    }

    @Then("User should be able to see chosen email address under the Message tab")
    public void user_should_be_able_to_see_chosen_email_address_under_the_message_tab() {
        Driver.getDriver().switchTo().frame(next889.iframeMessageBox);

        String expectedResult = "hr1@cybertekschool.com";
        String actualResult = next889.messageBox.getText();

        Assert.assertEquals(expectedResult,actualResult);

    }




}
