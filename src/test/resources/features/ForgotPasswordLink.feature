Feature: Verify that user can see the "Forgot password?" page

 US: As a user, I should be able to login, so that I can land on homepage.
 AC: User land on the ‘Forgot Password’ page after clicking on the "FORGOT YOUR PASSWORD?" link.

  @NEXT-1004
  Background:
  For the scenarios in the feature file, user is expected to be on login page
    Given user is on the login page

  Scenario:
    When user be clicks on "Forgot password?" link
    Then user will land on the "Forgot password?" page