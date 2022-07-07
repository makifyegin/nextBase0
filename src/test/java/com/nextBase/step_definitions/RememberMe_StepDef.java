package com.nextBase.step_definitions;

import com.nextBase.pages.LoginPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class RememberMe_StepDef {

    LoginPage RememberMePage = new LoginPage<>();

    @When("user clicks on {string} checkbox")
    public void user_clicks_on_checkbox(String string) {
    RememberMePage.RememberMeBox.click();
    }

    @Then("checkbox will be clicked")
    public void checkbox_will_be_clicked() {
        Assert.assertTrue(RememberMePage.RememberMeBox.isSelected());
    }
}
