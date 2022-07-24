package com.nextBase.step_definitions;

import com.nextBase.pages.Poll_Page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Poll_StepDefs {
    
    Poll_Page Poll_Page = new Poll_Page();


    @Given("user clicks on <Poll>")
    public void user_clicks_on_poll() {
       Poll_Page.pollButton.click();
    }

    @When("on To bar and deletes <All employees> selection")
    public void onToBarAndDeletesAllEmployeesSelection() {
      Poll_Page.allEmployeesDelete.click();
    }

    @When("clicks on <Add persons, groups or department> field")
    public void clicks_on_add_persons_groups_or_department_field() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("clicks different users from that section")
    public void clicks_different_users_from_that_section() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("verify that more than one user is added to the list")
    public void verify_that_more_than_one_user_is_added_to_the_list() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }




    io.cucumber.junit.UndefinedStepException: The step 'user clicks on <Poll>' and 4 other step(s) are undefined.
    You can implement these steps using the snippet(s) below:

    @Given("user clicks on <Poll>")
    public void user_clicks_on_poll() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("user clicks on link icon")
    public void user_clicks_on_link_icon() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("user is able to see a pop up window with title Link")
    public void user_is_able_to_see_a_pop_up_window_with_title_link() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("filling out link text and link url and clicking on save")
    public void filling_out_link_text_and_link_url_and_clicking_on_save() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("user can see the hyperlink added to the field")
    public void user_can_see_the_hyperlink_added_to_the_field() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


    io.cucumber.junit.UndefinedStepException: The step 'user clicks on <Poll>' and 2 other step(s) are undefined.
    You can implement these steps using the snippet(s) below:

    @Given("user clicks on <Poll>")
    public void user_clicks_on_poll() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("clicking on mention icon user is able to choose a person")
    public void clicking_on_mention_icon_user_is_able_to_choose_a_person() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("verify that a mention has been added in the field")
    public void verify_that_a_mention_has_been_added_in_the_field() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


    io.cucumber.junit.UndefinedStepException: The step 'user clicks on <Poll>' and 4 other step(s) are undefined.
    You can implement these steps using the snippet(s) below:

    @Given("user clicks on <Poll>")
    public void user_clicks_on_poll() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("clicking on {string} input box to create a next answer input box")
    public void clicking_on_input_box_to_create_a_next_answer_input_box(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("clicking on {string} link text")
    public void clicking_on_link_text(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("verify that <Answer {int}, Answer {int}> input box and another question input box will appear")
    public void verify_that_answer_answer_input_box_and_another_question_input_box_will_appear(Integer int1, Integer int2) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


    io.cucumber.junit.UndefinedStepException: The step 'user clicks on <Poll>' and 3 other step(s) are undefined.
    You can implement these steps using the snippet(s) below:

    @Given("user clicks on <Poll>")
    public void user_clicks_on_poll() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("multiple questions with multiple answers are added")
    public void multiple_questions_with_multiple_answers_are_added() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("user can delete a question and an answer")
    public void user_can_delete_a_question_and_an_answer() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("that deleted question box and answer box is gone on site")
    public void that_deleted_question_box_and_answer_box_is_gone_on_site() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


    io.cucumber.junit.UndefinedStepException: The step 'user clicks on <Poll>' and 2 other step(s) are undefined.
    You can implement these steps using the snippet(s) below:

    @Given("user clicks on <Poll>")
    public void user_clicks_on_poll() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("user clicks checkbox <Allow multiple choice>")
    public void user_clicks_checkbox_allow_multiple_choice() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("checkbox will turn blue and get enabled")
    public void checkbox_will_turn_blue_and_get_enabled() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

}
