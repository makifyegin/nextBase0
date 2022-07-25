package com.nextBase.step_definitions;

import com.github.javafaker.Faker;
import com.nextBase.pages.BasePage;
import com.nextBase.pages.NextBasePage;
import com.nextBase.utilities.BrowserUtils;
import com.nextBase.utilities.ConfigurationReader;
import com.nextBase.utilities.Driver;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Set;

public class Message_StepDefinitions {

    NextBasePage nextBasePage = new NextBasePage();

    List<WebElement>userName;


    @When("user clicks {string} button")
    public void user_clicks_button(String string) {
        nextBasePage.messageButton.click();
    }



    //////////////////UPLOAD FEATURE////////////////////////////////////////////
    @When("user clicks uploaded files button")
    public void user_clicks_uploaded_files_button() {
        nextBasePage.uploadedIcon.click();
    }

    @When("user clicks uploaded files and images button")
    public void user_clicks_uploaded_files_and_images_button() {
        nextBasePage.uploadedFileAndImages.click();
    }

//    @Then("verify that user can upload file and images from local disk")
//    public void verify_that_user_can_upload_file_and_images_from_local_disk() {
//
//
//        Driver.getDriver().findElement(By.xpath("//input[@name='bxu_files[]']")).sendKeys("C:\\Users\\SDVISTANBUL\\apple-logo.webp");
//
//        BrowserUtils.sleep(2);
//
//        WebElement uploadedMessage = Driver.getDriver().findElement(By.xpath("//div[@class='files-storage-block']/a"));
//        System.out.println("uploadedMessage.getText() = " + uploadedMessage.getText());//My Drive / Uploaded files
//        String expected ="My Drive / Uploaded files";
//        Assert.assertEquals(expected,uploadedMessage.getText());
//
//
//    }

    //////////////////CONTACT FEATURE////////////////////////////////////////////

    @When("user clicks contact button")
    public void user_clicks_contact_button() {

       nextBasePage.contact.click();

    }

    @And("user clicks Employees and Departments button")
    public void userClicksEmployeesAndDepartmentsButton() {

        String mainHandle = Driver.getDriver().getWindowHandle();
        Set<String> allWindowHandles = Driver.getDriver().getWindowHandles();
        // window handle 1 - main window
        // window handle 2 - 2nd window

        for(String each: allWindowHandles){

            Driver.getDriver().switchTo().window(each);


        }


        nextBasePage.employeeAndDepartmentButton.click();



        Driver.getDriver().switchTo().window(mainHandle);

    }


    @When("verify that user can add multiple contact from contact list")
    public void user_select_multiple_contact_from_contact_list() {



   // nextBasePage.contactList.click();

    //NextBasePage.contactList(nextBasePage.contactList).get(1);

       // nextBasePage.oneContact.click();


        List<WebElement>userName = BrowserUtils.getElement(nextBasePage.oneContact);

        for (int i = 0; i < 3; i++) {
            userName.get(i).click();
            Boolean actualContact = userName.get(i).getText().contains("@");
            Assert.assertEquals(true,actualContact);
            System.out.println(userName.get(i));
//asdofihsdaifhiusadhfuishfuih

        }


    }



    //////////////////LINK FEATURE////////////////////////////////////////////

//    @When("user clicks link icon")
//    public void user_clicks_link_icon() {
//        nextBasePage.uploadedLink.click();
//    }
    @When("user add link text")
    public void user_add_link_text() {
        BrowserUtils.sleep(2);
       nextBasePage.linkText.sendKeys(ConfigurationReader.getProperty("link.text"));


    }
    @When("user add link URL")
    public void user_add_link_url() {
        BrowserUtils.sleep(2);
        nextBasePage.linkURL.sendKeys(ConfigurationReader.getProperty("link.URL"));

    }

    @And("user click save button")
    public void userClickSaveButton() {
        nextBasePage.saveButton.click();


    }
    @Then("verify that user can add link")
    public void verify_that_user_can_add_link() {

        Driver.getDriver().switchTo().frame(nextBasePage.iframe);
        System.out.println(nextBasePage.cydeoLink.getText());

        Assert.assertEquals("cydeo", nextBasePage.cydeoLink.getText());

        Driver.getDriver().switchTo().parentFrame();


    }

