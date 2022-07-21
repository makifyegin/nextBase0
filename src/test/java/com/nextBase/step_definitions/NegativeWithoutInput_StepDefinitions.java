package com.nextBase.step_definitions;

import com.nextBase.pages.BasePage;
import com.nextBase.pages.NextBasePage;
import com.nextBase.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class NegativeWithoutInput_StepDefinitions {

    NextBasePage nextBasePage = new NextBasePage();
    String currentURLBefore = "";
    String currentURLAfter = "";



    @Given("clicks search button without providing input")
    public void clicks_search_button_without_providing_input() {
        // nextBasePage.searchBtn.click();
        String currentURLBefore = Driver.getDriver().getCurrentUrl();
        nextBasePage.searchBtn.sendKeys("" + Keys.ENTER);
        String currentURLAfter = Driver.getDriver().getCurrentUrl();


    }
    @Then("verify that any page can not opened")
    public void verify_that_any_page_can_not_opened() {
        //Assert.assertTrue(Driver.getDriver().findElement(By.xpath("//*[@id=\"pagetitle\"]")).isDisplayed());
        Assert.assertEquals(currentURLBefore,currentURLAfter);

    }


    @Given("Helpdesk is on homepage")
    public void helpdesk_is_on_homepage() {

        //nextBasePage.loginHelpdesk();
        BasePage.loginAsHelpdesk();
    }



    @Given("Marketing is on homepage")
    public void marketing_is_on_homepage() {

        //nextBasePage.loginMarketing();
        BasePage.loginAsMarketing();
    }

}
