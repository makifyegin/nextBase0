Feature: NEXT-1014

As a user, I should be able to display company structure

Background:

Given "HR" is on Home page
And user clicks employees

Scenario: Can not type nothing to find employees


When user clicks Find Employees
And user types nothing in the search box
And user click search button
Then user can not see any employee info displayed


Scenario: Can not type a special character to find employees

When user clicks Find Employees
And user types some "special characters" in the search box
And user click search button
Then user can not see any employee info displayed



  Scenario Outline: Can not type the same message more than 5 times

    Given there are two users in application as "<sender>" and "<receiver>"
    When "<sender>" send "message" to "<receiver>" 6 times
    And  "<receiver>" login
    Then verify that "<receiver>" gets an "Error message"

    Examples:
      | sender            | receiver     |
      | dadasdasdasd dada | Mousa Adolai |

  @NEXT1014
    Scenario: Add 2 departments with the same name

    When user adds department
    And user adds "Taskmaster" as department name
    And user clicks add
    And user adds another department
    And user adds "Taskmaster" as department name again
    And user clicks add again
    Then the user gets an error message


