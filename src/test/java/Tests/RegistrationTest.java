package Tests;

import io.qameta.allure.*;
import io.qameta.allure.testng.AllureTestNg;
import org.testng.annotations.Listeners;
import pages.*;
import base.BaseTest;
import org.testng.annotations.Test;

@Listeners({AllureTestNg.class})
@Epic("E-Commerce Application")
@Feature("User Registration")

public class RegistrationTest extends BaseTest {

    @Test(description = "User can successfully register a new account")
    @Story("New user registration process")
    @Severity(SeverityLevel.CRITICAL)
    @Description("This test verifies that a new user can access the registration page, fill all required fields, agree to privacy policy, and successfully create an account.")

    public void UserRegistrationTest() throws InterruptedException {
        SignInPage signInPage1 = new SignInPage(driver);

        signInPage1.goToRegisterPage();
        signInPage1.Register("alian","aramz","alian.armaz@gmail.com",32564126,"12345678","12345678");


    }






}
