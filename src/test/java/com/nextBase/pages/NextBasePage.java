package com.nextBase.pages;

import com.nextBase.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.Properties;

public class NextBasePage {

    public NextBasePage() {

        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(name = "USER_LOGIN")
    public WebElement userName;

    @FindBy(name = "USER_PASSWORD")
    public WebElement passWord;

    @FindBy(xpath = "//input[@class='login-btn']")
    public WebElement loginBtn;

    @FindBy(xpath = "//span[@class='sitemap-menu-lines']")
    public WebElement menuBtn;

    @FindBy(xpath = "//*[@id=\"sitemap-content\"]/div[1]/div/a[5]")
    public WebElement ConversationBtn;


    @FindBy(id = "pagetitle")
    public WebElement ConversationTitle;


    @FindBy(xpath = "//input[@name='q']")
    public WebElement searchBtn;


//  @FindBy(xpath = "//span[@class='header-search-icon header-search-icon-title']")
//  public WebElement searchSymbol;
//
//
//  @FindBy(id = "pagetitle")
//  public WebElement calendarPage;
//
//
//  @FindBy(xpath = "//span[@id='pagetitle']")
//  public WebElement drivePage;
//
//
//
//  @FindBy(xpath = "//span[@id='pagetitle']")
//  public WebElement mailPage;


    @FindBy(xpath = "//*[@id=\"feed-empty-wrap\"]/div")
    public WebElement nothingFoundTitle;

    @FindBy(xpath = "(//span[normalize-space(text()) = 'Calendar'])[1]")
    public WebElement calendar;

//    public void loginHelpdesk(){
//        userName.sendKeys(ConfigurationReader.getProperty("helpdesk.username"));
//        passWord.sendKeys(ConfigurationReader.getProperty("nextBase.password"));
//        loginBtn.click();
//    }
//
//    public void loginHR(){
//        userName.sendKeys(ConfigurationReader.getProperty("h1.username"));
//        passWord.sendKeys(ConfigurationReader.getProperty("nextBase.password"));
//        loginBtn.click();
//    }
//
//
//    public void loginMarketing(){
//        userName.sendKeys(ConfigurationReader.getProperty("marketing.username"));
//        passWord.sendKeys(ConfigurationReader.getProperty("nextBase.password"));
//        loginBtn.click();
//    }


    ///////////////////////////////SPRINT 4 /////////////////////////////////////////////////


    @FindBy(xpath = "//span[@id='feed-add-post-form-tab-message']")
    public WebElement messageButton;


    @FindBy(xpath = "//span[@id='bx-b-uploadfile-blogPostForm']")
    public WebElement uploadedIcon;


    @FindBy(xpath = "(//div[@class='diskuf-uploader'])[1]")
    public WebElement uploadedFileAndImages;

    @FindBy(xpath = "//*[@id=\"bx-b-link-blogPostForm\"]/span/i")
    public WebElement uploadedLink;

    @FindBy(xpath = "//*[@id=\"bx-b-video-blogPostForm\"]/span/i")
    public WebElement insertVideo;

    @FindBy(xpath = "//input[@id=\"video_idPostFormLHE_blogPostForm-source\"]")
    public WebElement videoURL;

    @FindBy(className = "adm-btn-save")
    public WebElement videoSaveButton;

    @FindBy(xpath = "//span[@class='bxhtmled-video-error']")
    public WebElement videoUploadedError;


    @FindBy(xpath = "//*[@id=\"bx-b-quote-blogPostForm\"]/span/i")
    public WebElement addQuote;

    @FindBy(xpath = "/html/body/blockquote")
    public WebElement Quote;

    @FindBy(xpath = "//span[@id='bx-b-mention-blogPostForm']")
    public WebElement addMention;

    @FindBy(xpath = "//button[@id='blog-submit-button-save']")
    public WebElement sendButton;

    @FindBy(xpath = "//span[@id='feed-add-post-destination-item']")
    public WebElement contact;

    @FindBy(xpath = "//a[text()='Employees and departments']")
    public WebElement employeeAndDepartmentButton;


    @FindBy(xpath = "//div[@class='bx-finder-company-department-employee-name']")
    public List<WebElement> oneContact;


    @FindBy(id = "feed-add-post-destination-input")
    public WebElement contactInput;


    @FindBy(xpath = "//input[@id='linkidPostFormLHE_blogPostForm-text']")
    public WebElement linkText;


    @FindBy(xpath = "//input[@id='linkidPostFormLHE_blogPostForm-href']")
    public WebElement linkURL;


    @FindBy(xpath = "//input[@id='undefined']")
    public WebElement saveButton;


    @FindBy(xpath = "//iframe[@class='bx-editor-iframe']")
    public WebElement iframe;

    @FindBy(xpath = "/html/body/a")
    public WebElement cydeoLink;

    //
////"span[@id='bxid775003454']"
    @FindBy(xpath = "/html/body/div[7]/div[1]/div/div[2]/table/tr/td/div[1]/span/span[2]/a[1]/div[3]/div")
    public WebElement oneOfMention;

    @FindBy(xpath = "//span[@class='bxhtmled-metion']")
    public WebElement oneOfMentionAssert;


    @FindBy(xpath = "//span[@class='bx-finder-groupbox-content']/a")
    public WebElement contactList;


    @FindBy(xpath = "/html/body")
    public WebElement messageBody;


    /////////////NEGATIVE//////////////////////////


    @FindBy(xpath = "/html/body/div[7]/div[1]/div/div[1]/table/tr/td/div/span[1]/span[2]/a")
    public WebElement nonExistEmail;


    @FindBy(xpath = "//td[@class='bxhtmled-video-error-cell']/span")
    public WebElement negativeVideoURL;


    @FindBy(xpath = "(//div[@class='feed-add-error'])/span[2]")
    public WebElement sendMessageWithoutRecipient;


    @FindBy(xpath = "//*[@id=\"feed-add-post-form-notice-blockblogPostForm\"]/div/span[2]")
    public WebElement sendMessageWithoutTitle;



    @FindBy(xpath = "//*[@id=\"feed-add-post-destination-item\"]/span/span[2]")
    public WebElement allEmployee;


    @FindBy(xpath = "/html/body/a[1]")
    public WebElement missingLink;

    @FindBy(xpath = "//span[text()='League of Legends (TM) Client 2021-11-24 19-40-10.mp4']")
    public WebElement negativeUploaded;



}
