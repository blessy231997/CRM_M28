package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo {
	@Test(priority = -11,invocationCount = 5,threadPoolSize = 2)
	public void students() {
	WebDriver driver= new ChromeDriver();
	}
	
	@Test
	public void coolTeacher() {
		Reporter.log("coolTeacher", true);
	}
	@Test(priority = 1)
	public void Blessy() {
		Reporter.log("Blessy", true);
	}
    @Test(priority = 3)
    public void karthik() {
    	Reporter.log("karthik", true);
    }
}
