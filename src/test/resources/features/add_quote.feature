Feature: NEXT-889

  As a user, I should be able to add quote.

  Background:
    Given User is on nextBase Homepage


  Scenario: Add quotes


    When user enters firstname
    And user enters password
    And user clicks to login button
    Then user should see CRM

    When User clicks Send Message on Homepage
    And User Types My message in the message box.
    And User clicks the quote icon on the message box.
    And User types in Quote Test.
    And User clicks send.
    Then User can see the post with Quote Test displayed.