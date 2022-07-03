Feature: Conversation Page feature

  User Story :
  Verify that users can see the conversations

  Accounts are : HR , Helpdesk , Marketing

  Background: For the scenarios in the feature file, user is expected to be on login page
    Given user is on the next base login page


  @NEXT-980
  Scenario Outline: Verify that users can see the conversations
  Conversation page is displayed

    Given <User> is on home page
    When user clicks 'Menu' button and 'Conversations' button
    Then verify that user displayes 'Conversations'

    Examples:

      |User     |
      |HR       |
      |Helpdesk |
      |Marketing|