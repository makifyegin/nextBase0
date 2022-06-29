@wip @login
Feature: Default

	#3. As a Marketing user, I should be able to login; so that I can land on homepage.
  @NEXT-984
  Scenario: Verify that Marketing user can login with valid credentials
Feature: CRM app login feature
  User Story:
  As an Marketing user, I should be able to login; so that I can land on homepage.

  Background
  For the scenarios in the feature file, user is expected to be on login page


  @Marketing
  Scenario: Login as Marketing
    When user enters username "marketing1@cybertekschool.com"
    And user enters password "UserUser"
    And user clicks to login button
    Then user should see the "Portal"