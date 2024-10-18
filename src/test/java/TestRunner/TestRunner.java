package TestRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import org.junit.runner.RunWith;

import java.awt.*;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/main/resources/Features"},
        glue = {"Hooks", "StepDefin"},
        tags = "@Test",
        plugin = {"pretty", "html:target/cucumber.html", "json:target/cucumber.json",}
)
public class TestRunner extends AbstractTestNGCucumberTests {

}
