
Feature:  User should be able to display Company Calendar

  User Story :
  Verify that users can see the calendar

  Accounts are : Hr , Helpdesk, Marketing

  Background: for the scenarios in the feature file, user is expected to be on login page
    Given user is on the next base login page


  @NEXT-997
  Scenario: Verify hat  User can add an event on My Calendar.

    Given "hr" is on homepage
    And Click the Calendar
    And Click the Add event
    And Select the event date and fill out th event name
    And Click Save
    When Click the Calendar
    And Click the MyCalendar
    Then Verify that User can see your new event on the calendar.
    And Click the Filter and Search
    And Write on your event name
    And Verify that User can see your new event on the calendar.

