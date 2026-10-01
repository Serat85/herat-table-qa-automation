package pages;
import utilities.screenshotHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HeratTableUiTest {

    @Test
    public void menuLinkOpensMenuSection() {
        WebDriver driver = new ChromeDriver();

        try {
            driver.manage().window().maximize();
            driver.get("http://127.0.0.1:5500/index.html");

            HomePage homePage = new HomePage(driver);
            homePage.clickMenuLink();

            Assert.assertTrue(
                driver.getCurrentUrl().endsWith("#menu"),
                "The Menu link did not navigate to #menu"
            );
            Assert.assertTrue(
                homePage.isMenuSectionVisible(),
                "The menu section is not visible"
            );
        }
        
        finally {
            driver.quit();}}
    
    @Test
    
    public void aboutLinkOpensAboutSection() {
        WebDriver driver = new ChromeDriver();

        try {
            driver.manage().window().maximize();
            driver.get("http://127.0.0.1:5500/index.html");

            HomePage homePage = new HomePage(driver);
            homePage.clickAboutLink();

            Assert.assertTrue(
                driver.getCurrentUrl().endsWith("#about"),
                "The About link did not navigate to #about"
            );

            Assert.assertTrue(
                homePage.isAboutSectionVisible(),
                "The About section is not visible"
            );
            
        } catch (AssertionError | RuntimeException e) {
            screenshotHelper.takeScreenshot(driver, "aboutTest");
            throw e;
        } finally {
            driver.quit();
        } } 
    
          @Test
          
          public void locationLinkOpensLocationSection() 
          
          {   // this location code is shorter than the other buttons codes
        	  WebDriver driver = new ChromeDriver();
        	  
        	  try {
        		  
        		  driver.get("http://127.0.0.1:5500/index.html");
        		  HomePage  homepage = new HomePage(driver);
        		  homepage.clickLocationLink();
        		  
        		  Assert.assertTrue(driver.getCurrentUrl().endsWith("#location"),
        				  "the location link did not navigate to location");
        		  
        		  Assert.assertTrue(homepage.isLocationSectionVisible1(),
        				  "the location section is not visible");
        		  
        	  } finally{ driver.quit(); }}
          
        @Test
        
        public void ReviewsLinkDisplay() {
        	
        	WebDriver driver = new ChromeDriver();
        	
        	try {
        		
        		driver.get("http://127.0.0.1:5500/index.html");
        		
        		HomePage homepage = new HomePage(driver);
        		homepage.clickReviewsLink();
        		
        		Assert.assertTrue(driver.getCurrentUrl().endsWith("#reviews"),
        				"the review link did not navigate to the review");
        		
        		Assert.assertTrue(homepage.isReviewsSectionVisible(),
        				"the review section is not visible");
        		
        	} finally { driver.quit();
        		
        	}}
        
        @Test
          
          public void CateringLinkClick() {
        	  
        	  WebDriver driver = new ChromeDriver();
        	  
        	  try {
        		  
        		  driver.get("http://127.0.0.1:5500/index.html");
        		  
        		  HomePage homepage = new HomePage (driver);
        		  homepage.clickCateringLink();
        		  
        		  Assert.assertTrue(driver.getCurrentUrl().endsWith("#catering"),
        				  "the catering link navigate to catering section");
        		  
        		  Assert.assertTrue(homepage.isCateringSectionVisible(),
        				  "the catering section is not visible");
        	  }
        	  
        	  finally {
        		  
        		  driver.quit();
        	  }  
        	  
          }
        
        @Test
        
        public void ContacLinkClick() {
      	  
      	  WebDriver driver = new ChromeDriver();
      	  
      	  try {
      		  
      		  driver.get("http://127.0.0.1:5500/index.html");
      		  
      		  HomePage homepage = new HomePage (driver);
      		  homepage.clickContactLink();
      		  
      		  Assert.assertTrue(driver.getCurrentUrl().endsWith("#contact"),
      				  "the contact link navigate to catering section");
      		  
      		  Assert.assertTrue(homepage.isCateringSectionVisible(),
      				  "the contact section is not visible");
      		  
      		homepage.enterMessage("This is a test message.");

      		Assert.assertEquals(
      		    homepage.getMessageValue(),
      		    "This is a test message.",
      		    "The message field does not contain the expected text"
      		);
      		  
      		  
      	  }
      	  
      	  finally {
      		  
      		  driver.quit();
      	  }  
      	  
        }
}
           
    
