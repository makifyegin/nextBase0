package com.nextBase.step_definitions;

import com.github.javafaker.Faker;
import com.nextBase.pages.NEXT889;
import com.nextBase.utilities.BrowserUtils;
import com.nextBase.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Delete_Message {

    NEXT889 next889 = new NEXT889();

    @When("User Types My message in the message box")
    public void user_types_my_message_in_the_message_box() {

        Driver.getDriver().switchTo().frame(next889.iframeMessageBox);
        Faker faker = new Faker();
        String message = faker.backToTheFuture().quote();
        next889.messageBox.sendKeys(message);
        Driver.getDriver().switchTo().parentFrame();
    }

    @When("User clicks Send Message on Homepage")
    public void user_clicks_send_message1_on_homepage() {
        next889.blogPost.click();
    }


    @And("User clicks the More option under your sent message")
    public void userClicksTheMoreOptionUnderYourSentMessage() {
        Driver.getDriver().manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        next889.moreOption.click();
    }

    @And("User clicks Delete")
    public void userClicksDelete() {
        next889.deleteMessage.click();

    }

    @And("User clicks OK on the alert prompt")
    public void userClicksOKOnTheAlertPrompt() {
        Alert alert = Driver.getDriver().switchTo().alert();
        alert.accept();

    }

    @Then("User can see The post has been deleted message under Activity Stream")
    public void userCanSeeThePostHasBeenDeletedMessageUnderActivityStream() {

       // String text = next889.messageBox.getText();
       // Assert.assertFalse(next889.messageBox.isDisplayed());
    }
}
