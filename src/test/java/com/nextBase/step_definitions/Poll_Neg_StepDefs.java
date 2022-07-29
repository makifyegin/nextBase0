package com.nextBase.step_definitions;

import com.nextBase.pages.Poll_Page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Poll_Neg_StepDefs {

    com.nextBase.pages.Poll_Page Poll_Page = new Poll_Page();


    @When("user clicks on SEND button")
    public void user_clicks_on_send_button() {
    Poll_Page.sendButton.click();
    }
    @Then("verify that poll is not send and error message The message title is not specified is displayed")
    public void verify_that_poll_is_not_send_and_error_message_the_message_title_is_not_specified_is_displayed() {
    Poll_Page.titleErrorMessage.isDisplayed();
    }

    @Given("user has provided title")
    public void user_has_provided_title() {

    }
    @When("user clicks on SEND button")
    public void user_clicks_on_send_button() {

    }
    @Then("verify that poll is not send and error message Please specify at least one person is displayed")
    public void verify_that_poll_is_not_send_and_error_message_please_specify_at_least_one_person_is_displayed() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Given("user has provided title")
    public void user_has_provided_title() {

    }
    @When("two answers are provided")
    public void two_answers_are_provided() {

    }
    @When("user clicks on SEND button")
    public void user_clicks_on_send_button() {

    }
    @Then("verify that poll is not send and error message Please specify at least one question is displayed")
    public void verify_that_poll_is_not_send_and_error_message_please_specify_at_least_one_question_is_displayed() {

    }

    @Given("user has provided title")
    public void user_has_provided_title() {

    }
    @When("user deletes the question box")
    public void user_deletes_the_question_box() {

    }
    @When("user clicks on SEND button")
    public void user_clicks_on_send_button() {

    }
    @Then("verify that poll is not send and error message Please specify at least one question is displayed")
    public void verify_that_poll_is_not_send_and_error_message_please_specify_at_least_one_question_is_displayed() {

    }

    @Given("user has provided title")
    public void user_has_provided_title() {

    }
    @When("user just fills out question box and only one answer")
    public void user_just_fills_out_question_box_and_only_one_answer() {

    }
    @When("user clicks on SEND button")
    public void user_clicks_on_send_button() {

    }
    @Then("verify that poll is not send and error message Please specify at least two answers is displayed")
    public void verify_that_poll_is_not_send_and_error_message_please_specify_at_least_two_answers_is_displayed() {

    }

    @Given("user has provided title")
    public void user_has_provided_title() {

    }
    @When("user just fills out question box")
    public void user_just_fills_out_question_box() {

    }
    @When("user clicks on SEND button")
    public void user_clicks_on_send_button() {

    }
    @Then("verify that poll is not send and error message Please specify at least two answers is displayed")
    public void verify_that_poll_is_not_send_and_error_message_please_specify_at_least_two_answers_is_displayed() {

    }

}
