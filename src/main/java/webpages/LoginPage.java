package webpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import utilities.BrowserActions;

public class LoginPage extends BasePage{

    private By emailInputTextField = By.xpath("//input[@id = 'Email']") ;
    private By passwordInputTextField = By.xpath("//input[@id = 'Password']") ;
    private By rememberMeCheckBox = By.xpath("//input[@id = 'RememberMe']") ;
    private By logInButton = By.xpath("//button[@class = 'button-1 login-button']") ;
    private By emailErrorMessageText = By.xpath("//span[@id = 'Email-error']") ;
    private By unsuccessfullLoginErrorMessageText = By.xpath("//div[@class = 'message-error validation-summary-errors']") ;
    public LoginPage(WebDriver driver) {
        super(driver);

    }
    public void enterTextInEmailTextField(String text){
        BrowserActions.enterTextInTextField(emailInputTextField,driver,text);
    }
    public void enterTextInPasswordTextField(String text){
        BrowserActions.enterTextInTextField(passwordInputTextField, driver,text);
    }
    public void clickOnLogInButton(){
        BrowserActions.clickOnButton(logInButton , driver);
    }
    public void unCheckRememberMeCheckBox(){
        BrowserActions.unCheckCheckBox(rememberMeCheckBox , driver);
    }
    public void checkRememberMeCheckBox(){
        BrowserActions.checkCheckBox(rememberMeCheckBox, driver);
    }

    public String getEmailErrorMessageText() {
        return BrowserActions.getElementText(emailErrorMessageText , driver) ;
    }
    public void fillLogInData(String email , String password , Boolean rememberMe){
        this.enterTextInEmailTextField(email);
        this.enterTextInPasswordTextField(password);
        if ( rememberMe ){
            this.checkRememberMeCheckBox();
        }
        else {
            this.unCheckRememberMeCheckBox();
        }
    }

    public String getUnsuccessfullLoginErrorMessageText() {
        return BrowserActions.getElementText(unsuccessfullLoginErrorMessageText , driver) ;
    }
}
