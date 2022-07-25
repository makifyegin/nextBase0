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
    And user adds "Taskmaster" as department name
    And user clicks add
    Then user can see the name of the newly created department


  Scenario: Find employees by search box

    When user clicks Find Employees
    And user types "name of employee" in the search box
    Then user can see "name of employee" employee info displayed


  Scenario: Find employees by search by Alphabet

    When user clicks Find Employees
    And user clicks Search By Alphabet button
    And user clicks the letter "letter"
    Then user can see employee info


  Scenario: Export the employee list

    When user clicks Find Employees
    And user clicks the more button
    And user clicks Export to Excel
    Then user can see the file in download


  Scenario: Display the telephone directory

    When user clicks telephone directory
    Then user can see the telephone directory displayed


  Scenario Outline: User send message to employee from the telephone directory

    Given there are two users in application as "<sender>" and "<receiver>"
    When "<sender>" send "date" to "<receiver>"
    And  "<receiver>" login
    Then verify that "<receiver>" gets "date"

    Examples:
      | sender            | receiver     |
      | dadasdasdasd dada | Mousa Adolai |






