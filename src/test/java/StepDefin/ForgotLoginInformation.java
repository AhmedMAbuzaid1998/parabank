package StepDefin;

import com.aventstack.extentreports.Status;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import static StepDefin.SignIn.*;

import java.io.IOException;

import static Data.DataPrep.getData;
import static Data.ScreenShots.takeScreenShotFail;
import static Data.ScreenShots.takeScreenShotPass;
import static Hooks.Hooks.extent;
import static Hooks.Hooks.test;
import static Locators.Locators.*;
import static StepDefin.SignUp.*;

public class ForgotLoginInformation {


    @When("user click the Forgot login info? link")
    public void userClickTheForgotLoginInfoLink() {
        findElement(ForgotLoginInfo).click();

    }

    @And("user enter his correct login information")
    public void userEnterHisCorrectLoginInformation() throws IOException {
        findElement(ForgotFirstName).sendKeys(getData(1, 0));
        findElement(ForgotLastName).sendKeys(getData(1, 1));
        findElement(ForgotAddress).sendKeys(getData(1, 2));
        findElement(ForgotCity).sendKeys(getData(1, 3));
        findElement(ForgotState).sendKeys(getData(1, 4));
        findElement(ForgotZipCode).sendKeys(getData(1, 5));
        findElement(ForgotSsn).sendKeys(getData(1, 7));

    }

    @And("user click the Submit button")
    public void userClickTheSubmitButton() {
        findElement(FindInfoButton).click();
    }

    @Then("user should receive Username  and password")
    public void userShouldReceiveUsernameAndPassword() throws InterruptedException, IOException {
        test = extent.createTest("Forgot login info", "Customer get the username and password ");
        Thread.sleep(2000);
        boolean TransactionMassage = findElement(ForgotSuccessMassage).getText().equals("Customer Lookup");

        if (TransactionMassage) {
            test.log(Status.PASS, "Customer Lookup successfully will be displayed");
            takeScreenShotPass();

        } else {
            test.log(Status.FAIL, "Customer Lookup will not be displayed");
            takeScreenShotFail();

        }
        Assert.assertEquals("Customer Lookup", findElement(ForgotSuccessMassage).getText());


    }

    @Given("user on the login page")
    public void userOnTheLoginPage() throws IOException, InterruptedException {

        findElement(LogOut).click();
    }


}
