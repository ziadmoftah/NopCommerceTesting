import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.asserts.SoftAssert;
import webpages.HomePage;

public class BaseTest {
    WebDriver driver ;
    WebDriverWait driverWait ;
    HomePage homePage ;
    SoftAssert softAssert ;
    @BeforeClass
    public void setupFireFox(){
        WebDriverManager.firefoxdriver().setup();
    }
    @BeforeMethod
    public void driverSetup(){
        softAssert = new SoftAssert();
        driver = new FirefoxDriver() ;
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();
        homePage = new HomePage(driver) ;
    }

    @AfterMethod
    public void driverClose(){
        driver.close();
    }
}
