package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class CreateContactsWithMandotoryFieldsTest {

	public static void main(String[] args) throws IOException {
		
      //login Ninza CRM
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("http://49.249.28.218:8098/");
		// Create java representation object of physical file
				FileInputStream fis = new FileInputStream("C:\\Users\\HP\\OneDrive\\Desktop\\login.properties.txt");
				// Create an object of Properties
				Properties prop = new Properties();
				// Load all the keys
				prop.load(fis);
				String browser = prop.getProperty("Browser");
				String url = prop.getProperty("Url");
				String username = prop.getProperty("Username");
				String password = prop.getProperty("Password");
				
				// Reading the data from Excel file
				FileInputStream fis1 = new FileInputStream("C:\\Users\\HP\\OneDrive\\Desktop\\CRM_TestScriptdata.xlsx");
				Workbook wb = WorkbookFactory.create(fis1);
				Row r = wb.getSheet("Campaign").getRow(4);
				String campaignName = r.getCell(2).getStringCellValue();
				String targetSize = r.getCell(3).getStringCellValue();
				//String status = r.getCell(4).getStringCellValue();
				wb.close();
				
				WebDriver driver1 = null;
				if (browser.equalsIgnoreCase("CHROME"))
					driver1 = new ChromeDriver();
				else if (browser.equalsIgnoreCase("Edge"))
					driver1 = new EdgeDriver();
				else if (browser.equalsIgnoreCase("Firefox"))
					driver1 = new FirefoxDriver();
				else if (browser.equalsIgnoreCase("Safari"))
					driver1 = new SafariDriver();
				
				// Login to NINZA CRM
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
				driver.get(url);
				driver.findElement(By.id("username")).sendKeys(username);
				driver.findElement(By.id("inputPassword")).sendKeys(password);
				driver.findElement(By.xpath("//button[text()='Sign In']")).click();
				
				
				//create contact
				
				
				
				
				
	}

}
