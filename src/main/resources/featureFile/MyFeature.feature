Feature: Login function

  Background: User is in Homepage
    Given "Tahsin" navigates to homepage

  Scenario: User login
    When User enters username as "T"
    And User enters password as "password"
    And clicks login button
    Then User is able to login to the MyProfile page
    And User clicks on logout

  Scenario: User false login
    When UserABCD types username as "A"
    And UserABCD types password as "password123"
    And clicks login buttons
    Then User is not able to login to the MyProfile page
