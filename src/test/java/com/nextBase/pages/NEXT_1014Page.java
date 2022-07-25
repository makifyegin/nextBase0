package com.nextBase.pages;

import com.nextBase.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NEXT_1014Page {

    public NEXT_1014Page(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//span[@class='menu-item-link-text'])[10]")
    public WebElement employeesLink;

    @FindBy(xpath = "//span[@id='pagetitle']")
    public WebElement viewCompanyStructure;

    @FindBy(css ="span[class='webform-small-button-text']")
    public WebElement addDepartmentButton;

    @FindBy(id = "NAME")
    public WebElement inputDepartmentName;

    @FindBy(xpath = "//span[@class='popup-window-button popup-window-button-accept']")
    public  WebElement addDepartmentNameButton;

    @FindBy(xpath = "//a[@title='Taskmaster']")
    public WebElement departmentTitle;

    @FindBy(xpath = "(//span[@class='main-buttons-item-text-title'])[2]")
    public WebElement findEmployeesButton;

    @FindBy(id = "user-fio")
    public WebElement inputEmployeeSearchBox;

    @FindBy(linkText = "dadasdasdasd dada")
    public WebElement employeeName;

    @FindBy(css = "span[class='filter-but-text']")
    public WebElement searchByAlphabetButton;

    @FindBy(xpath = "(//a[@class='employee-ABC-letter'])[4]")
    public WebElement letterD;

    @FindBy(css="span[class='filter-but-icon']")
    public WebElement moreButton;

    @FindBy(xpath = "(//span[@class='menu-popup-item-text'])[1]")
    public WebElement exportToExcel;

    @FindBy(xpath = "(//span[@class='main-buttons-item-text-title'])[3]")
    public WebElement telephoneDirectoryButton;

    @FindBy(id = "pagetitle")
    public WebElement telephoneDirectoryPageTitle;

    @FindBy(linkText = "Mousa Adolai")
    public WebElement moussaLink;

    @FindBy(css = "span[class='webform-small-button-text']")
    public WebElement sendMessageButton;

    @FindBy(css = "textarea[class='bx-messenger-textarea-input']")
    public WebElement inputMessage;

    @FindBy(css ="textarea[class='bx-messenger-textarea-input']")
    public  WebElement pressEnterToSendMessage;

    @FindBy(css = "a[class='bx-im-fullscreen-popup-back-link']")
    public  WebElement closeMessageBox;

    @FindBy(id ="user-name")
    public WebElement usernameButton;

    @FindBy(xpath = "(//span[@class='menu-popup-item-text'])[5]")
    public WebElement logOutLink;

    @FindBy(name = "USER_LOGIN")
    public WebElement inputUsername;

    @FindBy(name = "USER_PASSWORD")
    public WebElement inputPassword;

    @FindBy(xpath = "//img[@class='bx-messenger-cl-avatar-img']")
    public WebElement messageAvatar;

    @FindBy(xpath = "(//span[@class='bx-messenger-message'])")
    public WebElement verifyMessage;

    @FindBy(css = "input[class='login-btn']")
    public WebElement logInButton;

    @FindBy(xpath = "//div[@id='workarea-content']//p")
    public WebElement workArea;

    @FindBy(xpath = "//span[@class='bx-messenger-box-topline-text']")
    public WebElement errorMessage;

    @FindBy(xpath = "//a[@data-role='department_name']")
    public WebElement departmentName;

}
