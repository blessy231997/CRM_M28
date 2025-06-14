package DataDrivenTesting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CreateCampaignWithStatusTest {

	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		//Login to NINZA CRM 
		driver.get("http://49.249.28.218:8098/");
		driver.findElement(By.id("username")).sendKeys("rmgyantra");
		driver.findElement(By.id("inputPassword")).sendKeys("rmgy@9999");
		driver.findElement(By.xpath("//button[text()='Sign In']")).click();
		
		//Create Campaign
       driver.findElement(By.xpath("//span[text()='Create Campaign']")).click();
       driver.findElement(By.name("campaignName")).sendKeys("Campaign1234");
       WebElement targetSize = driver.findElement(By.name("targetSize"));
       driver.findElement(By.name("campaignStatus")).sendKeys("Pass");
       targetSize.clear();
       targetSize.sendKeys("5");
       driver.findElement(By.xpath("//button[text()='Create Campaign']")).click();
       
      
       //Validating
       WebElement toastMsg = driver.findElement(By.xpath("//div[@role='alert']"));
       WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
       wait.until(ExpectedConditions.visibilityOf(toastMsg));
       String msg = toastMsg.getText();
       if(msg.contains("Campaign1234"))
    	   System.out.println("Campaign Created");
       else
    	   System.out.println("Campaign Not Created");
       driver.findElement(By.xpath("//button[@aria-label='close']")).click();
       
       //Logout
       WebElement userIcon = driver.findElement(By.xpath("//div[@class='user-icon']"));
       Actions action=new Actions(driver);
       action.moveToElement(userIcon).perform();
       WebElement logoutBtn = driver.findElement(By.xpath("//div[@class='dropdown-item logout']"));
       action.moveToElement(logoutBtn).click().perform();
       
       driver.quit();


	}

}
