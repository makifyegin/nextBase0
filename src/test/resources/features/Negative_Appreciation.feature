Feature: Negative Appreciation feature

  Background: user is on Activity Stream
    Given "hr" is on Home page and clicks Appreciation button from More  dropdown menu

  @NEXT-1089
  Scenario: User should be able to upload application on upload files and pictures from local disks.
   When user clicks upload files icon
   And user clicks Upload files and images
   And user upload folder instead of file
   Then verify that user can see error message

  @NEXT-1090
  Scenario: User should be able to add users from selecting multiple contacts from Employees and Departments contact lists.
    When user clicks Add More button
    And user clicks Employees and departments
    And user tries to add contact which is not exist in the list
    Then verify that user cannot add non-existent contact

  @NEXT-1092
  Scenario: User should be able to attach link by clicking on the link icon.
    When user clicks link icon
    When user paste missing link url to link bar
    Then user should not be able to add missing link under Appreciation page

  @NEXT-1094
  Scenario: User should be able to insert videos by clicking on the video icon and entering the video URL.
    When user clicks Insert video icon
    And user clicks video source bar
    And user passes video from DailyMotion and click save
    Then verify that user cannot upload video other than Youtube and Vimeo

  @NEXT-1095
  Scenario: User should be able to send appreciation.
    When user click send button
    Then verify that user can not send message without title

