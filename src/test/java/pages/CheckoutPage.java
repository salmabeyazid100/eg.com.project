package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.*;
import org.testng.Assert;

import java.sql.Driver;
import java.time.Duration;

public class CheckoutPage {
    WebDriver driver;
    WebDriverWait wait;






    public CheckoutPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(20));


    }

    By CartButton = By.xpath("//*[@id=\"entry_217825\"]/a/div[1]");
    By ProceedToCheckoutButton = By.xpath("//*[@id=\"entry_217851\"]/a");
    By FirstNameField = By.id("input-payment-firstname");
    By LastNameField = By.id("input-payment-lastname");
    By CompanyField = By.id("input-payment-company");
    By Address1Field = By.id("input-payment-address-1");
    //    By Address2Field = By.id("input-payment-address-2"); if there is another address
    By CityField = By.id("input-payment-city");
    By PostCodeField = By.id("input-payment-postcode");
    By CountryDropdown = By.id("input-payment-country");
    By CountryOption = By.xpath("//option[contains(text(), 'Egypt')]");
    By RegionDropdown = By.id("input-payment-zone");
    By RegionOption = By.xpath("//*[@id=\"input-payment-zone\"]/option[12]");
    //    By CouponCodeField = By.id("input-coupon");
//    By ApplyCouponButton = By.xpath("//*[@id=\"button-coupon\"]");
    By CommentsField = By.id("input-comment");
    By TermsCheckbox = By.xpath("//*[@id=\"form-checkout\"]/div/div[2]/div/div[5]/label");
    By ContinueButton = By.id("button-save");
    By ConfirmOrderButton = By.id("button-confirm");



    public void ProceedToCheckout(String firstName, String lastName, String company, String address1, String city, String postcode, String comment) {
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.PAGE_UP).perform();
        wait.until(ExpectedConditions.elementToBeClickable(CartButton)).click();
        wait.until(ExpectedConditions.elementToBeClickable(ProceedToCheckoutButton)).click();

//        driver.findElement(FirstNameField).sendKeys(firstName);
//        driver.findElement(LastNameField).sendKeys(lastName);
//        driver.findElement(CompanyField).sendKeys(company);
//        driver.findElement(Address1Field).sendKeys(address1);
//        driver.findElement(CityField).sendKeys(city);
//        driver.findElement(PostCodeField).sendKeys(postcode);
//        Select countrySelect = new Select(driver.findElement(CountryDropdown));
//        countrySelect.selectByVisibleText("Egypt");
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        wait.until(ExpectedConditions.textToBePresentInElementLocated(RegionDropdown, "Qina"));
//
//        Select regionSelect = new Select(driver.findElement(RegionDropdown));
//        regionSelect.selectByVisibleText("Qina");
//        driver.findElement(CouponCodeField).sendKeys(couponCode);
//        driver.findElement(ApplyCouponButton).click();
        driver.findElement(CommentsField).sendKeys(comment);
        driver.findElement(TermsCheckbox).click();
        wait.until(ExpectedConditions.elementToBeClickable(ContinueButton)).click();
        wait.until(ExpectedConditions.elementToBeClickable(ConfirmOrderButton)).click();

    }

}
