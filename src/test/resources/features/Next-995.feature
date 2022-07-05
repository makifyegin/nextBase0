Feature:  User should be able to display Company Calendar

  User Story :
  Verify that users can see the calendar

  Accounts are : Hr , Helpdesk, Marketing

  Background: for the scenarios in the feature file, user is expected to be on login page
    Given user is on the next base login page

@wip
  @NEXT-995
  Scenario Outline: Verify that <User> User can display Company Calendar.



    Given <User> is on homepage
    When Click the Calendar
    Then Verify that User can see all the events belong to this Company.

  Examples:

    |User     |
    |HR       |
    |Helpdesk |
    |Marketing|