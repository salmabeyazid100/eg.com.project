package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.*;
import org.testng.Assert;

import java.time.Duration;

public class ComparingPage {
    WebDriver driver;
    WebDriverWait wait;


    public ComparingPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(20));

    }

    By CompareButton = By.xpath("//*[@id=\"entry_217823\"]/a/span");
    By RemoveButton = By.xpath("//*[@id=\"content\"]/table/tbody[3]/tr/td[2]/a");


//    By ContinueButton = By.xpath("//*[@id=\"content\"]/div/div/a");

    @Step("Compare items , add to cart, removing an item")
    public void ComparingItems() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, 0);");
        wait.until(ExpectedConditions.elementToBeClickable(CompareButton)).click();


        wait.until(ExpectedConditions.elementToBeClickable(RemoveButton)).click();

        WebElement AddToCart = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@class='btn btn-primary btn-block' and @value='Add to Cart']")));
        AddToCart.click();



//        wait.until(ExpectedConditions.elementToBeClickable(ContinueButton)).click();  if all items removed



    }
}