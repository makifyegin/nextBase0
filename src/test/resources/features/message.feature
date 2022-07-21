Feature: Uploaded feature

  User Story :
  Verify that user should be able to send messages by clicking on Message tab under Active Stream.

  Accounts are : HR , Helpdesk , Marketing

  Background: For the scenarios in the feature file, user is expected to be on login page
    Given user is on the next base login page
#      | HR        |
#      | Helpdesk  |
#      | Marketing |






  @NEXT-1040
  Scenario Outline: Verify that files and pictures are uploaded

    Given "<User>" is on homepage
    When user clicks 'MESSAGE' button
    And user clicks uploaded files button
    And user clicks uploaded files and images button
    Then verify that user can upload file and images from local disk


    Examples:

      |User     |
      |HR       |
      |Helpdesk |
      |Marketing|



    @NEXT-1041

    Scenario Outline: User should be able to add users from selecting multiple contacts from Employees and Departments
    contact lists.

      Given "<User>" is on homepage
      When user clicks 'MESSAGE' button
      And user clicks contact button
      And user clicks Employees and Departments button
      Then verify that user select multiple contact from contact list



    Examples:

      | User      |
      | HR        |
      | Helpdesk  |
      | Marketing |


  @NEXT-1042

  Scenario Outline: User should be able to attach link by clicking on the link icon.

     Given "<User>" is on homepage
     When user clicks 'MESSAGE' button
     And user clicks link icon
     And user add link text
     And user add link URL
     And user click save button
     Then verify that user can add link

     Examples:

       |User     |
       |HR       |
       |Helpdesk |
       |Marketing|




  @NEXT-1043

  Scenario Outline: User should be able to insert videos by clicking on the video icon and entering the video URL.


    Given "<User>" is on homepage
    When user clicks 'MESSAGE' button
    And user clicks video icon
    And user add video URL
    And user click save button for video
    Then verify that user can add video

    Examples:

      |User     |
      |HR       |
      |Helpdesk |
      |Marketing|



  @NEXT-1044

  Scenario Outline: User should be able to create a quote by clicking on the Comma icon


    Given "<User>" is on homepage
    When user clicks 'MESSAGE' button
    And user clicks comma icon
    Then verify that user can add quote


    Examples:

      |User     |
      |HR       |
      |Helpdesk |
      |Marketing|



  @NEXT-1045

  Scenario Outline: User should be able to add mention by clicking on the Add mention icon.


    Given "<User>" is on homepage
    When user clicks 'MESSAGE' button
    And user clicks mention icon
    And user select mention
    Then verify that user can add mention

    Examples:

      |User     |
      |HR       |
      |Helpdesk |
      |Marketing|



  @NEXT-1046

  Scenario Outline: User should be able to send a message.

    Given "<User>" is on homepage
    When user clicks 'MESSAGE' button
    And user click send button
    Then verify that user can send message


    Examples:

      |User     |
      |HR       |
      |Helpdesk |
      |Marketing|






