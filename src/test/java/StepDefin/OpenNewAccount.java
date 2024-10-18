package StepDefin;

import com.aventstack.extentreports.Status;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.io.IOException;

import static Data.ScreenShots.takeScreenShotFail;
import static Data.ScreenShots.takeScreenShotPass;
import static Locators.Locators.*;
import static Hooks.Hooks.*;

public class OpenNewAccount {
    @Given("Customer navigate to Open New Account page")
    public void customerNavigateToOpernNewAccountPage() throws IOException {
        findElement(OpeenNewAccount).click();
        String OpenNewAccountPage = findElement(NewAccountPage).getText();
        Assert.assertEquals(OpenNewAccountPage, "Open New Account");
    }

    @And("Chose the  type of Account would open")
    public void choseTheTypeOfAccountWouldOpen() {
        findElement(Saving).click();

    }

    @And("Chose choose an existing account to transfer funds into the new account")
    public void choseChooseAnExistingAccountToTransferFundsIntoTheNewAccount() {
        findElement(Accounts).click();
    }

    @When("the Customer click on Open New Account button")
    public void theCustomerClickOnOpenNewAccountButton() {
        findElement(ClickNewAccountBtn).click();
    }

    @Then("The Customer should be redirected to the Confirmation page")
    public void theCustomerShouldBeRedirectedToTheConfirmationPage() {
        String OpenNewAccountPage = findElement(MassageNewAcc).getText();
        Assert.assertEquals(OpenNewAccountPage, "");


    }

    @And("The Confirmation page should display the account number")
    public void theConfirmationPageShouldDisplayTheAccountNumber() throws IOException, InterruptedException {
        test = extent.createTest("Open new Account", "Customer opens a new account");
        Thread.sleep(2000);
        boolean AccountMassage = findElement(AccountOpenMassage).getText().equals("Account Opened!");
        if (AccountMassage) {
            test.log(Status.PASS, "Congratulations, your account is now open will displayed");
            takeScreenShotPass();
        } else {
            test.log(Status.FAIL, "Congratulations, your account is now open will not displayed");
            takeScreenShotFail();
        }


        Assert.assertEquals("Account Opened!", findElement(AccountOpenMassage).getText());
    }


}