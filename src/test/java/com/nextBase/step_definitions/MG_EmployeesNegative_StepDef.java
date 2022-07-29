package com.nextBase.step_definitions;

import com.nextBase.pages.BasePage;
import com.nextBase.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class MG_EmployeesNegative_StepDef {
 BasePage basePage = new BasePage();

  //  @Given("{string} user is on homepage.")
   // public void userIsOnHomepage(String arg0) {
   //     BasePage.loginAsHR();



  //  }

    @And("user should see Activity Stream url post")     // NEED TO LOCATE DIFFRENT ELEMENT
    public void userShouldSeeActivityStreamUrlPost() {
        WebElement pagetitle = Driver.getDriver().findElement(By.id("pagetitle")); //

//check if titled page is activity stream
        boolean activityStreamIsVisible = pagetitle.getText().equalsIgnoreCase("activity stream");
        Assert.assertTrue(activityStreamIsVisible);
        Assert.assertTrue(pagetitle.isDisplayed());

    }

    @When("User click comment button other employees' posts")
    public void userClickCommentButtonOtherEmployeesPosts() {

        WebElement commentButton = Driver.getDriver().findElement(By.xpath("(//span[@class='feed-inform-comments'])[1]")); // to get the first index
        commentButton.click();
    }

    @And("User click the send button at the INPUT BOX.")
    public void userClickTheSendButtonAtTheINPUTBOX() throws InterruptedException {
        Thread.sleep(500);

//get reference to first post
        WebElement firstPost = Driver.getDriver().findElement(By.cssSelector(".feed-item-wrap:nth-of-type(1)"));

        WebElement clickBtn = firstPost.findElement(By.xpath("//button[text()='Send']"));
        clickBtn.click();

    }

    @Then("Verify that User comments on other reviews' posts and User get Negative outcome")
    public void verifyThatUserCommentsOnOtherReviewsPostsAndUserGetNegativeOutcome() throws InterruptedException {
        Thread.sleep(500);

//get reference to first post
        WebElement firstPost = Driver.getDriver().findElement(By.cssSelector(".feed-item-wrap:nth-of-type(1)"));

        WebElement negativeOutComeOnTheReviewsPost = firstPost.findElement(By.cssSelector("div.feed-add-error"));
        Assert.assertTrue(negativeOutComeOnTheReviewsPost.isDisplayed());
    }



}




