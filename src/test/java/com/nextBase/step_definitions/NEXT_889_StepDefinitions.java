package com.nextBase.step_definitions;

import com.github.javafaker.Faker;
import com.nextBase.pages.NEXT_889Page;
import com.nextBase.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class NEXT_889_StepDefinitions {

    NEXT_889Page next889 = new NEXT_889Page();

    //Add link Step Definition

    @Given("User is on nextBase Homepage")
    public void user_is_on_next_base_homepage() {
        Driver.getDriver().get("https://qa.nextbasecrm.com/");
    }

    @And("User clicks link icon on Message box")
    public void user_clicks_link_icon_on_message_box() {
        Driver.getDriver().manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        next889.linkButton.click();

    }
    @And("User types in w3 Schools in Text Textbox")
    public void user_types_in_w3_schools_in_text_textbox() {
        next889.textInputBox.sendKeys("w3school");

    }
    @And("User add link https:\\/\\/www.w3schools.com\\/ in Link Textbox")
    public void user_add_link_https_www_w3schools_com_in_link_textbox() {
        next889.linkInputBox.sendKeys("www.w3schools.com");

    }
    @Then("User should see the saved link in the message bar")
    public void user_should_see_the_saved_link_in_the_message_bar() {
        next889.saveButton.click();

        Driver.getDriver().switchTo().frame(next889.iframeMessageBox);

        String expectedLink = "w3school";
        String actualResult = next889.linkMessageBox.getText();

        System.out.println("actualResult = " + actualResult);

        Assert.assertEquals(expectedLink,actualResult);

    }

    //Add Mention Step Definition

    @When("User mentions about hr76@cybertekschool.com")
    public void user_mentions_about_helpdesk2_cybertekschool_com() {

        Faker faker = new Faker();
        String title = faker.artist().name();
        next889.postTitle.sendKeys(title);
        next889.addMentionIcon.click();
        next889.employeeTagAndDepartmentTag.click();
        next889.hr76CybertekSchoolUser.click();
        next889.sendButton.click();
    }

    @Then("User should be able to see chosen email address under the Message tab")
    public void user_should_be_able_to_see_chosen_email_address_under_the_message_tab() {

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),5);
        wait.until(ExpectedConditions.invisibilityOf(next889.mention));

        String expectedResult = "hr76@cybertekschool.com";
        String actualResult = next889.mention.getText();
        System.out.println("actualResult = " + actualResult);
        Assert.assertEquals(expectedResult,actualResult);

    }
    StringStorage obj = new StringStorage();

    //Add tag Step Definition


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

    //Delete Message Step Definition

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
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),5);
        wait.until(ExpectedConditions.visibilityOf(next889.moreOption));

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

        Assert.assertTrue(next889.postIsDeletedMessage.isDisplayed());
    }

    //Insert Video Step Definition

    @When("User clicks the {string} video icon")
    public void user_clicks_the_video_icon(String string, io.cucumber.datatable.DataTable dataTable) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.
        throw new io.cucumber.java.PendingException();
    }

    @When("User clicks save button")
    public void user_clicks_save_button() {

    }
    @Then("User should see the Video title, video size and video itself")
    public void user_should_see_the_video_title_video_size_and_video_itself() {

    }

    //Remove tags Step Definition

    @When("User clicks the tag icon")
    public void user_clicks_the_tag_icon() {

        next889.tagIcon.click();

    }
    @When("User types tag test")
    public void user_types_tag_test() {
        next889.tagInputBox.sendKeys("Test");
    }
    @When("User clicks add button1")
    public void user_clicks_add_button1() {
        next889.addButton.click();
    }
    @When("User clicks the x sign to remove added tag\\/s")
    public void user_clicks_the_x_sign_to_remove_added_tag_s() {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),5);
        wait.until(ExpectedConditions.visibilityOf(next889.removeTag));

        next889.removeTag.click();

    }
    @Then("User should be able to see tags removed")
    public void user_should_be_able_to_see_tags_removed() {

        try{
            Assert.assertFalse(next889.removeTag.isDisplayed());
        }catch(NoSuchElementException e){
            System.out.println("Catch NoSuchElement");
        }

    }
}
