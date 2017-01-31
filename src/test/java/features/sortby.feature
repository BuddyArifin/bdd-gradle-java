

  Feature: Validate Dubizzle Sort By

    Scenario Outline: Search Result sorting should not change after selecting a result
      Given I open website dublizze
      When I click property categories
      And I am on property category listing
      When I short listing by <sort_option>
      And I click the first result to go to details page
      And I landed on Details Page
      And I back to listing
      Then I Should see the result not change


      Examples:
        | sort_option |
        | Oldest to Newest |
        | Newest to Oldest |
        | Price Lowest to Highest |
        | Price Highest to Lowest |