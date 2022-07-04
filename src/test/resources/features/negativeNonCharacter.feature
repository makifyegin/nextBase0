Feature: Search feature

  User Story : Verify that user can't search without providing input

  Accounts are : HR , Helpdesk , Marketing

  Background: For the scenarios in the feature file, user is expected to be on login page
    Given user is on the next base login page


  @NEXT-994
  Scenario Outline: Verify that users can't search with non-related characters


    Given <User> is on homepage
    And clicks search button with non-releated "41356251547471"
    Then verify that user has get Nothing found title

    Examples:

      |User     |
      |HR       |
      |Helpdesk |
      |Marketing|