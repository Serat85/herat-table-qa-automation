import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
public class HeratTableSmokeTest {

    @Test
    public void heratHomePageSmokeTest() {
        WebDriver driver = new ChromeDriver();

        try {
            driver.get("http://127.0.0.1:5500/index.html");

            HomePage homePage = new HomePage(driver);

            Assert.assertTrue(
                homePage.getMainHeadingText().contains("Herat hospitality"),
                "The home page's main heading has unexpected text"
            );
        } finally {
            driver.quit();
        }
    }
}