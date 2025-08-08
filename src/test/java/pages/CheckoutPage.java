package pages;

import io.qameta.allure.Step;
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
//Failing Test
    By Checkoutfailing = By.xpath("//*[@id=\"content\"]/div[2]/a[2]");






    @Step("Proceeding to checkout with data: {firstName} {lastName}, {company}, {address1}, {city}, {postcode}, comment: {comment}, and accepting terms, and conditions, and confirming the order")
    public void ProceedToCheckout(String firstName, String lastName, String company, String address1, String city, String postcode, String comment) {
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.PAGE_UP).perform();
        wait.until(ExpectedConditions.elementToBeClickable(CartButton)).click();
        wait.until(ExpectedConditions.elementToBeClickable(ProceedToCheckoutButton)).click();


        driver.findElement(CommentsField).sendKeys(comment);
        driver.findElement(TermsCheckbox).click();
        wait.until(ExpectedConditions.elementToBeClickable(ContinueButton)).click();
        wait.until(ExpectedConditions.elementToBeClickable(ConfirmOrderButton)).click();

    }
    @Step("Verify bug in the checkout process to buy stock item")
    public void ProceedToCheckoutFailing() {
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.PAGE_UP).perform();
        wait.until(ExpectedConditions.elementToBeClickable(CartButton)).click();
        wait.until(ExpectedConditions.elementToBeClickable(ProceedToCheckoutButton)).click();
        driver.findElement(Checkoutfailing).click();



    }
    @Step("Verify no stock error message appears for in-stock items")
    public void verifyNoStockErrorMessage() {
        boolean isMessageDisplayed;
        try {
            isMessageDisplayed = driver.findElement(By.xpath("//*[@id=\"checkout-cart\"]/div[1]")).isDisplayed();
        } catch (NoSuchElementException e) {
            isMessageDisplayed = false;
        }
        if (isMessageDisplayed) {
            System.out.println("BUG: Stock availability error message appeared for an in-stock item!");
        }
        Assert.assertFalse(isMessageDisplayed, "BUG: Stock availability error message appeared for an in-stock item!");
    }


}
