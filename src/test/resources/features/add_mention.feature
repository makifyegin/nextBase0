Feature: NEXT-889

  As a user, I should be able to add mention about only department employees

  Background:
    Given User is on nextBase Homepage

  Scenario: Add mention about only department employees

    When user enters firstname
    And user enters password
    And user clicks to login button
    Then user should see CRM

    When User clicks Send Message on Homepage
    And User mentions about helpdesk2@cybertekschool.com
    Then User should be able to see chosen email address under the Message tab






