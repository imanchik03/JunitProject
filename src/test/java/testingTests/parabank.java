package testingTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.locks.Condition;

public class parabank {
    private WebDriver driver;
    private WebDriverWait wait;

    @BeforeClass
    public void setUp(){
        System.setProperty("WebDriver.chrome.driver", "path/to/chromedriver");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.manage().window().maximize();
    }
    @Test
    public void registerButton(){
        driver.get("https://parabank.parasoft.com/parabank");
        driver.findElement(By.linkText("Register")).click();

        driver.findElement(By.id("customer.firstName")).sendKeys("Sergey");
        driver.findElement(By.id("customer.lastName")).sendKeys("Zverev");
        driver.findElement(By.id("customer.address.street")).sendKeys("2250 e devon ave");
        driver.findElement(By.id("customer.address.city")).sendKeys("Chicago");
        driver.findElement(By.id("customer.address.state")).sendKeys("IL");
        driver.findElement(By.id("customer.address.zipCode")).sendKeys("60656");
        driver.findElement(By.id("customer.phoneNumber")).sendKeys("9918076834");
        driver.findElement(By.id("customer.ssn")).sendKeys("4445306");
        driver.findElement(By.id("customer.username")).sendKeys("cumshot");
        driver.findElement(By.id("customer.password")).sendKeys("696969");
        driver.findElement(By.id("repeatedPassword")).sendKeys("696969");

    }
}
