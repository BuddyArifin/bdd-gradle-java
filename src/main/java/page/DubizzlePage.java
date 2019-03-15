package page;

import com.google.common.base.Function;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;

import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Created by buddyarifin on 1/31/17.
 */
public class DubizzlePage {
    private WebDriver driver;
//    private String baseUrl = "https://dubai.dubizzle.com";
    private String baseUrl = "https://www.youtube.com/";
    private static String ads;


    @FindBy(css = "a[href='#property-for-rent-modal']")
    private WebElement viewAllProperty;

    @FindBy(css = "a[href='/property-for-rent/residential/']")
    private WebElement residentialUnitsForRent;

    @FindBy(id = "id_sort_by")
    private WebElement sortByOptions;

    @FindBys({
            @FindBy(css = "#id_sort_by > option")
    })
    private List<WebElement> options;

    @FindBy(css = "div#listing-details-list")
    private WebElement detailsAds;

    @FindBys({
            @FindBy(css = "span.title")
    })
    private List<WebElement> firstAds;

    public DubizzlePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void iOpenWebsiteDubizzle() {
        driver.get(baseUrl);
//        Assert.assertTrue(isElementPresent(viewAllProperty),
//                "Property Category Not displayed");
    }

    public void clickPropertyCateogory() {
        viewAllProperty.click();
        residentialUnitsForRent.click();
    }

    public void verifyLandedToListing() {
        Assert.assertTrue(isElementPresent(sortByOptions),
                "Sort By Button not displayed");
    }

    public void clickSortByDropDown() {
        sortByOptions.click();
        Assert.assertTrue(isElementPresent(options.get(0)),
                "First Option of Sort By not displayed");

    }

    public void chooseOptions(String sort_option) {

        for (WebElement option : options) {
            if (option.getText().equalsIgnoreCase(sort_option)){
                option.click();
                break;
            }
        }
    }

    public void clickFirstResult() {
        setAds(firstAds.get(0).getText());
        firstAds.get(0).click();
    }

    public void clickBackButton() {
        driver.navigate().back();
    }

    public Boolean isElementPresent(WebElement element) {
        try {
            Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                    .withTimeout(60, TimeUnit.SECONDS)
                    .pollingEvery(2, TimeUnit.SECONDS)
                    .ignoring(NoSuchElementException.class);
            return wait.until(new Function<WebDriver, Boolean>() {
                @Override
                public Boolean apply(WebDriver driver) {
                    return element.isDisplayed();
                }
            });
        }catch (NoSuchElementException | TimeoutException e){
            return false;
        }
    }

    public void verifyLandedToDetailPage() {
        Assert.assertTrue(isElementPresent(detailsAds),
                "User not landed on details page, details info not found");
    }

    public void verifyListingAlreadyUnload() {
            int nanos = 2 * 1000;
            try {
                Thread.sleep(nanos);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
    }

    public static String getAds() {
        return ads;
    }

    public static void setAds(String ads) {
        DubizzlePage.ads = ads;
    }

    public void verifyResultNotChange() {
        Assert.assertEquals(firstAds.get(0).getText(), getAds());
    }
}
