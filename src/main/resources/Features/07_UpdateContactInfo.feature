Feature: update

  @Test

  Scenario: updating some field

    And User fill the details For Login
    When User click on Login button

    Given user sign in and navigate to update contact info
    And change some field(last name and phone)
    When click update profile button
    Then verify updated contact info