Feature: User Login Functionality

  Scenario Outline: Verify login with distinct credentials
    Given User is on the login page
    When User enters username "<username>" and password "<password>"
    And User clicks on the login button
    Then User should be redirected to the dashboard page

    Examples:

      | username | password  |
      | admin    | admin123  |
      | tester   | test456   |
