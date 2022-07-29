package com.nextBase.pages;

import com.nextBase.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MG_NegativePage {

    public MG_NegativePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(css = "input[type='submit'].login-btn")   //LogIn OK
    public WebElement loginAsHR;


    @FindBy(xpath = "//*[@id='pagetitle']")  // PageTitle OK
    public WebElement activityStream;

    @FindBy(css= "span.feed-inform-comments>a")    //NEED 2 REVIEW
    public WebElement commentButton;

    @FindBy(xpath = ("//button[text()='Send']"))  //NEED TO REVIEW
    public WebElement clickSendButton;


}