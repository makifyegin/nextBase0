package com.nextBase.pages;

import com.nextBase.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage<usernameInput> {
    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(name ="USER_LOGIN")
    public WebElement usernameInput;

    @FindBy(name ="USER_PASSWORD")
    public WebElement passwordInput;

    @FindBy(className ="login-btn")
    public WebElement loginButton;

    @FindBy(xpath = "//div[@class='errortext']")
    public WebElement errorMessage;




}
