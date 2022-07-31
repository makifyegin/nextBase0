package com.nextBase.step_definitions;

import com.nextBase.pages.Poll_Page;
import com.nextBase.utilities.BrowserUtils;
import com.nextBase.utilities.Driver;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

public class PollNegative_StepDefs {

    Poll_Page Poll_Page = new Poll_Page();

    @When("user clicks on SEND button")
    public void userClicksOnSENDButton() {
        Poll_Page.sendButton.click();
    }

    @Then("verify that poll is not send and error message The message title is not specified is displayed")
    public void verifyThatPollIsNotSendAndErrorMessageTheMessageTitleIsNotSpecifiedIsDisplayed() {
    Poll_Page.titleErrorMessage.isDisplayed();
    }

    @Given("user has provided title")
    public void userHasProvidedTitle() {
        Poll_Page.iframeTitleField.sendKeys("Title"+Keys.ENTER);
    }

    @Then("verify that poll is not send and error message Please specify at least one person is displayed")
    public void verifyThatPollIsNotSendAndErrorMessagePleaseSpecifyAtLeastOnePersonIsDisplayed() {
        Poll_Page.titleErrorMessage.isDisplayed();
    }

    @When("two answers are provided")
    public void twoAnswersAreProvided() {
        Poll_Page.answerBoxTwo.sendKeys("No");
        Poll_Page.answerBoxOne.sendKeys("Yes");
    }

    @Then("verify that poll is not send and error message Please specify at least one question is displayed")
    public void verifyThatPollIsNotSendAndErrorMessagePleaseSpecifyAtLeastOneQuestionIsDisplayed() {
    String actualMessage =  Poll_Page.titleErrorMessage.getText();
    String expectedMessage = "Please specify at least one question.";
        Assert.assertEquals(expectedMessage,actualMessage);
    }

    @When("user deletes the question box")
    public void userDeletesTheQuestionBox() {
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(Poll_Page.questionBoxOne);
        Poll_Page.deleteQuestionsBoxOne.click();

    }

    @When("user just fills out question box and only one answer")
    public void userJustFillsOutQuestionBoxAndOnlyOneAnswer() {
        Poll_Page.answerBoxOne.sendKeys("Answer One");
        Poll_Page.questionBoxOne.sendKeys("Question One");
    }

    @Then("verify that poll is not send and error message Please specify at least two answers is displayed")
    public void verifyThatPollIsNotSendAndErrorMessagePleaseSpecifyAtLeastTwoAnswersIsDisplayed() {
        String expectedMsg = "Please specify at least two answers.";
        boolean verificationTwoAnswers = Poll_Page.iframeOne.toString().contains(expectedMsg);

    }

    @When("user just fills out question box")
    public void userJustFillsOutQuestionBox() {
    }
}
