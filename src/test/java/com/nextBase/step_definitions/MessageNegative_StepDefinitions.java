package com.nextBase.step_definitions;

import com.nextBase.pages.NextBasePage;
import com.nextBase.utilities.BrowserUtils;
import com.nextBase.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import javax.swing.*;
import java.util.List;
import java.util.Set;

public class MessageNegative_StepDefinitions {

    NextBasePage nextBasePage = new NextBasePage();

    ////////////////////UPLOADED FEATURE///////////////////////////


    @When("user uploaded folders")
    public void user_uploaded_folders() {
        Driver.getDriver().findElement(By.xpath("//input[@name='bxu_files[]']")).sendKeys("C:\\Users\\SDVISTANBUL\\Desktop\\SDETTTT");

        BrowserUtils.sleep(2);
    }
    @Then("verify that user can not upload folders from local disk")
    public void verify_that_user_can_not_upload_folders_from_local_disk() {

        String expected = "Upload files and images";
        String actual = nextBasePage.uploadedFileAndImages.getText();

        Assert.assertTrue(expected,actual.contains("upload"));


    }


    ///////////////////VIDEO FEATURE/////////////////////////////



    @When("user add {string}")
    public void user_add(String string) {
        nextBasePage.videoURL.sendKeys("https://www.dailymotion.com/video/x8ckpok?playlist=x7g4o0");
        //  BrowserUtils.waitForVisibility(nextBasePage.videoURL,2);
        BrowserUtils.sleep(7);
    }
    @Then("verify that user can not add video which is not vimeo or youtube url")
    public void verify_that_user_can_not_add_video_which_is_not_vimeo_or_youtube_url() {

        System.out.println("nextBasePage.negativeVideoURL.getAttribute(\"class\") = " + nextBasePage.negativeVideoURL.getAttribute("class"));

        String attribute = "bxhtmled-video-error";

        Assert.assertEquals(attribute,nextBasePage.negativeVideoURL.getAttribute("class"));
    }






    /////////////////SEND FEATURE/////////////////////

    @When("user click send button without provide recipient")
    public void user_click_send_button_without_provide_recipient() {
       nextBasePage.sendButton.click();
    }


    @And("user writes {string} in the title space")
    public void userWritesInTheTitleSpace(String string) {


        Driver.getDriver().switchTo().frame(nextBasePage.iframe);
        nextBasePage.messageBody.click();
        nextBasePage.messageBody.sendKeys(string);
        BrowserUtils.sleep(1);
        Driver.getDriver().switchTo().parentFrame();

    }

    @And("delete recipient which is existing on the website")
    public void deleteRecipientWhichIsExistingOnTheWebsite() {

        nextBasePage.allEmployee.click();
    }

    @Then("verify that user can not send message without add recipient")
    public void verify_that_user_can_not_send_message_without_add_recipient() {




       System.out.println("nextBasePage.sendMessagewithoutRecipient.getText() = " + nextBasePage.sendMessageWithoutRecipient.getText());

       String expected = "Please specify at least one person.";

      Assert.assertEquals(expected,nextBasePage.sendMessageWithoutRecipient.getText());
    }





    @When("user click send button without provide title")
    public void user_click_send_button_without_provide_title() {


        nextBasePage.sendButton.click();


    }
    @Then("verify that user can not send message without title")
    public void verify_that_user_can_not_send_message_title() {

        System.out.println("nextBasePage.sendMessageWithoutTitle.getText() = " + nextBasePage.sendMessageWithoutTitle.getText());

        String expected = "The message title is not specified";

         Assert.assertEquals(expected,nextBasePage.sendMessageWithoutRecipient.getText());

    }


    @And("user adds {string}")
    public void userWrites(String string) {
        nextBasePage.contactInput.sendKeys(string);


    }

    @Then("verify that user can not add users from non existing contact from contact lists")
    public void verifyThatUserCanNotAddUsersFromNonExistingContactFromContactLists() {

        String mainHandle = Driver.getDriver().getWindowHandle();
        Set<String> allWindowHandles = Driver.getDriver().getWindowHandles();
        // window handle 1 - main window
        // window handle 2 - 2nd window

        for (String each : allWindowHandles) {

            Driver.getDriver().switchTo().window(each);

            System.out.println("nextBasePage.nonExistEmail.getText() = " + nextBasePage.nonExistEmail.getText());

            String expected = "cydeo@hotmail.com";

            Assert.assertEquals(expected,nextBasePage.nonExistEmail.getText());

        }
        Driver.getDriver().switchTo().window(mainHandle);



    }

    @And("user add link text {string}")
    public void userAddLinkText(String string) {

        nextBasePage.linkText.sendKeys(string);
    }

    @And("user add link URL {string}")
    public void userAddLinkURL(String string) {
        nextBasePage.linkURL.sendKeys(string);
    }

    @Then("verify that user can not add missing link")
    public void verifyThatUserCanNotAddMissingLink() {

        Driver.getDriver().switchTo().frame(nextBasePage.iframe);
        System.out.println("nextBasePage.missingLink.getText() = " + nextBasePage.missingLink.getText());

        String expected ="next";
        Assert.assertEquals(expected,nextBasePage.missingLink.getText());

        Driver.getDriver().switchTo().parentFrame();

    }

//    @And("user select non existing mention")
//    public void userSelectNonExistingMention() {
//
//
//    }
//
//    @Then("verify that user can not add non existing mention")
//    public void verifyThatUserCanNotAddNonExistingMention() {
//
//
//    }
}
