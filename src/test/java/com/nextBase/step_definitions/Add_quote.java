package com.nextBase.step_definitions;


import com.github.javafaker.Faker;
import com.nextBase.pages.NEXT889;
import com.nextBase.utilities.BrowserUtils;
import com.nextBase.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class Add_quote {

    NEXT889 next889 = new NEXT889();

    @When("User Types My message in the message box.")
    public void user_types_my_message_in_the_message_box() {
        Driver.getDriver().switchTo().frame(next889.iframeMessageBox);
        next889.messageBox.sendKeys("My message");
        Driver.getDriver().switchTo().parentFrame();

    }
    @When("User clicks the quote icon on the message box.")
    public void user_clicks_the_quote_icon_on_the_message_box() {

        next889.quoteButton.click();

    }
    @When("User types in Quote Test.")
    public void user_types_in_quote_test() {
        Driver.getDriver().switchTo().frame(next889.iframeMessageBox);
        Faker faker = new Faker();
        String text = faker.chuckNorris().fact();
        next889.blockQuote.sendKeys(text);
        Driver.getDriver().switchTo().parentFrame();

    }
    @When("User clicks send.")
    public void user_clicks_send() {
        next889.sendButton.click();

    }
    @Then("User can see the post with Quote Test displayed.")
    public void user_can_see_the_post_with_quote_test_displayed() {


        System.out.println("next889.postBlogQuote.getText() = " + next889.postBlogQuote.getText());


    }

    @When("User clicks the add tag icon")
    public void user_clicks_the_add_tag_icon() {
        next889.tagIcon.click();
    }
    @When("User types #important in the textbox")
    public void user_types_important_in_the_textbox() {
        next889.tagInputBox.sendKeys("#important");

    }
    @When("User clicks add button")
    public void user_clicks_add_button() {
        next889.addButton.click();

    }
    @When("User types Test1 in the message box")
    public void user_types_test1_in_the_message_box() {
        Driver.getDriver().switchTo().frame(next889.iframeMessageBox);
        next889.messageBox.sendKeys("Test1");
        Driver.getDriver().switchTo().parentFrame();

    }
    @When("User clicks send button")
    public void user_clicks_send_button() {
        next889.sendButton.click();

    }
    @Then("User should see the tag in the activity stream")
    public void user_should_see_the_tag_in_the_activity_stream() {

    }
}
