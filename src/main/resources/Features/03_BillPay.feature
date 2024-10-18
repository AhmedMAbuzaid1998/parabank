Feature: Bill Pay

  @Test
  Scenario: User navigates to bill pay

    And User fill the details For Login
    When User click on Login button

    Given  User  navigates to bill pay page
    And User fill bill pay details
    When  User click on send payment
    Then the user will be redirected to the Confirmation page
