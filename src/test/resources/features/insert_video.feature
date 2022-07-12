

Feature: NEXT-889

  As a user, I should be able to insert YouTube and Vimeo video.

  Background:
    Given User is on nextBase Homepage

  @NEXT889
  Scenario: Insert Youtube or Vimeo video


    Given "HR" is on Home page
    When User clicks Send Message on Homepage
    And User clicks the "<Insert>" video icon
      |youTube|
      |vimeo  |
    And User clicks save button
    Then User should see the Video title, video size and video itself









