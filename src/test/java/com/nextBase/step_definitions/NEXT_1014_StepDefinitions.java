package com.nextBase.step_definitions;

import com.nextBase.pages.NEXT_1014Page;
import com.nextBase.utilities.BrowserUtils;
import com.nextBase.utilities.ConfigurationReader;
import com.nextBase.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.LocalDate; // import the LocalDate class



import java.io.File;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class NEXT_1014_StepDefinitions {

    //Create a page object to call methods from poms
    NEXT_1014Page next_1014Page = new NEXT_1014Page();

    // Create a date object
    LocalDate date = LocalDate.now();


    //Part of background as common to all scenarios
    @And("user clicks employees")
    public void user_clicks_employees() {
        next_1014Page.employeesLink.click();
    }


    @Then("user can see company structure")
    public void user_can_see_company_structure() {

        assertEquals("Company Structure", next_1014Page.viewCompanyStructure.getText());
    }

    @When("user adds department")
    public void user_adds_department() {
        next_1014Page.addDepartmentButton.click();

    }

    @And("user adds {string} as department name")
    public void userAddsAsDepartmentName(String arg0) {
        next_1014Page.inputDepartmentName.sendKeys("Taskmaster");
    }

    @When("user clicks add")
    public void user_clicks_add() {
        next_1014Page.addDepartmentNameButton.click();

    }

    @Then("user can see the name of the newly created department")
    public void user_can_see_the_name_of_the_newly_created_department() {
        assertEquals("Taskmaster", next_1014Page.departmentTitle.getText());

    }

    @When("user clicks Find Employees")
    public void user_clicks_find_employees() {
        next_1014Page.findEmployeesButton.click();
    }

    @And("user types {string} in the search box")
    public void userTypesInTheSearchBox(String arg0) {
        next_1014Page.inputEmployeeSearchBox.sendKeys("dada");
        next_1014Page.inputEmployeeSearchBox.sendKeys(Keys.ENTER);
    }

    @Then("user can see {string} employee info displayed")
    public void userCanSeeEmployeeInfoDisplayed(String arg0) {
        String actualResult = next_1014Page.employeeName.getText();
        String expectedResult = "dadasdasdasd dada";

        assertEquals(expectedResult, actualResult);
    }

    //Search employees by search by Alphabet


    @When("user clicks Search By Alphabet button")
    public void user_clicks_search_by_alphabet_button() {
        next_1014Page.searchByAlphabetButton.click();
    }

    @And("user clicks the letter {string}")
    public void userClicksTheLetter(String arg0) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 5);
        wait.until(ExpectedConditions.visibilityOf(next_1014Page.letterD));

        next_1014Page.letterD.click();
    }

    @Then("user can see employee info")
    public void userCanSeeEmployeeInfo() {


        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 5);
        wait.until(ExpectedConditions.visibilityOf(next_1014Page.employeeName));

        System.out.println("next_1014Page.employeeName.getText() = " + next_1014Page.employeeName.getText());

        assertEquals("dadasdasdasd dada", next_1014Page.employeeName.getText());

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

        assertEquals("Telephone Directory", next_1014Page.telephoneDirectoryPageTitle.getText());

    }

    @When("user clicks on company structure")
    public void userClicksOnCompanyStructure() {
        next_1014Page.viewCompanyStructure.click();
    }

    @And("user press enter key")
    public void user_press_enter_key() {
        next_1014Page.pressEnterToSendMessage.sendKeys(Keys.ENTER);
    }

    @And("user clicks close")
    public void user_cliks_close() {
        next_1014Page.closeMessageBox.click();
    }
    @And("user logout")
    public void user_logout() {
        next_1014Page.usernameButton.click();
        next_1014Page.logOutLink.click();
    }

    @And("user clicks message avatar")
    public void user_clicks_moussa_s_icon() {
        next_1014Page.messageAvatar.click();

    }
    @Then("user verify that the message has been received")
    public void user_verify_that_the_message_has_been_received() {
        String message = next_1014Page.verifyMessage.getText();
        assertEquals("Bonjour",message);


    }

    @And("user clicks send message button")
    public void userClicksSendMessageButton() {
        next_1014Page.sendMessageButton.click();
    }

    @When("user clicks login button")
    public void user_clicks_to_login_button() {
        next_1014Page.logInButton.click();
    }


    @And("user types nothing in the search box")
    public void userTypesInTheSearchBox() {
        next_1014Page.inputEmployeeSearchBox.sendKeys("");
    }

    @Then("user can not see any employee info displayed")
    public void userCanNotSeeAnyEmployeeInfoDisplayed() {

        assertEquals("",next_1014Page.inputEmployeeSearchBox.getText());
    }


    @Given("there are two users in application as {string} and {string}")
    public void thereAreTwoUsersInApplicationAsAnd(String arg0, String arg1) {

        next_1014Page.telephoneDirectoryButton.click();
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 5);
        wait.until(ExpectedConditions.visibilityOf(next_1014Page.moussaLink));
        next_1014Page.moussaLink.click();
        next_1014Page.sendMessageButton.click();


    }

    @When("{string} send {string} to {string}")
    public void sendBonjourTo(String arg0, String arg1, String arg2) {



        String str = (String.valueOf(date));

        next_1014Page.inputMessage.sendKeys(str);
        next_1014Page.pressEnterToSendMessage.sendKeys(Keys.ENTER);
        next_1014Page.closeMessageBox.click();
        next_1014Page.usernameButton.click();
        next_1014Page.logOutLink.click();
    }

    @And("{string} login")
    public void login(String arg0) {
        next_1014Page.inputUsername.clear();
        next_1014Page.inputUsername.sendKeys("helpdesk21@cybertekschool.com");
        next_1014Page.inputPassword.sendKeys("UserUser");
        next_1014Page.logInButton.click();
        next_1014Page.messageAvatar.click();
    }

    @Then("verify that {string} gets {string}")
    public void verifyThatGets(String arg0, String arg1) {



        String message = next_1014Page.verifyMessage.getText();

        System.out.println("message = " + message);
        System.out.println("date.toString() = " + date.toString());


        assertEquals(date.toString(),message);

    }

    @And("user types some {string} in the search box")
    public void userTypesSomeInTheSearchBox(String arg0) {
        String specialCharacter = ConfigurationReader.getProperty("special.character");
        next_1014Page.inputEmployeeSearchBox.sendKeys(specialCharacter);
        next_1014Page.inputEmployeeSearchBox.sendKeys(Keys.ENTER);
        String actualResult = "Your search did not match any employees.";
        String expectedResult = next_1014Page.workArea.getText();

        assertEquals(expectedResult,actualResult);
    }

    @When("{string} send {string} to {string} {int} times")
    public void sendToTimes(String arg0, String arg1, String arg2, int arg3) {


        String str = (String.valueOf(date));

        for (int i = 1; i <=6 ; i++) {

            next_1014Page.inputMessage.sendKeys(str);
            next_1014Page.pressEnterToSendMessage.sendKeys(Keys.ENTER);

        }

        next_1014Page.closeMessageBox.click();
        next_1014Page.usernameButton.click();
        next_1014Page.logOutLink.click();


    }

    @Then("verify that {string} gets an {string}")
    public void verifyThatGetsAn(String arg0, String arg1) {

        assertEquals("Error message",next_1014Page.errorMessage.getText());
    }



    @Then("the user gets an error message")
    public void the_user_gets_an_error_message() {
        List<String> listOfAllWebElements = new ArrayList<>();
        listOfAllWebElements.add(next_1014Page.departmentTitle.getText());
        System.out.println(listOfAllWebElements);
    }

    @And("user adds another department")
    public void userAddsAnotherDepartment() {
        BrowserUtils.waitFor(3);
        next_1014Page.addDepartmentButton.click();

    }

    @And("user adds {string} as department name again")
    public void userAddsAsDepartmentNameAgain(String arg0) {
        next_1014Page.inputDepartmentName.sendKeys("Taskmaster");
    }

    @And("user clicks add again")
    public void userClicksAddAgain() {
        next_1014Page.addDepartmentNameButton.click();
    }
}
