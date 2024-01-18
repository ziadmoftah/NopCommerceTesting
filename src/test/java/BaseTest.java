import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.asserts.SoftAssert;

public class BaseTest {
    WebDriver driver ;
    WebDriverWait driverWait ;
    SoftAssert softAssert ;
    @BeforeClass
    public void setupFireFox(){
        WebDriverManager.firefoxdriver().setup();
    }
    @BeforeMethod
    public void softAssertSetup(){
        softAssert = new SoftAssert() ;
    }
    @BeforeMethod
    public void driverSetup(){
        driver = new FirefoxDriver() ;
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void driverClose(){
        driver.close();
    }
}
