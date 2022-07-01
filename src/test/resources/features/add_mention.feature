Feature: NEXT-889

  As a user, I should be able to add mention about only department employees

  Scenario: Add link to specified text


    Given User is on nextBase LoginPage


    When user enters firstname
    And user enters password
    And user clicks to login button
    Then user should see CRM



    When User clicks Send Message on Homepage
    And User clicks add on message icon in the message box
    And User clicks on employee and department tab
    And User clicks hr1@cybertekschool.com email
    Then User should be able to see chosen email address under the Message tab






