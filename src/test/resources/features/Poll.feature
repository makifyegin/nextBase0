Feature: Poll.feature

  As a user, I should be able to create a poll by clicking on Poll tab under Active Stream.

  Background: For the scenarios in the feature file, user is expected to be on login page
    # following scenarios are valid for all logged in user (Hr,Marketing, Helpdesk)
    Given "Hr" is on homepage
      #user is logged in and on poll under activity stream
    Given user clicks on <Poll>


  #User should be able to add users from selecting multiple contacts from Employees and Departments contact lists.
  Scenario: Verify user can add multiple contacts to poll
    When on <To:> bar and deletes "All employees" selection
    And clicks on <Add persons, groups or department> field
    # And click on <Employees and departments> selection
    And clicks different users from that section
    Then verify that more than one user is added to the list

    #User should be able to attach link by clicking on the link icon.
  Scenario: Verify that user can attach a link under the link icon
    When user clicks on link icon
    Then user is able to see a pop up window with title Link
    When filling out link text and link url and clicking on save
    Then user can see the hyperlink added to the field


    #User should be able to add mention by clicking on the add mention icon.
  Scenario: verify user can add a mention
    When clicking on mention icon user is able to choose a person
    Then verify that a mention has been added in the field

    #User should be able to add questions and multiple answers.
  Scenario: Verify user can add multiple questions with multiple answers
    When clicking on "Answer 2" input box to create a next answer input box
    And clicking on "Answer 3" input box to create a next answer input box
    And clicking on "Add question" link text
    Then verify that <Answer 3, Answer 4> input box and another question input box will appear

  #User should be able to delete questions and multiple answers.
  Scenario: Verify that user can delete multiple questions and answers
    When multiple questions with multiple answers are added
    And user can delete a question and an answer
    Then that deleted question box and answer box is gone on site

    #User should be able to provide multiple choice to attendees by selecting the Allow multiple choice checkbox.
  Scenario: Verify that user can check the "Multiple Choice" checkbox
    When user clicks checkbox <Allow multiple choice>
    Then checkbox will turn blue and get enabled



