package Tests;

import pages.*;
import base.BaseTest;
import org.testng.annotations.Test;

//@Listeners({AllureTestNg.class})
//@Epic("Swag Labs Automation")
//@Feature("E2E Purchase Flow")

public class RegistrationTest extends BaseTest {

    @Test
//    @Story("user can complete successful purchase flow")
//    @Severity(SeverityLevel.CRITICAL)
//    @Description("This test verifies the end-to-end purchase flow on the Swag Labs website: It includes logging in -> adding an item to the cart -> proceeding to checkout -> completing the purchase.")


    public void flowPurchaseTest() throws InterruptedException {
        SignInPage signInPage1 = new SignInPage(driver);

        signInPage1.goToRegisterPage();
        signInPage1.Register("alian","aramz","alian.armaz@gmail.com",32564126,"12345678","12345678");


    }






}
