package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.*;
import org.testng.Assert;

import java.sql.Driver;
import java.time.Duration;

public class ItemsPage {
    WebDriver driver;
    WebDriverWait wait;





    public ItemsPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(20));

    }
//    By MinPriceFilter = By.xpath("//*[@id=\"mz-filter-panel-0-0\"]/div/div[2]/input[1]");
//    By MaxPriceFilter = By.xpath("//*[@id=\"mz-filter-panel-0-0\"]/div/div[2]/input[2]");
//    By BrandFilter = By.xpath("//*[@id=\"mz-filter-panel-0-1\"]/div/div[1]/div/label");
//    By SearchFilter = By.xpath("//*[@id=\"mz-filter-panel-0-3\"]/div/input");
//    By AvailableFilter = By.xpath("//*[@id=\"mz-filter-panel-0-5\"]/div/div[1]/div/label");
//  By SizeFilter = By.xpath("//*[@id=\"mz-filter-panel-0-6\"]/div/div[1]/div/label"); if we want to choose the size

    By ProductList = By.xpath("//*[@id=\"mz-product-grid-image-68-212408\"]/div/div[1]/img");
    /// add products to cart
    By  Specification = By.xpath("//*[@id=\"entry_216814\"]/div[1]/div/ul/li[2]/a");
    By Review = By.xpath("//*[@id=\"entry_216814\"]/div[1]/div/ul/li[3]/a");
    By Custom = By.xpath("//*[@id=\"entry_216814\"]/div[1]/div/ul/li[3]/a");

    By Size = By.xpath("//*[@id=\"input-option236-216836\"]");

    By ChosenSize = By.xpath("//*[@id=\"input-option236-216836\"]/option[2]");

    By QuantityIncrease = By.xpath("//*[@id=\"entry_216841\"]/div/div[2]/button");
    //    By QuantityDecrease = By.xpath("//*[@id=\"entry_216841\"]/div/div[1]/button");
    By  CompareItem = By.xpath("//*[@id=\"entry_216844\"]/button");

    By AddToCartButton = By.xpath("//*[@id=\"entry_216842\"]/button");
    By CancelButton = By.xpath("//*[@id=\"notification-box-top\"]/div/div[1]/button/span");
    @Step("Open product from the product list")
    public void items() {

        wait.until(ExpectedConditions.visibilityOfElementLocated(ProductList)).click();



    }
    @Step("Add item to cart with specific options, size, and quantity, then cancel the notification, and review the item, if needed, and specification, and compare it with another item, and increase the quantity, and choose the size, and add it to the cart, and cancel the notification")
    public void AddToCart() {
        wait.until(ExpectedConditions.elementToBeClickable(Specification)).click();
        wait.until(ExpectedConditions.elementToBeClickable(Review)).click();


        WebElement Chosen = wait.until(ExpectedConditions.visibilityOfElementLocated(Size));

        Actions actions = new Actions(driver);
        actions.moveToElement(Chosen).perform();

        wait.until(ExpectedConditions.elementToBeClickable(ChosenSize)).click();
        driver.findElement(QuantityIncrease).click();
//        driver.findElement(QuantityDecrease).click(); only if we want to decrease the quantity
        driver.findElement(CompareItem).click();

        wait.until(ExpectedConditions.elementToBeClickable(AddToCartButton)).click();

//        driver.findElement(AddToCartButton).click();

        wait.until(ExpectedConditions.elementToBeClickable(CancelButton)).click();

    }

}
