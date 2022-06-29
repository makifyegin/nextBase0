@wip @login
Feature: Default

	#1. As an HR user, I should be able to login; so that I can land on homepage.
  @NEXT-982
  Scenario: Verify that HR user can login with valid credentials
Feature: CRM app login feature
  User Story:
  As an HR user, I should be able to login; so that I can land on homepage.

  Background
  For the scenarios in the feature file, user is expected to be on login page


  @HR
  Scenario: Login as HR
    When user enters username "hr1@cybertekschool.com"
    And user enters password "UserUser"
    And user clicks to login button
    Then user should see the "Portal"