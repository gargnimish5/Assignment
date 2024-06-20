Feature: User Registration

  Scenario: Successful Registration
    Given I navigate to the registration page
    When I enter valid details
    And I submit the registration form
    Then I should see a registration success message

  Scenario: Successful Sign In
    Given I navigate to the sign-in page
    When I enter valid credentials
    And I submit the sign-in form
    Then I should be logged in successfully
