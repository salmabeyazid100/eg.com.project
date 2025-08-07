package Tests;

import io.qameta.allure.*;
import io.qameta.allure.testng.AllureTestNg;
import org.testng.annotations.Listeners;
import pages.*;
import base.BaseTest;
import org.testng.annotations.Test;

@Listeners({AllureTestNg.class})
@Epic("E-Commerce Application")
@Feature("My Account Management")

public class MyAccountTest extends BaseTest {

    @Test(description = "User can edit account info, change password, add address, update subscription, and logout")
    @Story("Update personal account settings")
    @Severity(SeverityLevel.NORMAL)
    @Description("This test ensures that a logged-in user can update account details, change password, add a new address, update newsletter subscription, and successfully log out.")


    public void AccountEditingTest() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        MyAccountPage myAccountTest1 = new MyAccountPage(driver);

        loginPage.goToLoginPage();
        loginPage.login("Salma.beyazid@gmail.com","12345678");
        myAccountTest1.MyAccountOptions("salma","aramz","Salma.beyazid@gmail.com","32564126", "12345678","12345678",
                "alin","sdfghjk","asdfgjk","maadi","653");




    }






}
