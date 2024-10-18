Feature: Request Loan
  @Test
  Scenario: Customer Request for a loan

    And User fill the details For Login
    When User click on Login button


    Given  Customer Navigate to request loan page
    And Customer fill the details For request loan
    And customer chose the account for Down payment
    Then Costumer click on Submit button
    And Customer see the success message
