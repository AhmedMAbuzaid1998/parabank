package StepDefin;

import com.aventstack.extentreports.Status;
import io.cucumber.java.en.*;
import org.junit.Assert;
import java.io.IOException;
import static Data.DataPrep.getData;
import static Data.DataPrep.setData;
import static Data.ScreenShots.takeScreenShotFail;
import static Data.ScreenShots.takeScreenShotPass;
import static Locators.Locators.*; // anything on locators package will be import
import static Hooks.Hooks.*;

public class SignUp {
    @Given("User navigate to sign up page")
    public static void userNavigateToSignUpPage() throws IOException {
        setData();
        findElement(SignUpButton).click();
        String SignUpPage = findElement(SignPage).getText();
        Assert.assertEquals(SignUpPage, "Signing up is easy!");


    }

    @And("User fill the details in the page")
    public static void userFillTheDetailsInThePage() throws IOException {
        findElement(FirstName).sendKeys(getData(1, 0));
        findElement(LastName).sendKeys(getData(1, 1));
        findElement(AddressStreet).sendKeys(getData(1, 2));
        findElement(AddressCity).sendKeys(getData(1, 3));
        findElement(AddressState).sendKeys(getData(1, 4));
        findElement(AddressZipCode).sendKeys(getData(1, 5));
        findElement(PhoneNumber).sendKeys(getData(1, 6));
        findElement(SSN).sendKeys(getData(1, 7));
        findElement(Username).sendKeys(getData(1, 8));
        findElement(Password).sendKeys(getData(1, 9));
        findElement(RepeatPassword).sendKeys(getData(1, 10));

    }

    @When("User click on sign up button")

    public static void userClickOnSignUpButton() {

        findElement(ClickSignBtn).click();
    }

    @Then("Sign up successfully will be displayed")
    public static void signUpSuccessfullyWillBeDisplayed() throws IOException {
        test = extent.createTest("Registration", "user register");
        boolean successMessage = findElement(Massage).getText().equals("Your account was created successfully. You are now logged in.");
        if (successMessage) {
            test.log(Status.PASS, "Register successfully will be displayed");
            takeScreenShotPass();

        } else {
            test.log(Status.FAIL, "Register successfully will not be displayed");
            takeScreenShotFail();

        }
        Assert.assertTrue("Your account was created successfully. You are now logged in.", successMessage);
    }


}
