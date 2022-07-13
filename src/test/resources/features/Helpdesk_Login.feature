 @login
Feature: Default

	#2. As a Helpdesk user, I should be able to login; so that I can land on homepage.
  @NEXT-983
  Scenario: Verify that Helpdesk user can login with valid credentials
Feature: CRM app login feature
  User Story:
  As an Helpdesk user, I should be able to login; so that I can land on homepage.


  @Helpdesk
  Scenario: Login as Helpdesk
    When user enters username "helpdesk1@cybertekschool.com"
    And user enters password "UserUser"
    And user clicks to login button
