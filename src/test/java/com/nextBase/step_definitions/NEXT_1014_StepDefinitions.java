package com.nextBase.step_definitions;

import com.nextBase.pages.NEXT_1014Page;
import com.nextBase.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;

public class NEXT_1014_StepDefinitions {

    NEXT_1014Page next_1014Page = new NEXT_1014Page();

    @When("user clicks employees")
    public void user_clicks_employees() {
        next_1014Page.employeesLink.click();
    }

    @Then("user can see company structure")
    public void user_can_see_company_structure() {

        Assert.assertEquals("Company Structure", next_1014Page.viewCompanyStructure.getText());
    }

    @When("user adds department")
    public void user_adds_department() {
        next_1014Page.addDepartmentButton.click();

    }

    @When("user adds Taskmaster as department name")
    public void user_adds_taskmaster_as_department_name() {
        next_1014Page.inputDepartmentName.sendKeys("Taskmaster");

    }

    @When("user clicks add")
    public void user_clicks_add() {
        next_1014Page.addDepartmentNameButton.click();

    }

    @Then("user can see the name of the newly created department")
    public void user_can_see_the_name_of_the_newly_created_department() {
        Assert.assertEquals("Taskmaster", next_1014Page.departmentTitle.getText());

    }

    @When("user clicks Find Employees")
    public void user_clicks_find_employees() {
        next_1014Page.findEmployeesButton.click();
    }

    @When("user types dada in the search box")
    public void user_types_dada_in_the_search_box() {
        next_1014Page.inputEmployeeSearchBox.sendKeys("dada");
        next_1014Page.inputEmployeeSearchBox.sendKeys(Keys.ENTER);
    }

    @Then("user can see dada employee info displayed")
    public void user_can_see_dada_employee_info_displayed() {


        String actualResult = next_1014Page.employeeName.getText();


        String expectedResult = "dadasdasdasd dada";

        Assert.assertEquals(expectedResult, actualResult);
    }


    //Search employees by search by Alphabet


    @When("user clicks Search By Alphabet button")
    public void user_clicks_search_by_alphabet_button() {
        next_1014Page.searchByAlphabetButton.click();
    }

    @When("user clicks the letter D")
    public void user_clicks_the_letter_d() {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 5);
        wait.until(ExpectedConditions.visibilityOf(next_1014Page.letterD));

        next_1014Page.letterD.click();
    }


    @Then("user can see employee info")
    public void userCanSeeEmployeeInfo() {


        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 5);
        wait.until(ExpectedConditions.visibilityOf(next_1014Page.employeeName));

        System.out.println("next_1014Page.employeeName.getText() = " + next_1014Page.employeeName.getText());

        Assert.assertEquals("dadasdasdasd dada", next_1014Page.employeeName.getText());

    }

    @Given("user clicks the more button")
    public void user_clicks_the_more_button() {
        next_1014Page.moreButton.click();
    }

    @Given("user clicks Export to Excel")
    public void user_clicks_export_to_excel() {
        next_1014Page.exportToExcel.click();
    }

    @Then("user can see the file in download")
    public void user_can_see_the_file_in_download() {
        File f = new File("/Users/jerome/Downloads/users.xls");
        f.exists();

        System.out.println(f);

    }

    @When("user clicks telephone directory")
    public void user_clicks_telephone_directory() {
        next_1014Page.telephoneDirectoryButton.click();
    }

    @Then("user can see the telephone directory displayed")
    public void user_can_see_the_telephone_directory_displayed() {

        Assert.assertEquals("Telephone Directory", next_1014Page.telephoneDirectoryPageTitle.getText());

    }
}
