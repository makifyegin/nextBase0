Feature: NEXT-889

  As a user, I should be able to add tags in messages.

  Background:
    Given User is on nextBase Homepage


  Scenario: Add tags in messages


    Given "HR" is on Home page
    When User clicks Send Message on Homepage
    And User clicks the add tag icon
    And User types important in the textbox
    And User clicks add button
    And User types Test1 in the message box
    And User clicks send button
    Then User should see the tag in the activity stream

