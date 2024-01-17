import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import webpages.HomePage;
import webpages.LoginPage;

public class SampleTest {
    WebDriver driver ;
    @BeforeClass
    public void setupFireFox(){
        WebDriverManager.firefoxdriver().setup();
    }
    @Test
    public void test1(){
        driver = new FirefoxDriver( );
        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com/");
        HomePage homePage = new HomePage(driver) ;
        homePage.clickOnLoginHeaderButton();
        LoginPage loginPage = new LoginPage(driver) ;
        loginPage.enterTextInEmailTextField("dasfa@gmail.com");
        loginPage.enterTextInPasswordTextField("dfas");
        loginPage.checkRememberMeCheckBox();
        loginPage.clickOnLogInButton();
    }
}
