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
import static Hooks.Hooks.extent;
import static Hooks.Hooks.test;
import static Locators.Locators.*;

public class FindTransaction {

    public static String id;
    public static String date;

    @And("customer chose the account to get the transaction Id")
    public void customerChoseTheAccountToGetTheTransactionId() {
        findElement(Account).click();
        findElement(Transaction).click();
        id = findElement(TransactionId).getText();
        System.out.println(id);
    }

    @And("customer navigate to find transaction page")
    public void customerNavigateToFindTransactionPage() {
        findElement(Find_transactions).click();

    }

    @And("customer fill the transaction Id")
    public void customerFillTheTransactionId() {
        findElement(TransactionIdField).sendKeys(id);

    }

    @And("customer click on search id button")
    public void customerClickOnSearchIdButton() throws InterruptedException, IOException {
        findElement(SearchButtonById).click();
        Thread.sleep(2000);

    }


    @And("customer should see the transaction details")
    public void customerShouldSeeTheTransactionDetails() throws InterruptedException, IOException {
        test = extent.createTest("Find transaction by id", "Customer Customer find transaction by id");
        Thread.sleep(2000);
        takeScreenShotFail();

    }



    @When("customer chose the account to get the transaction date")
    public void customerChoseTheAccountToGetTheTransactionDate() {
        findElement(AccountOverview).click();
        findElement(Account).click();
        findElement(Transaction).click();
        date = findElement(TransactionDate).getText();
        System.out.println(date);

    }
    @And("customer fill the transaction date")
    public void customerFillTheTransactionDate() throws InterruptedException {
        findElement(TransactionDatedField).sendKeys(date);
        Thread.sleep(2000);

    }

    @And("customer click on search date button")
    public void customerClickOnSearchDateButton() {
        findElement(SearchButtonByDate).click();
    }

    @Then("customer should see the transaction details of this date")
    public void customerShouldSeeTheTransactionDetailsOfThisDate() throws InterruptedException, IOException {
        test = extent.createTest("Find Transaction by date", "Customer see the transaction details of this date");
        Thread.sleep(2000);
        boolean TransactionMassage = findElement(TransactionSuccessMassage).getText().equals("Transaction Results");

        if (TransactionMassage) {
            test.log(Status.PASS, "Transaction Results successfully will be displayed");
            takeScreenShotPass();

        } else {
            test.log(Status.FAIL, "Transaction Results will not be displayed");
            takeScreenShotFail();

        }
        Assert.assertEquals("Transaction Results", findElement(TransactionSuccessMassage).getText());


    }

    @And("customer fill the transaction Date Range")
    public void customerFillTheTransactionDateRange() {
        findElement(FromDate).sendKeys("01-01-2020");
        findElement(ToDate).sendKeys(date);
    }

    @And("customer click on search Date Range button")
    public void customerClickOnSearchDateRangeButton() {
        findElement(SearchButtonByDateRange).click();
    }

    @Then("customer should see the transaction details of this Date Range")
    public void customerShouldSeeTheTransactionDetailsOfThisDateRange() throws InterruptedException, IOException {
        test = extent.createTest("Find Transaction by Date Range", "Customer see the transaction details of this Date Range");
        Thread.sleep(2000);
        boolean TransactionMassage = findElement(TransactionSuccessMassage).getText().equals("Transaction Results");

        if (TransactionMassage) {
            test.log(Status.PASS, "Transaction Results successfully will be displayed");
            takeScreenShotPass();

        } else {
            test.log(Status.FAIL, "Transaction Results will not be displayed");
            takeScreenShotFail();

        }
        Assert.assertEquals("Transaction Results", findElement(TransactionSuccessMassage).getText());


    }

    @And("customer fill the transaction Amount")
    public void customerFillTheTransactionAmount() {
        findElement(TransactionAmount).sendKeys("100");
    }

    @And("customer click on search Amount button")
    public void customerClickOnSearchAmountButton() {
        findElement(SearchButtonByAmount).click();
    }

    @Then("customer should see the transaction details of this Amount")
    public void customerShouldSeeTheTransactionDetailsOfThisAmount() throws InterruptedException, IOException {
        test = extent.createTest("Find Transaction by Amount", "Customer see the transaction details of this Amount");
        Thread.sleep(2000);
        boolean TransactionMassage = findElement(TransactionSuccessMassage).getText().equals("Transaction Results");

        if (TransactionMassage) {
            test.log(Status.PASS, "Transaction Results successfully will be displayed");
            takeScreenShotPass();

        } else {
            test.log(Status.FAIL, "Transaction Results will not be displayed");
            takeScreenShotFail();

        }
        Assert.assertEquals("Transaction Results", findElement(TransactionSuccessMassage).getText());



    }


}

