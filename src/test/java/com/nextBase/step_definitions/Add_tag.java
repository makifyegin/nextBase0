package com.nextBase.step_definitions;
import java.time.LocalDate;
import java.time.LocalTime;

import com.github.javafaker.Faker;
import com.nextBase.pages.NEXT889;
import com.nextBase.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Add_tag {

    NEXT889 next889 = new NEXT889();
    StringStorage obj = new StringStorage();




    @When("User clicks the add tag icon")
    public void user_clicks_the_add_tag_icon() {
        next889.tagIcon.click();
    }

    @When("User types important in the textbox")
    public void user_types_important_in_the_textbox() {



        String msg = obj.msg;
        next889.tagInputBox.sendKeys(msg);

    }
    @When("User clicks add button")
    public void user_clicks_add_button() {
        next889.addButton.click();

    }

    @When("User types Test1 in the message box")
    public void user_types_test1_in_the_message_box() {
        Driver.getDriver().switchTo().frame(next889.iframeMessageBox);
        Faker faker = new Faker();
        String dragonBall = faker.dragonBall().character();
        next889.messageBox.sendKeys(dragonBall);
        Driver.getDriver().switchTo().parentFrame();

    }

    @When("User clicks send button")
    public void user_clicks_send_button() {
        next889.sendButton.click();

    }




    @Then("User should see the tag in the activity stream")
    public void user_should_see_the_tag_in_the_activity_stream() {

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),5);
        wait.until(ExpectedConditions.visibilityOf(next889.actualTag));

       String expectedResult = obj.msg;
       System.out.println("obj.msg = " + obj.msg);
       String actualResult = next889.actualTag.getText();

       Assert.assertEquals(expectedResult,actualResult);

    }
}
