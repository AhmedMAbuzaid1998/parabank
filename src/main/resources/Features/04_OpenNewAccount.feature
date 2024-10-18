Feature: Open New Account


  @Test
  Scenario: Customer open new account

    And User fill the details For Login
    When User click on Login button


    Given Customer navigate to Open New Account page
    And  Chose the  type of Account would open
    And Chose choose an existing account to transfer funds into the new account
    When the Customer click on Open New Account button
    Then The Customer should be redirected to the Confirmation page
    And The Confirmation page should display the account number

