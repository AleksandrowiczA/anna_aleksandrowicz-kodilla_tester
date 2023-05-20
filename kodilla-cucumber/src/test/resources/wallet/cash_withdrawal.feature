Feature: Cash Withdrawal

  Scenario: Successful withdrawal from a wallet
    Given I have deposited $200 in my wallet
    When I request $30
    Then $30 should be dispensed
    And the balance of my wallet should be $170

  Scenario: Attempting to withdraw more money than available in the wallet
    Given I have deposited $200 in my wallet
    When I request more money than available in the wallet
    Then No money should be dispensed

  Scenario: Attempting to deposit a negative amount
    Given I have deposited $200 in my wallet
    When I deposit a negative amount
    Then No money should be dispensed from the slot

  Scenario: Withdrawing $0 from the wallet
    Given I have deposited $200 in my wallet
    When I request $0
    Then No money should be dispensed from the slot