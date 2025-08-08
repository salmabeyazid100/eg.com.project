package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.*;
import org.testng.Assert;

import java.sql.Driver;
import java.time.Duration;

public class SearchPage {
    WebDriver driver;
    WebDriverWait wait;





    public SearchPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(20));

    }
    By CategoriesMenu = By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div[1]/button");
    By CategoryOption = By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div[1]/div/a[4]");
    By SaerchField = By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div[2]/input");
    By SearchButton = By.xpath("//*[@id=\"search\"]/div[2]/button");
    By SearchField2 = By.xpath("//*[@id=\"input-search\"]");
    By Categories = By.xpath("//*[@id=\"entry_212457\"]/div/div[2]/select");
    By Category = By.xpath("//*[@id=\"entry_212457\"]/div/div[2]/select/option[2]");
    By SearchButton2 = By.xpath("//*[@id=\"button-search\"]");


    @Step("Search for specific item")
    public void searchForItem(String searchTerm, String SearchTerm2) {
        wait.until(ExpectedConditions.elementToBeClickable(CategoriesMenu)).click();
        wait.until(ExpectedConditions.elementToBeClickable(CategoryOption)).click();
        driver.findElement(SaerchField).clear();
        driver.findElement(SaerchField).sendKeys(searchTerm);
        wait.until(ExpectedConditions.elementToBeClickable(SearchButton)).click();
        driver.findElement(SearchField2).clear();
        wait.until(ExpectedConditions.visibilityOfElementLocated(SearchField2)).sendKeys(SearchTerm2);
        wait.until(ExpectedConditions.elementToBeClickable(Categories)).click();
        wait.until(ExpectedConditions.elementToBeClickable(Category)).click();
        wait.until(ExpectedConditions.elementToBeClickable(SearchButton2)).click();

    }

}
