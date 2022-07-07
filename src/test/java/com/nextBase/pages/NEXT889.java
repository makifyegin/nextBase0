package com.nextBase.pages;

import com.nextBase.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NEXT889 {

    public NEXT889(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//div[@id='microoPostFormLHE_blogPostForm_inner']")
    public WebElement blogPost;

    @FindBy(xpath = "//input[@id='POST_TITLE']")
    public WebElement postTitle;


    @FindBy(xpath = "//span[@id='bx-b-mention-blogPostForm']")
    public WebElement addMentionIcon;

    @FindBy(xpath = "//a[@class='bx-finder-box-tab bx-lm-tab-department']")
    public WebElement employeeTagAndDepartmentTag;

    @FindBy(xpath = "(//div[@class='bx-finder-company-department-employee-name'])[2]")
    public WebElement hr76CybertekSchoolUser;

    @FindBy(xpath = "//body[@contenteditable='true']")
    public WebElement messageBox;

    @FindBy(xpath = "//iframe[@class='bx-editor-iframe']")
    public WebElement iframeMessageBox;

    @FindBy(xpath = "//span[@class='bxhtmled-top-bar-btn bxhtmled-button-link']/i")
    public WebElement linkButton;

    @FindBy(xpath = "//input[@id='linkidPostFormLHE_blogPostForm-text']")
    public WebElement textInputBox;

    @FindBy(xpath = "//input[@id='linkidPostFormLHE_blogPostForm-href']")
    public WebElement linkInputBox;

    @FindBy(xpath = "//input[@value='Save']")
    public WebElement saveButton;

    @FindBy(xpath = "//a[.='w3school']")
    public WebElement linkMessageBox;

    @FindBy(xpath = "//span[@class='bxhtmled-top-bar-btn bxhtmled-button-quote']/i")
    public WebElement quoteButton;

    @FindBy(xpath = "//blockquote[@class='bxhtmled-quote']")
    public WebElement blockQuote;

    @FindBy(xpath = "//button[@id='blog-submit-button-save']")
    public WebElement sendButton;

    @FindBy(xpath = ("(//table[@class='blogquote']/tbody/tr/td)[1]"))
    public WebElement postBlogQuote;

    @FindBy(xpath = "//span[@id='bx-b-tag-input-blogPostForm']")
    public WebElement tagIcon;

    @FindBy(xpath = "//input[@name='TAGS_blogPostForm']")
    public WebElement tagInputBox;

    @FindBy(xpath = "//span[@class='popup-window-button']")
    public WebElement addButton;

    @FindBy(xpath = "(//span[@class='feed-add-post-del-but'])[2]")
    public WebElement removeTag;

    @FindBy(xpath = "//span[contains(@class,'feed-post-more-text')][1]")
    public WebElement moreOption;

    @FindBy(xpath = "(//span[contains(@class,'menu-popup-item-text')][1])[7]")
    public WebElement deleteMessage;

    @FindBy(xpath = "(//div[@class='feed-post-cont-wrap sonet-log-item-createdby-694 sonet-log-item-where-U-694-all sonet-log-item-where-U-694-blog-post sonet-log-item-where-U-694-blog'])[1]")
    public WebElement postBlog;

    @FindBy(xpath = "//span[@class='bxhtmled-top-bar-btn bxhtmled-button-video']/i")
    public WebElement insertVideoIcon;

    @FindBy(xpath = "//input[@id='video_idPostFormLHE_blogPostForm-source']")
    public WebElement inputUrl;

    @FindBy(xpath = "//input[@class='adm-btn-save']")
    public WebElement insertVideoSaveButton;

    @FindBy(xpath = "//input[@id='video_idPostFormLHE_blogPostForm-source']")
    public WebElement videoSourceTextBox;


    @FindBy(xpath = ("(//div[@class='feed-com-files-cont'])[1]/a"))
    public WebElement actualTag;


    @FindBy(xpath = "//div[@class='feed-add-successfully']")
    public WebElement postIsDeletedMessage;

    @FindBy(linkText = "hr76@cybertekschool.com")
    public WebElement mention;

    @FindBy(xpath = "//a[@class='feed-com-tag']")
    public WebElement tagDisplay;



}
