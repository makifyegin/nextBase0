package com.nextBase.pages;

import com.nextBase.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CalendarPage {

    public CalendarPage() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//button[@class='ui-btn-main']")
    public WebElement add;

    @FindBy(xpath = "//*[@id='calendar_slider_84180_date_from']")
    public WebElement dateFromInput;

    @FindBy(xpath = "//*[@id='calendar_slider_84180_date_to']")
    public WebElement dateToInput;

    // Pleaser add eventNameInput is akif.
    @FindBy(xpath = "//*[@id='calendar_slider_578462_entry_name']")
    public WebElement eventNameInput;


    @FindBy(xpath = "//*[@id='calendar_slider_84180_save']")
    public WebElement calendarSliderSaveButton;

    @FindBy(xpath = "//span[text()='akif']")
    public WebElement eventNameFind;


}
