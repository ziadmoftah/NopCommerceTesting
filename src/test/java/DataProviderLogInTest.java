import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import webpages.LoginPage;

public class DataProviderLogInTest extends BaseTest{
    @DataProvider(name = "InValidLoginInData")
    public Object[][] provideLoginInData(){
        return new Object[][] {
                {"ab@gmail.com" , "123456" },
                {"acb@gmail.com" , ""}
        } ;
    }

    @Test(dataProvider = "InValidLoginInData")
    public void VerifyNotLoggedInWhenInvalidData(String username , String password){
        homePage.clickOnLoginHeaderButton();
        LoginPage loginPage = new LoginPage(driver) ;
        loginPage.fillLogInData(username , password , true);
        loginPage.clickOnLogInButton();
        softAssert.assertTrue(loginPage.getUnsuccessfullLoginErrorMessageText().contains("Login was unsuccessful. Please correct the errors and try again."));
        softAssert.assertAll();
    }
}
