
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FacebookLogin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","/Users/printal/Desktop/ChromeDriver/chromedriver");

		//Create a map to store  preferences 
		Map<String, Object> prefs = new HashMap<String, Object>();

		//add key and value to map as follow to switch off browser notification
		//Pass the argument 1 to allow and 2 to block
		prefs.put("profile.default_content_setting_values.notifications", 2);

		//Create an instance of ChromeOptions 
		ChromeOptions options = new ChromeOptions();

		// set ExperimentalOption - prefs 
		options.setExperimentalOption("prefs", prefs);

		//Now Pass ChromeOptions instance to ChromeDriver Constructor to initialize chrome driver which will switch off this browser notification on the chrome browser
		WebDriver driver = new ChromeDriver(options);
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//open the browser in maximize mode
		driver.manage().window().maximize();
        
		//get command to open URL in browser
        driver.get("https://www.facebook.com");
        
        //Locate the email id field on facebook login page and send values in it.
        driver.findElement(By.id("email")).sendKeys("6823024424");
        
        //Locate the password filed on facebook login page and send values in it.
        driver.findElement(By.id("pass")).sendKeys("Facebook*2020");
        
        //Given wait to so that user can see all actions happening.
        Thread.sleep(3000);
        
        //Locate Log in locator and click on it.
        driver.findElement(By.xpath("//button[@id='u_0_b']")).click(); 
        Thread.sleep(3000);
        
        //Locate the search bar and send Fetch Rewards value in it.
        driver.findElement(By.xpath("//div/input[2]")).sendKeys("Fetch Rewards");
        Thread.sleep(2000);
        
        //Locate the magnifying glass and click on it
        driver.findElement(By.xpath("//button/i")).click();
        Thread.sleep(2000);
        
        //Search Fetch Rewards link and click on it
        driver.findElement(By.linkText("Fetch Rewards")).click();
        Thread.sleep(2000);
        
        //Locate the Like button and click on it
        driver.findElement(By.xpath("//span/button")).click();
        Thread.sleep(2000);
        
        //Close the browser once all actions are completed.
        driver.close();
	}
	
}
