package com.nextBase.step_definitions;

import com.nextBase.pages.BasePage;
import com.nextBase.pages.HrTaskPage;
import com.nextBase.utilities.ConfigurationReader;
import com.nextBase.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

public class Hr_Task_Negative_StepDefinitions {
    HrTaskPage hrTaskPage = new HrTaskPage();
    @Given("User  is on home page")
    public void user_is_on_home_page() {
        BasePage.loginAsHR();

    }
    @When("User  clicks Tasks button on the home page")
    public void user_clicks_tasks_button_on_the_home_page() {
        hrTaskPage.taskButton.click();

    }
    @When("User  clicks NEW TASK button")
    public void user_clicks_new_task_button() {
        hrTaskPage.newTaskButton.click();

    }
    @When("User  displays new task page")
    public void user_displays_new_task_page() {
        Driver.getDriver().switchTo().frame(Driver.getDriver().findElement(By.xpath("//iframe[@class='side-panel-iframe']")));
        //System.out.println("Driver.getDriver().getCurrentUrl() = " + Driver.getDriver().getCurrentUrl());
        String expectedContainsUrl = "task/edit";
        Assert.assertTrue(expectedContainsUrl, Driver.getDriver().getCurrentUrl().contains("task/edit"));

    }

    @And("User  clicks ADD TASK button")
    public void userClicksADDTASKButton() {
        hrTaskPage.addTaskEnter.click();
    }

    @Then("User displays {string}")
    public void userDisplays(String arg0) {
        String expected= "Task name is not specified.";
      Assert.assertTrue(hrTaskPage.newTaskErrorMessage.isDisplayed());

    }

    @And("user  clicks on header  and types {string}.")
    public void userClicksOnHeaderAndTypes(String arg0) {
        hrTaskPage.thingsToDo.sendKeys( arg0);
    }

    @And("user  clicks Text area and types {string}")
    public void userClicksTextAreaAndTypes(String arg0) {
        Driver.getDriver().switchTo().frame(Driver.getDriver().findElement(By.xpath("//iframe[@class='bx-editor-iframe']")));
        hrTaskPage.textArea.click();
        hrTaskPage.textArea.sendKeys(arg0);
    }

    @And("User  clicks Deadline dropdown menu")
    public void userClicksDeadlineDropdownMenu() {
        Driver.getDriver().switchTo().parentFrame();
        hrTaskPage.deadline.click();
    }

    @And("user clicks left arrow button on calender.")
    public void userClicksLeftArrowButtonOnCalender() throws InterruptedException {
        Thread.sleep(4);
        hrTaskPage.calendarLeftButton.click();
    }

    @And("User  select {string} date")
    public void userSelectDate(String arg0) {
        hrTaskPage.date10ThJun.click();
        hrTaskPage.selectButton.click();
    }


    @And("User  clicks Project menu")
    public void userClicksProjectMenu() {
        hrTaskPage.projectAddButton.click();

    }



    @And("User  clicks Soccer team")
    public void userClicksSoccerTeam() {
        hrTaskPage.soccerTeam.click();
    }


    @Then("Verify that user can not create task recent time.")
    public void verify_that_user_can_not_create_task_recent_time() {
        Driver.getDriver().switchTo().defaultContent();
        hrTaskPage.overDueButton.click();
        //Assert.assertTrue(hrTaskPage.overDueButton.isDisplayed());
    }






}
