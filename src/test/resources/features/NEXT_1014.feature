Feature: NEXT-1014

  As a user, I should be able to display company structure

  Background:

    Given User is on nextBase Homepage


    Scenario: Display company structure

    Given "HR" is on Home page
    When user clicks employees
    Then user can see company structure


  Scenario: Add a department

    Given "HR" is on Home page
    When user clicks employees
    And user adds department
    And user adds Taskmaster as department name
    And user clicks add
    Then user can see the name of the newly created department


    Scenario: Find employees by search box

    Given "HR" is on Home page
    When user clicks employees
    And user clicks Find Employees
    And user types dada in the search box
    Then user can see dada employee info displayed


    Scenario: Find employees by search by Alphabet

    Given "HR" is on Home page
    When user clicks employees
    And user clicks Find Employees
    And user clicks Search By Alphabet button
    And user clicks the letter D
    Then user can see employee info


  Scenario: Export the employee list

    Given "HR" is on Home page
    And user clicks employees
    And user clicks Find Employees
    And user clicks the more button
    And user clicks Export to Excel
    Then user can see the file in download

  Scenario: Display the telephone directory

    Given "HR" is on Home page
    When user clicks employees
    And user clicks Find Employees
    And user clicks telephone directory
    Then user can see the telephone directory displayed