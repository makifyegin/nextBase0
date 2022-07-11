@login @PleaseFillOut
Feature: "Please fill out this field" message should be displayed if Username or password input was left empty

  US: As a user, I should be able to login, so that I can land on homepage.
  AC: "Please fill out this field" message should be displayed if username or password input was left empty.


  Scenario Outline:
    When user enters "<password>"
    And user clicks to login button
    Then user should not see dashboard instead this notice message : <Please fill out this field>
    Examples:

      | user      | password |
      | HR        | UserUser |
      | Helpdesk  | UserUser |
      | Marketing | UserUser |


  Scenario Outline:
    When user enters "<username>"
    And user clicks to login button
    Then user should not see dashboard instead this notice message : <Please fill out this field>
    Examples:

      |username                      |
      |hr1@cybertekschool.com        |
      |helpdesk1@cybertekschool.com  |
      |marketing1@cybertekschool.com |