@NEXT-998

Feature: HR user  task  features negative scenarios


	#*US:[NEXT-785]*
	#
	#1. As an HR User, I should be able to display All Tasks.
	#2. As an HR User, I should be able to display Ongoing Tasks.
	#3. As an HR User, I should be able to create a new task.
	#
	#*A.C:*
	#
	#HR user types can see the all tasks
	#
	#HR user can create task
	#
	#HR user can edit task





  Background:
    Given User is on home page
    When User clicks Tasks button on the home page
    And User clicks NEW TASK button
    And User displays new task page

  @1
  Scenario: HR User can not create  new task without any input
    When User clicks ADD TASK button
    Then User displays "The task name is not specified."

  @2
  Scenario: HR User can not create recent
    When user clicks on header  and types "almost task ".
    And user clicks Text area and types "I'm creating recent  task as a HR user"
    And User clicks Deadline dropdown menu
    And user clicks left arrow button on calender.
    And User select "10/06/2022" date
    And User clicks more menu
    And User clicks Project menu
    And User clicks Soccer team
    And User clicks ADD TASK button

    Then Verify that user can not create task recent time.

