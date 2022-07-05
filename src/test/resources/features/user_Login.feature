Feature: Default

	#1.As an HR user, I should be able to login; so that I can land on homepage.
	#2.As a Helpdesk user, I should be able to login; so that I can land on homepage.
	#3.As a Marketing user, I should be able to login; so that I can land on homepage.
	@NEXT-999
	Scenario Outline: Verify that user can login with valid credentials
		Feature: CRM app login feature
		 User Story:
		 As an user, I should be able to login; so that I can land on homepage.
		
		Background:
		  For the scenarios in the feature file, user is expected to be on login page
		  Given <user> is on the login page
		  
		 Scenario Outline:
		  When <user> user enters <username>
		  And <user> user enters <password>
		  And <user> user clicks to login button
		  Then <user> user should see the dashboard
		  
		   Examples:
		
		      |User     |username                       |password |
		      |HR       |hr1@cybertekschool.com         |UserUser |
		      |Helpdesk |helpdesk1@cybertekschool.com   |UserUser |
		      |Marketing|marketing1@cybertekschool.com  |UserUser |