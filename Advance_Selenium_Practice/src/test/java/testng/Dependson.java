package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Dependson {
  WebDriver driver;
	@Test
	public void students() {
		driver=new ChromeDriver();
		Reporter.log("students", true);
	}
	@Test(dependsOnMethods ="students")
	public void advanceSelenium() {
		driver.get("https://www.instagram.com/");
		Reporter.log("advanceSelenium", true);
	}
	@Test(dependsOnMethods = {"advanceSelenium","students"})
	public void test() {
		driver.findElement(By.name("username")).sendKeys("fjhsiuhfk");
		Reporter.log("test", true);
	}
}
