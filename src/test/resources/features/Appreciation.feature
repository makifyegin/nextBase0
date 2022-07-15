@appreciation
Feature: NextBase App appreciation feature

  User Story: As a user, I should be able to send appreciation by clicking on
              Appreciation subheading from "More" tab under Activity Stream.

  Background: user is on Activity Stream
    Given "hr" is on Home page and clicks Appreciation button from More  dropdown menu



  Scenario: User should be able to click on upload files icon to upload files and pictures from local disks.
    When user clicks upload files icon
    And user clicks Upload files and images
    Then user should see Pictures files


