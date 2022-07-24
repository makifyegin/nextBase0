Feature: Default
  User Story :

	#*US :* *NEXT-1012*
	#
	#{*}A.C.{*}:
	#
	# ** 
	#{color:#de350b}
 # 1. HR User can add new important repeating event with description
 #
 # by specifying the start-end dates in the specific time zones,
 # adding certain location, adding attendees, color as "Pink" and availability as "Occupied". {color}
	#2. HR User can edit the 1st AC's task color as "Navy Blue" by using "other color". 
	#3. HR User can edit the 1st AC's privacy as "Private event". 
	#4. Marketing user can not display the 3rd AC's private event on his/her calendar. 
	#5. HR User can edit his/her availability from "Occupied" to "Unsure". 
	#6. HR User can edit his/her event's name. 
	#7. HR User can edit Repeat section as "Daily". 
	#8. HR User can delete attendee by editing the event. 
	#9. HR User can add one More attendee by editing the event. 
	#10. Marketing User can display the invitations by using "Filter and search" box after clicking "Invitations" button. 
	#11. HR User can filter events and/or tasks by using "Filter and search" box after clicking "I'M AN ORGANISER" button. 
	#12. Helpdesk User can reset after selecting "Yes" under "Event with participants" menu and "Invited" under "Participant status".
	# 
	#*Validation Rule:*
	#
	#1.In the 1st AC, description should be "MY_FIRST_DESCRIPTION_OF_BIRTHDAY".
	#2. In the 1st AC, start date should be 25 Aug 2022 and end date should be 30 Aug 2022.
	#3. In the 1st AC, attendees should be marketing1@cybertekschool.com, helpdesk1@cybertekschool.com.
	#4. In the 1st AC, the location should be as Central Meeting Room.
	#5.In the 6th AC, event name should be "MY_TEST_EVENT".

#  Scenario: Verify that HR User should add new important repeating event with description by
#  specifying the start-end dates in the specific time zones, adding certain location,
#  adding attendees, color as "Pink" and availability as "Occupied".
#Feature:  HR User can add new important repeating event
#  with description by specifying the start-end dates in the
#  specific time zones, adding certain
#  location, adding attendees, color as
#  "Pink" and availability as "Occupied".

  Background:
    Given user is on the next base login page
    Given "hr" is on homepage
    And Click the Calendar
    And Click the Add event
    And Click the This event is important
    And Fill out the "event name"
    And Specifying "start" dates in the spesific "end"
    And Click the repeating event with description
    And Add "specific" time zones
    And Add certain "location"
    And Add "attendees"
    And Click More
    And Add colour of "Pink"
    And Choose availability "Occupied"
    And user click save button

  @NEXT-1051
  Scenario: HR User can edit the 1st AC's task color as

    Given Click the Event
    When Click the Open
    Then Verify that Event name is "MY_FIRST_DESCRIPTION_OF_BIRTHDAY"
    And Verify that start day is "25 Aug 2022" end date "30 Aug 2022"
    And Verify that "Private" event is not selected
    And Verify that colour is "Pink"

  @NEXT-1052
  Scenario: HR User can edit the 1st AC's task color as
  "Navy Blue" by using "other color".

    Given Click the Event
    And Click the Edit
    When Click More
    When Click other color
    And Add colour of "NavyBlue"
    And Click Save
    Then Click the Event
    And Verify that colour is "Navy Blue"

  @NEXT-1053
  Scenario: HR user can edit the 1st AC's privacy as "Private event".

    Given Click the Event
    And Click the Edit
    When Click More
    And Click Private Event
    And Click Save
    Then Click the Event
    And Verify that Private event is selected.

  @NEXT-1054
  Scenario: HR user can edit the 1st AC's privacy as "Private event".

    Given Click Logout
    And "marketinguser" is on homepage
    When Click the Calendar
    And List the Event
    Then Verify that Marketing User can not see the private event


  @NEXT-1055
  Scenario: HR user can edit availability from "Occupied" to "Unsure"
    Given Click the Event
    When Click the Edit
    And Click More
    And  Choose available "Unsure"
    And Click Save
    Then Click the Event
    And Click the Edit
    And Click More
    And Verify that Available is "Unsure"

  @NEXT-1056
  Scenario: HR user can edit event's name

    Given Click the Event
    When Click the Edit
    And Fill out the "event name"
    And Click Save
    Then verify that event "MY_TEST_EVENT" changed

  @NEXT-1057
  Scenario: HR user can edit repeat section as "Daily"

    Given Click the Event
    When Click the Edit
    And Click the More
    And Choose the "Daily" repeat
    And Click Save
    Then verify that this event is happen daily

  @NEXT-1058
  Scenario: HR user can delete attendee by editing the event

    Given Click the Event
    When Click the Edit
    And Click the delete attendee
    And Click Save
    Then Click the Event
    And Clock the Open
    And Verify that event attend's was updated

  @NEXT-1059
  Scenario: HR user can add attendee by editing the event

    Given Click the Event
    When Click the Edit
    And Click the add "helpdesk1@cybertekschool.com" and "marketing1@cybertekschool.com" attendee
    And Click Save
    Then Click the Event
    And Click the Open
    And Verify that event attendees was updated

  @NEXT-1060
  Scenario: MArketing user can display invitation by using Filter and Search box after clicking Invitaiton button

    Given Click Logout
    And "marketinguser" is on homepage
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
