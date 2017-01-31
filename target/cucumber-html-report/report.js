$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("sortby.feature");
formatter.feature({
  "line": 3,
  "name": "Validate Dubizzle Sort By",
  "description": "",
  "id": "validate-dubizzle-sort-by",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 5,
  "name": "Search Result sorting should not change after selecting a result",
  "description": "",
  "id": "validate-dubizzle-sort-by;search-result-sorting-should-not-change-after-selecting-a-result",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 6,
  "name": "I open website dublizze",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I click property categories",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I am on property category listing",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I short listing by \u003csort_option\u003e",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "I click the first result to go to details page",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I landed on Details Page",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I back to listing",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I Should see the result not change",
  "keyword": "Then "
});
formatter.examples({
  "line": 16,
  "name": "",
  "description": "",
  "id": "validate-dubizzle-sort-by;search-result-sorting-should-not-change-after-selecting-a-result;",
  "rows": [
    {
      "cells": [
        "sort_option"
      ],
      "line": 17,
      "id": "validate-dubizzle-sort-by;search-result-sorting-should-not-change-after-selecting-a-result;;1"
    },
    {
      "cells": [
        "Oldest to Newest"
      ],
      "line": 18,
      "id": "validate-dubizzle-sort-by;search-result-sorting-should-not-change-after-selecting-a-result;;2"
    },
    {
      "cells": [
        "Newest to Oldest"
      ],
      "line": 19,
      "id": "validate-dubizzle-sort-by;search-result-sorting-should-not-change-after-selecting-a-result;;3"
    },
    {
      "cells": [
        "Price Lowest to Highest"
      ],
      "line": 20,
      "id": "validate-dubizzle-sort-by;search-result-sorting-should-not-change-after-selecting-a-result;;4"
    },
    {
      "cells": [
        "Price Highest to Lowest"
      ],
      "line": 21,
      "id": "validate-dubizzle-sort-by;search-result-sorting-should-not-change-after-selecting-a-result;;5"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 1769482507,
  "status": "passed"
});
formatter.scenario({
  "line": 18,
  "name": "Search Result sorting should not change after selecting a result",
  "description": "",
  "id": "validate-dubizzle-sort-by;search-result-sorting-should-not-change-after-selecting-a-result;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 6,
  "name": "I open website dublizze",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I click property categories",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I am on property category listing",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I short listing by Oldest to Newest",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "I click the first result to go to details page",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I landed on Details Page",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I back to listing",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I Should see the result not change",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefs.i_open_website_dublizze()"
});
formatter.result({
  "duration": 10167632853,
  "status": "passed"
});
formatter.match({
  "location": "StepDefs.i_click_property_categories()"
});
formatter.result({
  "duration": 162427547,
  "status": "passed"
});
formatter.match({
  "location": "StepDefs.i_am_on_property_category_listing()"
});
formatter.result({
  "duration": 13284693743,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Oldest to Newest",
      "offset": 19
    }
  ],
  "location": "StepDefs.i_short_listing_by(String)"
});
formatter.result({
  "duration": 13450355144,
  "status": "passed"
});
formatter.match({
  "location": "StepDefs.i_click_the_first_result_to_go_to_details_page()"
});
formatter.result({
  "duration": 35120753941,
  "status": "passed"
});
formatter.match({
  "location": "StepDefs.i_landed_on_Details_Page()"
});
formatter.result({
  "duration": 39418423,
  "status": "passed"
});
formatter.match({
  "location": "StepDefs.i_back_to_listing()"
});
formatter.result({
  "duration": 3879127507,
  "status": "passed"
});
formatter.match({
  "location": "StepDefs.i_Should_see_the_result_not_change()"
});
formatter.result({
  "duration": 48546674,
  "status": "passed"
});
formatter.after({
  "duration": 82415919,
  "status": "passed"
});
formatter.before({
  "duration": 1328649926,
  "status": "passed"
});
formatter.scenario({
  "line": 19,
  "name": "Search Result sorting should not change after selecting a result",
  "description": "",
  "id": "validate-dubizzle-sort-by;search-result-sorting-should-not-change-after-selecting-a-result;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 6,
  "name": "I open website dublizze",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I click property categories",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I am on property category listing",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I short listing by Newest to Oldest",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "I click the first result to go to details page",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I landed on Details Page",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I back to listing",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I Should see the result not change",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefs.i_open_website_dublizze()"
});
formatter.result({
  "duration": 7912806541,
  "status": "passed"
});
formatter.match({
  "location": "StepDefs.i_click_property_categories()"
});
formatter.result({
  "duration": 153016733,
  "status": "passed"
});
formatter.match({
  "location": "StepDefs.i_am_on_property_category_listing()"
});
formatter.result({
  "duration": 13558027471,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Newest to Oldest",
      "offset": 19
    }
  ],
  "location": "StepDefs.i_short_listing_by(String)"
});
formatter.result({
  "duration": 2244503798,
  "status": "passed"
});
formatter.match({
  "location": "StepDefs.i_click_the_first_result_to_go_to_details_page()"
});
