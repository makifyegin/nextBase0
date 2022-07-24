package com.nextBase.step_definitions;

import com.nextBase.pages.CalendarPage;
import com.nextBase.utilities.BrowserUtils;
import com.nextBase.utilities.Driver;
import io.cucumber.java.ca.Cal;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.JavascriptExecutor;
import java.util.ArrayList;
import java.util.List;


public class Next_1012_StepDefinitions {
    CalendarPage calendarPage = new CalendarPage();

    @Given("Click the This event is important")
    public void click_the_this_event_is_important() {

        calendarPage.
                thisEventIsImportant.click();
    }

    @Given("Fill out the {string}")
    public void fill_out_the(String string) {
        string = "MY_FIRST_DESCRIPTION_OF_BIRTHDAY";
        calendarPage.eventNameInput.clear();
        calendarPage.eventNameInput.sendKeys(string);
    }

    @Given("Specifying {string} dates in the spesific {string}")
    public void specifying_dates_in_the_spesific(String string, String string2) {
        string = "25/08/2022";
        string2 = "30/08/2022";
        calendarPage.eventDateAndTime.clear();
        calendarPage.eventDateAndTime.sendKeys(string);
        calendarPage.eventEndDateAndTime.clear();
        calendarPage.eventEndDateAndTime.sendKeys(string2);


    }

    @Given("Click the repeating event with description")
    public void click_the_repeating_event_with_description() {
//        Select select = new Select(calendarPage.repeatSelector);
//        select.selectByIndex(1);


    }

    @Given("Add {string} time zones")
    public void add_time_zones(String string) {

    }



    Actions action = new Actions(Driver.getDriver());

    @Given("Add certain {string}")
    public void add_certain(String string) {


    }
// alskdfadslkfasd;lfjaldj
    @Given("Add {string}")
    public void add(String string) {

        BrowserUtils.waitForVisibility(calendarPage.attendees,3);
        calendarPage.attendInput.sendKeys("hr1@cybertekschool.com");

    }

    @Given("Click More")
    public void click_more() {
        calendarPage.more.click();
        action.moveToElement(calendarPage.privateEventInput).perform();

    }

    @Given("Add colour of {string}")
    public void add_colour_of(String string) {

    }

    @Given("Choose availability {string}")
    public void choose_availability(String string) {

    }



    @Given("Click the Event")
    public void click_the_event() {

    }

    @When("Click the Open")
    public void click_the_open() {

    }

    @Then("Verify that Event name is {string}")
    public void verify_that_event_name_is(String string) {

    }

    @Then("Verify that start day is {string} end date {string}")
    public void verify_that_start_day_is_end_date(String string, String string2) {

    }

    @Then("Verify that {string} event is not selected")
    public void verify_that_event_is_not_selected(String string) {

    }

    @Then("Verify that colour is \\{Pink}")
    public void verify_that_colour_is() {

    }


    @Given("Click the Edit")
    public void click_the_edit() {

    }

    @When("Click other color")
    public void click_other_color() {

    }


    @When("Click Private Event")
    public void click_private_event() {

    }

    @Then("Verify that Private event is selected.")
    public void verify_that_private_event_is_selected() {

    }

    @Given("Click Logout")
    public void click_logout() {

    }

    @When("List the Event")
    public void list_the_event() {

    }

    @Then("Verify that Marketing User can not see the private event")
    public void verify_that_marketing_user_can_not_see_the_private_event() {

    }


    @When("Choose available {string}")
    public void choose_available(String string) {

    }


    @Then("Verify that Available is {string}")
    public void verify_that_available_is(String string) {

    }


    @Then("verify that event {string} changed")
    public void verify_that_event_changed(String string) {

    }


    @When("Click the More")
    public void click_the_more() {

    }

    @When("Choose the {string} repeat")
    public void choose_the_repeat(String string) {

    }

    @Then("verify that this event is happen daily")
    public void verify_that_this_event_is_happen_daily() {

    }


    @When("Click the delete attendee")
    public void click_the_delete_attendee() {

    }

    @Then("Clock the Open")
    public void clock_the_open() {

    }

    @Then("Verify that event attend's was updated")
    public void verify_that_event_attend_s_was_updated() {

    }


    @When("Click the add {string} and {string} attendee")
    public void click_the_add_and_attendee(String string, String string2) {

    }


    @Then("Verify that event attendees was updated")
    public void verify_that_event_attendees_was_updated() {

    }

    @When("Click the Invitation {string}")
    public void click_the_invitation(String string) {

    }

    @When("Click the Search")
    public void click_the_search() {

    }

    @Then("Verify that User can displays these events")
    public void verify_that_user_can_displays_these_events() {

    }

    @When("Click the I am an Organiser")
    public void click_the_i_am_an_organiser() {

    }


    @And("Verify that colour is {string}")
    public void verifyThatColourIs(String arg0) {

    }


    @And("Add [attendees]")
    public void addAttendees() {




    }

}
