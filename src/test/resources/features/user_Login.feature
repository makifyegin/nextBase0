@login
Feature: Verify that user can login with valid credentials

	#1.As an HR user, I should be able to login; so that I can land on homepage.
	#2.As a Helpdesk user, I should be able to login; so that I can land on homepage.
	#3.As a Marketing user, I should be able to login; so that I can land on homepage.

  Scenario Outline:
    When user enters "<username>"
    And user enters "<password>"
    And user clicks to login button
    Then user should see the "Portal"

    Examples:

      |username                      | password |
      |hr1@cybertekschool.com        | UserUser |
      |helpdesk1@cybertekschool.com  | UserUser |
      |marketing1@cybertekschool.com | UserUser |