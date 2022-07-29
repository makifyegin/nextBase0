package com.nextBase.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PollNegative_StepDefs {

    @When("user clicks on SEND button")
    public void userClicksOnSENDButton() {
    }

    @Then("verify that poll is not send and error message The message title is not specified is displayed")
    public void verifyThatPollIsNotSendAndErrorMessageTheMessageTitleIsNotSpecifiedIsDisplayed() {
    }

    @Given("user has provided title")
    public void userHasProvidedTitle() {
    }

    @Then("verify that poll is not send and error message Please specify at least one person is displayed")
    public void verifyThatPollIsNotSendAndErrorMessagePleaseSpecifyAtLeastOnePersonIsDisplayed() {
    }

    @When("two answers are provided")
    public void twoAnswersAreProvided() {
    }

    @Then("verify that poll is not send and error message Please specify at least one question is displayed")
    public void verifyThatPollIsNotSendAndErrorMessagePleaseSpecifyAtLeastOneQuestionIsDisplayed() {
    }

    @When("user deletes the question box")
    public void userDeletesTheQuestionBox() {
    }

    @When("user just fills out question box and only one answer")
    public void userJustFillsOutQuestionBoxAndOnlyOneAnswer() {
    }

    @Then("verify that poll is not send and error message Please specify at least two answers is displayed")
    public void verifyThatPollIsNotSendAndErrorMessagePleaseSpecifyAtLeastTwoAnswersIsDisplayed() {
    }

    @When("user just fills out question box")
    public void userJustFillsOutQuestionBox() {
    }
}
