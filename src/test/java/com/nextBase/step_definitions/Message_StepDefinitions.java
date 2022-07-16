package com.nextBase.step_definitions;

import com.nextBase.pages.NextBasePage;
import com.nextBase.utilities.BrowserUtils;
import com.nextBase.utilities.Driver;
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

    @Then("verify that user can upload file and images from local disk")
    public void verify_that_user_can_upload_file_and_images_from_local_disk() {


        Driver.getDriver().findElement(By.xpath("//input[@name='bxu_files[]']")).sendKeys("C:\\Users\\SDVISTANBUL\\apple-logo.webp");

        BrowserUtils.sleep(2);


    }

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
    @When("user select multiple contact from contact list")
    public void user_select_multiple_contact_from_contact_list() {
   // nextBasePage.contactList.click();

    //NextBasePage.contactList(nextBasePage.contactList).get(1);

       // nextBasePage.oneContact.click();

        List<WebElement>userName = BrowserUtils.getElement(nextBasePage.oneContact);

        for (int i = 0; i < 3; i++) {
            userName.get(i).click();
            System.out.println(userName.get(i));

        }


    }


    @Then("verify that user can add multiple contact")
    public void verify_that_user_can_add_multiple_contact() {


//        String expectedText = "helpdesk22@cybertekschool.com";
//        String actualText = Driver.getDriver().findElement(By.xpath("//*[@id=\"feed-add-post-destination-item\"]/span[2]/span[1]")).getText();
//
//        Assert.assertEquals(expectedText,actualText);

       // System.out.println(Driver.getDriver().findElement(By.xpath("//div[@class='bx-finder-company-department-employee-name'")));
      //  System.out.println(BrowserUtils.getElementsText(userName));

    }


    //////////////////LINK FEATURE////////////////////////////////////////////

    @When("user clicks link icon")
    public void user_clicks_link_icon() {
        nextBasePage.uploadedLink.click();
    }
    @When("user add link text")
    public void user_add_link_text() {
        BrowserUtils.sleep(2);
       nextBasePage.linkText.sendKeys("cydeo");


    }
    @When("user add link URL")
    public void user_add_link_url() {
        BrowserUtils.sleep(2);
        nextBasePage.linkURL.sendKeys("https://cydeo.com/");

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
       BrowserUtils.sleep(2);
       nextBasePage.videoURL.sendKeys("https://vimeo.com/726713693");
     //  BrowserUtils.waitForVisibility(nextBasePage.videoURL,2);
       BrowserUtils.sleep(7);
    }
    @Then("verify that user can add video")
    public void verify_that_user_can_add_video() {

        Driver.getDriver().switchTo().frame(nextBasePage.iframe);

        Assert.assertTrue(nextBasePage.videoTitle.getAttribute("title").equals("Video"));

        Driver.getDriver().switchTo().parentFrame();
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

//        for (int i = 0; i < 3; i++) {
//            userName.get(i).click();
//            System.out.println(userName.get(i));
//        }
//
//            Driver.getDriver().switchTo().frame(nextBasePage.iframe);
//
//        System.out.println(Driver.getDriver().findElement(By.xpath("//span[@id='bxid503909697']")).getText());
//
//        Driver.getDriver().switchTo().parentFrame();


    }

    @And("user select mention")
    public void userSelectMention() {

        List<WebElement>userName = BrowserUtils.getElement(nextBasePage.oneOfMention);

        for (int i = 0; i < 3; i++) {
            userName.get(i).click();
            System.out.println(userName.get(i));

        }


        }



//    @Then("verify that user can add mention")
//    public void verify_that_user_can_add_mention() {
//
//
//
//        String expected = "helpdesk22@cybertekschool.com";
//
//        String actual = Driver.getDriver().findElement(By.xpath("//span[text()='helpdesk22@cybertekschool.com']")).getText();
//
//
//



//   }



    //////////////////SEND MESSAGE FEATURE////////////////////////////////////////////


    @When("user click send button")
    public void userClickSendButton() {
        nextBasePage.sendButton.click();
    }
    @Then("verify that user can send message")
    public void verifyThatUserCanSendMessage() {

        Assert.assertTrue(Driver.getDriver().findElement(By.xpath("//*[@id=\"feed-add-post-form-notice-blockblogPostForm\"]/div")).isDisplayed());
    }



}