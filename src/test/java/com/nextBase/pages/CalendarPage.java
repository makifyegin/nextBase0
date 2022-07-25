package com.nextBase.pages;

import com.nextBase.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CalendarPage {

    public CalendarPage() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//button[@class='ui-btn-main']")
    public WebElement add;


    @FindBy(xpath = "(//*[@class='calendar-field calendar-field-datetime'])[1]")
    public WebElement eventDateAndTime;

    @FindBy(xpath = "(//*[@class='calendar-field calendar-field-datetime'])[2]")
    public WebElement eventEndDateAndTime;

    // Pleaser add eventNameInput is akif.
    @FindBy(xpath = "//*[@name='name']")
    public WebElement eventNameInput;


    @FindBy(xpath = "//*[@class='ui-btn ui-btn-success']")
    public WebElement calendarSliderSaveButton;

    @FindBy(xpath = "//span[text()='akif']")
    public WebElement eventNameFind;

    @FindBy(xpath = "//span[text()='My Calendarf']")
    public WebElement myCalendar;

    @FindBy(xpath = "//span[text()='Company Calendar']")
    public WebElement companyCalendar;


    @FindBy(xpath = "(//input[@tabindex='1'])[1]")
    public WebElement filterAndSearch;


    @FindBy(xpath = "//div[@class = 'calendar-timeline-stream-content-event-name']")
    public WebElement calendarTimeLine;

    @FindBy(xpath = "//input[@name = 'skip_time']")
    public WebElement allDayCheckBox;

    @FindBy(xpath = "(//div[@class='calendar-timeline-stream-section-wrap'])[2]")
    public WebElement calenderCompanyEvents;


    @FindBy(xpath = "//input[@name='importance']")
    public WebElement thisEventIsImportant;


    @FindBy(xpath = "//select[@name='EVENT_RRULE[FREQ]']")
    public WebElement repeatSelector;

    @FindBy(xpath = "//input[@name='lo_cation']")
    public WebElement loCationInput;

    @FindBy(xpath = "//*[@id='EC51750443-slider-destination-link']")
    public WebElement AddMore;

    @FindBy(xpath = "//div[@class='calendar-additional-alt-more']")
    public WebElement more;

    @FindBy(xpath = "//li[contains(@style, '115,')]//span")
    public WebElement pink;

    @FindBy(xpath = "//*[@id='calendar_slider_820357_accessibility']")
    public WebElement accessibilitySelect;

    @FindBy(xpath = "//*[@name='private_event']")
    public WebElement privateEventInput;

    @FindBy(xpath = "//span[@class='calendar-field-colorpicker-color-item-more-link']")
    public WebElement otherColorSelectClickButton;

    @FindBy(xpath = "//div[@class='main-color-picker-box']")
    public WebElement otherColorSelect;


    @FindBy(xpath = "//span[@class='calendar-field-colorpicker-color-item-more-link']")
    public WebElement NavyBlueColor;

    @FindBy(xpath = "//div[@class='calendar-timeline-stream-content-event-name']")
    public WebElement eventName;

    @FindBy(xpath = "//span[@id='EC1725938622-slider-destination-link']")
    public WebElement attendees;

    @FindBy(xpath = "(//div[@class='bx-finder-box-item-t7-name'])[2]")
    public WebElement attendeesHelpDesk;

    @FindBy(xpath = "//span[@class='popup-window-close-icon']")
    public WebElement attendeesClose;

    @FindBy(xpath = "//div[.='hr1@cybertekschool.com']")
    public WebElement attendeeUser;


    @FindBy(xpath = "//input[@class='feed-add-destination-inp']")
    public WebElement attendInput;

    @FindBy(xpath = "//span[.='Time zone']")
    public WebElement timeZone;

    @FindBy(xpath = "//*[@class='calendar-field-colorpicker-color-item']")
    public WebElement colourWebElement;


    private final Color RGB_COLOUR = Color.fromString("rgb(255, 255, 255)");
//    public static String colorFinder(WebElement webElement) {
//
//    }

}
