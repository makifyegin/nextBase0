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

    @FindBy(xpath = "//input[@name='USER_LOGIN']")
    public WebElement usernameInput;

    @FindBy(xpath ="//input[@name='USER_PASSWORD']")
    public WebElement passwordInput;

    @FindBy(className ="login-btn")
    public WebElement loginButton;

    @FindBy(xpath = "//span[@id='bx-b-mention-blogPostForm']")
    public WebElement addMentionIcon;

    @FindBy(xpath = "//a[@class='bx-finder-box-tab bx-lm-tab-department']")
    public WebElement employeeTagAndDepartmentTag;

    @FindBy(xpath = "//div[@class='bx-finder-company-department-employee-name']")
    public WebElement hr1CybertekSchoolUser;

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



}
