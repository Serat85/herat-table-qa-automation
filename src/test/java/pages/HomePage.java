package pages;
import org.openqa.selenium.WebElement;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

    public class HomePage {
    private WebDriver driver;
    private By mainHeading = By.tagName("h1");
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public String getMainHeadingText() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        return wait.until(
            ExpectedConditions.visibilityOfElementLocated(mainHeading)
        ).getText();   }
          
        public void clickMenuLink() {
            driver.findElement(By.cssSelector("#site-nav a[href='#menu']")).click();
        }

        public boolean isMenuSectionVisible() {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            return wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.id("menu"))
            ).isDisplayed();
        }
        
        public void clickAboutLink() {
            driver.findElement(By.cssSelector("#site-nav a[href='#about']")).click();
        }

        public boolean isAboutSectionVisible() {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            return wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.id("about"))
            ).isDisplayed();
        }
        
        public void clickLocationLink() {
        	driver.findElement(By.cssSelector("#site-nav a[href='#location']")).click();
        
        }
        public boolean isLocationSectionVisible1() {
        	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        	return wait.until(
        			ExpectedConditions.visibilityOfElementLocated(By.id("location"))
        		).isDisplayed();
        }
        
         public void clickReviewsLink() {
        	 
        	 driver.findElement(By.xpath("//a[@href='#reviews']")).click();
        	 
         }
         
         public boolean isReviewsSectionVisible() {
        	 
        	 WebDriverWait wait  = new WebDriverWait(driver, Duration.ofSeconds(10));
			return wait.until(
		 ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@href='#reviews']")))
					.isDisplayed();
        	 
         }

		
         public void clickCateringLink() {
        	 
        	 
        	 driver.findElement(By.cssSelector("a[href='#catering']")).click();
        	 
         }
      
         public boolean isCateringSectionVisible() {
        	 
        	 WebDriverWait wait = new WebDriverWait (driver, Duration.ofSeconds(10));
        	 return wait.until
       (ExpectedConditions.visibilityOfElementLocated(By.cssSelector("a[href='#catering']")))
       .isDisplayed();
        	 
        	
        	 
         }
         
          public void clickContactLink() {
        	 
        	 
        	 driver.findElement(By.cssSelector("a[href='#contact']")).click();
        	 
         }
      
         public boolean isContactSectionVisible() {
        	 
        	 WebDriverWait wait = new WebDriverWait (driver, Duration.ofSeconds(10));
        	 return wait.until
       (ExpectedConditions.visibilityOfElementLocated(By.cssSelector("a[href='#contact']")))
       .isDisplayed();
        	 
        	
        	 
         }
         
         
         public void enterMessage(String message) {
        	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        	    WebElement messageField = wait.until(
        	        ExpectedConditions.visibilityOfElementLocated(By.name("message"))
        	    );

        	    messageField.clear();
        	    messageField.sendKeys(message);
        	}

        	public String getMessageValue() {
        	    return driver.findElement(By.name("message")).getDomProperty("value");
        	}
		} 
    

    
		
    