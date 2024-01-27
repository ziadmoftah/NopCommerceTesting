import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import webpages.LoginPage;

public class ParametrizedLoginTest extends BaseTest{
    @Parameters({"username", "password"})
    @Test
    public void logInUsingValidCredentials(String username, String password){
        homePage.clickOnLoginHeaderButton();
        LoginPage loginPage = new LoginPage(driver) ;
        loginPage.fillLogInData(username , password , true);
        loginPage.clickOnLogInButton();
        softAssert.assertTrue(homePage.isUserLoggedIn());
        softAssert.assertAll();
    }
}
