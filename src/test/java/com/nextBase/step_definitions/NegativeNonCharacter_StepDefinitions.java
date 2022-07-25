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

}
