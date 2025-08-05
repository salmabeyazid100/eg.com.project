package Tests;

import pages.*;
import base.BaseTest;
import org.testng.annotations.Test;

//@Listeners({AllureTestNg.class})
//@Epic("Swag Labs Automation")
//@Feature("E2E Purchase Flow")

public class MyAccountTest extends BaseTest {

    @Test


    public void flowPurchaseTest() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        MyAccountPage myAccountTest1 = new MyAccountPage(driver);

        loginPage.goToLoginPage();
        loginPage.login("Salma.beyazid@gmail.com","12345678");
        myAccountTest1.MyAccountOptions("salma","aramz","Salma.beyazid@gmail.com","32564126", "12345678","12345678",
                "alin","sdfghjk","asdfgjk","maadi","653");




    }






}
