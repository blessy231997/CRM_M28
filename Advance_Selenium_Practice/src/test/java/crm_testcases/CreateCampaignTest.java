package crm_testcases;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import baseclass.BaseClass;
import fileutility.ExcelUtility;
import javautility.JavaUtility;
import objectRepository.CampaignPage;
import objectRepository.HomePage;
import webDriverUtility.WebDriverUtility;

public class CreateCampaignTest extends BaseClass {

	@Test
	public void CreateCampaignWithMandatoryFields() throws EncryptedDocumentException, IOException{
		
		ExcelUtility eLib = new ExcelUtility();
		String campName = eLib.ReadDataFromExcelFile("Campaign", 7, 2);
		String targetSize = eLib.ReadDataFromExcelFile("Campaign", 7, 3);

		JavaUtility jLib = new JavaUtility();
		int randomInt = jLib.getRandomNumber();
		String campaignName = campName + randomInt;

		WebDriverUtility wLib = new WebDriverUtility();
        HomePage hp = new HomePage(driver);
        CampaignPage campaignPage = new CampaignPage(driver);
		
    	// Validation
		wLib.waitForVisibilityOfWebElement(driver, hp.getToastMsg());
		String msg = hp.getToastMsg().getText();
		if (msg.contains(campaignName))
			System.out.println("Campaign Created");
		else
			System.out.println("Campaign Not Created");
		hp.getCloseToastMsg().click();	
		
	}
	@Test
    public void CreateCampaignWithStatusTest() {
    	
    }
	@Test
	public void createCampaignWithExpectedCloseDateTest() {
		
	}
}
