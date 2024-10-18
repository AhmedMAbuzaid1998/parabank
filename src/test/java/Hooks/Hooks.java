package Hooks;


import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;


public class Hooks {
    public static WebDriver driver;
    public static ExtentTest test;
    public static ExtentReports extent = new ExtentReports();
    public static ExtentSparkReporter spark;
    public static String ScenarioName;

    @Before
    public void beforeScenario(Scenario scenario) {
        driver = new ChromeDriver();
        WebDriverManager.chromedriver().setup();
        ScenarioName = scenario.getName();
        driver.get("https://parabank.parasoft.com/parabank/index.htm");
        driver.manage().window().maximize();
        spark = new ExtentSparkReporter(new File("E:\\3. Testing\\DEPI\\Final Project\\my work edit\\ParkBank1.1\\ParkBank\\target\\reports\\testingReport.html"));
        extent.attachReporter(spark);


    }

    @After
    public void afterScenario() {
        extent.flush();
        driver.quit();

    }
}
