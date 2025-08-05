package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.*;
import org.testng.Assert;

import java.time.Duration;

public class MyAccountPage {
    WebDriver driver;
    WebDriverWait wait;


    By EditAccountLink = By.linkText("Edit your account information");
    By FirstNameField = By.id("input-firstname");
    By LastNameField = By.id("input-lastname");
    By EmailField = By.id("input-email");
    By TelephoneField = By.id("input-telephone");
    By ContinueButton = By.xpath("//*[@id=\"content\"]/form/div/div/input");
    By SuccessMessage = By.xpath("//div[contains(@class, 'alert-success') and contains(text(), 'Success: Your account has been successfully updated')]\n");
    By ChangePasswordLink = By.linkText("Change your password");
    By PasswordField = By.id("input-password");
    By ConfirmPasswordField = By.xpath("//*[@id=\"input-confirm\"]");
    By ChangePasswordButton = By.xpath("//*[@id=\"content\"]/form/div[3]/div[2]/input");
    By PasswordSuccessMessage = By.xpath("//*[@id=\"account-account\"]/div[1]");
    By AddressBookLink = By.xpath("//*[@id=\"column-right\"]/div/a[4]");
    By AddNewAddressButton = By.xpath("//*[@id=\"content\"]/div[2]/div[2]/a");
    By FirstNameAddressField = By.id("input-firstname");
    By LastNameAddressField = By.id("input-lastname");
    By CompanyAddressField = By.id("input-company");
    By Address1Field = By.id("input-address-1");
    By Address2Field = By.id("input-address-2");
    By CityField = By.id("input-city");
    By PostCodeField = By.id("input-postcode");
    By CountryDropdown = By.id("input-country");
    By CountryOption = By.xpath("//option[contains(text(), 'Egypt')]");
    By RegionDropdown = By.id("input-zone");
    By RegionOption = By.xpath("//*[@id=\"input-zone\"]/option[12]");
    By AddAddressButton = By.xpath("//*[@id=\"content\"]/form/div/div/input");
    By BackButton = By.xpath("//*[@id=\"content\"]/div[2]/div[1]/a");
    By AddressSuccessMessage = By.xpath("//*[@id=\"content\"]/h1");
    //    By WishlistLink = By.linkText("Wish List");
//    By MyOrdersLink = By.linkText("My Orders");
//    By AddToCArtButton = By.xpath("//*[@id=\"entry_217825\"]/a/div[1]");
//    By RemoveButton = By.xpath("//*[@id=\"entry_217825\"]/div[2]/button");
//
    By SbscriptionLink = By.xpath("//*[@id=\"column-right\"]/div/a[13]");
    By SubscriptionNo = By.xpath("//*[@id=\"content\"]/form/fieldset/div/div/div[2]/label");
    By SubscriptionContinueButton = By.xpath("//*[@id=\"content\"]/form/div/div[2]/input");
    By LogoutLink = By.xpath("//*[@id=\"column-right\"]/div/a[14]");
    public MyAccountPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(20));

    }
    public void MyAccountOptions(String NewFirstName, String NewLastName, String email, String Telephone, String newpassword, String confirmPassword , String company, String Address1, String Address2, String City, String code) {

        wait.until(ExpectedConditions.elementToBeClickable(EditAccountLink)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(FirstNameField));
        driver.findElement(FirstNameField).clear();
        driver.findElement(FirstNameField).sendKeys(NewFirstName);
        driver.findElement(LastNameField).clear();
        driver.findElement(LastNameField).sendKeys(NewLastName);
        driver.findElement(EmailField).clear();
        driver.findElement(EmailField).sendKeys(email);
        driver.findElement(TelephoneField).clear();
        driver.findElement(TelephoneField).sendKeys(Telephone);
        driver.findElement(ContinueButton).click();
//        Assert.assertEquals(driver.findElement(SuccessMessage).getText(), "Success: Your account has been successfully updated.", "Account update failed");
        wait.until(ExpectedConditions.elementToBeClickable(ChangePasswordLink)).click();

        driver.findElement(PasswordField).sendKeys(newpassword);
        driver.findElement(ConfirmPasswordField).sendKeys(confirmPassword);
        driver.findElement(ChangePasswordButton).click();
//        Assert.assertEquals(driver.findElement(PasswordSuccessMessage).getText(), "Success: Your password has been successfully updated.", "password update failed");
        wait.until(ExpectedConditions.elementToBeClickable(AddressBookLink)).click();

        wait.until(ExpectedConditions.elementToBeClickable(AddNewAddressButton)).click();
        driver.findElement(FirstNameAddressField).sendKeys(NewFirstName);
        driver.findElement(LastNameAddressField).sendKeys(NewLastName);
        driver.findElement(CompanyAddressField).sendKeys(company);
        driver.findElement(Address1Field).sendKeys(Address1);
        driver.findElement(Address2Field).sendKeys(Address2);
        driver.findElement(CityField).sendKeys(City);
        driver.findElement(PostCodeField).sendKeys(code);
        Select countrySelect = new Select(driver.findElement(CountryDropdown));
        countrySelect.selectByVisibleText("Egypt");
        wait.until(ExpectedConditions.textToBePresentInElementLocated(RegionDropdown, "Qina"));
        Select regionSelect = new Select(driver.findElement(RegionDropdown));
        regionSelect.selectByVisibleText("Qina");
        driver.findElement(AddAddressButton).click();
//        Assert.assertEquals(driver.findElement(AddressSuccessMessage).getText(), "Your address has been successfully added to your address book.", "Address addition failed");
        driver.findElement(BackButton).click();
        driver.findElement(SbscriptionLink).click();
        wait.until(ExpectedConditions.elementToBeClickable(SubscriptionNo)).click();
        driver.findElement(SubscriptionContinueButton).click();
//        Assert.assertEquals(driver.findElement(SuccessMessage).getText(), "Success: Your subscription has been successfully updated.", "Subscription update failed");
        driver.findElement(LogoutLink).click();

    }










    public void home() {
    }

}
