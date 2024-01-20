package webpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
    private static final int DEFAULT_WAIT_TIME_SECONDS = 5 ;
    WebDriver driver ;
    WebDriverWait driverWait ;
    By registerHeaderButton = By.xpath("//a[@class = 'ico-register']") ;
    By loginHeaderButton = By.xpath("//a[@class = 'ico-login']");

    By myAccountHeaderButton = By.xpath("//a[@class = 'ico-account']") ;
    By logOutHeaderButton = By.xpath("//a[@class = 'ico-logout']") ;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        driverWait = new WebDriverWait(this.driver , DEFAULT_WAIT_TIME_SECONDS) ;
    }
    public void clickOnLoginHeaderButton(){
        driverWait.until(ExpectedConditions.elementToBeClickable(loginHeaderButton)) ;
        driver.findElement(loginHeaderButton).click();
    }
    public void clickOnRegisterHeaderButton(){
        driverWait.until(ExpectedConditions.elementToBeClickable(registerHeaderButton)) ;
        driver.findElement(registerHeaderButton).click();
    }

    public void clickOnMyAccountHeaderButton(){
        driverWait.until(ExpectedConditions.elementToBeClickable(myAccountHeaderButton)) ;
        driver.findElement(myAccountHeaderButton).click();
    }
    public void clickOnLogOutHeaderButton(){
        driverWait.until(ExpectedConditions.elementToBeClickable(loginHeaderButton)) ;
        driver.findElement(logOutHeaderButton).click();
    }
    public Boolean isUserLoggedIn(){
        driverWait.until(ExpectedConditions.visibilityOfElementLocated(myAccountHeaderButton)) ;
        return driver.findElement(myAccountHeaderButton).getText().equals("My account")  ;
    }
}
