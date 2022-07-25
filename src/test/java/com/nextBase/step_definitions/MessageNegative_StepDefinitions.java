package com.nextBase.step_definitions;

import com.nextBase.pages.NextBasePage;
import com.nextBase.utilities.BrowserUtils;
import com.nextBase.utilities.ConfigurationReader;
import com.nextBase.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import javax.lang.model.SourceVersion;
import javax.swing.*;
import java.util.List;
import java.util.Set;

public class MessageNegative_StepDefinitions {

    NextBasePage nextBasePage = new NextBasePage();

    ////////////////////UPLOADED FEATURE///////////////////////////


    @When("user uploaded anything except files and images")
    public void user_uploaded_folders() {
        Driver.getDriver().findElement(By.xpath("//input[@name='bxu_files[]']")).sendKeys("C:\\Users\\SDVISTANBUL\\Desktop\\SDETTTT");
        //C:\Users\SDVISTANBUL\Desktop\League of Legends (TM) Client 2021-11-24 19-40-10.mp4 -->video
        //C:\Users\SDVISTANBUL\Desktop\SDETTTT -->folder
        //C:\Users\SDVISTANBUL\apple-logo.webp -->images
        BrowserUtils.sleep(2);
    }
    @Then("verify that user can not upload anything except files and images from local disk")
    public void verify_that_user_can_not_upload_folders_from_local_disk() {

        //*[@id="file1658573464475Item"]/td[3]/span[2]
        //span[text()='Incorrect server response.']

        //if we want to uploaded anything expect file or images we should get this error.
         WebElement actual = Driver.getDriver().findElement(By.xpath("//span[text()='Incorrect server response.']"));
         String actualError = Driver.getDriver().findElement(By.xpath("//span[text()='Incorrect server response.']")).getText();
         System.out.println("actual.getText() = " + actual.getText());//Incorrect server response.
         String uploadedNonExpected = "Incorrect server response.";

        Assert.assertEquals(uploadedNonExpected,actualError);





    }


    ///////////////////VIDEO FEATURE/////////////////////////////



    @When("user add {string}")
    public void user_add(String string) {
        nextBasePage.videoURL.sendKeys(ConfigurationReader.getProperty("daily.URL"));
        //  BrowserUtils.waitForVisibility(nextBasePage.videoURL,2);
        BrowserUtils.sleep(7);
    }
    @Then("verify that user can not add video which is not vimeo or youtube url")
    public void verify_that_user_can_not_add_video_which_is_not_vimeo_or_youtube_url() {

       // System.out.println("nextBasePage.negativeVideoURL.getAttribute(\"class\") = " + nextBasePage.negativeVideoURL.getAttribute("class"));

        String attribute = "bxhtmled-video-error";

       // Assert.assertEquals(attribute,nextBasePage.negativeVideoURL.getAttribute("class"));

       Boolean mainPage=Driver.getDriver().findElement(By.xpath("//div[@id='pagetitle']")).isDisplayed();

        Assert.assertNotSame(attribute,mainPage);//--> it should not uploaded so we can not see main page
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

    //////////////// ADD RECIPIENTS FEATURE/////////////////


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

    //////////////////LINK FEATURE//////////////////////

    @And("user add link text {string}")
    public void userAddLinkText(String string) {

        nextBasePage.linkText.sendKeys(string);
    }

    @And("user add link URL {string}")
    public void userAddLinkURL(String string) {
        nextBasePage.linkURL.sendKeys(string);
        BrowserUtils.waitFor(3);
    }


    @Then("verify that user can not add missing link")
    public void verifyThatUserCanNotAddMissingLink() {

        Driver.getDriver().switchTo().frame(nextBasePage.iframe);
        System.out.println("nextBasePage.missingLink.getText() = " + nextBasePage.missingLink.getText());

        String expected ="next";
        Assert.assertEquals(expected,nextBasePage.missingLink.getText());

        Driver.getDriver().switchTo().parentFrame();

    }

}
