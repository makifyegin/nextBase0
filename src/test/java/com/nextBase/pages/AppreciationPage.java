package com.nextBase.pages;

import com.nextBase.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AppreciationPage {

    public AppreciationPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//span[@id='feed-add-post-form-link-text']" )
    public WebElement moreButton;

    @FindBy(xpath = "(//span[@class='menu-popup-item-text'])[2]")
    public WebElement appreciationButton;

    @FindBy(xpath = "//span[@id='bx-b-uploadfile-blogPostForm']")
    public WebElement uploadFilesIcon;

    @FindBy(xpath = "(//div[@class='diskuf-uploader'])[1]")
    public WebElement uploadFilesAndImagesButton;

    @FindBy(xpath = "//a[.='Add more']")
    public WebElement addMoreButton;

    @FindBy(xpath = "//a[@class='bx-finder-box-tab bx-lm-tab-department']")
    public WebElement employeesAndDepartments;

    @FindBy(xpath = "//body[@contenteditable='true']")
    public WebElement passingMessageForAddingUser;

    @FindBy(xpath = "//a[@rel='U512']/div[@class='bx-finder-company-department-employee-info']")
    public WebElement helpDesk22;

    @FindBy(xpath = "//a[@rel='U513']/div/div[@class='bx-finder-company-department-employee-name']")
    public WebElement helpdesk23User;

    @FindBy(xpath = "//a[@id='dest_1639_512']")
    public WebElement aTagHelpdeskUser;

    @FindBy(xpath = "//span[@class='popup-window-close-icon']")
    public WebElement closeUserTab;

    @FindBy(xpath = "//span[@class='bxhtmled-top-bar-btn bxhtmled-button-link']/i")
    public WebElement linkIcon;

    @FindBy(xpath = "//input[@id='linkidPostFormLHE_blogPostForm-href']")
    public WebElement linkURLBar;

    @FindBy(xpath = "//span[@class='bxhtmled-top-bar-btn bxhtmled-button-video']/i")
    public WebElement insertVideoIcon;

    @FindBy(xpath = "//table/tbody/tr[1]/td[2]/input[@id='video_idPostFormLHE_blogPostForm-source']")
    public WebElement videoLinkBar;

    @FindBy(xpath = "//input[@value='Save']")
    public WebElement saveVideoLink;

    @FindBy(xpath = "//span[@class='bxhtmled-top-bar-btn bxhtmled-button-quote']/i")
    public WebElement quoteIcon;

    @FindBy(xpath = "//blockquote[@class='bxhtmled-quote']")
    public WebElement quoteInputBar;

    @FindBy(xpath = "//span[@id='bx-b-mention-blogPostForm']")
    public WebElement addMentionIcon;

    @FindBy(xpath = "(//div[.='hr1@cybertekschool.com'])[3]")
    public WebElement hrUserMention;

    @FindBy(xpath = "(//span[@class='feed-post-more-text'])[1]")
    public WebElement more;

    @FindBy(xpath = "(//span[.='Delete'])[1]")
    public WebElement deleteButton;

    @FindBy(xpath = "//button[@id='blog-submit-button-save']")
    public WebElement sendButton;




}
