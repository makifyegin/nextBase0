package com.nextBase.step_definitions;

import com.nextBase.pages.BasePage;
import com.nextBase.pages.NextBasePage;
import com.nextBase.utilities.BrowserUtils;
import com.nextBase.utilities.ConfigurationReader;
import com.nextBase.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class ConversationPage_StepDefinitions {

    NextBasePage nextBasePage = new NextBasePage();


    @Given("user is on the next base login page")
    public void user_is_on_the_next_base_login_page1() {
        Driver.getDriver().get(ConfigurationReader.getProperty("nextBase.url"));

    }


    @When("user clicks {string} button and {string} button")
    public void userClicksMenuButtonAndConversationsButton(String menu, String conversation) {
        nextBasePage.menuBtn.click();
        BrowserUtils.waitFor(1);
        nextBasePage.ConversationBtn.click();
    }

    @Then("verify that user displayes {string}")
    public void verifyThatUserDisplayesConversations(String conversationPage) {
        Assert.assertTrue(nextBasePage.ConversationTitle.isDisplayed());
    }

//    @Given("HR is on home page")
//    public void hr_is_on_home_page() {
//       // nextBasePage.loginHR();
//        BasePage.loginAsHR();
//
//    }
//
////    @When("user clicks Menu button")
////    public void user_clicks_menu_button1() {
////        nextBasePage.menuBtn.click();
////
////    }
////    @And("user clicks Conversations button")
////    public void user_clicks_conversations_button1() {
////        nextBasePage.ConversationBtn.click();
////
////    }
//
//
//    @Given("Helpdesk is on home page")
//    public void helpdesk_is_on_home_page() {
//
//        //nextBasePage.loginHelpdesk();
//        BasePage.loginAsHelpdesk();
//    }
//
//    @Given("Marketing is on home page")
//    public void marketing_is_on_home_page() {
//      //  nextBasePage.loginMarketing();
//        BasePage.loginAsMarketing();
//
//    }

//   @And("verify that user displayes Conversations")
//   public void verifyThatUserDisplayesConversations() {
//
//       Assert.assertTrue(nextBasePage.ConversationTitle.isDisplayed());
//
//   }




}
