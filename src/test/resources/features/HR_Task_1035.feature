Feature:HR user high priority task feature

	#*US:*{color:#de350b} {color}NEXT-1011
	#{color:#de350b}1. HR User can create a high priority task in duration of the certain deadline by mentioning about a user.{color}
	#2. Marketing User can edit the task by declaring himself/herself as responsible person.
	#3. HR User can edit the task for adding time tracking.
	#4. HR User can edit the task for adding reminder to e-mail.
	#5. Marketing User can create a subtask of the first acceptance criteria's task quickly by using plus button, adding tags.
	#6. HR User can add one more responsible person by editing created task.
	#7. Marketing User can add participants and observers to already created task by editing.
	#8. Marketing User can add checklist to an already created task by editing.
	#9. HR User can add dependent tasks by editing the already created task.
	#10. HR User can be redirected to "New task template" page by clicking 'All templates' under "TASK TEMPLATES" menu on "New task" module.
	#11. HR User can create new task template for high priority task, for him/herself, by mentioning about Marketing User, specifying the deadline, using the Options under 'Deadline in' section.
	#12. HR User can delete task by using "SELECT ACTION" dropdown menu after checking the task.
	# 
	#h4. A.C
	#h4. 1. In the 3rd AC, time tracking should be 2 Hours 30 Minutes.
	#2. In the 4th AC, You may use reminder e-mail to alper@cybertekschool.com.
	#3. In the 5th AC, the plus button can be seen by hovering the mouse over "Tasks" on the left navigation menu.
	#4.In the 6th AC, the responsible user should be marketing1@cybertekschool.com.
	#5. In the 7th AC, the participant should be marketing1@cybertekschool.com and the observer should be hr2@cybertekschool.com.
	#6. In the 8th AC, You may use "TEST1,TEST2,TEST3" as checklist items.(commas are the separators for the items).
	#7. You may use randomly picked task as dependent task.
	#8. In the 11th AC, the deadline must be 5 days 2 hours 15 minutes.
	#9. In the 11th AC, "Responsible person can change deadline", "Approve task when completed" Options should be checked.
  @NEXT-1035
  Scenario: Verify that  HR User can create a high priority task in duration of the certain deadline by mentioning about a user

    Given User is on home page
    When  User clicks Tasks button on the home page
    And User verify  display task page
    And User clicks NEW TASK button
    And User displays new task page
    And user clicks on header  and types "high priority task"
    And User clicks High Priority button
    And user clicks Text area and types "I'm creating new task as a HR user"
    And User clicks Created by button
    And User clicks Deadline dropdown menu
    And User selects "31/07/2022" date
    And User clicks Project menu
    And User clicks Soccer team
    And User clicks ADD TASK button

    Then Verify that "high priority task" on the task page