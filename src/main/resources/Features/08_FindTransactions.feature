Feature: FindTransactions

  @Test

  Scenario: Find transaction by id

    And User fill the details For Login
    When User click on Login button

    And customer chose the account to get the transaction Id
    And customer navigate to find transaction page
    And customer fill the transaction Id
    And customer click on search id button
    And customer should see the transaction details


    When customer chose the account to get the transaction date
    And customer navigate to find transaction page
    And customer fill the transaction date
    And customer click on search date button
    Then customer should see the transaction details of this date

    And customer navigate to find transaction page
    And customer fill the transaction Date Range
    And customer click on search Date Range button
    Then customer should see the transaction details of this Date Range

    And customer navigate to find transaction page
    And customer fill the transaction Amount
    And customer click on search Amount button
    Then customer should see the transaction details of this Amount
