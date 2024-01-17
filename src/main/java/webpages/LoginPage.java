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

    public void waitUntilAllWebElementsAreLocated(){
        driverWait.until(ExpectedConditions.visibilityOfElementLocated(emailInputTextField));
        driverWait.until(ExpectedConditions.visibilityOfElementLocated(passwordInputTextField));
        driverWait.until(ExpectedConditions.visibilityOfElementLocated(rememberMeCheckBox));
        driverWait.until(ExpectedConditions.visibilityOfElementLocated(loginHeaderButton));
    }
    public void enterTextInEmailTextField(String text){
        driver.findElement(emailInputTextField).sendKeys(text);
    }
    public void enterTextInPasswordTextField(String text){
        driver.findElement(passwordInputTextField).sendKeys(text);
    }
    public void clickOnLogInButton(){
        driver.findElement(logInButton).click();
    }
    public void unCheckRememberMeCheckBox(){
        WebElement checkBox =driver.findElement(rememberMeCheckBox) ;
        if (checkBox.isSelected() ){
            checkBox.click();
        }
    }
    public void checkRememberMeCheckBox(){
        WebElement checkBox =driver.findElement(rememberMeCheckBox) ;
        if ( !checkBox.isSelected() ){
            checkBox.click();
        }
    }
}