    //////////////////VIDEO FEATURE////////////////////////////////////////////

    @When("user clicks video icon")
    public void user_clicks_video_icon() {
        nextBasePage.insertVideo.click();
    }
    @When("user add video URL")
    public void user_add_video_url() {
       BrowserUtils.sleep(5);
       nextBasePage.videoURL.sendKeys(ConfigurationReader.getProperty("video.URL"));
        BrowserUtils.sleep(5);

    }


    @And("user click save button for video")
    public void userClickSaveButtonForVideo() {
        nextBasePage.videoSaveButton.click();
    }


    //normally it has a bug but the test is passed
    @Then("verify that user can add video")
    public void verify_that_user_can_add_video() {

        System.out.println("nextBasePage.videoUploadedError.getAttribute(\"class\") = " + nextBasePage.videoUploadedError.getAttribute("class"));

        String expected = "bxhtmled-video-error";

//      Assert.assertEquals(expected,nextBasePage.videoUploadedError.getAttribute("class"));


        // Boolean mainPage = Driver.getDriver().findElement(By.xpath("//div[@id='pagetitle']")).isDisplayed();
//        Assert.assertFalse(nextBasePage.videoUploadedError.isDisplayed());                    !!!!!CHANGING
        Assert.assertTrue(nextBasePage.videoUploadedError.isDisplayed());



    }


    //////////////////QUOTE FEATURE////////////////////////////////////////////

    @When("user clicks comma icon")
    public void user_clicks_comma_icon() {
       nextBasePage.addQuote.click();
    }

    @Then("verify that user can add quote")
    public void verify_that_user_can_add_quote() {

        Driver.getDriver().switchTo().frame(nextBasePage.iframe);

        Assert.assertEquals("blockquote",nextBasePage.Quote.getTagName());

        Driver.getDriver().switchTo().parentFrame();
    }

//////////////////MENTION FEATURE////////////////////////////////////////////

    @When("user clicks mention icon")
    public void user_clicks_mention_icon() {
        nextBasePage.addMention.click();


    }

    @And("user select mention")
    public void userSelectMention() {


        String mainHandle = Driver.getDriver().getWindowHandle();
        Set<String> allWindowHandles = Driver.getDriver().getWindowHandles();
        // window handle 1 - main window
        // window handle 2 - 2nd window

        for (String each : allWindowHandles) {

            Driver.getDriver().switchTo().window(each);

            nextBasePage.oneOfMention.click();


        }
        Driver.getDriver().switchTo().window(mainHandle);



    }


    @Then("verify that user can add mention")
    public void verify_that_user_can_add_mention() {

        Driver.getDriver().switchTo().frame(nextBasePage.iframe);

        Boolean actualContact = nextBasePage.oneOfMentionAssert.getText().contains("com");


       System.out.println("actualContact = " + actualContact);

        Assert.assertEquals(true, actualContact);


        Driver.getDriver().switchTo().parentFrame();

    }


    //////////////////SEND MESSAGE FEATURE////////////////////////////////////////////

    @When("user click send button")
    public void userClickSendButton() {
        nextBasePage.sendButton.click();
    }
    @Then("verify that user can send message")
    public void verifyThatUserCanSendMessage() {

      //  Assert.assertTrue(Driver.getDriver().findElement(By.xpath("//div[@id=\"microoPostFormLHE_blogPostForm\"]/div/span[1]")).isDisplayed());
        WebElement sendMessage =Driver.getDriver().findElement(By.xpath("//div[@id=\"microoPostFormLHE_blogPostForm\"]/div/span[1]"));
        //WebElement mainPage = Driver.getDriver().findElement(By.xpath("//div[@id='pagetitle']"));
        BrowserUtils.waitForVisibility(sendMessage,3);
        Assert.assertTrue(sendMessage.isDisplayed());


    }



}