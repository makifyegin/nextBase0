Feature: Sending Message feature

  User Story :
  Verify that user should be able to send messages by clicking on Message tab under Active Stream.

  Accounts are : HR , Helpdesk , Marketing

  Background: For the scenarios in the feature file, user is expected to be on login page
    Given user is on the next base login page
#      | HR        |
#      | Helpdesk  |
#      | Marketing |






  @NEXT-1067
  Scenario Outline: Verify that user can not upload anything except files and images

    Given "<User>" is on homepage
    When user clicks 'MESSAGE' button
    And user clicks uploaded files button
    And user clicks uploaded files and images button
    And user uploaded anything except files and images
    Then verify that user can not upload anything except files and images from local disk


    Examples:

      |User     |
      |HR       |
      |Helpdesk |
      |Marketing|


  @NEXT-1068

  Scenario Outline: Verify that User can not add users from non existing contact from contact lists.

    Given "<User>" is on homepage
    When user clicks 'MESSAGE' button
    And user clicks contact button
    And user adds "cydeo@hotmail.com"
    Then verify that user can not add users from non existing contact from contact lists



    Examples:

      | User      |
      | HR        |
      | Helpdesk  |
      | Marketing |




  @NEXT-1069

  Scenario Outline: Verify that user can not insert  video without vimeo or youtube video URL.


    Given "<User>" is on homepage
    When user clicks 'MESSAGE' button
    And user clicks video icon
    And user add "video URL"
    And user click save button for video
    Then verify that user can not add video which is not vimeo or youtube url

    Examples:

      |User     |
      |HR       |
      |Helpdesk |
      |Marketing|




  @NEXT-1070

  Scenario Outline: Verify that user can not send a message without add recipient.

    Given "<User>" is on homepage
    When user clicks 'MESSAGE' button
    And user writes "message" in the title space
    And delete recipient which is existing on the website
    And user click send button without provide recipient
    Then verify that user can not send message without add recipient


    Examples:

      |User     |
      |HR       |
      |Helpdesk |
      |Marketing|


  @NEXT-1071

  Scenario Outline: Verify that user can not send a message without add title.

    Given "<User>" is on homepage
    When user clicks 'MESSAGE' button
    And user click send button without provide title
    Then verify that user can not send message without title


    Examples:

      |User     |
      |HR       |
      |Helpdesk |
      |Marketing|


  @NEXT-1072

  Scenario Outline: Verify that user can not attach missing link

    Given "<User>" is on homepage
    When user clicks 'MESSAGE' button
    And user clicks link icon
    And user add link text "next"
    And user add link URL "https://nextbasecrm"
    And user click save button
    Then verify that user can not add missing link

    Examples:

      |User     |
      |HR       |
      |Helpdesk |
      |Marketing|

