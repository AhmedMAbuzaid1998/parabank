package StepDefin;


import static Data.DataPrep.getData;
import static Data.ScreenShots.takeScreenShotFail;
import static Data.ScreenShots.takeScreenShotPass;
import static Hooks.Hooks.extent;
import static Hooks.Hooks.test;
import static Locators.Locators.*;


import java.io.IOException;

import com.aventstack.extentreports.Status;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class BillPay {


    @Given("User  navigates to bill pay page")
    public void userNavigatesToBillPayPage() {
        findElement(BillPayButton).click();

    }

    @And("User fill bill pay details")
    public void userFillBillPayDetails() throws IOException {

        findElement(PayeeName).sendKeys(getData(2, 0));
        findElement(PayeeNameAddress).sendKeys(getData(2, 2));
        findElement(PayeeNameeCity).sendKeys(getData(2, 3));
        findElement(PayeeNameState).sendKeys(getData(2, 4));
        findElement(PayeeNameZipCode).sendKeys(getData(2, 5));
        findElement(PayeeNamePhoneNumber).sendKeys(getData(2, 6));
        findElement(PayeeNameAccountNumber).sendKeys("14400");
        findElement(PayeeNameVerifyAccountNumber).sendKeys("14400");
        findElement(PayeeNameAmount).sendKeys("150");

    }

    @When("User click on send payment")
    public void userClickOnSendPayment() {
        findElement(SendPayment).click();
    }

    @Then("the user will be redirected to the Confirmation page")
    public void theUserWillBeRedirectedToTheConfirmationPage() throws InterruptedException, IOException {
        test = extent.createTest("Bill Pay", "customer pay the bill");
        Thread.sleep(2000);
        String x = findElement(BillpaySuccessMassage).getText();
        System.out.println(x);

        boolean BillPaySuccessMessage = findElement(BillpaySuccessMassage).getText().equals("Bill Payment Complete");
        if (BillPaySuccessMessage) {
            test.log(Status.PASS, "Transfer Complete! successfully will be displayed");
            takeScreenShotPass();

        } else {
            test.log(Status.FAIL, "Transfer Complete! successfully will not be displayed");
            takeScreenShotFail();

        }


        Assert.assertEquals("Bill Payment Complete", findElement(BillpaySuccessMassage).getText());

    }
}
