Feature: SignIn

  @Test
  Scenario: Customer signed in with his account username and password

    Given User fill the details For Login
    When User click on Login button
    Then User will be logged in successfully