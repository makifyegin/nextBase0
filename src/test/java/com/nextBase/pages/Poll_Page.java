package com.nextBase.pages;

import com.nextBase.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Poll_Page {

    public Poll_Page(){PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy(id= "feed-add-post-form-tab-vote")
    public WebElement pollButton;

    @FindBy(xpath = "//span[@class='feed-add-post-del-but']")
    public WebElement allEmployeesDelete;


    @FindBy(id="bx-destination-tag")
    public WebElement addPersons;

    @FindBy(xpath = "//a[text()='Employees and departments']")
    public WebElement employeesAndDepartmentsSection;

    @FindBy(id="feed-add-post-destination-container")
    public WebElement toBarAddedUsers;


    @FindBy(xpath = "//span[@title='Link']")
    public WebElement linkIcon;

    @FindBy(id= "bx-admin-prefix")
    public WebElement linkPopUp;

    @FindBy(xpath = "//*[@placeholder='Link text']")
    public WebElement linkTextInputBox;

    @FindBy(xpath = "//*[@placeholder='Link URL']")
    public WebElement urlTextInputBox;


    @FindBy(className = "adm-btn-save")
    public WebElement saveButton;

    @FindBy(className = "bx-editor-iframe")
    public WebElement activityBox;

    @FindBy(id = "bx-b-mention-blogPostForm")
    public WebElement mentionBox;

    @FindBy(name = "POST_MESSAGE")
    public WebElement mentionAdded;

    @FindBy(id = "answer_0__1_")
    public WebElement answerBoxTwo;

    @FindBy(id= "answer_0__2_")
    public WebElement answerBoxThree;

    @FindBy(xpath = "//a[.='Add question']")
    public WebElement addQuestionBox;

    @FindBy(id = "answer_0__3_")
    public WebElement answerBoxFour;

    @FindBy(id = "multi_0")
    public WebElement allowMultipleChoiceBox;

   // @FindBy(css = "label[for='answer_0__2_']")
  //  public WebElement deleteAnswerBoxThree;

    @FindBy(id="answer_0__2_")
    public WebElement AnswerBoxThreeWholeBox;

    @FindBy(xpath = "//label[@for='answer_0__2_']")
    public WebElement deleteAnswerBoxThree;
   //  @FindBy(xpath = "//input[@name='UF_BLOG_POST_VOTE_n0_DATA[QUESTIONS][0][ANSWERS][2][MESSAGE_TYPE]']")
  //  public WebElement deleteAnswerBoxThree;

    @FindBy(id="answer_0__3_")
    public WebElement AnswerBoxFourWholeBox;

    @FindBy(css = "label[for='answer_0__3_']")
    public WebElement deleteAnswerBoxFour;

    @FindBy(id="question_1")
    public WebElement questionBoxWhole;

    @FindBy(css = "label[for='question_1']")
    public WebElement deleteQuestionBox;


    @FindBy(id="blog-submit-button-save")
    public WebElement sendButton;

    @FindBy(className = "feed-add-info-text")
    public WebElement titleErrorMessage;

    @FindBy(className = "bx-editor-iframe")
    public WebElement iframeTitleField;

    @FindBy(id="answer_0__0_")
    public WebElement answerBoxOne;

    @FindBy(id = "question_0")
    public WebElement questionBoxOne;

    @FindBy(xpath = "//label[@for=\"question_0\"]")
    public WebElement deleteQuestionsBoxOne ;

    @FindBy(id = "blg-post-img-1574")
    public WebElement iframeOne;

}
