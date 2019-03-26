Feature: Special Services : Order Cuci mobil

  Background: User go to Special page
    Given user login with account "fatur@golife.com" and password "golife123" to golife launchpad page
    And user is at go auto main page
    When user click "Cuci Mobil" at go-auto main page
    Then user will see "Pilihan Layanan" at go-auto detail page

  @Golife @Special @setrika @clear @quit
  Scenario Outline: User want to see cost each special package detail for 1 hours
    When user click <type> at go-auto main page
    Then user will see <scenario> case for see <type> amount <result> at special package detail
    Examples:
      |type              | scenario | result                     |
      | "cuci eksterior" | "Valid"  | "Rp 25.000"                |
      | "cuci reguler"   | "Valid"  | "Rp 35.000"                |
      | "Cuci & Wax"     | "Valid"  | "Rp 35.000"                |
