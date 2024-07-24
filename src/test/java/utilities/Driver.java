package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.time.Duration;

public class Driver {
    public static WebDriver driver;
    public static WebDriver getDriver(){
        if (driver == null){
            String browser = Config.getProperties("browser");
            switch (browser){
                case "chrome":
                driver = new ChromeDriver();
                break;
                case "firefox":
                driver = new FirefoxDriver();
                break;
                case "safari":
                driver = new SafariDriver();
                break;
                default:
                driver = new ChromeDriver();
            }
            driver = new ChromeDriver();
        }
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));

        driver.manage().window().maximize();

        return driver;
    }
}
