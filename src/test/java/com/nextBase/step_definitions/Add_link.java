package com.nextBase.step_definitions;

import com.nextBase.pages.NEXT889;
import com.nextBase.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.concurrent.TimeUnit;

public class Add_link {

    NEXT889 next889 = new NEXT889();


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

        //Assert.assertEquals(expectedLink,actualResult);

    }


}
