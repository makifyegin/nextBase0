Feature: NEXT-889

  As a user, I should be able to insert YouTube and Vimeo video.

  Background:
    Given User is on nextBase Homepage
@wip
  Scenario: Insert Youtube or Vimeo video

    When user enters firstname
    And user enters password
    And user clicks to login button
    Then user should see CRM

    When User clicks Send Message on Homepage
    And User clicks the Insert video icon
    And User paste https://www.youtube.com/watch?v=Xd5KFlwF6zM on the Video source bar
    And User clicks save button
    And User clicks the Insert video icon
    And User paste https://vimeo.com/718338402 in Link Textbox
    And User clicks save button
    Then User should see the Video title, video size and video itself