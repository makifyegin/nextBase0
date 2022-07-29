package com.nextBase.step_definitions;

import com.nextBase.pages.NextBasePage;
import com.nextBase.pages.Poll_Page;
import com.nextBase.utilities.BrowserUtils;
import com.nextBase.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Poll_StepDefs {

    com.nextBase.pages.Poll_Page Poll_Page = new Poll_Page();
    NextBasePage nextBasePage = new NextBasePage();


    List<WebElement>userName;

    private static WebDriver driver;

    // Add multiple Employees
    @Given("user clicks on Poll")
    public void user_clicks_on_poll() {
        Poll_Page.pollButton.click();
    }

    @When("user on To bar and deletes All employees selection")
    public void userOnToBarAndDeletesAllEmployeesSelection() {
        Poll_Page.allEmployeesDelete.click();
        BrowserUtils.waitForVisibility(Poll_Page.addPersons,2);
    }

    @And("user clicks on Add persons, groups or department field")
    public void userClicksOnAddPersonsGroupsOrDepartmentField() {
        Poll_Page.addPersons.click();
        BrowserUtils.waitForVisibility(Poll_Page.employeesAndDepartmentsSection,2);
    }

    @And("clicks on Employees and departments button")
    public void clicksOnEmployeesAndDepartmentsButton() {
        Poll_Page.employeesAndDepartmentsSection.click();
    }

    @And("user selects multiple contacts from contact list")
    public void userSelectsMultipleContactsFromContactList() {
        List<WebElement> userName = BrowserUtils.getElement(nextBasePage.oneContact);

        for (int i = 0; i < 3; i++) {
            userName.get(i).click();
            Boolean actualContact = userName.get(i).getText().contains("@");

        }
    }

    @Then("verify that multiple contacts is added to the list")
    public void verifyThatMultipleContactsIsAddedToTheList() {
        Poll_Page.toBarAddedUsers.isDisplayed();
    }

    //Link Icon
/*
        @When("user clicks on link icon")
        public void user_clicks_on_link_icon () {
            Poll_Page.linkIcon.click();
        }

        @Then("user is able to see a pop up window with title Link")
        public void user_is_able_to_see_a_pop_up_window_with_title_link () {
            Poll_Page.linkPopUp.isDisplayed();
        }

        @When("filling out link text and link url and clicking on save")
        public void filling_out_link_text_and_link_url_and_clicking_on_save () {
        }

        @When("filling out link text {string} and link url {string} and clicking on save")
        public void fillingOutLinkTextAndLinkUrlAndClickingOnSave (String arg0, String arg1){
            Poll_Page.linkTextInputBox.sendKeys(arg0);
            Poll_Page.urlTextInputBox.sendKeys(arg1);
            Poll_Page.saveButton.click();
        }

        @Then("user can see the hyperlink added to the field")
        public void user_can_see_the_hyperlink_added_to_the_field () {
            Poll_Page.activityBox.isDisplayed();
             }
*/
//MENTION SCENARIO
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

    //MULTIPLE ANSWER SCENARIO
    @When("clicking on Answer Two input box to create a next answer input box")
    public void clickingOnAnswerTwoInputBoxToCreateANextAnswerInputBox() {
        Poll_Page.answerBoxTwo.click();
    }

    @And("clicking on Answer Three input box to create a next answer input box")
    public void clickingOnAnswerThreeInputBoxToCreateANextAnswerInputBox() {
        Poll_Page.answerBoxThree.click();
    }
    @And("clicking on Add question link text")
    public void clickingOnAddQuestionLinkText() {
        Poll_Page.addQuestionBox.click();
    }

    @Then("verify that Answer Three, Answer Four input box and another question input box will appear")
    public void verifyThatAnswerThreeAnswerFourInputBoxAndAnotherQuestionInputBoxWillAppear() {
        Poll_Page.answerBoxThree.isDisplayed();
        Poll_Page.answerBoxFour.isDisplayed();
        Poll_Page.addQuestionBox.isDisplayed();
    }

//DELETE MULTIPLE ANSWERS AND QUESTION BOX
    @When("multiple questions with multiple answers are added")
    public void multiple_questions_with_multiple_answers_are_added() {
        Poll_Page.answerBoxTwo.click();
        Poll_Page.answerBoxThree.click();
        Poll_Page.addQuestionBox.click();
      //  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @When("user can delete a question and an answer")
    public void user_can_delete_a_question_and_an_answer() {

      //  WebElement tmpElement = driver.findElement(By.xpath("//input[@name='UF_BLOG_POST_VOTE_n0_DATA[QUESTIONS][0][ANSWERS][2][MESSAGE_TYPE]']"));
      //  JavascriptExecutor executor = (JavascriptExecutor)driver;
      //  executor.executeScript("arguments[0].click();", tmpElement);

        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(Poll_Page.deleteAnswerBoxThree);
        Poll_Page.deleteAnswerBoxThree.click();
        actions.moveToElement(Poll_Page.deleteAnswerBoxFour);
        Poll_Page.deleteAnswerBoxFour.click();
        actions.moveToElement(Poll_Page.deleteQuestionBox);
        Poll_Page.deleteQuestionBox.click();

    }

    @Then("that deleted question box and answer box is gone on site")
    public void that_deleted_question_box_and_answer_box_is_gone_on_site() {
        List<WebElement> listOfAnswers = driver.findElements(By.xpath("//li[@class='vote-block-inp-wrap']"));

        System.out.println("listOfAnswers.size() = " + listOfAnswers.size());

    }

//MULTIPLE CHOICE BOX
    @When("user clicks checkbox <Allow multiple choice>")
    public void user_clicks_checkbox_allow_multiple_choice() {
        Poll_Page.allowMultipleChoiceBox.click();
    }

    @Then("checkbox will turn blue and get enabled")
    public void checkbox_will_turn_blue_and_get_enabled() {
        Poll_Page.allowMultipleChoiceBox.isSelected();
    }


 //   @When("user clicks link icon")
 //   public void userClicksLinkIcon() {
  //      Poll_Page.linkIcon.click();
  //  }


}



