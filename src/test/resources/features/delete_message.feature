Feature: NEXT-889

  As a user, I should be able to delete message after sending the message.

  Background:
    Given User is on nextBase Homepage

  Scenario Outline: Delete message after sending the message


    Given <User> is on home page
    When User clicks Send Message on Homepage
    And User Types My message in the message box
    And User clicks send button
    And User clicks the More option under your sent message
    And User clicks Delete
    And User clicks OK on the alert prompt
    Then User can see The post has been deleted message under Activity Stream

    Examples:
      | User      |
      | HR        |