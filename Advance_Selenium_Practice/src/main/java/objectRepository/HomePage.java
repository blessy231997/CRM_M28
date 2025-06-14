package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import webDriverUtility.WebDriverUtility;

public class HomePage {
	WebDriver driver;
	WebDriverUtility wLib=new WebDriverUtility();
	
	public HomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//span[text()='Create Campaign']")
	private WebElement createCampaignBtn;
	
	@FindBy(linkText = "Contacts")
	private WebElement contactsBtn; 
	
	@FindBy(className = "user-icon")
	private WebElement userIcon;
	
	@FindBy(xpath = "//div[text()='Logout ']")
	private WebElement logoutBtn;
	
	public WebElement getCreateCampaignBtn() {
		return createCampaignBtn;
	}

	public WebElement getContactsBtn() {
		return contactsBtn;
	}

	public WebElement getUserIcon() {
		return userIcon;
	}

	public WebElement getLogoutBtn() {
		return logoutBtn;
	}

	public void logout() {
		wLib.mouseHoverOnWebElement(driver, userIcon);
		wLib.clickOnWebElement(driver, logoutBtn);
	
	}

}


