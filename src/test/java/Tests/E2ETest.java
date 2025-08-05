package Tests;

import pages.*;
import base.BaseTest;
import org.testng.annotations.Test;

//@Listeners({AllureTestNg.class})
//@Epic("Swag Labs Automation")
//@Feature("E2E Purchase Flow")

public class E2ETest extends BaseTest {

    @Test


    public void flowPurchaseTest() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        ItemsPage itemsPage = new ItemsPage(driver);
        CheckoutPage checkoutPage = new CheckoutPage(driver);



        loginPage.goToLoginPage();
        loginPage.login("Salma.beyazid@gmail.com","12345678");
        homePage.home();
        itemsPage.items("98","2000", "cinema");
        itemsPage.AddToCart();
        checkoutPage.ProceedToCheckout("alian","aramz","Almaz","street 123","Maadi","12345","\"Please deliver between 5 PM and 7 PM.");






    }






}
