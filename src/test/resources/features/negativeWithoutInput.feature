Feature: Search feature

  User Story : Verify that user can't search without providing input

  Accounts are : HR , Helpdesk , Marketing

  Background: For the scenarios in the feature file, user is expected to be on login page
    Given user is on the next base login page


  @NEXT-993
  Scenario Outline: Verify that user can't search without providing input
  Searching without input

    Given <User> is on homepage
    And clicks search button without providing input
    Then verify that any page can not opened

    Examples:

      |User     |
      |HR       |
      |Helpdesk |
      |Marketing|