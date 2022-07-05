Feature: NEXT-889

  As a user, I should be able to add link to specified text

  Background:
    Given User is on nextBase Homepage
  @NEXT889
  Scenario Outline: Add link to specified text

    Given <User> is on home page
    And User clicks Send Message on Homepage
    And User clicks link icon on Message box
    And User types in w3 Schools in Text Textbox
    And User add link https://www.w3schools.com/ in Link Textbox
    Then User should see the saved link in the message bar

    Examples:
      | User      |
      | HR        |

