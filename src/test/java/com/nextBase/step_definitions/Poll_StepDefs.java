package com.nextBase.step_definitions;

import com.nextBase.pages.Poll_Page;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Poll_StepDefs {

    com.nextBase.pages.Poll_Page Poll_Page = new Poll_Page();
    public String arg0;
    public String arg1;
    public String arg2;


    @Given("user clicks on <Poll>")
    @Given("user clicks on Poll")
    public void user_clicks_on_poll() {
        Poll_Page.pollButton.click();
    }


    @And("user adds {string}, {string}, {string};")
    public void userAdds(String arg0, String arg1, String arg2) {

        Poll_Page.toBarAddedUsers.sendKeys(arg0, arg1, arg2);
    }

    @Then("verify that more than one user is added to the list")
    public void verify_that_more_than_one_user_is_added_to_the_list() {
        Poll_Page.toBarAddedUsers.isDisplayed();
    }

    @When("user clicks on link icon")
    public void user_clicks_on_link_icon() {
        Poll_Page.linkIcon.click();
    }

    @Then("user is able to see a pop up window with title Link")
    public void user_is_able_to_see_a_pop_up_window_with_title_link() {
        Poll_Page.linkPopUp.isDisplayed();
    }

    @When("filling out link text and link url and clicking on save")
    public void filling_out_link_text_and_link_url_and_clicking_on_save() {
    }

    @When("filling out link text {string} and link url {string} and clicking on save")
    public void fillingOutLinkTextAndLinkUrlAndClickingOnSave(String arg0, String arg1) {
        Poll_Page.linkTextInputBox.sendKeys(arg0);
        Poll_Page.urlTextInputBox.sendKeys(arg1);
        Poll_Page.saveButton.click();
    }

    @Then("user can see the hyperlink added to the field")
    public void user_can_see_the_hyperlink_added_to_the_field() {
        Poll_Page.activityBox.isDisplayed();
    }


    @When("clicking on mention icon user is able to choose a person")
    public void clicking_on_mention_icon_user_is_able_to_choose_a_person() {

    }

    public void clickingOnMentionIconUserIsAbleToChooseAPerson() {
        Poll_Page.mentionBox.click();
        Poll_Page.mentionAdded.click();
    }

    @Then("verify that a mention has been added in the field")
    public void verify_that_a_mention_has_been_added_in_the_field() {
        Poll_Page.mentionAdded.isDisplayed();
    }


    @When("clicking on {string} input box to create a next answer input box")
    public void clicking_on_input_box_to_create_a_next_answer_input_box(String string) {


    }

    @When("clicking on {string} link text")
    public void clicking_on_link_text(String string) {


    }

    @Then("verify that <Answer {int}, Answer {int}> input box and another question input box will appear")
    public void verify_that_answer_answer_input_box_and_another_question_input_box_will_appear(Integer
                                                                                                       int1, Integer int2) {

    }


    @When("multiple questions with multiple answers are added")
    public void multiple_questions_with_multiple_answers_are_added() {


    }

    @When("user can delete a question and an answer")
    public void user_can_delete_a_question_and_an_answer() {


    }

    @Then("that deleted question box and answer box is gone on site")
    public void that_deleted_question_box_and_answer_box_is_gone_on_site() {

    }

    @When("user clicks checkbox <Allow multiple choice>")
    public void user_clicks_checkbox_allow_multiple_choice() {
        Poll_Page.allowMultipleChoiceBox.click();
    }

    @Then("checkbox will turn blue and get enabled")
    public void checkbox_will_turn_blue_and_get_enabled() {
        Poll_Page.allowMultipleChoiceBox.isSelected();
    }

}


