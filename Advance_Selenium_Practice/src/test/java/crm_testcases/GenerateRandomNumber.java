package crm_testcases;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GenerateRandomNumber {

	public static void main(String[] args) throws IOException {
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		//Create java representation object of physical file 
		  FileInputStream fis=new FileInputStream("C:\\Users\\HP\\OneDrive\\Desktop\\login.properties.txt"); 
		  //Create an object of Properties 
		  Properties prop=new Properties(); 
		  //Load all the keys 
		  prop.load(fis); 
		  String browser = prop.getProperty("Browser"); 
		  String url = prop.getProperty("Url"); 
		  String username = prop.getProperty("Username"); 
		  String password = prop.getProperty("Password"); 
		   
		 WebDriver driver1 = null;
		  if(browser.equalsIgnoreCase("CHROME")) 
		   driver1=new ChromeDriver(); 
		  else if(browser.equalsIgnoreCase("Edge")) 
		   driver1=new EdgeDriver(); 
		  else if(browser.equalsIgnoreCase("Firefox")) 
		   driver1=new FirefoxDriver(); 
		  else if(browser.equalsIgnoreCase("Safari")) 
		   driver1=new SafariDriver(); 
		
		//Login to NINZA CRM 
		driver1.get("http://49.249.28.218:8098/");
		driver1.findElement(By.id("username")).sendKeys("rmgyantra");
		driver1.findElement(By.id("inputPassword")).sendKeys("rmgy@9999");
		driver1.findElement(By.xpath("//button[text()='Sign In']")).click();
		
		//Create Campaign
//       driver.findElement(By.xpath("//span[text()='Create Campaign']")).click();
//       driver.findElement(By.name("campaignName")).sendKeys("Campaign1234");
//       WebElement targetSize = driver.findElement(By.name("targetSize"));
//       targetSize.clear();
//       targetSize.sendKeys("5");
//       driver.findElement(By.xpath("//button[text()='Create Campaign']")).click();
//       
//      
//       //Validating
//       WebElement toastMsg = driver.findElement(By.xpath("//div[@role='alert']"));
//       WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
//       wait.until(ExpectedConditions.visibilityOf(toastMsg));
//       String msg = toastMsg.getText();
//       if(msg.contains("Campaign1234"))
//    	   System.out.println("Campaign Created");
//       else
//    	   System.out.println("Campaign Not Created");
//       driver.findElement(By.xpath("//button[@aria-label='close']")).click();
//       
//       //Logout
//       WebElement userIcon = driver.findElement(By.xpath("//div[@class='user-icon']"));
//       Actions action=new Actions(driver);
//       action.moveToElement(userIcon).perform();
//       WebElement logoutBtn = driver.findElement(By.xpath("//div[@class='dropdown-item logout']"));
//       action.moveToElement(logoutBtn).click().perform();
       
       driver1.quit();


	}

}
