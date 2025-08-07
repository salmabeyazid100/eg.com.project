package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.*;
import org.testng.Assert;

import java.sql.Driver;
import java.time.Duration;

public class FilterPage {
    WebDriver driver;
    WebDriverWait wait;





    public FilterPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(20));

    }
    By MinPriceFilter = By.xpath("//*[@id=\"mz-filter-panel-0-0\"]/div/div[2]/input[1]");
    By MaxPriceFilter = By.xpath("//*[@id=\"mz-filter-panel-0-0\"]/div/div[2]/input[2]");
    By BrandFilter = By.xpath("//*[@id=\"mz-filter-panel-0-1\"]/div/div[1]/div/label");
    By SearchFilter = By.xpath("//*[@id=\"mz-filter-panel-0-3\"]/div/input");
    By AvailableFilter = By.xpath("//*[@id=\"mz-filter-panel-0-5\"]/div/div[1]/div/label");
//    By SizeFilter = By.xpath("//*[@id=\"mz-filter-panel-0-6\"]/div/div[1]/div/label"); if we want to choose the size

    By ProductList = By.xpath("//*[@id=\"mz-product-grid-image-68-212408\"]/div/div[1]/img");
    /// add products to cart
    @Step("Apply filters with min price: {minPrice}, max price: {maxPrice}, and search term: {searchTerm}")
    public void filter(String minPrice, String maxPrice, String searchTerm) {
        driver.findElement(MinPriceFilter).clear();
        driver.findElement(MinPriceFilter).sendKeys(minPrice);
        driver.findElement(MaxPriceFilter).clear();
        driver.findElement(MaxPriceFilter).sendKeys(maxPrice);
        wait.until(ExpectedConditions.elementToBeClickable(BrandFilter)).click();
        wait.until(ExpectedConditions.elementToBeClickable(SearchFilter)).sendKeys(searchTerm);
        wait.until(ExpectedConditions.elementToBeClickable(AvailableFilter)).click();
//    wait.until(ExpectedConditions.elementToBeClickable(SizeFilter)).click();
    }
}
