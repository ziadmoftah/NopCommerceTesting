package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserSetup {
    public static WebDriver getWebDriver(String browser, String URL){
        WebDriver driver ;
        if ( browser.equalsIgnoreCase("chrome")){
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver() ;
        }
        else if ( browser.equalsIgnoreCase("edge")){
            WebDriverManager.edgedriver().setup();
            driver =   new EdgeDriver();
        }
        else if (browser.equalsIgnoreCase("firefox")){
            WebDriverManager.firefoxdriver().setup();
            driver =  new FirefoxDriver() ;
        }
        else {
            return null ;
        }
        driver.get(URL);
        driver.manage().window().maximize();
        return driver ;
    }
}
