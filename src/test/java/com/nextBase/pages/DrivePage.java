package com.nextBase.pages;

import com.nextBase.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DrivePage {

    public DrivePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//span[@class='menu-item-link-text'])[5]")
    public WebElement drive;

    @FindBy(xpath = "(//span[.='My Drive'])[1]")
    public WebElement myDrive;

    @FindBy(xpath = "//span[.='All Documents']")
    public WebElement allDocuments;


}
