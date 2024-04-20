Feature: Multiple data

  Scenario: Login with lots of data
    Given User logged in to the application
    When User enters lots of value to calculator
      | Tahsin | Syeed | 889 |
      | Tom    | Paul  | 112 |
      | Jordan | Smith | 554 |
    Then User see results for each sets of data
