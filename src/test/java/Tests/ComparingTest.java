package Tests;

import io.qameta.allure.*;
import io.qameta.allure.testng.AllureTestNg;
import org.testng.annotations.Listeners;
import pages.*;
import base.BaseTest;
import org.testng.annotations.Test;


@Epic("E-Commerce Application")
@Feature("Product Comparison and Cart Management")


public class ComparingTest extends BaseTest {

    @Test(description = "User can log in, filter items, compare two products, and manage the comparison list.")
    @Story("User compares two products and adds one to cart")
    @Severity(SeverityLevel.NORMAL)
    @Description("This test verifies the ability to log in, apply filters, compare two products, and add an item to the cart after comparison.")


    public void ComparingItemsTest() throws InterruptedException {
    LoginPage loginPage = new LoginPage(driver);
    HomePage homePage = new HomePage(driver);
    FilterPage filterPage = new FilterPage(driver);
    ComparingItemPage comparingItemPage = new ComparingItemPage(driver);
    ComparingPage comparingPage = new ComparingPage(driver);





        loginPage.goToLoginPage();
        loginPage.login("Salma.beyazid@gmail.com","12345678");
        homePage.home();
        filterPage.filter("98","2000", "Apple");
//        comparingItemPage.items();
        comparingItemPage.Item1Compare();
        driver.navigate().back();
        comparingItemPage.Item2Compare();

        comparingPage.ComparingItems();



    }

}
