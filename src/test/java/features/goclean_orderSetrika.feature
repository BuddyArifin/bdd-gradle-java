Feature: Special Services : Order Setrika

  Background: User go to Special page
    Given user login with account "fatur@golife.com" and password "golife123" to golife launchpad page
    And user is at go clean main page
    When user click "Setrika" at special main page
    Then user will see "Estimasi pengerjaan" at special detail page

  @Golife @Special @setrika @clear @quit
  Scenario Outline: User want to order each special package detail for 1 hours
    When user click <type> at go-clean main page
    And user click <value> at special main page
    Then user will see <scenario> for see <value> detail with description <result> at special package detail

    Examples:
      | type    | value       | scenario | result                     |
      | "1 jam" | "Wanita"    | "Valid"  | "Rp 35.000"                |
      | "1 jam" | "Pria"      | "Valid"  | "Rp 35.000"                |
      | "1 jam" | "Tidak ada" | "Valid"  | "Rp 35.000"                |
