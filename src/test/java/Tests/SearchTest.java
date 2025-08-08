package Tests;

import io.qameta.allure.*;
import io.qameta.allure.testng.AllureTestNg;
import org.testng.annotations.Listeners;
import pages.*;
import base.BaseTest;
import org.testng.annotations.Test;

@Listeners({AllureTestNg.class})
@Epic("E-Commerce Application")
@Feature("Search Item")

public class SearchTest extends BaseTest {

    @Test(description = "User can add an item to the wishlist and manage it")
    @Story("Search Item flow")
    @Severity(SeverityLevel.NORMAL)
    @Description("This test verifies that a logged-in user can search for item")


    public void SearchForItem() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        SearchPage searchPage = new SearchPage(driver);


        loginPage.goToLoginPage();
        loginPage.login("Salma.beyazid@gmail.com","12345678");
        homePage.home();
        searchPage.searchForItem("ipod", "ipod Touch");


    }






}
