@login
Feature: User should be login successfully with valid credential

  Background:
    Given User is on HomePage

  Scenario Outline: User should be able to login with valid credential

    When user enter wrong "<User Name>" and "<Password>"
    And click on login
    Then user should see "<Login Failure Message>"

    Examples:
      | User Name | Password | Login Failure Message    |
      | Admin     | Admin123 | Invalid credentials      |
      |           | admin123 | Username cannot be empty |
      | admin123  | admin123 | Invalid credentials      |
      | admin123  |          | Password cannot be empty |
      | Admin     |          | Password cannot be empty |
      |           |          | Username cannot be empty |

    @login1
    Scenario: User should able to put correct credential for login
    When user enter correct credentials
    Then user should see dashboard successfully