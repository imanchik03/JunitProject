//package pages;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.PageFactory;
//import utilities.Driver;
//
//public class AddIncomePage {
//
//    WebDriver driver;
//
//    public AddIncomePage() {
//        this.driver = Driver.getDriver();
//        PageFactory.initElements(driver, this);
//
//
//    }
//
//    @FindBy(xpath = "//li[text()=\"Reports\"]")
//    public WebElement reports;
//
//    @FindBy(xpath = "//a[@id=\"active\"]")
//    public WebElement transactionButton;
//
//    @FindBy(css = "class=\"MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButtonBase-root css-xdzsgw\"")
//    public WebElement addIncome;
//
//    @FindBy(css = "css-88fr0h")
//    public WebElement toDate;
//
//    @FindBy(xpath = "//input[@placeholder=\"File title\"]")
//    public WebElement fileUpload;
//
//    @FindBy(css = "MuiOutlinedInput-root MuiInputBase-root MuiInputBase-colorPrimary MuiInputBase-formControl MuiInputBase-sizeSmall css-1v4ccyo")
//    public WebElement title;
//
//    @FindBy(css = "MuiSelect-select MuiSelect-outlined MuiOutlinedInput-input MuiInputBase-input css-qiwgdb")
//    public WebElement category;
//
//    @FindBy(id = "mui-component-select-type_of_pay")
//    public WebElement paymentMethod;
//
//    @FindBy(id = "mui-component-select-bank_account")
//    public WebElement toWhichCheck;
//
//    @FindBy(id = "amount_of_money_input_text")
//    public WebElement Sum;
//
//    @FindBy(xpath = "//button[@type=\"submit\"]")
//    public WebElement submitButton;
//
//
//
//
//}
