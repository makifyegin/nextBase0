@pneg
Feature: Poll_Negative.feature

  As a user I should not be able to send a poll without the necessary requirements

  Mandatory fields: Message title, recipient, 1 question, 2 answers -
  Error message: "The message title is not specified"
  Error message: "Please specify at least one person."
  Error message: "Please specify at least one question."
  Error message: "Please specify at least two answers."

  Background: For the scenarios in the feature file, user is expected to be on login page
    Given "Hr" is on homepage
    Given user clicks on Poll

  Scenario: Verify that title of poll is provided
    When user clicks on SEND button
    Then verify that poll is not send and error message The message title is not specified is displayed

  Scenario: Verify that recipients for Poll are provided
    Given user has provided title
    When user on To bar and deletes All employees selection
    And user clicks on SEND button
    Then verify that poll is not send and error message Please specify at least one person is displayed

  Scenario: Verify that question for poll is provided Alternative 1
    Given user has provided title
    When two answers are provided
    And user clicks on SEND button
    Then verify that poll is not send and error message Please specify at least one question is displayed

  Scenario:  Verify that question for poll is provided Alternative 2
    Given user has provided title
    When user deletes the question box
    And user clicks on SEND button
    Then verify that poll is not send and error message Please specify at least one question is displayed

    Scenario: Verify that two answers are provided for poll Alternative 1
      Given user has provided title
      When user just fills out question box and only one answer
      And user clicks on SEND button
      Then verify that poll is not send and error message Please specify at least two answers is displayed

  Scenario: Verify that two answers are provided for poll Alternative 2
    Given user has provided title
    When user just fills out question box
    And user clicks on SEND button
    Then verify that poll is not send and error message Please specify at least two answers is displayed