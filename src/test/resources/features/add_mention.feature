Feature: NEXT-889

  As a user, I should be able to add mention about only department employees

  Background:
    Given User is on nextBase Homepage

  Scenario: Add mention about only department employees

    Given "HR" is on Home page
    When User clicks Send Message on Homepage
    And User mentions about hr76@cybertekschool.com
    Then User should be able to see chosen email address under the Message tab






