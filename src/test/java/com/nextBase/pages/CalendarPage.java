package com.nextBase.pages;

import com.nextBase.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CalendarPage {

    public CalendarPage() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//button[@class='ui-btn-main']")
    public WebElement add;



    @FindBy(xpath = "(//*[@class='calendar-field calendar-field-datetime'])[1]")
    public WebElement dateFromInput;

    @FindBy(xpath = "(//*[@class='calendar-field calendar-field-datetime'])[2]")
    public WebElement dateToInput;

    // Pleaser add eventNameInput is akif.
    @FindBy(xpath = "//*[@name='name']")
    public WebElement eventNameInput;


    @FindBy(xpath = "//*[@class='ui-btn ui-btn-success']")
    public WebElement calendarSliderSaveButton;

    @FindBy(xpath = "//span[text()='akif']")
    public WebElement eventNameFind;

    @FindBy(xpath = "//span[text()='My Calendar']")
    public WebElement myCalendar;

    @FindBy(xpath = "//span[text()='Company Calendar']")
    public WebElement companyCalendar;


    @FindBy(xpath = "(//input[@tabindex='1'])[1]")
    public WebElement filterAndSearch;

    @FindBy(xpath = "//div[@class = 'calendar-timeline-stream-content-event-name']")
    public WebElement calendarTimeLine;




}
