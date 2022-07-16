@appreciation
Feature: NextBase App appreciation feature

  User Story: As a user, I should be able to send appreciation by clicking on
              Appreciation subheading from "More" tab under Activity Stream.

  Background: user is on Activity Stream
    Given "hr" is on Home page and clicks Appreciation button from More  dropdown menu



#  Scenario: User should be able to click on upload files icon to upload files and pictures from local disks.
#    When user clicks upload files icon
#    And user clicks Upload files and images
#    Then user should see Pictures files

  Scenario: User should be able to add users from selecting multiple contacts from Employees and Departments contact lists.
    When user clicks Add More button
    And user clicks Employees and departments
    Then user should see multiple contacts and add one of them

  Scenario: User should be able to attach link by clicking on the link icon.
    When user clicks link icon
    When user paste link url to link bar
    And user clicks to Save button
    Then user should see link url under Appreciation

    @video
  Scenario: User should be able to insert videos by clicking on the video icon and entering the video URL.
    When user clicks Insert video icon
    And user clicks video source bar
    And user insert video link and click save
    Then user should see saved video under Appreciation

  Scenario: User should be able to create a quote by clicking on the Comma icon.
    When user clicks quote text icon
    And user types quote in text bar
    #missing part

  Scenario: User should be able to add mention by clicking on the Add mention icon.
    When

  Scenario: User should be able to send appreciation.




