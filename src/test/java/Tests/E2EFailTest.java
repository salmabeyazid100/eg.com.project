package Tests;

import pages.*;
import base.BaseTest;
import org.testng.annotations.Test;

//@Listeners({AllureTestNg.class})
//@Epic("Swag Labs Automation")
//@Feature("E2E Purchase Flow")

public class E2EFailTest extends BaseTest {

    @Test


    public void flowPurchaseTest() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        FilterPage filterPage = new FilterPage(driver);
        ItemsPage itemsPage = new ItemsPage(driver);
        CheckoutPage checkoutPage = new CheckoutPage(driver);



        loginPage.goToLoginPage();
        loginPage.login("Salma.beyazid@gmail.com","12345678");
        homePage.home();
        filterPage.filter("98","2000", "cinema");
        itemsPage.item2();
        itemsPage.FailingTest();
        checkoutPage.ProceedToCheckoutFailing();
        checkoutPage.verifyNoStockErrorMessage();






    }









}
