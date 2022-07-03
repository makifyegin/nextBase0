package com.nextBase.step_definitions;

import com.nextBase.pages.NEXT889;
import com.nextBase.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.concurrent.TimeUnit;

public class Remove_tags {

    NEXT889 next889 = new NEXT889();
    @When("User clicks the tag icon")
    public void user_clicks_the_tag_icon() {
        next889.tagIcon.click();

    }
    @When("User types tag test")
    public void user_types_tag_test() {
      next889.tagInputBox.sendKeys("Test");
    }
    @When("User clicks add button1")
    public void user_clicks_add_button1() {
    next889.addButton.click();
    }
    @When("User clicks the x sign to remove added tag\\/s")
    public void user_clicks_the_x_sign_to_remove_added_tag_s() {
        next889.removeTag.click();

    }
    @Then("User should be able to see tags removed")
    public void user_should_be_able_to_see_tags_removed() {

    }
}
