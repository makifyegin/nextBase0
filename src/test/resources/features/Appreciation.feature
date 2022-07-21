@appreciation
Feature: NextBase App appreciation feature

  User Story: As a user, I should be able to send appreciation by clicking on
              Appreciation subheading from "More" tab under Activity Stream.

  Background: user is on Activity Stream
    Given "hr" is on Home page and clicks Appreciation button from More  dropdown menu

  @file #done
  Scenario: User should be able to click on upload files icon to upload files and pictures from local disks.
    When user clicks upload files icon
    And user clicks Upload files and images
    Then verify that user can upload file and images from local disk

  @addUser #done
  Scenario: User should be able to add users from selecting multiple contacts from Employees and Departments contact lists.
    When user clicks Add More button
    And user clicks Employees and departments
    And user should see multiple contacts and add one of them
    Then send added user to Activity Stream and verify if it's displayed or not

  @link #done
  Scenario: User should be able to attach link by clicking on the link icon.
    When user clicks link icon
    When user paste link url to link bar
    And user clicks to Save button
    And send link to Appreciation page
    Then verify that user can see link

  @video #passed
  Scenario: User should be able to insert videos by clicking on the video icon and entering the video URL.
    When user clicks Insert video icon
    And user clicks video source bar
    And user insert video link and click save
    Then user should see saved video under Appreciation

  @quote #done
  Scenario: User should be able to create a quote by clicking on the Comma icon.
    When user clicks quote text icon
    And user types quote in text bar
    Then user should send quote

  @mention #done
  Scenario: User should be able to add mention by clicking on the Add mention icon.
    When user clicks Add Mention icon
    And user clicks Employees and departments button
    Then user should click one user from the list and send appreciation
    Then verify that user can see sent mention.





