
Feature: Special Services : Order Cuci motor

  Background: User go to Special page
    Given user login with account "fatur@golife.com" and password "golife123" to golife launchpad page
    And user is at go auto main page
    When user click "Cuci Motor" at go-auto main page
    Then user will see "Detail Layanan" at go-auto detail page

  @Golife @Special @setrika @clear @quit
  Scenario: User want to order cuci motor
    When user click "lanjut" button at go-auto main page
    Then user will see "favorit" list
