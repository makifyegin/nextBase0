Feature:  User should be able to display Company Calendar

  User Story :
  Verify that users can see the calendar

  Accounts are : Hr , Helpdesk, Marketing

  Background: for the scenarios in the feature file, user is expected to be on login page
    Given user is on the next base login page

@wip
  @NEXT-997
  Scenario : Verify hat <User> User can add an event on My Calendar.



  Given "<User>" is on Home page
    And Click the Calendar
    And See the ADD button on  the page and click the arrow.
    And Click the Add event
    And Click SAVE(CTRL + ENTER)
    Then Verify that User can see your new event on the calendar.

