package com.nextBase.step_definitions;

import com.nextBase.pages.BasePage;
import com.nextBase.pages.HrTaskPage;
import com.nextBase.utilities.BrowserUtils;
import com.nextBase.utilities.ConfigurationReader;
import com.nextBase.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.bouncycastle.jcajce.provider.asymmetric.EC;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;
import java.util.function.Function;

public class Hr_Task_Pozitive_StepDefinitions {
    HrTaskPage hrTaskPage = new HrTaskPage();



    @Given("User is on home page")
    public void userIsOnHomePage() {

        BasePage.loginAsHR();;

    }


    @Given("User clicks Tasks button on the home page")
    public void userClicksTasksButtonOnTheHomePage() {
        hrTaskPage.taskButton.click();



    }

    @When("User verify  display task page")
    public void userVerifyaDisplayTaskPage() {
        String expectedContainUrl = "tasks";
        Assert.assertTrue(expectedContainUrl, Driver.getDriver().getCurrentUrl().contains("tasks"));




    }

    @And("User clicks All button")
    public void userClicksAllButton() {
        hrTaskPage.allButton.click();


    }


    @Then("User sees tasks  is on the task page")
    public void userSeesTasksIsOnTheTaskPage() {
        String allTaskContainsUrl = "SECTION=ADVANCED";
        Assert.assertTrue(allTaskContainsUrl, Driver.getDriver().getCurrentUrl().contains("SECTION=ADVANCED"));

    }

    @And("User clicks Ongoing button")
    public void userClicksOngoingButton() {
        hrTaskPage.ongoingButton.click();


    }

    @Then("User sees Role:ongoing   on the ongoing task page")
    public void userSeesRoleOngoingOnTheOngoingTaskPage() {
        String expectedOngoing = "Role: Ongoing";
        String actualOngoing = hrTaskPage.roleOngoing.getText();
        Assert.assertEquals(expectedOngoing, actualOngoing);
    }

    @And("User clicks NEW TASK button")
    public void userClicksNEWTASKButton() {
        hrTaskPage.newTaskButton.click();





    }

    @And("User displays new task page")
    public void userDisplaysNewTaskPage() {
        Driver.getDriver().switchTo().frame(Driver.getDriver().findElement(By.xpath("//iframe[@class='side-panel-iframe']")));
        //System.out.println("Driver.getDriver().getCurrentUrl() = " + Driver.getDriver().getCurrentUrl());
        String expectedContainsUrl = "task/edit";
        Assert.assertTrue(expectedContainsUrl, Driver.getDriver().getCurrentUrl().contains("task/edit"));



    }

    @And("user clicks on header  and types {string}.")
    public void userClicksOnHeaderAndTypes(String newTask) {
        hrTaskPage.thingsToDo.sendKeys(newTask, Keys.ENTER);



    }

    @And("user clicks Text area and types {string}")
    public void userClicksTextAreaAndTypes(String arg0) {
        Driver.getDriver().switchTo().frame(Driver.getDriver().findElement(By.xpath("//iframe[@class='bx-editor-iframe']")));
        hrTaskPage.textArea.click();
        hrTaskPage.textArea.sendKeys(arg0);



    }

    @And("User clicks Deadline dropdown menu")
    public void userClicksDeadlineDropdownMenu() {
        //Driver.getDriver().switchTo().frame(hrTaskPage.newTaskPageIframe);
        hrTaskPage.deadline.click();



    }
    @And("User select {string} date")
    public void userSelectDate(String arg0) {
        hrTaskPage.days.click();
        hrTaskPage.selectButton.click();


    }
    @And("User clicks more menu")
    public void userClicksMoreMenu() {

        hrTaskPage.clickMore.click();




    }
    @And("User clicks Project menu")
    public void userClicksProjectMenu()  {
        hrTaskPage.projectAddButton.click();



    }


    @And("User clicks Soccer team")
    public void userClicksSoccerTeam() {
        hrTaskPage.soccerTeam.click();



    }

    @And("User clicks ADD TASK button")
    public void userClicksADDTASKButton() {
        hrTaskPage.addTaskEnter.click();



    }


    @Then("User sees New Task on the task page")
    public void userSeesNewTaskOnTheTaskPage() {

         Driver.getDriver().switchTo().defaultContent();
        String expectedAttribute="tasks-grid-group-link";

        Assert.assertTrue(expectedAttribute,hrTaskPage.
                underSoccerTeamCreatedTask.getAttribute("class").contains("tasks-grid-group-link"));

    }
}
