package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.*;
import org.testng.Assert;

import java.time.Duration;

public class HomePage {
    WebDriver driver;
    WebDriverWait wait;





    public HomePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(20));

    }

    By HomeButton = By.linkText("Home");
    By ItemCategory = By.xpath("//h4[contains(text(), 'Software')]");








    public void home() {

        wait.until(ExpectedConditions.elementToBeClickable(HomeButton)).click();
        WebElement item = wait.until(ExpectedConditions.visibilityOfElementLocated(ItemCategory));

        // Scroll into view
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", item);

        // Add a small wait to ensure any overlay animation finishes
        try {
            Thread.sleep(1000);  // Better to use FluentWait in real projects
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Click using JavaScript to bypass overlay issues
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", item);
    }

}
