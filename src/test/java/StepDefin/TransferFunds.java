package StepDefin;

import com.aventstack.extentreports.Status;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.io.IOException;

import static Data.DataPrep.getData;
import static Data.ScreenShots.takeScreenShotFail;
import static Data.ScreenShots.takeScreenShotPass;
import static Locators.Locators.*;
import static Hooks.Hooks.*;


public class TransferFunds {
    @Given("Customer Navigate to Transfer Funds")
    public void customerNavigateToTransferFunds() {
        findElement(TransferFunds).click();
    }


    @And("Customer type the amount of transfer funds")
    public void customerTypeTheAmountOfTransferFunds() throws IOException {
        findElement(Amount).sendKeys("200");
    }

    @And("select the account to transfer from and select the account to transfer to from drop list")
    public void selectTheAccountToTransferFromAndSelectTheAccountToTransferToFromDropList() {
        findElement(FromAccount).click();
        findElement(ToAccount).click();
    }

    @When("Customer Click on transfer buttons")
    public void customerClickOnTransferButtons() {
        findElement(TransferButton).click();

    }

    @Then("The Customer should be redirected to the Funds Confirmation page")
    public void theCustomerShouldBeRedirectedToTheFundsConfirmationPage() throws IOException, InterruptedException {
        test = extent.createTest("Transfer Funds", "Customer Transfer funds");
        Thread.sleep(2000);
        String x = findElement(TransferSuccessMassage).getText();
        System.out.println(x);

        boolean TransfersuccessMessage = findElement(TransferSuccessMassage).getText().equals("Transfer Complete!");
        if (TransfersuccessMessage) {
            test.log(Status.PASS, "Transfer Complete! successfully will be displayed");
            takeScreenShotPass();

        } else {
            test.log(Status.FAIL, "Transfer Complete! successfully will not be displayed");
            takeScreenShotFail();

        }


        Assert.assertEquals("Transfer Complete!", findElement(TransferSuccessMassage).getText());


    }
}
