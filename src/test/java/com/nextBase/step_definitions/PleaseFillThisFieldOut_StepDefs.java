package com.nextBase.step_definitions;

import com.nextBase.pages.LoginPage;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class PleaseFillThisFieldOut_StepDefs {

    LoginPage PleaseFillThisFieldOut = new LoginPage();

    @Then("user should not see dashboard instead this notice message : <Please fill out this field>")
    public void user_should_not_see_dashboard_instead_this_notice_message_please_fill_out_this_field() {
        Assert.assertEquals("Please fill out this field", PleaseFillThisFieldOut.errorMessage.getText());
    }

}
