package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.*;
import org.testng.Assert;

import java.time.Duration;

public class WishlistPage {
    WebDriver driver;
    WebDriverWait wait;
    By AddToWishlistButton = By.xpath("//*[@id=\"image-gallery-216811\"]/div[1]/button");
    By CancelButton = By.xpath("//*[@id=\"notification-box-top\"]/div/div[1]/button/span");
    By WishlistIcon = By.xpath("//*[@id=\"notification-box-top\"]/div/div[2]/a");

    By AddToCArtButton = By.xpath("//*[@id=\"content\"]/div[1]/table/tbody/tr[1]/td[6]/button");
    By RemoveButton = By.xpath("//*[@id=\"content\"]/div[1]/table/tbody/tr[2]/td[6]/a");
    By ContinueButton = By.xpath("//*[@id=\"content\"]/div[2]/div/a");
    public WishlistPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(20));

    }
    @Step("Manage Wishlist: Add item, view wishlist, move to cart, remove item, and continue")
    public void WishlistManagement() {

        wait.until(ExpectedConditions.elementToBeClickable(AddToWishlistButton)).click();

//        wait.until(ExpectedConditions.elementToBeClickable(CancelButton)).click();


        wait.until(ExpectedConditions.elementToBeClickable(WishlistIcon)).click();
        wait.until(ExpectedConditions.elementToBeClickable(AddToCArtButton)).click();
        wait.until(ExpectedConditions.elementToBeClickable(RemoveButton)).click();
        wait.until(ExpectedConditions.elementToBeClickable(ContinueButton)).click();
//        Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"content\"]/h1")).getText().contains("Your Wish List is empty."));

    }










}
