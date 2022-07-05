Feature: NEXT-925

  As a user, I should be able to remove tags before sending the message

  Background:
    Given User is on nextBase Homepage

  Scenario Outline: Remove tags before sending the message


    Given <User> is on home page
    When User clicks Send Message on Homepage
    And User clicks the tag icon
    And User types tag test
    And User clicks add button1
    And User clicks the x sign to remove added tag/s
    Then User should be able to see tags removed

    Examples:
      | User      |
      | HR        |