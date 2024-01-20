package webpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.BrowserActions;

public class BasePage {
    WebDriver driver ;
    By registerHeaderButton = By.xpath("//a[@class = 'ico-register']") ;
    By loginHeaderButton = By.xpath("//a[@class = 'ico-login']");

    By myAccountHeaderButton = By.xpath("//a[@class = 'ico-account']") ;
    By logOutHeaderButton = By.xpath("//a[@class = 'ico-logout']") ;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }
    public void clickOnLoginHeaderButton(){
        BrowserActions.clickOnButton(loginHeaderButton , driver);
    }
    public void clickOnRegisterHeaderButton(){
        BrowserActions.clickOnButton(registerHeaderButton , driver);
    }

    public void clickOnMyAccountHeaderButton(){
        BrowserActions.clickOnButton(myAccountHeaderButton , driver);
    }
    public void clickOnLogOutHeaderButton(){
        BrowserActions.clickOnButton(logOutHeaderButton , driver);
    }
    public Boolean isUserLoggedIn(){
        return BrowserActions.getElementText(myAccountHeaderButton , driver).equals("My account")  ;
    }
}
