package cucumberTest;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import page.DubizzlePage;

/**
 * Created by buddyarifin on 1/31/17.
 */
public class StepDefs {
    private DubizzlePage dubizzlePage = new DubizzlePage(BaseAcceptanceTest.driver);

    @Given("^I open website dublizze$")
    public void  i_open_website_dublizze() {
        dubizzlePage.iOpenWebsiteDubizzle();
    }

    @When("^I click property categories$")
    public void i_click_property_categories() {
        dubizzlePage.clickPropertyCateogory();
    }

    @And("^I am on property category listing$")
    public void  i_am_on_property_category_listing() {
        dubizzlePage.verifyLandedToListing();
    }

    @When("^I short listing by (.*)$")
    public void i_short_listing_by(String short_by) {
        dubizzlePage.clickSortByDropDown();
        dubizzlePage.chooseOptions(short_by);
        dubizzlePage.verifyListingAlreadyUnload();
    }

    @And("^I click the first result to go to details page$")
    public void i_click_the_first_result_to_go_to_details_page() {
        dubizzlePage.clickFirstResult();
    }

    @And("^I landed on Details Page$")
    public void i_landed_on_Details_Page() {
        dubizzlePage.verifyLandedToDetailPage();
    }

    @And("^I back to listing$")
    public void i_back_to_listing() {
        dubizzlePage.clickBackButton();
    }

    @Then("^I Should see the result not change$")
    public void i_Should_see_the_result_not_change() {
        dubizzlePage.verifyResultNotChange();
    }


}
