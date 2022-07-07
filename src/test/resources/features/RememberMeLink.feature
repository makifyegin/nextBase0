Feature: Default

	#*US:* As a user, I should be able to login; so that I can land on homepage.
	#
	# 
	#
	#{color:#de350b}*AC:{color}* User can see "\{*}Remember Me"\{*} link exists and is clickable on the login page.
	@NEXT-1005
	Scenario: Verify users can see "Remember Me" link exists and clickable on the login page.
		Feature: Verify that user can see the "Remember me" checkbox
				
				Background:
				  For the scenarios in the feature file, user is expected to be on login page
				  Given user is on the login page
				  
				 Scenario:
				  When user clicks on "Remember me" checkbox
				  Then checkbox will be clicked