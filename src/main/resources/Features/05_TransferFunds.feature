Feature: Transfer Funds

  @Test
  Scenario: Customer Transfer Funds between two accounts



    And User fill the details For Login
    When User click on Login button

    Given Customer Navigate to Transfer Funds
    And Customer type the amount of transfer funds
    And select the account to transfer from and select the account to transfer to from drop list
    When Customer Click on transfer buttons
    Then The Customer should be redirected to the Funds Confirmation page

