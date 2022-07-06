Feature: NEXT-889

  As a user, I should be able to insert YouTube and Vimeo video.

  Background:
    Given User is on nextBase Homepage

  @NEXT889
  Scenario Outline: Insert Youtube or Vimeo video


    Given <User> is on home page
    When User clicks Send Message on Homepage
    And User clicks the Insert video icon
    And User paste <Video> on the Video source bar
    And User clicks save button
    Then User should see the Video title, video size and video itself

    Examples:
      | User |
      | HR   |

    Examples:
      | Video                                            |
      | https://www.youtube.com/watch?v=Xd5KFlwF6zM&t=6s |
      | https://vimeo.com/718338402                      |



