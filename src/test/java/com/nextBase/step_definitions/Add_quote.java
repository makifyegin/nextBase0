package com.nextBase.step_definitions;

import com.nextBase.pages.NEXT889;
import com.nextBase.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

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
        next889.blockQuote.sendKeys("Quote Test");
        Driver.getDriver().switchTo().parentFrame();

    }
    @When("User clicks send.")
    public void user_clicks_send() {

    }
    @Then("User can see the post with Quote Test displayed.")
    public void user_can_see_the_post_with_quote_test_displayed() {

    }
}
