package com.nextBase.step_definitions;

import com.nextBase.pages.BasePage;
import com.nextBase.pages.NextBasePage;
import com.nextBase.utilities.Driver;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import java.util.Locale;

public class NegativeNonCharacter_StepDefinitions {

    NextBasePage nextBasePage = new NextBasePage();

    @Given("{string} is on homepage")
    public void is_on_homepage(String string) {
        switch (string.toLowerCase()){
            case "hr":
                BasePage.loginAsHR();
                break;
            case "helpdesk":
                BasePage.loginAsHelpdesk();
                break;
            case "marketing":
                BasePage.loginAsMarketing();
                break;
        }
    }
    @Given("User is on homepage")
    public void is_on_homepage(DataTable dataTable) {
        dataTable.asLists().get(0).toString().toUpperCase().contains("HR");
        dataTable.asMap().get("USER").contains("HR");// dataTable should start with USER - And, not sure if it's gonna work
    }
    @Given("clicks search button with non-releated {string}")
    public void clicks_search_button_with_non_releated(String string) {
        nextBasePage.searchBtn.sendKeys(string + Keys.ENTER);
    }
    @Then("verify that user has get Nothing found title")
    public void verify_that_user_has_get_nothing_found_title() {
        Assert.assertTrue(Driver.getDriver().findElement(By.xpath("//*[@id=\"feed-empty-wrap\"]/div")).isDisplayed());
    }



}

