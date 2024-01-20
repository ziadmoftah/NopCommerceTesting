import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import webpages.HomePage;
import webpages.RegisterPage;

public class RegisterPageTest extends BaseTest{
    // positive scenario
    @Test
    public void test001(){
        homePage.clickOnRegisterHeaderButton();
        RegisterPage registerPage = new RegisterPage(driver) ;
        registerPage.enterTextInFirstNameInputTextField("ziad");
        registerPage.enterTextInLastNameInputTextField("moftah");
        registerPage.selectBirthDayFromDropdownList("1");
        registerPage.selectBirthMonthFromDropdownList("January");
        registerPage.selectBirthYearFromDropdownList("2000");
        registerPage.enterTextInCompanyNameInputTextField("Ahlan");
        registerPage.enterTextInEmailInputTextField("acb@gmail.com");
        registerPage.enterTextInPasswordInputTextField("123456");
        registerPage.enterTextInConfirmPasswordInputTextField("123456");
        registerPage.selectGenderRadioButton(0);
        registerPage.checkNewsLetterCheckBox();
        registerPage.clickOnRegisterButton();

        WebElement successMessage = driver.findElement(By.className("result")) ;
        softAssert.assertEquals(successMessage.getText() , "Your registration completed", "Registration was not successful");

        softAssert.assertAll();
    }
    // leave first name field empty
    @Test
    public void test002(){
        homePage.clickOnRegisterHeaderButton();
        RegisterPage registerPage = new RegisterPage(driver) ;
        registerPage.enterTextInLastNameInputTextField("moftah");
        registerPage.selectBirthDayFromDropdownList("1");
        registerPage.selectBirthMonthFromDropdownList("January");
        registerPage.selectBirthYearFromDropdownList("2000");
        registerPage.enterTextInCompanyNameInputTextField("Ahlan");
        registerPage.enterTextInEmailInputTextField("acb@gmail.com");
        registerPage.enterTextInPasswordInputTextField("123456");
        registerPage.enterTextInConfirmPasswordInputTextField("123456");
        registerPage.selectGenderRadioButton(0);
        registerPage.checkNewsLetterCheckBox();
        registerPage.clickOnRegisterButton();
        softAssert.assertEquals(registerPage.getFirstNameErrorMessageText() , "First name is required.");
        softAssert.assertAll();
    }
}
