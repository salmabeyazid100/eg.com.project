package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.HashMap;

import static javax.swing.UIManager.put;

public class BaseTest {


    protected WebDriver driver;


    @BeforeMethod
    public void setUp(){
//        driver = new ChromeDriver();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-info-bars");
        options.addArguments("--disable-notifications");
        options.addArguments("--disable-popups-blocking");
        options.addArguments("--disable-extensions");
        options.addArguments("--incognito");
        options.setExperimentalOption("prefs",new HashMap<String,Object>() {{
            put("credentials_enable_service", false);
            put("profile.password_manager_enabled", false);
        }});



        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://ecommerce-playground.lambdatest.io/index.php?route=common/home");

    }



//    @AfterMethod
//    public void tearDown() {
//        driver.quit();
//    }

}
