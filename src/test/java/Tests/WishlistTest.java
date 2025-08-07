package Tests;

import io.qameta.allure.*;
import io.qameta.allure.testng.AllureTestNg;
import org.testng.annotations.Listeners;
import pages.*;
import base.BaseTest;
import org.testng.annotations.Test;

@Listeners({AllureTestNg.class})
@Epic("E-Commerce Application")
@Feature("Wishlist Management")

public class WishlistTest extends BaseTest {

    @Test(description = "User can add an item to the wishlist and manage it")
    @Story("Wishlist interaction flow")
    @Severity(SeverityLevel.NORMAL)
    @Description("This test verifies that a logged-in user can filter items, add an item to the wishlist, view it, add to cart, remove from wishlist, and continue browsing.")


    public void AddWishlistTest() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        FilterPage filterPage = new FilterPage(driver);
        ItemsPage itemsPage = new ItemsPage(driver);
        WishlistPage wishlistPage = new WishlistPage(driver);

        loginPage.goToLoginPage();
        loginPage.login("Salma.beyazid@gmail.com","12345678");
        homePage.home();

        filterPage.filter("98","2000", "cinema");
        itemsPage.items();
        wishlistPage.WishlistManagement();



    }






}
