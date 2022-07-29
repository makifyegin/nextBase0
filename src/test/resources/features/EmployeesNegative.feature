Feature: Default

	#*User Story:* As a user, I should be able to interact with employees on the posts that I have access to
	#
	#US: [NEXT-1017|http://jira.cydeo.com/browse/NEXT-1017]
	#
	#*Acceptance Criteria:*
	#
	#User should be able to make a comment, like, or unfollow on other employees' posts.
	#User should be able to like or make comments on all other reviewers' comments.
	#User should be able to click on reviewers' names and visit their profiles.
	#User should be able to add others' posts to favorite by clicking on the Star icon.

    @NEXT-1065
    Scenario: As a user, I should be able to interact with employees on the posts that I have access to.(Negative)
    Feature: Next-1065 Employees Interaction Functionality (Negative)

    US - As a user, I should be able to interact with employees on the posts that I have access to

    Background:
      Given "HR" is on Home page

    Scenario: User cannot make a comment with an empty employees' posts.
      Given User click comment button other employees' posts
      When User click the send button at the INPUT BOX.
      Then Verify that User comments on other reviews' posts and User get Negative outcome