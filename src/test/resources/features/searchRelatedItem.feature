Feature: Finding related items

  User story :
  Verify that users can find related items to written keyword

  Accounts are : HR, Helpdesk , Marketing

  Background: For the scenarios in the feature file, user is expected to be on login page
    Given user is on the next base login page


  @NEXT-987
  Scenario Outline: Verify that users can find related items to written keyword
  Finding related keyword

    Given <User> is on home page
    When user click search button
    And user search for "task" and clicks enter
    Then verify that  "task" related  can be seen

    Examples:
      | User      |
      | HR        |
      | Helpdesk  |
      | Marketing |