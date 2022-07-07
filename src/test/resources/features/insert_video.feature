Feature: NEXT-889

  As a user, I should be able to insert YouTube and Vimeo video.

  Background:
    Given User is on nextBase Homepage


  Scenario : Insert Youtube or Vimeo video


    Given "HR" is on Home page

    When User clicks Send Message on Homepage
    And User clicks the Insert video icon


    | youtubeUrl    |
    |vimeo          |


    And User clicks save button
    Then User should see the Video title, video size and video itself









