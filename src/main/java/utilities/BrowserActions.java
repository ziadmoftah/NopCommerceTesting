package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BrowserActions {
    private static final int DEFAULT_WAIT_TIME_SECONDS = 5 ;
    private static WebDriverWait driverWait ;
    private static void checkForWebElementVisibility(By by , WebDriver driver){
        driverWait = new WebDriverWait( driver , DEFAULT_WAIT_TIME_SECONDS) ;
        try{
            driverWait.until(ExpectedConditions.visibilityOfElementLocated(by)) ;
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
    public static void clickOnButton(By by , WebDriver driver ){
        checkForWebElementVisibility(by , driver);
        driverWait.until(ExpectedConditions.elementToBeClickable(by)) ;
        driver.findElement(by).click();
    }
    public static void enterTextInTextField(By by , WebDriver driver , String text){
        checkForWebElementVisibility(by , driver);
        driver.findElement(by).clear(); ;
        driver.findElement(by).sendKeys(text);
    }
    public static void checkCheckBox(By by , WebDriver driver){
        checkForWebElementVisibility(by , driver);
        driverWait.until(ExpectedConditions.elementToBeClickable(by)) ;
        WebElement checkBox = driver.findElement(by) ;
        if ( !checkBox.isSelected()){
            checkBox.click();
        }
    }
    public static void unCheckCheckBox(By by , WebDriver driver){
        checkForWebElementVisibility(by , driver);
        driverWait.until(ExpectedConditions.elementToBeClickable(by)) ;
        WebElement checkBox = driver.findElement(by) ;
        if ( checkBox.isSelected()){
            checkBox.click();
        }
    }
    public static String getElementText(By by , WebDriver driver){
        checkForWebElementVisibility(by , driver);
        return driver.findElement(by).getText() ;
    }
    public static void selectFromDropDownList(By by , WebDriver driver , String selectionValue){
        checkForWebElementVisibility(by , driver);
        driverWait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(by)) ;
        Select select = new Select(driver.findElement(by)) ;
        select.selectByVisibleText(selectionValue);
    }
    public static void selectRadioButton(By by , WebDriver driver, int value){
        checkForWebElementVisibility(by, driver);
        driverWait.until(ExpectedConditions.elementToBeClickable(by)) ;
        driver.findElements(by).get(value).click();
    }
}
