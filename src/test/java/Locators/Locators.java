package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

import static Hooks.Hooks.driver;

public class Locators {
    public static By SignUpButton = By.xpath("//*[text()=\"Register\"]");
    public static By FirstName = By.id("customer.firstName");
    public static By LastName = By.id("customer.lastName");
    public static By AddressStreet = By.id("customer.address.street");
    public static By AddressCity = By.id("customer.address.city");
    public static By AddressState = By.id("customer.address.state");
    public static By AddressZipCode = By.id("customer.address.zipCode");
    public static By PhoneNumber = By.id("customer.phoneNumber");
    public static By SSN = By.id("customer.ssn");
    public static By Username = By.id("customer.username");
    public static By Password = By.id("customer.password");
    public static By RepeatPassword = By.id("repeatedPassword");
    public static By WarningMassage = By.id("customer.username.errors");
    public static By Massage = By.xpath("//*[@id=\"rightPanel\"]/p");
    public static By ClickSignBtn = By.xpath("//input[@value='Register']");
    public static By SignPage = By.xpath("//*[@class= \"title\"]");

    // open new Account locators
    public static By OpeenNewAccount = By.xpath("//*[@id=\"leftPanel\"]/ul/li[1]/a");
    public static By NewAccountPage = By.xpath("//h1[contains(text(),\"Open New Account\")]");
    public static By Cheking = By.xpath("//option[@value=\"0\"]");
    public static By Saving = By.xpath("//option[@value=\"1\"]");
    public static By Accounts = By.xpath("//*[@id=\"fromAccountId\"]/option[1]");
    public static By MassageNewAcc = By.xpath("//*[@id=\"openAccountResult\"]/h1");
    public static By NewAccountId = By.xpath("//a[@id=\"newAccountId\"]");
    public static By ClickNewAccountBtn = By.xpath("//input[@class=\"button\"]");
    public static By AccountOverview = By.xpath("//*[@id=\"leftPanel\"]/ul/li[2]/a");
    public static By NewAccountid = By.xpath("//*[@id=\"accountTable\"]/tbody/tr[2]/td[1]/a");
    public static By NewAccountIdcheck = By.xpath("//td[@id=\"accountId\"]");
    public static By AccountOpenMassage = By.xpath("//*[contains(text(),\"Account Opened!\")]");


    // sign in locators
    public static By UsernameLogin = By.xpath("//*[@type=\"text\"]");
    public static By PasswordLogin = By.xpath("//*[@type=\"password\"]");
    public static By SignInButton = By.xpath("//*[@type=\"submit\"]");
    public static By SignInPage = By.xpath("//h1[contains(text(),\"Accounts Overview\")]");

    // Transfer Funds Locators
    public static By TransferFunds = By.xpath("//*[@href=\"transfer.htm\"]");
    public static By Amount = By.xpath("//input[@id=\"amount\"]");
    public static By FromAccount = By.xpath("//*[@id=\"fromAccountId\"]/option[1]");
    public static By ToAccount = By.xpath("//*[@id=\"toAccountId\"]/option[2]");
    public static By TransferButton = By.xpath("//*[@type=\"submit\"]");
    public static By TransferSuccessMassage = By.xpath("//*[text()=\"Transfer Complete!\"]");
    // request Loan Loactors
    public static By ReequestLoan = By.xpath("//*[@id=\"leftPanel\"]/ul/li[7]/a");
    public static By LoanAmount = By.xpath("//*[@id=\"amount\"]");
    public static By DownPayment = By.xpath("//*[@id=\"downPayment\"]");
    public static By fromAccount = By.xpath("//*[@id=\"fromAccountId\"]/option[2]");
    public static By LoanButton = By.xpath("//*[@type=\"button\"]");
    public static By LoanSuccessMassage = By.xpath("//*[@id=\"loanRequestApproved\"]/p[1]");

    //bill pay
    public static By BillPayButton = By.xpath("//*[@id=\"leftPanel\"]/ul/li[4]/a");
    public static By PayeeName = By.name("payee.name");
    public static By PayeeNameAddress = By.name("payee.address.street");
    public static By PayeeNameeCity = By.name("payee.address.city");
    public static By PayeeNameState = By.name("payee.address.state");
    public static By PayeeNameZipCode = By.name("payee.address.zipCode");
    public static By PayeeNamePhoneNumber = By.name("payee.phoneNumber");
    public static By PayeeNameAccountNumber = By.name("payee.accountNumber");
    public static By PayeeNameVerifyAccountNumber = By.name("verifyAccount");
    public static By PayeeNameAmount = By.name("amount");
    public static By SendPayment = By.xpath("//*[@id=\"billpayForm\"]/form/table/tbody/tr[14]/td[2]/input");
    public static By BillpaySuccessMassage = By.xpath("//h1[contains(text(),\"Bill Payment Complete\")]");
    //update contact locators
    public static By update_contact = By.xpath("//div[@id=\"mainPanel\"]/div[3]/div/ul/li[6]");
    public static By update_last_name = By.id("customer.lastName");
    public static By update_phone = By.id("customer.phoneNumber");
    public static By update_profile_button = By.xpath("//*[@colspan=\"2\"]/input");
    public static By success_update = By.xpath("//div[@id=\"updateProfileResult\"]/p");
    //Find transactions locators
    public static By TransactionId = By.xpath("//*[@id=\"rightPanel\"]/table/tbody/tr[1]/td[2]");
    public static By Account = By.xpath("//*[@id=\"accountTable\"]/tbody/tr[1]/td[1]/a");
    public static By Transaction = By.xpath("//*[@id=\"transactionTable\"]/tbody/tr[1]/td[2]/a");
    public static By Find_transactions = By.xpath("//*[@href=\"findtrans.htm\"]");
    public static By TransactionIdField = By.id("transactionId");
    public static By SearchButtonById = By.id("findById");
    public static By TransactionDate = By.xpath("//*[@id=\"rightPanel\"]/table/tbody/tr[2]/td[2]");
    public static By TransactionDatedField = By.id("transactionDate");
    public static By SearchButtonByDate = By.id("findByDate");
    public static By TransactionSuccessMassage = By.xpath("//*[contains(text(),\"Transaction Results\")]");
    public static By FromDate = By.id("fromDate");
    public static By ToDate = By.id("toDate");
    public static By SearchButtonByDateRange = By.id("findByDateRange");
    public static By TransactionAmount = By.id("amount");
    public static By SearchButtonByAmount = By.id("findByAmount");
    // forgot
    public static By LogOut = By.xpath("//*[contains(text(),\"Log Out\")]");
    public static By ForgotLoginInfo = By.xpath(" //*[contains(text(),\"Forgot login info?\")]");
    public static By ForgotFirstName = By.id("firstName");
    public static By ForgotLastName = By.id("lastName");
    public static By ForgotAddress = By.id("address.street");
    public static By ForgotCity = By.id("address.city");
    public static By ForgotState = By.id("address.state");
    public static By ForgotZipCode = By.id("address.zipCode");
    public static By ForgotSsn = By.id("ssn");
    public static By FindInfoButton = By.xpath("//*[@value=\"Find My Login Info\"]");
    public static By ForgotSuccessMassage = By.xpath("//h1[contains(text(),\"Customer Lookup\")]");


    public static WebElement findElement(By Locator) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
        wait.until(ExpectedConditions.presenceOfElementLocated(Locator));
        return driver.findElement(Locator);
    }

    public static List<WebElement> findElements(By locator) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(2000));
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(locator));
        return driver.findElements(locator);
    }


}
