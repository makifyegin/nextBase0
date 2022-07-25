Feature: NEXT-889

  As a user, I should be able to add link to specified text

  Background:
    Given User is on nextBase Homepage

  Scenario: Add link to specified text

    Given "HR" is on Home page
    When User clicks link icon on Message box
    And User clicks Send Message on Homepage
    And User clicks link icon on Message box
    And User types in w3 Schools in Text Textbox
    And User add link https://www.w3schools.com/ in Link Textbox
    Then User should see the saved link in the message bar

  Scenario: Add mention about only department employees

    Given "HR" is on Home page
    When User clicks Send Message on Homepage
    And User mentions about hr76@cybertekschool.com
    Then User should be able to see chosen email address under the Message tab

  Scenario: Add quotes

    Given "HR" is on Home page
    When User clicks Send Message on Homepage
    And User clicks the quote icon on the message box
    And User types in quote
    And User clicks send
    Then User can see the post with Quote Test displayed

  Scenario: Add tags in messages


    Given "HR" is on Home page
    When User clicks Send Message on Homepage
    And User clicks the add tag icon
    And User types important in the textbox
    And User clicks add button
    And User types Test1 in the message box
    And User clicks send button
    Then User should see the tag in the activity stream

  Scenario: Delete message after sending the message

    Given "HR" is on Home page
    When User clicks Send Message on Homepage
    And User Types My message in the message box
    And User clicks send button
    And User clicks the More option under your sent message
    And User clicks Delete
    And User clicks OK on the alert prompt
    Then User can see The post has been deleted message under Activity Stream

  Scenario: Remove tags before sending the message


    Given "HR" is on Home page
    When User clicks Send Message on Homepage
    And User clicks the tag icon
    And User types tag test
    And User clicks add button1
    And User clicks the x sign to remove added tag/s
    Then User should be able to see tags removed
