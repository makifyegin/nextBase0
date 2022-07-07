@wip @login
Feature: Entering incorrect email address or password should display "Incorrect login or password"

  US: As a user, I should be able to login so that I can land on homepage.{color}

  AC:"Incorrect login or password" should be displayed for invalid credentials.

  Background:
  For the scenarios in the feature file, user is expected to be on login pageGiven user is on the login page

  Scenario Outline:
    When user enters "<username>"
    And user enters "<password>"
    And user clicks to login button
    Then user should not see dashboard instead this notice message : "Incorrect login or password."

    Examples:
      |username                       | password |
      |ehr1@cybertekschool.com        | UserUser |
      |ehelpdesk1@cybertekschool.com  | UserUser |
      |emarketing1@cybertekschool.com | UserUser |


  Scenario Outline:
    When user enters "<username>"
    And user enters "<password>"
    And user clicks to login button
    Then user should not see dashboard instead this notice message : "Incorrect login or password."
    Examples:

      | username                     | password  |
      |hr1@cybertekschool.com        | eUserUser |
      |helpdesk1@cybertekschool.com  | eUserUser |
      |marketing1@cybertekschool.com | eUserUser |