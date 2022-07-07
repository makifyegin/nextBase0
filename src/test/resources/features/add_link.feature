Feature: NEXT-889

  As a user, I should be able to add link to specified text

  Background:
    Given User is on nextBase Homepage

  Scenario : Add link to specified text

    Given "HR" is on Home page
    And User clicks Send Message on Homepage
    And User clicks link icon on Message box
    And User types in w3 Schools in Text Textbox
    And User add link https://www.w3schools.com/ in Link Textbox
    Then User should see the saved link in the message bar



