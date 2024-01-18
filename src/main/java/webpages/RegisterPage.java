package webpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage extends BasePage{
    By firstNameInputTextField = By.xpath("//input[@id = 'FirstName']") ;
    By lastNameInputTextField = By.xpath("//input[@id = 'LastName']") ;
    By emailInputTextField = By.xpath("//input[@id = 'Email']") ;
    By passwordInputTextField = By.xpath("//input[@id = 'Password']") ;
    By confirmPasswordInputTextField = By.xpath("//input[@id = 'ConfirmPassword']") ;
    By registerButton = By.xpath("//button[@id = 'register-button']") ;
    By genderRadioButtons = By.xpath("//div[@id = 'gender']//input") ;
    By birthDaySelectDropdownList = By.xpath("//select[@name = 'DateOfBirthDay']") ;
    By birthMonthSelectDropDownList = By.xpath("//select[@name = 'DateOfBirthMonth']") ;
    By birthYearSelectDropDownList = By.xpath("//select[@name = 'DateOfBirthYear']") ;
    By newsLetterCheckBox = By.xpath("//input [@id = 'Newsletter']") ;
    By companyNameInputTextField = By.xpath("//input [@id = 'Company']") ;
    By firstNameErrorMessageText = By.xpath("//span[@id = 'FirstName-error']") ;
    public RegisterPage(WebDriver driver) {
        super(driver);
    }

    public void enterTextInFirstNameInputTextField(String text){
        driverWait.until(ExpectedConditions.visibilityOfElementLocated(firstNameInputTextField));
        WebElement webElement = driver.findElement(firstNameInputTextField) ;
        webElement.clear();
        webElement.sendKeys(text);
    }
    public void enterTextInLastNameInputTextField(String text){
        driverWait.until(ExpectedConditions.visibilityOfElementLocated(lastNameInputTextField));
        WebElement webElement = driver.findElement(lastNameInputTextField) ;
        webElement.clear();
        webElement.sendKeys(text);
    }
    public void enterTextInEmailInputTextField(String text){
        driverWait.until(ExpectedConditions.visibilityOfElementLocated(emailInputTextField));
        WebElement webElement = driver.findElement(emailInputTextField) ;
        webElement.clear();
        webElement.sendKeys(text);
    }
    public void enterTextInPasswordInputTextField(String text){
        driverWait.until(ExpectedConditions.visibilityOfElementLocated(passwordInputTextField));
        WebElement webElement = driver.findElement(passwordInputTextField) ;
        webElement.clear();
        webElement.sendKeys(text);
    }
    public void enterTextInConfirmPasswordInputTextField(String text){
        driverWait.until(ExpectedConditions.visibilityOfElementLocated(confirmPasswordInputTextField));
        WebElement webElement = driver.findElement(confirmPasswordInputTextField) ;
        webElement.clear();
        webElement.sendKeys(text);
    }

    public void clickOnRegisterButton(){
        driverWait.until(ExpectedConditions.elementToBeClickable(registerButton)) ;
        driver.findElement(registerButton).click();
    }

    public void selectGenderRadioButton(int value){
        driverWait.until(ExpectedConditions.visibilityOfElementLocated(genderRadioButtons)) ;
        driver.findElements(genderRadioButtons).get(value).click();
    }
    public void unCheckNewsLetterCheckBox(){
        driverWait.until(ExpectedConditions.elementToBeClickable(newsLetterCheckBox)) ;
        WebElement webElement = driver.findElement(newsLetterCheckBox) ;
        if ( webElement.isSelected()){
            webElement.click();
        }
    }
    public void checkNewsLetterCheckBox(){
        driverWait.until(ExpectedConditions.elementToBeClickable(newsLetterCheckBox)) ;
        WebElement webElement = driver.findElement(newsLetterCheckBox) ;
        if ( !webElement.isSelected()){
            webElement.click();
        }
    }
    public void selectBirthDayFromDropdownList(String day){
        driverWait.until(ExpectedConditions.elementToBeClickable(birthDaySelectDropdownList)) ;
        driverWait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(birthDaySelectDropdownList)) ;
        Select select = new Select(driver.findElement(birthDaySelectDropdownList)) ;
        select.selectByVisibleText(day);
    }
    public void selectBirthMonthFromDropdownList(String month){
        driverWait.until(ExpectedConditions.elementToBeClickable(birthMonthSelectDropDownList)) ;
        driverWait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(birthMonthSelectDropDownList)) ;
        Select select = new Select(driver.findElement(birthMonthSelectDropDownList)) ;
        select.selectByVisibleText(month);
    }
    public void selectBirthYearFromDropdownList(String year){
        driverWait.until(ExpectedConditions.elementToBeClickable(birthYearSelectDropDownList)) ;
        driverWait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(birthYearSelectDropDownList)) ;
        Select select = new Select(driver.findElement(birthYearSelectDropDownList)) ;
        select.selectByVisibleText(year);
    }
    public void enterTextInCompanyNameInputTextField(String text){
        driverWait.until(ExpectedConditions.visibilityOfElementLocated(companyNameInputTextField)) ;
        WebElement webElement = driver.findElement(companyNameInputTextField) ;
        webElement.clear();
        webElement.sendKeys(text);
    }
    public String getFirstNameErrorMessageText(){
        driverWait.until(ExpectedConditions.visibilityOfElementLocated(firstNameErrorMessageText)) ;
        return driver.findElement(firstNameErrorMessageText).getText();
    }

}
