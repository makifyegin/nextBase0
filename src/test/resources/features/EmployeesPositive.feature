@NEXT-1026
Feature: Employees Interaction Functionality (Positive scenarios)

  US: NEXT-1017
  AC: As a user, I should be able to interact with employees on the posts that I have access to

  Background:
    Given "HR" is on Home page

  Scenario: User should be able to make a comment, like, or unfollow on other employees' posts
    Given there is a post under Activity Stream
    When  User interacts as "<interaction>"
   # And  User hovers over the "like" button
   # And  User should see the "emoji" selection box
    #And  User clicks on the "emoji" button
    And  User leaves comment as "Test Comment" on post
    #Then verify that all steps passed

   # Examples:
   #   | interaction |
    #  | Like        |
    #  | Kiss        |
    #  | Laugh       |
    #  | Wonder      |
     # | Cry         |
     # | Angry       |


  Scenario Outline: User should be able to like or make comments on all other reviewers' comments
    Given User is on home page
    When User click "like"
    When User leaves comment as "Test Comment" on reviewer's comment
    And  User interacts as "<interaction>"
    Then verify that interaction is given
    Then verify that comment is posted
    Examples:
      |interaction|
      |like       |
      |comments   |


  # Scenario Outline: User should be able to click on reviewers' names and visit their profiles
  #  When User clicks reviews name button with the name "<Name>"
   # And User is redirect to URL "https://login.nextbasecrm.com/company/personal/user/693/"
   # Then User should be able to see reviewers profiles
   # Examples:
     #| Name        |
    # | dadasdasdasd dada        |


  Scenario: User should be able to add others' posts to favourite by clicking on the Star icon
   Given User click star on the top right corner of message box
   Then Verify that User can add to starIcon favourite


    #user should be able to make a comment, like, or unfollow on other employees' posts.
	#User should be able to like or make comments on all other reviewers' comments.
	#User should be able to click on reviewers' names and visit their profiles.
	#User should be able to add others' posts to favorite by clicking on the Star icon.