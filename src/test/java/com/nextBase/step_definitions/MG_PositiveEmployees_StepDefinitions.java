package com.nextBase.step_definitions;
import com.nextBase.pages.BasePage;
import com.nextBase.pages.MG_Positive;
import com.nextBase.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class MG_PositiveEmployees_StepDefinitions {


    MG_Positive MG_Positive = new MG_Positive();
    BasePage basePage = new BasePage();


    public String Emoji;

    @And("there is a post under Activity Stream")
    public void thereIsAPostUnderActivityStream() throws InterruptedException {
        MG_Positive.blogPost.isDisplayed();
        Thread.sleep(3000);
    }

    @And("User interacts as {string}")
    public String userInteractsAs(String emoji) {
        Emoji = emoji;
        return Emoji;
    }


    @And("User hovers over the {string} button")
    public void userHoversOverTheButton(String emoji) throws InterruptedException {
        MG_Positive.setLikeHover();
        Thread.sleep(3000);
    }

    @And("User should see the {string} selection box")
    public void userShouldSeeTheSelectionBox(String arg0) throws InterruptedException {
        MG_Positive.setLikeHover().isDisplayed();
        Thread.sleep(3000);
    }

    @And("User clicks on the {string} button")
    public void userClicksOnTheButton(String arg0) throws InterruptedException {

        if (MG_Positive.like.getAttribute("title").equals(Emoji)) {
            MG_Positive.like.click();
            Thread.sleep(3000);
        } else if (MG_Positive.kiss.getAttribute("title").equals(Emoji)) {
            MG_Positive.kiss.click();
            Thread.sleep(3000);

        } else if (MG_Positive.laugh.getAttribute("title").equals(Emoji)) {
            MG_Positive.laugh.click();
            Thread.sleep(3000);

        } else if (MG_Positive.wonder.getAttribute("title").equals(Emoji)) {
            MG_Positive.wonder.click();
            Thread.sleep(3000);

        } else if (MG_Positive.cry.getAttribute("title").equals(Emoji)) {
            MG_Positive.cry.click();
            Thread.sleep(3000);

        } else if (MG_Positive.angry.getAttribute("title").equals(Emoji)) {
            MG_Positive.angry.click();
            Thread.sleep(3000);
        } else {
            System.out.println("Not Found");
            Thread.sleep(3000);
        }
        Thread.sleep(3000);
    }


    @And("User leaves comment as {string} on post")
    public void userLeavesCommentAsOnPost(String arg0) throws InterruptedException {
        MG_Positive.addComment.click();
        Thread.sleep(2000);
        Driver.getDriver().switchTo().frame(0);
        Thread.sleep(2000);
        MG_Positive.commentBody.sendKeys("Test Comment");
        Driver.getDriver().switchTo().defaultContent();
        Thread.sleep(2000);
        MG_Positive.sendButton.click();
        Thread.sleep(5000);

    }

    // DOUBLE CHECK AGAIN
    @Then("verify that all steps passed")
    public void verifyThatAllStepsPassed(String arg0) throws InterruptedException {
        Assert.assertEquals(MG_Positive.contactInformation.getText(), "all steps passed");
        //   Assert.assertTrue(Driver.getDriver().getTitle().contains("all steps"));
        Thread.sleep(3000);
    }


    //=================== TEST DOIS ABAIXO LIKE OR MAKE COMMENTS ALL OTHER REVIEWERS COMMENT ===================//


    @When("User click {string}")
    public void userClick(String arg0) throws InterruptedException {

        MG_Positive.commentLike.click();
        Thread.sleep(3000);

        /*
        if (MG_Positive.commentLike.isDisplayed()) {
            MG_Positive.commentLike.click();
        } else {
            System.exit(1);
        }*/
    }


    @And("User leaves comment as {string} on reviewer's comment")
    public void userLeavesCommentAsOnReviewerSComment(String send) throws InterruptedException {

        MG_Positive.commentReply.click();
        Thread.sleep(2000);
        Driver.getDriver().switchTo().frame(0);
        Thread.sleep(2000);
        MG_Positive.commentBody.sendKeys("Test Comment");
        Driver.getDriver().switchTo().defaultContent();
        Thread.sleep(2000);
        MG_Positive.sendButton.click();
        Thread.sleep(5000);



        try {
            MG_Positive.commentVisible.isDisplayed();
        } catch (Exception e) {
            MG_Positive.commentReply.click();
            Driver.getDriver().switchTo().frame(0);
            Thread.sleep(2000);
            MG_Positive.commentBody.sendKeys("Test Comment Qa");
            Driver.getDriver().switchTo().defaultContent();
            Thread.sleep(2000);
            MG_Positive.sendButton.click();
            Thread.sleep(5000);
        }

    }


    @Then("verify that interaction is given")
    public void verifyThatInteractionIsGiven() throws InterruptedException {
        if (Emoji.equals("like")) {
            try {
                Assert.assertTrue(MG_Positive.commentLikeInteraction.isDisplayed());
            } catch (Exception e) {
                MG_Positive.commentLike.click();
                Thread.sleep(2000);
                Assert.assertTrue(MG_Positive.commentLikeInteraction.isDisplayed());
            }
        }
        if (Emoji.equals("comments")) {
            Assert.assertTrue(MG_Positive.commentVisible.isDisplayed());
        }
    }


    @And("verify that comment is posted")
    public void verifyThatCommentIsPosted() throws InterruptedException {
        Assert.assertTrue(MG_Positive.commentVisible.isDisplayed());
        Thread.sleep(3000);
        System.out.println("Comments is visible");
    }


    //======================= TEST TRES ABAIXO REVIEWERS NAME & VISIT THEIR PROFILE===============================//

    @When("User clicks reviews name button with the name {string}")
    public void userClicksReviewsNameButtonWithTheName(String reviewsName1) throws InterruptedException {
        for (WebElement element : MG_Positive.reviewerName()) {
            if (element.getText().equalsIgnoreCase(reviewsName1)) {
                element.click();
                Thread.sleep(5000);
                break;
            } else {
                System.out.println("Reviewer Not Found");
            }
        }
    }

    @And("User is redirect to URL {string}")
    public void userIsRedirectToURL(String url) throws InterruptedException {
        Assert.assertEquals(Driver.getDriver().getCurrentUrl(), url);
        Thread.sleep(3000);
    }


    @Then("User should be able to see reviewers profiles")
    public void userShouldBeAbleToSeeReviewersProfiles() {
        Assert.assertEquals(MG_Positive.contactInformation.getText(), "Contact information");
    }



    //======================= TEST QUATRO ABAIXO ADD POST TO FAVOURITE==================================//


    @When("User click star on the top right corner of message box")
    public void userClickStarOnTheTopRightCornerOfMessageBox() throws InterruptedException {


        MG_Positive.favoriteIcon.click();
        Thread.sleep(3000);


    }


    @Then("Verify that User can add to starIcon favourite")
    public void verifyThatUserCanAddToStarIconFavourite() throws InterruptedException {
        System.out.println("(MG_Positive.firstPost.findElement(By.xpath(\"//div[@class=\\\"feed-post-important-switch feed-post-important-switch-active\\\"]\")).isDisplayed()) = " +
                (MG_Positive.firstPost.findElement(By.xpath("//div[@class=\"feed-post-important-switch feed-post-important-switch-active\"]")).isDisplayed()));
        Assert.assertTrue(MG_Positive.favIconSelected.isDisplayed());

    }
}



