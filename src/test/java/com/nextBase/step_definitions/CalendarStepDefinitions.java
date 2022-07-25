package com.nextBase.step_definitions;

import com.github.javafaker.Faker;
import com.github.javafaker.University;
import com.nextBase.pages.CalendarPage;
import com.nextBase.pages.NextBasePage;
import com.nextBase.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en_old.Ac;
import org.junit.Assert;
import org.openqa.selenium.Keys;

import javax.swing.*;

public class CalendarStepDefinitions {

    NextBasePage nextBasePage = new NextBasePage();
    CalendarPage calendarPage = new CalendarPage();

    Faker faker = new Faker();

    String name = faker.name().fullName();


    @When("Click the Calendar")
    public void click_the_calendar() {
        nextBasePage.calendar.click();

    }

    @Then("Verify that User can see all the events belong to this Company.")
    public void verify_that_user_can_see_all_the_events_belong_to_this_company() {

        System.out.println(calendarPage.calenderCompanyEvents.getText());


    }

    @Then("Verify that User can see the my calendar on the page.")
    public void verify_that_user_can_see_the_my_calendar_on_the_page() {
    }


    @Given("Click the Add event")
    public void click_the_add_event() {
        calendarPage.add.click();


    }



    @Then("Verify that User can see your new event on the calendar.")
    public void verify_that_user_can_see_your_new_event_on_the_calendar() {

    }

    @And("Select the event date and fill out th event name")
    public void selectTheEventDateAndFillOutThEventName() {


        calendarPage.eventNameInput.clear();
        calendarPage.eventNameInput.sendKeys(name);
        calendarPage.eventDateAndTime.sendKeys("07/11/2022");
        calendarPage.eventEndDateAndTime.sendKeys("07/11/2022");
        calendarPage.allDayCheckBox.click();


    }

    @When("Click the MyCalendar")
    public void clickTheMyCalendar() {
        calendarPage.myCalendar.click();

    }

    @And("Click the Company Calendar")
    public void clickTheCompanyCalendar() {
        calendarPage.companyCalendar.click();
    }

    @And("Click Save")
    public void clickSave() {
        calendarPage.calendarSliderSaveButton.click();

    }

    @And("Click the Filter and Search")
    public void clickTheFilterAndSearch() {
        calendarPage.filterAndSearch.click();

    }

    @And("Write on your event name")
    public void writeOnYourEventName() {


        calendarPage.filterAndSearch.sendKeys(name);
        calendarPage.filterAndSearch.sendKeys(Keys.ENTER);


    }
}
