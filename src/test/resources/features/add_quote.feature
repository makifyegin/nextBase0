Feature: NEXT-889

  As a user, I should be able to add quote.

  Background:
    Given User is on nextBase Homepage


  Scenario Outline: Add quotes

    Given <User> is on home page


    Examples:
      | User      |
      | HR        |