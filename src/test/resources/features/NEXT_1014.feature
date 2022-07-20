Feature: NEXT-1014

  As a user, I should be able to display company structure

  Background:

    Given "HR" is on Home page
    And user clicks employees


  Scenario: Display company structure

    When user clicks on company structure
    Then user can see company structure


  Scenario: Add a department

    When user adds department
    And user adds Taskmaster as department name
    And user clicks add
    Then user can see the name of the newly created department


  Scenario: Find employees by search box

    When user clicks Find Employees
    And user types dada in the search box
    Then user can see dada employee info displayed


  Scenario: Find employees by search by Alphabet

    When user clicks Find Employees
    And user clicks Search By Alphabet button
    And user clicks the letter D
    Then user can see employee info


  Scenario: Export the employee list

    When user clicks Find Employees
    And user clicks the more button
    And user clicks Export to Excel
    Then user can see the file in download


  Scenario: Display the telephone directory

    When user clicks telephone directory
    Then user can see the telephone directory displayed

  @NEXT1014
  Scenario Outline: Display company structure

    When user clicks telephone directory
    And user clicks employee "<employeeReceiver>"
    And user clicks send message button
    And user types a random message
    And user press enter key
    And user clicks close
    And user logout
    And user enter employee "<employeeReceiver>" username
    And user enter employee "<employeeReceiver>" password
    And user clicks login button
    And user clicks message avatar
    Then user verify that employee "<employeeReceiver>" got the message from employee "<employeeSender>"

    Examples:
      | employeeSender    | employeeReceiver |
      | dadasdasdasd dada | Mousa Adolai     |


  Scenario: Can not use number to find employees


    When user clicks employees
    And user clicks Find Employees
    And user types nothing in the search box
    And user click search button
    Then user can not see any employee info displayed



