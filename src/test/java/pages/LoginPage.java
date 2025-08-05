package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.*;
import org.testng.Assert;

import java.time.Duration;

public class LoginPage {
    WebDriver driver;
    WebDriverWait wait;

    By myAccountMenu = By.linkText("My account");
    By loginLink = By.linkText("Login");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }
    By EmailField = By.id("input-email");
    By PasswordField = By.id("input-password");
    By LoginButton = By.xpath("//*[@id=\"content\"]/div/div[2]/div/div/form/input");






    public void goToLoginPage() {
        WebElement account = wait.until(ExpectedConditions.visibilityOfElementLocated(myAccountMenu));

        Actions actions = new Actions(driver);
        actions.moveToElement(account).perform();

        WebElement login = wait.until(ExpectedConditions.elementToBeClickable(loginLink));
        login.click();
    }


    public void login(String email, String password) {
        driver.findElement(EmailField).sendKeys(email, Keys.TAB,
                password, Keys.ENTER);



    }

}
