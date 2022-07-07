Feature: "Incorrect login or password." comes up for invalid password credentials.

  US: As a user, I should be able to login so that I can land on homepage.
  AC: "Incorrect login or password" should be displayed for invalid  password credentials.

  @NEXT-1001
  Background:
  For the scenarios in the feature file, user is expected to be on login page
    Given user is on the login page

  Scenario Outline:
    When <user> enters correct <username>
    And user enters incorrect <password>
    And user clicks to login button
    Then user should not see dashboard instead this notice message : "Incorrect login or password."
    Examples:

      | user      | username                      | password  |
      | HR        | hr1@cybertekschool.com        | eUserUser |
      | Helpdesk  | helpdesk1@cybertekschool.com  | eUserUser |
      | Marketing | marketing1@cybertekschool.com | eUserUser |