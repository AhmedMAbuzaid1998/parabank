package StepDefin;

import com.aventstack.extentreports.Status;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.io.IOException;

import static Data.DataPrep.getData;
import static Data.ScreenShots.takeScreenShotFail;
import static Data.ScreenShots.takeScreenShotPass;
import static Hooks.Hooks.extent;
import static Hooks.Hooks.test;
import static Locators.Locators.*;

public class SignIn {


    @Given("User fill the details For Login")
    public static void userFillTheDetailsForLogin() throws IOException {
        findElement(UsernameLogin).sendKeys(getData(1, 8));
        findElement(PasswordLogin).sendKeys(getData(1, 9));

    }

    @When("User click on Login button")
    public static void userClickOnLoginButton() {
        findElement(SignInButton).click();
    }

    @Then("User will be logged in successfully")
    public static void userWillBeLoggedInSuccessfully() throws IOException, InterruptedException {
        test = extent.createTest("Sign In", "user Sign In");
        Thread.sleep(2000);
        boolean welcomeMessage = findElement(SignInPage).getText().equals("Accounts Overview");
        if (welcomeMessage) {
            test.log(Status.PASS, "Sign in successfully will be displayed");
            takeScreenShotPass();

        } else {
            test.log(Status.FAIL, "sign in successfully will not be displayed");
            takeScreenShotFail();

        }
        Assert.assertTrue("Accounts Overview", welcomeMessage);

    }


}

