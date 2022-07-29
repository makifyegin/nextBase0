package com.nextBase.step_definitions;

import com.github.javafaker.Business;
import com.github.javafaker.Faker;
import com.nextBase.pages.AppreciationPage;
import com.nextBase.utilities.BrowserUtils;
import com.nextBase.utilities.ConfigurationReader;
import com.nextBase.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Negative_Appreciation_StepDefinitions {

    AppreciationPage appreciationPage= new AppreciationPage();

    //-----------1st Scenario : Upload Folder ------------//

    @And("user upload folder instead of file")
    public void userUploadFolderInsteadOfFile() {
        Driver.getDriver().findElement(By.xpath("//input[@name='bxu_files[]']"))
                .sendKeys("C:\\Users\\44739\\OneDrive\\Desktop\\Project Check");

        BrowserUtils.sleep(2);
    }

    @Then("verify that user can see error message")
    public void verifyThatUserCanSeeErrorMessage() {

        WebElement incorrectFileMessage= Driver.getDriver().findElement(By.xpath("//span[.='Incorrect server response.']"));
        System.out.println("incorrectFileMessage.isDisplayed() = " + incorrectFileMessage.isDisplayed());

    }


    //-----------2nd Scenario : Non-Existent Employee------------//

    @And("user tries to add contact which is not exist in the list")
    public void userTriesToAddContactWhichIsNotExistInTheList() {
        appreciationPage.addContactInputText.sendKeys("hrrr0@cybertek.com");
        //Driver.getDriver().findElement(By.xpath("//div[@class='bx-finder-box-item-t7-name']")).click();
        appreciationPage.weirdPersonNameInputBox.sendKeys("akjfh");
        appreciationPage.weirdPersonLastNameInputBox.sendKeys("shfisj");
        appreciationPage.weirdPersonOKButton.click();
        Driver.getDriver().switchTo().frame(0);
        Faker faker= new Faker();
        Business business = faker.business();
        appreciationPage.passingMessageForAddingUser.click();
        appreciationPage.passingMessageForAddingUser.sendKeys(business.toString());
        Driver.getDriver().switchTo().parentFrame();
    }

    @Then("verify that user cannot add non-existent contact")
    public void verifyThatUserCannotAddNonExistentContact() {
        appreciationPage.sendButton.click();

        WebElement unknownEmployee= Driver.getDriver()
                .findElement(By.xpath("(//a[@class='feed-add-post-destination-new feed-add-post-destination-new-email'])[1]"));
        Assert.assertFalse(unknownEmployee.isDisplayed());
    }

    //-----------3rd Scenario : LINK------------//

    @When("user paste missing link url to link bar")
    public void userPasteMissingLinkUrlToLinkBar() {
//        Faker faker= new Faker();
//        appreciationPage.linkURLBar.sendKeys(faker.internet().url().substring(2));
        appreciationPage.linkURLBar.sendKeys("www.goog.com");
        appreciationPage.saveVideoLink.click();

    }

    @Then("user should not be able to add missing link under Appreciation page")
    public void userShouldNotBeAbleToAddMissingLinkUnderAppreciationPage() {
        Driver.getDriver().switchTo().frame(0);
        String expected= "www.goog.com";
        WebElement missingLink= Driver.getDriver().findElement(By.xpath("//a[@title='Link: www.goog.com']"));
        System.out.println("missingLink.isDisplayed() = " + missingLink.getText());
        Assert.assertEquals(expected, missingLink);
        Driver.getDriver().switchTo().parentFrame();

    }

    //-----------4th Scenario : VIDEO------------//

    @And("user passes video from DailyMotion and click save")
    public void userPassesVideoFromDailyMotionAndClickSave() {
        appreciationPage.videoLinkBar.sendKeys(ConfigurationReader.getProperty("dailyMotionVideo"));
    }

    @Then("verify that user cannot upload video other than Youtube and Vimeo")
    public void verifyThatUserCannotUploadVideoOtherThanYoutubeAndVimeo() {
        WebElement videoErrorMessage=Driver.getDriver()
                .findElement(By.xpath("//span[@class='bxhtmled-video-error']"));
        System.out.println("videoErrorMessage.isDisplayed() = " + videoErrorMessage.isDisplayed());

    }


}
