Feature: "Please fill out this field" message should be displayed if Username or password input was left empty

  US: As a user, I should be able to login, so that I can land on homepage.
  AC: "Please fill out this field" message should be displayed if username or password input was left empty.

  @NEXT-1002
  Background:
  For the scenarios in the feature file, user is expected to be on login page
    Given user is on the login page

  Scenario Outline:
    When <user> skips email address
    And user enters <password>
    And user clicks to login button
    Then user should not see dashboard instead this notice message : "Please fill out this field"
    Examples:

      | user      | password |
      | HR        | UserUser |
      | Helpdesk  | UserUser |
      | Marketing | UserUser |

  @NEXT-1003
  Scenario Outline:
    When <user> enters <username>
    And user skips password
    And user clicks to login button
    Then user should not see dashboard instead this notice message : "Please fill out this field"
    Examples:

      | user      | username                      |
      | HR        | hr1@cybertekschool.com        |
      | Helpdesk  | helpdesk1@cybertekschool.com  |
      | Marketing | marketing1@cybertekschool.com |