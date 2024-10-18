package StepDefin;

import com.aventstack.extentreports.Status;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.io.IOException;

import static Data.DataPrep.getData;
import static Data.ScreenShots.takeScreenShotFail;
import static Data.ScreenShots.takeScreenShotPass;
import static Hooks.Hooks.extent;
import static Hooks.Hooks.test;
import static Locators.Locators.*;

public class RequestLoan {

    @Given("Customer Navigate to request loan page")
    public void customerNavigateToRequestLoanPage() {
        findElement(ReequestLoan).click();
    }

    @And("Customer fill the details For request loan")
    public void customerFillTheDetailsForRequestLoan() throws IOException {
        findElement(LoanAmount).sendKeys("200");
        findElement(DownPayment).sendKeys("20");
    }

    @And("customer chose the account for Down payment")
    public void customerChoseTheAccountForDownPayment() {
        findElement(fromAccount).click();
    }


    @Then("Costumer click on Submit button")
    public void costumerClickOnSubmitButton() {
        findElement(LoanButton).click();
    }

    @And("Customer see the success message")
    public void customerSeeTheSuccessMessage() throws IOException, InterruptedException {
        test = extent.createTest("Loan Request", "Customer see Loan Request");
        Thread.sleep(2000);
        boolean LoanMassage = findElement(LoanSuccessMassage).getText().equals("Congratulations, your loan has been approved.");

        if (LoanMassage) {
            test.log(Status.PASS, "Loan Request Processed successfully will be displayed");
            takeScreenShotPass();

        } else {
            test.log(Status.FAIL, "Loan Request Processed will not be displayed");
            takeScreenShotFail();

        }
        Assert.assertEquals("Congratulations, your loan has been approved.", findElement(LoanSuccessMassage).getText());

    }
}
