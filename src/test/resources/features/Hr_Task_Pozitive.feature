@NEXT-981
Feature: HR user  task  features

	#*US:* [NEXT-785|http://jira.cydeo.com/browse/NEXT-785]
	#{color:#de350b}1. As an HR User, I should be able to display All Tasks.{color}
	#2. As an HR User, I should be able to display Ongoing Tasks.
	#3. As an HR User, I should be able to create a new task.
	#*A.C*
	# * All user types can see the all tasks
	# * All user types can see the ongoing tasks
	# *  HR user can create task


  Background:
    Given User is on home page
    When User clicks Tasks button on the home page
    And User verify  display task page

  Scenario: HR User Displays All Task  Verification
    And User clicks All button
    Then User sees tasks  is on the task page

  Scenario: HR User Displays Ongoing Task  Verification
    And User clicks Ongoing button
    Then User sees Role:ongoing   on the ongoing task page

  Scenario: HR User Displays Create Task  Verification
    And User clicks NEW TASK button
    And User displays new task page
    And user clicks on header  and types "New Task".
    And user clicks Text area and types "I'm creating new task as a HR user"
    And User clicks Deadline dropdown menu
    And User select "10/07/2022" date
    And User clicks more menu
    And User clicks Project menu
    And User clicks Soccer team
    And User clicks ADD TASK button
    Then User sees New Task on the task page