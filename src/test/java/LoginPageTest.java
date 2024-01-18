import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import webpages.HomePage;
import webpages.LoginPage;

public class LoginPageTest extends BaseTest{
    @Test
    public void test001(){
        HomePage homePage = new HomePage(driver) ;
        homePage.clickOnLoginHeaderButton();
        LoginPage loginPage = new LoginPage(driver) ;
        loginPage.enterTextInEmailTextField("acb@gmail.com");
        loginPage.enterTextInPasswordTextField("123456");
        loginPage.checkRememberMeCheckBox();
        loginPage.clickOnLogInButton();
        driverWait = new WebDriverWait(driver , 20) ;
        driverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class = 'ico-account']"))) ;
        WebElement myAccountButton = driver.findElement(By.xpath("//a[@class = 'ico-account']")) ;
        softAssert.assertEquals(myAccountButton.getText() , "My account");
        softAssert.assertAll();
    }
    @Test
    public void test002(){
        HomePage homePage = new HomePage(driver) ;
        homePage.clickOnLoginHeaderButton();
        LoginPage loginPage = new LoginPage(driver) ;
        loginPage.enterTextInPasswordTextField("123456");
        loginPage.checkRememberMeCheckBox();
        loginPage.clickOnLogInButton();
        softAssert.assertEquals(loginPage.getEmailErrorMessageText() , "Please enter your email");
        softAssert.assertAll();
    }
}
