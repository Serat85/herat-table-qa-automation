package utilities;

import java.io.File;
import java.nio.file.Files;
import org.openqa.selenium.*;

public class screenshotHelper {

    public static void takeScreenshot(WebDriver driver, String name) {
        try {
            new File("screenshots").mkdirs();

            File image = ((TakesScreenshot) driver)
                    .getScreenshotAs(OutputType.FILE);

            File destination = new File(
                    "screenshots/" + name + "_" + System.nanoTime() + ".png"
            );

            Files.copy(image.toPath(), destination.toPath());
            System.out.println("Screenshot saved: " + destination.getAbsolutePath());

        } catch (Exception e) {
            System.out.println("Screenshot failed: " + e.getMessage());
        }}}
  