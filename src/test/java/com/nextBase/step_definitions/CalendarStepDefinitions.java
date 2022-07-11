package com.nextBase.step_definitions;

import com.nextBase.pages.NextBasePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CalendarStepDefinitions {

    NextBasePage nextBasePage = new NextBasePage();

    @When("Click the Calendar")
    public void click_the_calendar() {
        nextBasePage.calendar.click();

    }

    @Then("Verify that User can see all the events belong to this Company.")
    public void verify_that_user_can_see_all_the_events_belong_to_this_company() {
    }

    @Then("Verify that User can see the my calendar on the page.")
    public void verify_that_user_can_see_the_my_calendar_on_the_page() {
    }

    @Given("See the ADD button on  the page and click the arrow.")
    public void see_the_add_button_on_the_page_and_click_the_arrow() {
    }

    @Given("Click the Add event")
    public void click_the_add_event() {

    }

    @Given("Click SAVE\\(CTRL + ENTER)")
    public void click_save_ctrl_enter() {
    }

    @Then("Verify that User can see your new event on the calendar.")
    public void verify_that_user_can_see_your_new_event_on_the_calendar() {

    }

    @And("Select the event date and fill out th event name")
    public void selectTheEventDateAndFillOutThEventName() {

    }
}
