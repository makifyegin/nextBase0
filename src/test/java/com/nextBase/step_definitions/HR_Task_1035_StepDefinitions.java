package com.nextBase.step_definitions;

import com.nextBase.pages.HrTaskPage;
import com.nextBase.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
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

    }

    @And("user clicks Add more menu")
    public void userClicksAddMoreMenu() {
       Driver.getDriver().switchTo().parentFrame();
        hrTaskPage.addMoreResponsible.click();
    }

    @And("user clicks time tracking button.")
    public void userClicksTimeTrackingButton() {
        hrTaskPage.timeTrackingButton.click();

    }



    @And("user clicks hours button and writes {string} on the time tracking")
    public void userClicksHoursButtonAndWritesOnTheTimeTracking(String arg0) {
    }

    @And("user clikcs minutes button and writes {string} on the time tracking")
    public void userClikcsMinutesButtonAndWritesOnTheTimeTracking(String arg0) {
    }

    @And("user clicks {string} and clicks pop up button")
    public void userClicksAndClicksPopUpButton(String arg0) {
        hrTaskPage.responsiblePersonHR.click();
        hrTaskPage.responsiblePersonPopUpButton.click();

    }
}
