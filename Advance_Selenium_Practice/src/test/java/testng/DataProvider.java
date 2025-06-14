package testng;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class DataProvider {
	@Test(dataProvider = "loginDetails")
	public void login(String username,String password) {
		System.out.println(username+"----->"+password);
	}

	@org.testng.annotations.DataProvider
	
	public Object[][] loginDetails() throws EncryptedDocumentException, IOException{
		
		FileInputStream fis=new FileInputStream("C:\\Users\\HP\\OneDrive\\Desktop\\CRM_TestScriptdata.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("Login");
		int rowcount = sh.getLastRowNum();
		System.out.println(rowcount);
		Object[][] objArr=new Object[rowcount][2];
		for(int i=0;i<rowcount;i++) {
			objArr[i][0]=sh.getRow(i+1).getCell(0).getStringCellValue();
			objArr[i][1]=sh.getRow(i+1).getCell(1).getStringCellValue();
			
		}
		
		return objArr;
		
	}
}
