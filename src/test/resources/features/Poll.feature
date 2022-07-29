@poll
Feature: Poll.feature

  As a user, I should be able to create a poll by clicking on Poll tab under Active Stream.

  Background: For the scenarios in the feature file, user is expected to be on login page
    # following scenarios are valid for all logged in user (Hr,Marketing, Helpdesk)
    Given "Hr" is on homepage
      #user is logged in and on poll under activity stream
    Given user clicks on Poll


 @emp #User should be able to add users from selecting multiple contacts from Employees and Departments contact lists.
  Scenario: Verify user can add multiple contacts to poll

    When user on To bar and deletes All employees selection
    And user clicks on Add persons, groups or department field
    And clicks on Employees and departments button
    And user selects multiple contacts from contact list
    Then verify that multiple contacts is added to the list


#DONE #User should be able to attach link by clicking on the link icon.
  Scenario: Verify that user can attach a link under the link icon


    When user clicks link icon
    And user add link text
    And user add link URL
    And user click save button
    Then verify that user can add link


#PASSED BUT NOT SURE IF RIGHT   #User should be able to add mention by clicking on the add mention icon.
  Scenario: verify user can add a mention

    When clicking on mention icon user is able to choose a person
    Then verify that a mention has been added in the field

 #DONE   #User should be able to add questions and multiple answers.
  Scenario: Verify user can add multiple questions with multiple answers

    When clicking on Answer Two input box to create a next answer input box
    And clicking on Answer Three input box to create a next answer input box
    And clicking on Add question link text
    Then verify that Answer Three, Answer Four input box and another question input box will appear

  #User should be able to delete questions and multiple answers.
  Scenario: Verify that user can delete multiple questions and answers

    When multiple questions with multiple answers are added
    And user can delete a question and an answer
    Then that deleted question box and answer box is gone on site

 #DONE   #User should be able to provide multiple choice to attendees by selecting the Allow multiple choice checkbox.
  Scenario: Verify that user can check the "Multiple Choice" checkbox
    When user clicks checkbox <Allow multiple choice>
    Then checkbox will turn blue and get enabled



