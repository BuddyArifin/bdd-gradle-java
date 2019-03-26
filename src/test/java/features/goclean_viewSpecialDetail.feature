  Feature: Special Services : View special package detail

  Background: User go to Special page
    Given user login with account "fatur@golife.com" and password "golife123" to golife launchpad page
    And user is at go clean main page

  @Golife @Special @clear @quit
  Scenario Outline: User want to see each special package detail
    When user click "Special" at go-clean main page
    And user click <value> at special main page
    Then user will see <scenario> for see <value> detail with description <result> at special package detail
    Examples:
      | value             | scenario | result                                       |
      | "Paket Kost"      | "Valid"  | "Paket pembersihan kost"                     |
      | "Paket Apartemen" | "Valid"  | "Paket pembersihan apartemen type studio"    |
      | "Setrika"         | "Valid"  | "Layanan ini khusus untuk setrika & melipat" |
