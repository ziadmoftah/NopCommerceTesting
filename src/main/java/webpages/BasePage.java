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

    public BasePage(WebDriver driver) {
        this.driver = driver;
        driverWait = new WebDriverWait(this.driver , DEFAULT_WAIT_TIME_SECONDS) ;
    }
    public void clickOnLoginHeaderButton(){
        driver.findElement(loginHeaderButton).click();
    }
    public void clickOnRegisterHeaderButton(){
        driver.findElement(registerHeaderButton).click();
    }
}
