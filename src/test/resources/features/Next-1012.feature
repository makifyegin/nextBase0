Feature:Add an event for the AC criteria
  User Story :As a user, I should be able to navigate "Calendar" page so that user can filter and search, display, add and track the tasks or events either on "Calendar" page.
  Background:
    Given user is on the next base login page
    Given "hr" is on homepage
    And Click the Calendar
    And Click the Add event
    And Click the This event is important
    And Fill out the "MY_FIRST_DESCRIPTION_OF_BIRTHDAY"
    And Specifying "08/25/2022" dates in the spesific "08/27/2022"
    And Click the repeating event with description
    And Add "specific" time zones
    And Add certain "location"
    And Add "attendees"
    And Click More
    And Add colour of "Pink"
    And Choose availability "Occupied"
    And user clickCtrlEnter save button


  @NEXT-1051
  Scenario: HR User can edit the 1st AC's task color as

    Given Click the Event
    When Click the Open
    Then Verify that Event name is "MY_FIRST_DESCRIPTION_OF_BIRTHDAY"
    And Verify that start day is "25 Aug 2022" end date "30 Aug 2022"
    And Verify that "Private" event is not selected
    And Verify that colour is "Pink"

  @NEXT-1056
  Scenario: HR user can edit event's name

    Given Click the Event
    When Click the Open
    And Edit and Fill out the "MY_TEST_EVENT"
    And user clickCtrlEnter save button
    And Edit recurring event
    Then verify that event "MY_TEST_EVENT" changed


  @NEXT-1060
  Scenario: MArketing user can display invitation by using Filter and Search box after clicking Invitaiton button

    Given Click Logout
    And "marketing" is on homepage
    And Click the Calendar
    When Click the Filter and Search
    And Click the Invitation "Yes"
    And Click the Search
    Then Verify that User can displays these events

  @NEXT-1061
  Scenario: HR User can filter events by using filter and search box after clicking I'm an organiser.

    When  Click the Filter and Search
    And Click the I am an Organiser
    And Click the Search
    Then Verify that User can displays these events
