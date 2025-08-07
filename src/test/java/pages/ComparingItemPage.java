package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.*;
import org.testng.Assert;

import java.sql.Driver;
import java.time.Duration;

public class ComparingItemPage {
    WebDriver driver;
    WebDriverWait wait;





    public ComparingItemPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(20));

    }
    //*[@id="mz-product-grid-image-50-212408"]/div/div[1]/img
    By ProductList = By.xpath("//*[@id=\"mz-product-grid-image-62-212408\"]/div/div[1]/img");/// add products to cart
    By Product2List = By.xpath(" //*[@id=\"mz-product-grid-image-50-212408\"]/div/div[1]/img");/// add products to cart

    By  CompareItem = By.xpath("//button[contains(text(), 'Compare this Product')]");
    By RemoveNotification = By.xpath("//*[@id=\"notification-box-top\"]/div/div[1]/button");
//    public void items() {
//
//
//
//
//
//    }
@Step("Compare first item, click on it and add to compare list, then remove notification")
    public void Item1Compare() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(ProductList)).click();
        driver.findElement(CompareItem).click();
        wait.until(ExpectedConditions.elementToBeClickable(RemoveNotification)).click();


    }
    @Step("Compare first item, click on it and add to compare list, then remove notification")
    public void Item2Compare() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(Product2List)).click();
        driver.findElement(CompareItem).click();
        wait.until(ExpectedConditions.elementToBeClickable(RemoveNotification)).click();


    }
}
