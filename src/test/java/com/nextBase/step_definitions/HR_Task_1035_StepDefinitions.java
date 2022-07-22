package com.nextBase.step_definitions;

import com.nextBase.pages.HrTaskPage;
import com.nextBase.utilities.BrowserUtils;
import com.nextBase.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;


public class HR_Task_1035_StepDefinitions {
    HrTaskPage hrTaskPage = new HrTaskPage();
    @When("user clicks on header  and types {string}")
    public void user_clicks_on_header_and_types(String string) {
        hrTaskPage.thingsToDo.sendKeys(string, Keys.ENTER);
    }
    @When("User clicks High Priority button")
    public void user_clicks_high_priority_button() {
        hrTaskPage.highPriority.sendKeys(Keys.BACK_SPACE);
        hrTaskPage.highPriority.click();
    }
    @When("User clicks Text area and types {string}")
    public void user_clicks_text_area_and_types(String string) throws InterruptedException {
        Driver.getDriver().switchTo().frame(Driver.getDriver().findElement(By.xpath("//iframe[@class='bx-editor-iframe']")));
        hrTaskPage.textArea.click();
        hrTaskPage.textArea.sendKeys(string);
        Thread.sleep(3);
    }
    @When("User clicks Created by button")
    public void user_clicks_created_by_button() throws InterruptedException {
    }
    @When("User selects {string} date")
    public void user_selects_date(String string) {
        hrTaskPage.getDate31ThJun.click();
        hrTaskPage.selectButton.click();
    }
    @Then("Verify that {string} on the task page")
    public void verify_that_on_the_task_page(String string) {
        Driver.getDriver().switchTo().defaultContent();
       String actual= hrTaskPage.highPriorityTaskAssert.getText();
        Assert.assertEquals(string,actual);
    }
    @And("user clicks Add more menu")
    public void userClicksAddMoreMenu() {
        hrTaskPage.addMoreResponsible.click();
    }
    @And("user clicks time tracking button.")
    public void userClicksTimeTrackingButton() {
        BrowserUtils.scrollToElement(hrTaskPage.timeTrackingButton);
        hrTaskPage.timeTrackingButton.click();
    }
    @And("user clicks hours button and writes {string} on the time tracking")
    public void userClicksHoursButtonAndWritesOnTheTimeTracking(String hours) {
        hrTaskPage.timeTrackingHoursButton.click();
        BrowserUtils.waitForClickablility(hrTaskPage.timeTrackingHoursButton,60);
        hrTaskPage.timeTrackingHoursButton.sendKeys(hours);
    }
    @And("user clicks minutes button and writes {string} on the time tracking")
    public void userClikcsMinutesButtonAndWritesOnTheTimeTracking(String minutes) {
        hrTaskPage.timeTrackingMinuteButton.click();
        hrTaskPage.timeTrackingMinuteButton.sendKeys(minutes);
    }
    @When("User clicks Project menu")
    public void user_clicks_project_menu() {
        BrowserUtils.scrollToElement(hrTaskPage.projectAddButton);
        hrTaskPage.projectAddButton.click();
    }
    @And("user clicks {string} and clicks pop up button")
    public void userClicksAndClicksPopUpButton(String arg0) {
        hrTaskPage.responsiblePersonHR.click();
        hrTaskPage.responsiblePersonPopUpButton.click();
    }
    @And("user clicks created task button")
    public void userClicksCreatedTaskButton() {
        Driver.getDriver().switchTo().defaultContent();
        hrTaskPage.taskButton.click();
        hrTaskPage.timeEditingTaskButton.click();
    }
    @And("users clicks edit button")
    public void usersClicksEditButton() {
        Driver.getDriver().switchTo().frame(hrTaskPage.newTaskPageIframe);
        hrTaskPage.timeEditing.click();
        BrowserUtils.waitFor(3);
        Driver.getDriver().switchTo().defaultContent();
    }
    @And("user clicks  SAVE CHANGES button")
    public void userClicksSAVECHANGESButton() {
        hrTaskPage.saveChangesButton.click();

    }
    @And("user verify that chanced time")
    public void userVerifyThatChancedDate() {

        String expected="04:00:00";
        Assert.assertEquals(expected,hrTaskPage.timeAssert.getText());
        System.out.println(hrTaskPage.timeAssert.getText());
    }
    @Given("HR User has already created task as {string}")
    public void hrUserHasAlreadyCreatedTaskAs(String taskName) {
        hrTaskPage.newTaskButton.click();
        Driver.getDriver().switchTo().frame(Driver.getDriver().findElement(By.xpath("//iframe[@class='side-panel-iframe']")));
        hrTaskPage.thingsToDo.sendKeys("Time Editing Task", Keys.ENTER);
        Driver.getDriver().switchTo().frame(Driver.getDriver().findElement(By.xpath("//iframe[@class='bx-editor-iframe']")));
        hrTaskPage.textArea.click();
        hrTaskPage.textArea.sendKeys("Im creating  Time Editing Task ");
        Driver.getDriver().switchTo().parentFrame();
        hrTaskPage.deadline.click();
        hrTaskPage.getDate31ThJun.click();
        hrTaskPage.selectButton.click();
        hrTaskPage.addMoreResponsible.click();
        hrTaskPage.responsiblePersonHR.click();
        hrTaskPage.responsiblePersonPopUpButton.click();
        BrowserUtils.scrollToElement(hrTaskPage.clickMore);
        hrTaskPage.clickMore.click();
        BrowserUtils.scrollToElement(hrTaskPage.projectAddButton);
        BrowserUtils.waitForClickablility(hrTaskPage.projectAddButton,60);
        hrTaskPage.projectAddButton.click();
        hrTaskPage.soccerTeam.click();
        BrowserUtils.scrollToElement(hrTaskPage.timeTrackingButton);
        hrTaskPage.timeTrackingButton.click();
        hrTaskPage.timeTrackingHoursButton.click();
        BrowserUtils.waitForClickablility(hrTaskPage.timeTrackingHoursButton,60);
        hrTaskPage.timeTrackingHoursButton.sendKeys("2");
        hrTaskPage.addTaskEnter.click();
    }
    @Given("user clicks more button")
    public void user_clicks_more_button() {
        Driver.getDriver().switchTo().frame(Driver.getDriver().findElement(By.xpath("//iframe[@class='side-panel-iframe']")));
        BrowserUtils.waitForClickablility(hrTaskPage.thingsToDo,60);
        hrTaskPage.thingsToDo.sendKeys(" (edited)", Keys.ENTER);
        Driver.getDriver().switchTo().frame(Driver.getDriver().findElement(By.xpath("//iframe[@class='bx-editor-iframe']")));
        hrTaskPage.textArea.click();
        hrTaskPage.textArea.sendKeys("Im creating  Time Editing Task  ");
        Driver.getDriver().switchTo().parentFrame();
        hrTaskPage.deadline.click();
        hrTaskPage.getDate31ThJun.click();
        hrTaskPage.clickMore.click();
    }
    @Given("user clicks hours button and writes {string}")
    public void user_clicks_hours_button_and_writes(String string) {
        BrowserUtils.scrollToElement(hrTaskPage.timeTrackingHoursButton);
        hrTaskPage.timeTrackingHoursButton.click();
        hrTaskPage.timeTrackingHoursButton.sendKeys(Keys.BACK_SPACE,"4");

    }

}
