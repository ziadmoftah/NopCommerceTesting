import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.asserts.SoftAssert;
import utilities.BrowserSetup;
import webpages.HomePage;

public class BaseTest {
    WebDriver driver ;
    HomePage homePage ;
    SoftAssert softAssert ;
    @BeforeMethod
    public void driverSetup(){
        softAssert = new SoftAssert();
        driver = BrowserSetup.getWebDriver("firefox" , "https://demo.nopcommerce.com/") ;
        homePage = new HomePage(driver) ;
    }

    @AfterMethod
    public void driverClose(){
        driver.close();
    }
}
