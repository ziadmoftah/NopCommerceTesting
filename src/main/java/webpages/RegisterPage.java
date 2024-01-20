package webpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import utilities.BrowserActions;

public class RegisterPage extends BasePage{
    private By firstNameInputTextField = By.xpath("//input[@id = 'FirstName']") ;
    private By lastNameInputTextField = By.xpath("//input[@id = 'LastName']") ;
    private By emailInputTextField = By.xpath("//input[@id = 'Email']") ;
    private By passwordInputTextField = By.xpath("//input[@id = 'Password']") ;
    private By confirmPasswordInputTextField = By.xpath("//input[@id = 'ConfirmPassword']") ;
    private By registerButton = By.xpath("//button[@id = 'register-button']") ;
    private By genderRadioButtons = By.xpath("//div[@id = 'gender']//input") ;
    private By birthDaySelectDropdownList = By.xpath("//select[@name = 'DateOfBirthDay']") ;
    private By birthMonthSelectDropDownList = By.xpath("//select[@name = 'DateOfBirthMonth']") ;
    private By birthYearSelectDropDownList = By.xpath("//select[@name = 'DateOfBirthYear']") ;
    private By newsLetterCheckBox = By.xpath("//input [@id = 'Newsletter']") ;
    private By companyNameInputTextField = By.xpath("//input [@id = 'Company']") ;
    private By firstNameErrorMessageText = By.xpath("//span[@id = 'FirstName-error']") ;
    public RegisterPage(WebDriver driver) {
        super(driver);
    }

    public void enterTextInFirstNameInputTextField(String text){
        BrowserActions.enterTextInTextField(firstNameInputTextField , driver,text);
    }
    public void enterTextInLastNameInputTextField(String text){
        BrowserActions.enterTextInTextField(lastNameInputTextField , driver , text);
    }
    public void enterTextInEmailInputTextField(String text){
        BrowserActions.enterTextInTextField(emailInputTextField , driver , text);
    }
    public void enterTextInPasswordInputTextField(String text){
        BrowserActions.enterTextInTextField(passwordInputTextField , driver , text);
    }
    public void enterTextInConfirmPasswordInputTextField(String text){
        BrowserActions.enterTextInTextField(confirmPasswordInputTextField , driver, text);
    }

    public void clickOnRegisterButton(){
        BrowserActions.clickOnButton(registerButton, driver);
    }

    public void selectGenderRadioButton(int value){
        BrowserActions.selectRadioButton(genderRadioButtons , driver , value);
    }
    public void unCheckNewsLetterCheckBox(){
        BrowserActions.unCheckCheckBox(newsLetterCheckBox , driver);
    }
    public void checkNewsLetterCheckBox(){
        BrowserActions.checkCheckBox(newsLetterCheckBox, driver);
    }
    public void selectBirthDayFromDropdownList(String day){
        BrowserActions.selectFromDropDownList(birthDaySelectDropdownList , driver , day);
    }
    public void selectBirthMonthFromDropdownList(String month){
        BrowserActions.selectFromDropDownList(birthMonthSelectDropDownList , driver , month);
    }
    public void selectBirthYearFromDropdownList(String year){
        BrowserActions.selectFromDropDownList(birthYearSelectDropDownList , driver , year);
    }
    public void enterTextInCompanyNameInputTextField(String text){
        BrowserActions.enterTextInTextField(companyNameInputTextField , driver , text);
    }
    public String getFirstNameErrorMessageText(){
        return BrowserActions.getElementText(firstNameErrorMessageText, driver) ;
    }

}
