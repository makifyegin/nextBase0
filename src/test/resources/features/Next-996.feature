Feature:  User should be able to display My Calendar

  User Story :
  Verify that users can see the calendar

  Accounts are : Hr , Helpdesk, Marketing

  Background: for the scenarios in the feature file, user is expected to be on login page
    Given user is on the next base login page


  @NEXT-996
  Scenario Outline: Verify that Hr user can display My Calender



    Given <User> is on homepage
    And Click the Calendar
    Then Verify that User can see the my calendar on the page.

    Examples:

      | User      |
      | Hr        |
      | Helpdesk  |
      | Marketing |