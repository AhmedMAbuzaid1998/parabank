Feature: Forgot login information

  @Test
  Scenario: User forgot login information and got it back


    When user click the Forgot login info? link
    And user enter his correct login information
    And user click the Submit button
    Then user should receive Username  and password
    Given user on the login page


    Given User fill the details For Login
    When User click on Login button
    Then User will be logged in successfully