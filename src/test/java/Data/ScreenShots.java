package Data;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;

import static Hooks.Hooks.*;

public class ScreenShots {
    public static String filePath;

    public static void takeScreenShotFail() throws IOException {

        TakesScreenshot screenshot = (TakesScreenshot) driver;
        File srcFile = screenshot.getScreenshotAs(OutputType.FILE);
        String name = ScenarioName + " Fail ".concat(".png");
//        FileUtils.copyFile(srcFile, new File("E:\\3. Testing\\DEPI\\Final Project\\my work edit\\ParkBank1.1\\ParkBank\\target\\ScreenShots\\".concat(name)));
//        test.addScreenCaptureFromPath("E:\\3. Testing\\DEPI\\Final Project\\my work edit\\ParkBank1.1\\ParkBank\\target\\ScreenShots".concat(name));
//        extent.flush();
        File destination = new File("E:\\testing\\automation\\New folder\\parabank_DEPI graduation\\my work\\parabank\\target\\ScreenShots\\".concat(name));
        filePath = destination.getAbsolutePath();
        FileUtils.copyFile(srcFile, destination);
        test.addScreenCaptureFromPath(filePath);
    }

    public static void takeScreenShotPass() throws IOException {
        TakesScreenshot screenshot = (TakesScreenshot) driver;
        File srcFile = screenshot.getScreenshotAs(OutputType.FILE);
        //Calendar cal = Calendar.getInstance();
        String name = ScenarioName + " Pass ".concat(".png");
//        FileUtils.copyFile(srcFile, new File("E:\\3. Testing\\DEPI\\Final Project\\my work edit\\ParkBank1.1\\ParkBank\\target\\ScreenShots\\".concat(name)));
//        test.addScreenCaptureFromPath("E:\\3. Testing\\DEPI\\Final Project\\my work edit\\ParkBank1.1\\ParkBank\\target\\ScreenShots".concat(name));
//        extent.flush();
        File destination = new File("E:\\testing\\automation\\New folder\\parabank_DEPI graduation\\my work\\parabank\\target\\ScreenShots\\".concat(name));
        filePath = destination.getAbsolutePath();
        FileUtils.copyFile(srcFile, destination);
        test.addScreenCaptureFromPath(filePath);
    }
}

