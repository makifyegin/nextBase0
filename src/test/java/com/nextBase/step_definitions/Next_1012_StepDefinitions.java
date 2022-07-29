package com.nextBase.step_definitions;

import com.github.javafaker.Faker;
import com.nextBase.pages.CalendarPage;
import com.nextBase.pages.NextBasePage;
import com.nextBase.utilities.BrowserUtils;
import com.nextBase.utilities.Driver;
import io.cucumber.java.ca.Cal;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.Color;

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
        calendarPage.eventNameInput.clear();
        calendarPage.eventNameInput.sendKeys(meetingRoom);
    }

    @Given("Specifying {string} dates in the spesific {string}")
    public void specifying_dates_in_the_spesific(String string, String string2) {
        calendarPage.eventDateAndTime.clear();
        calendarPage.eventDateAndTime.sendKeys(string);
        calendarPage.eventEndDateAndTime.clear();
        calendarPage.eventEndDateAndTime.sendKeys(string2);


    }

    Actions actions = new Actions(Driver.getDriver());

    @Given("Click the repeating event with description")
    public void click_the_repeating_event_with_description() {
        Select select = new Select(calendarPage.repeatSelector);
        select.selectByIndex(1);


    }

    @Given("Add {string} time zones")
    public void add_time_zones(String string) {
        calendarPage.timeZone.click();
    }


    Actions action = new Actions(Driver.getDriver());
    Faker faker = new Faker();
    String meetingRoom = faker.company().name();

    @Given("Add certain {string}")
    public void add_certain(String string) {


        calendarPage.loCationInput.click();
        calendarPage.locatorWhilePlace.click();
        System.out.println(meetingRoom);
        BrowserUtils.waitForVisibility(calendarPage.inputMeetingRoomsSaveButton, 10);
        calendarPage.inputMeetingRoomsSaveButton.click();
        calendarPage.inputMeetingRoomsSaveButton.clear();
        calendarPage.inputMeetingRoomsSaveButton.sendKeys(meetingRoom);
        calendarPage.meetingRoomsSaveButton.click();
//        List<WebElement> coloursWebElement = Driver.getDriver().findElements(By.xpath("//input[@name='lo_cation']"));
//        for (WebElement webElement : coloursWebElement) {
//            System.out.println(webElement.getText());
//        }


        //   Driver.getDriver().findElements(By.xpath("//*[@class='calendar-field-colorpicker-color-item']"));


//        BrowserUtils.waitForVisibility(calendarPage.loCationInput,5);
//        Driver.getDriver().findElement(By.xpath("//input[@name='lo_cation']")).click();
//        Driver.getDriver().findElement(By.xpath("(//span[@class='menu-popup-item-text'])[4]")).click();
//        calendarPage.locatorWhilePlace.click();

    }

    @Given("Add {string}")
    public void add(String string) {
        calendarPage.addMore.click();
        BrowserUtils.waitForVisibility(calendarPage.addMoreUser, 2);
        calendarPage.addMoreUser.click();

    }

    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

    @Given("Click More")
    public void click_more() {
        BrowserUtils.waitForVisibility(calendarPage.more, 3);
        calendarPage.more.click();
        BrowserUtils.waitForVisibility(calendarPage.privateEventInput, 3);
        actions.sendKeys(Keys.PAGE_DOWN).build().perform();
        // BrowserUtils.waitForVisibility(calendarPage.privateEventInput,3);

//        action.moveToElement(calendarPage.privateEventInput).perform();


    }

    @Given("Add colour of {string}")
    public void add_colour_of(String string) {
//        String pink = "rgb(248, 115, 150)";
//        pink = Color.fromString(pink).asHex();
//        System.out.println(pink);
//        String navyBlue = "rgb(28, 13, 100);";
//        navyBlue = Color.fromString(navyBlue).asHex();
        String pink = "#f87396";

        List<WebElement> coloursWebElement = Driver.getDriver().findElements(By.xpath("//*[@class='calendar-field-colorpicker-color-item']"));
        List<String> colors = new ArrayList<>();

        for (WebElement colour : coloursWebElement) {
            String color = colour.getCssValue("background-color");
            color = Color.fromString(color).asHex();
            colors.add(color);

            if (pink.equalsIgnoreCase(color)) {
                colour.click();
            }
        }
//        calendarPage.otherColorSelectClickButton.click();
//        List<WebElement> otherColorsWebElements = Driver.getDriver().findElements(By.xpath("//div[@class='main-color-picker-box']"));

//        for (WebElement otherColorsWebElement : otherColorsWebElements) {
//            String otherColors = otherColorsWebElement.getCssValue("background-color");
//            otherColors = Color.fromString(otherColors).asHex();
//            colors.add(otherColors);
//        }
//        System.out.println(colors);
    }


    @Given("Choose availability {string}")
    public void choose_availability(String string) {

        Select select = new Select(Driver.getDriver().findElement(By.name("accessibility")));
        select.selectByIndex(2);
    }

    List<WebElement> allLocations = Driver.getDriver().findElements(By.xpath("//span[@class='calendar-timeline-stream-content-event-location']"));

    @Given("Click the Event")
    public void click_the_event() {

        calendarPage.filterAndSearch.click();
        calendarPage.filterAndSearch.sendKeys(meetingRoom);
        BrowserUtils.waitFor(2);
        calendarPage.filterAndSearch.sendKeys(Keys.ENTER);
        calendarPage.filterAndSearch.sendKeys(Keys.ENTER);
        BrowserUtils.waitFor(3);

//
//        Actions actions1 = new Actions(Driver.getDriver());
//
////        BrowserUtils.waitForVisibility(By.xpath("//*[@id=\"EC398199812-main-container\"]/div[2]/div[4]/div[2]/div[1]/div[2]/div/div[3]/div[25]/div/div[2]/div/div[1]/div[2]/span[2]"), 3);
//        for (WebElement allMessage : allLocations) {
//            if (allMessage.getText().equals(meetingRoom)) {
//                actions1.doubleClick(allMessage).perform();
//                System.out.println(allMessage.getText());
//            }
//
//
//        }

/*        for (WebElement allMessage : allMessages) {
            if (allMessage.getText().contains("MY_FIRST_DESCRIPTION_OF_BIRTHDAY")) {
                actions1.doubleClick(allMessage);
                System.out.println(allMessage.getText());


            }

        }*/

    }

    @When("Click the Open")
    public void click_the_open() {

        action.doubleClick(calendarPage.firstElement).perform();
    }

    @Then("Verify that Event name is {string}")
    public void verify_that_event_name_is(String string) {
//        Assert.assertEquals(string, calendarPage.calendarHead.getText());
//        System.out.println(calendarPage.calendarHead.getText());
        Assert.assertEquals(meetingRoom, calendarPage.calendarHead.getText());
    }

    @Then("Verify that start day is {string} end date {string}")
    public void verify_that_start_day_is_end_date(String string, String string2) {
        String date = Driver.getDriver().findElement(By.xpath("//div[@class='calendar-slider-sidebar-string-value']")).getText();
        Assert.assertEquals("daily\n" +
                "from 08/25/2022", date);
    }

    @Then("Verify that {string} event is not selected")
    public void verify_that_event_is_not_selected(String string) {
//        calendarPage.editButton.click();
//        BrowserUtils.waitForVisibility(calendarPage.more, 3);
//        calendarPage.more.click();
        // more is not clickable

    }

    @Then("Verify that colour is \\{Pink}")
    public void verify_that_colour_is() {

    }


    @Given("Click the Edit")
    public void click_the_edit() {
        calendarPage.editButton.click();
//        BrowserUtils.waitForVisibility(calendarPage.allEventInstance, 5);
//        calendarPage.allEventInstance.click();


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
        calendarPage.user.click();
        BrowserUtils.waitForVisibility(calendarPage.logOut, 2);
        calendarPage.logOut.click();
        BrowserUtils.waitFor(2);
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
        calendarPage.filterAndSearch.sendKeys(meetingRoom);
        calendarPage.filterAndSearch.sendKeys(Keys.ENTER);

    }

    @Then("Verify that User can displays these events")
    public void verify_that_user_can_displays_these_events() {

        System.out.println(calendarPage.firstElement.getText());

    }

    @When("Click the I am an Organiser")
    public void click_the_i_am_an_organiser() {
        calendarPage.iamAnOrganiser.click();

    }


    @And("Verify that colour is {string}")
    public void verifyThatColourIs(String arg0) {

    }


    @And("Add [attendees]")
    public void addAttendees() {


    }

    NextBasePage nextBasePage = new NextBasePage();

    @And("user clickCtrlEnter save button")
    public void userClickCtrlEnterSaveButton() {
        calendarPage.SaveCtrlEnter.click();
        BrowserUtils.waitForVisibility(nextBasePage.calendar, 4);
    }

    @And("Edit recurring event")
    public void editRecurringEvent() {
        BrowserUtils.waitForVisibility(calendarPage.allEventInstance, 2);
        calendarPage.allEventInstance.click();
    }


    @And("Edit and Fill out the {string}")
    public void editAndFillOutThe(String arg0) {
        calendarPage.editButton.click();
        calendarPage.editInput.clear();
        calendarPage.editInput.sendKeys(arg0);


    }
}

