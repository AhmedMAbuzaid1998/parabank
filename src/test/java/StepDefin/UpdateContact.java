package StepDefin;


import com.aventstack.extentreports.Status;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import java.io.IOException;

import static Data.ScreenShots.takeScreenShotFail;
import static Data.ScreenShots.takeScreenShotPass;
import static Hooks.Hooks.*;
import static Locators.Locators.*;
import static Locators.Locators.success_update;
import static StepDefin.SignIn.*;

public class UpdateContact {
    @Given("user sign in and navigate to update contact info")
    public void navigatingToUpdateContactInfo() throws IOException {
        findElement(update_contact).click();
    }

    @And("change some field\\(last name and phone)")
    public void changeSomeFieldLastNameAndPhone() throws InterruptedException {
        Thread.sleep(2000);
        findElement(update_last_name).clear();
        findElement(update_phone).clear();
        findElement(update_last_name).sendKeys("Mohamed Abuzaid");
        findElement(update_phone).sendKeys("01025252525");

    }

    @When("click update profile button")
    public void clickUpdateProfileButton() {

        findElement(update_profile_button).click();

    }

    @Then("verify updated contact info")
    public void verifyUpdatedContactInfo() throws InterruptedException, IOException {
        test = extent.createTest("Update Contact", "Customer updated contact info");
        Thread.sleep(2000);
        boolean updateMessage = findElement(success_update).getText().equals("Your updated address and phone number have been added to the system.");
        System.out.println(updateMessage);
        String x = findElement(success_update).getText();
        System.out.println(x);
        if (updateMessage) {
            test.log(Status.PASS, "Your updated address and phone number have been added to the system. successfully will be displayed");
            takeScreenShotPass();

        } else {
            test.log(Status.FAIL, "Your updated address and phone number have been added to the system. successfully will not be displayed");
            takeScreenShotFail();

        }


        Assert.assertEquals("Your updated address and phone number have been added to the system.", findElement(success_update).getText());

    }
}
