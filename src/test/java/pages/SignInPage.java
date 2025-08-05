package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.*;
import org.testng.Assert;

import java.time.Duration;

public class SignInPage {
    WebDriver driver;
    WebDriverWait wait;

    By myAccountMenu = By.linkText("My account");
    By registerLink = By.linkText("Register");

    public SignInPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }
    By  FirstNameField = By.id("input-firstname");
    By LastNameField = By.id("input-lastname");
    By EmailField = By.id("input-email");
    By TelephoneField = By.id("input-telephone");
    By PasswordField = By.id("input-password");
    By ConfirmPasswordField = By.id("input-confirm");
    By SubscribeYes = By.xpath("//label[@for='input-newsletter-yes']");
    By SubscribeNo = By.xpath("//label[@for='input-newsletter-no']");
    By PrivacyPolicyCheckbox = By.xpath("//*[@id=\"content\"]/form/div/div/div");
    By ContinueButton = By.xpath("//*[@id=\"content\"]/form/div/div/input");
    By Successmesg = By.xpath("//*[@id=\"content\"]/h1");
    public void goToRegisterPage() {
        WebElement account = wait.until(ExpectedConditions.visibilityOfElementLocated(myAccountMenu));

        Actions actions = new Actions(driver);
        actions.moveToElement(account).perform();

        WebElement register = wait.until(ExpectedConditions.elementToBeClickable(registerLink));
        register.click();
    }


    public void Register(String firstname, String lastname, String email,int telephone,String password,String confirmpassword) {
        driver.findElement(FirstNameField).sendKeys(firstname, Keys.TAB,
                lastname, Keys.TAB,
                email, Keys.TAB,
                String.valueOf(telephone), Keys.TAB,
                password, Keys.TAB,
                confirmpassword, Keys.TAB);
        driver.findElement(SubscribeYes).click();
        // or driver.findElement(SubscribeNo).click();
        driver.findElement(PrivacyPolicyCheckbox).click();
        driver.findElement(ContinueButton).click();
        Assert.assertEquals(Successmesg,"Your Account Has Been Created!", "Account creation didnt appear");
    }

}
