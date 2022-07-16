Feature: Uploaded feature

  User Story :
  Verify that user should be able to send messages by clicking on Message tab under Active Stream.

  Accounts are : HR , Helpdesk , Marketing

  Background: For the scenarios in the feature file, user is expected to be on login page
    Given "User" is on homepage
      | HR |  | Marketing |  | helpdesk |
    When user clicks 'MESSAGE' button
#What should we write here to login with three users at the same time inside the background. it's like a preconditions.

  @NEXT-1018
  Scenario: Verify that files and pictures are uploaded

    When user clicks uploaded files button
    And user clicks uploaded files and images button
    Then verify that user can upload file and images from local disk


  @1018-contact

  Scenario: User should be able to add users from selecting multiple contacts from Employees and Departments
  contact lists.


    When user clicks contact button
    And user clicks Employees and Departments button
    And user select multiple contact from contact list
    Then verify that user can add multiple contact


  @1018-link

  Scenario: User should be able to attach link by clicking on the link icon.


    When user clicks link icon
    And user add link text
    And user add link URL
    And user click save button
    Then verify that user can add link


  @1018-video

  Scenario: User should be able to insert videos by clicking on the video icon and entering the video URL.


    When user clicks video icon
    And user add video URL
    And user click save button
    Then verify that user can add video


  @1018-quote

  Scenario: User should be able to create a quote by clicking on the Comma icon


    When user clicks comma icon
    Then verify that user can add quote


  @1018-mention

  Scenario: User should be able to add mention by clicking on the Add mention icon.


    When user clicks mention icon
    And user select mention
  #  Then verify that user can add mention



  @1018-sendMessage

  Scenario: User should be able to send a message.

    When user click send button
    Then verify that user can send message







