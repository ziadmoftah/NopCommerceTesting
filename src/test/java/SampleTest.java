import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import webpages.HomePage;
import webpages.LoginPage;
import webpages.RegisterPage;

public class SampleTest extends BaseTest{

    @Test
    public void test1(){
        HomePage homePage = new HomePage(driver) ;
        homePage.clickOnLoginHeaderButton();
        LoginPage loginPage = new LoginPage(driver) ;
        loginPage.enterTextInEmailTextField("dasfa@gmail.com");
        loginPage.enterTextInPasswordTextField("dfas");
        loginPage.checkRememberMeCheckBox();
        loginPage.clickOnLogInButton();
    }
    @Test
    public void test2(){
        HomePage homePage = new HomePage(driver) ;
        homePage.clickOnRegisterHeaderButton();
        RegisterPage registerPage = new RegisterPage(driver) ;
        registerPage.enterTextInFirstNameInputTextField("ziad");
        registerPage.enterTextInLastNameInputTextField("moftah");
        registerPage.selectBirthDayFromDropdownList("1");
        registerPage.selectBirthMonthFromDropdownList("January");
        registerPage.selectBirthYearFromDropdownList("2000");
        registerPage.enterTextInCompanyNameInputTextField("Ahlan");
        registerPage.enterTextInEmailInputTextField("agb@gmail.com");
        registerPage.enterTextInPasswordInputTextField("123456");
        registerPage.enterTextInConfirmPasswordInputTextField("123456");
        registerPage.selectGenderRadioButton(0);
        registerPage.checkNewsLetterCheckBox();
        registerPage.clickOnRegisterButton();

    }
}
