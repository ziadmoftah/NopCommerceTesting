package webpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage extends BasePage{

    By emailInputTextField = By.xpath("//input[@id = 'Email']") ;
    By passwordInputTextField = By.xpath("//input[@id = 'Password']") ;
    By rememberMeCheckBox = By.xpath("//input[@id = 'RememberMe']") ;
    By logInButton = By.xpath("//button[@class = 'button-1 login-button']") ;

    public LoginPage(WebDriver driver) {
        super(driver);

    }
    public void enterTextInEmailTextField(String text){
        driverWait.until(ExpectedConditions.visibilityOfElementLocated(emailInputTextField)) ;
        driver.findElement(emailInputTextField).clear();
        driver.findElement(emailInputTextField).sendKeys(text);
    }
    public void enterTextInPasswordTextField(String text){
        driverWait.until(ExpectedConditions.visibilityOfElementLocated(passwordInputTextField)) ;
        driver.findElement(passwordInputTextField).click();
        driver.findElement(passwordInputTextField).sendKeys(text);
    }
    public void clickOnLogInButton(){
        driverWait.until(ExpectedConditions.elementToBeClickable(logInButton)) ;
        driver.findElement(logInButton).click();
    }
    public void unCheckRememberMeCheckBox(){
        driverWait.until(ExpectedConditions.elementToBeClickable(rememberMeCheckBox)) ;
        WebElement checkBox =driver.findElement(rememberMeCheckBox) ;
        if (checkBox.isSelected() ){
            checkBox.click();
        }
    }
    public void checkRememberMeCheckBox(){
        driverWait.until(ExpectedConditions.elementToBeClickable(rememberMeCheckBox)) ;
        WebElement checkBox =driver.findElement(rememberMeCheckBox) ;
        if ( !checkBox.isSelected() ){
            checkBox.click();
        }
    }
}
