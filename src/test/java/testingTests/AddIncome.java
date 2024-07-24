//package testingTests;
//
//import com.github.javafaker.Faker;
//import org.openqa.selenium.WebDriver;
//import org.testng.annotations.Test;
//import pages.AddIncomePage;
//import pages.HomePage;
//import tests.HomepageTests;
//import utilities.Driver;
//
//public class AddIncome {
//    WebDriver driver = Driver.getDriver();
//    AddIncomePage incomePage = new AddIncomePage();
//    AddIncomePage addIncome = new AddIncomePage();
//
//    Faker faker = new Faker();
//    HomePage homePage;
//    AddIncomePage addIncomePage = new AddIncomePage();
//
//
//    @Test
//    public void testAddIncome() {
//
//        driver.get("https://www.cashwise.us/main");
//        homePage.login("Admin@gmail.com", "admin1234");
//        addIncomePage.reports.click();
//
//
//    }
//}