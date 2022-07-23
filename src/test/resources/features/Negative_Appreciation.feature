Feature: Negative Appreciation feature

  Background: user is on Activity Stream
    Given "hr" is on Home page and clicks Appreciation button from More  dropdown menu

    @uploadApp
  Scenario: User should be able to upload application on upload files and pictures from local disks.
   When user clicks upload files icon
    And user clicks Upload files and images
    And user upload application instead of file
    #Then verify that user can upload application

  Scenario: User should be able to add users from selecting multiple contacts from Employees and Departments contact lists.
      #without sending any message , non exit contact
  Scenario: User should be able to attach link by clicking on the link icon.
  Scenario: User should be able to insert videos by clicking on the video icon and entering the video URL.
      #daily motion video
  Scenario: User should be able to create a quote by clicking on the Comma icon.
  Scenario: User should be able to add mention by clicking on the Add mention icon.
  Scenario: User should be able to send appreciation.
      #without any title
