package crm_testcases;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataFromExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
	     FileInputStream fis =new FileInputStream("C:\\Users\\HP\\OneDrive\\Desktop\\CRM_TestScriptdata.xlsx");
	     //open excel in read mode
	     Workbook wb = WorkbookFactory.create(fis);
	     //get control of the sheet
	     Sheet sh = wb.getSheet("Campaign");
	     //get control of the row
	    Row r = sh.getRow(1);	
	    //get the control of cell
	    Cell c = r.getCell(2);
	    
	    String campaignName = c.getStringCellValue();
		System.out.println(campaignName);
		
		String targetSize = r.getCell(3).getStringCellValue();
		System.out.println(targetSize);
		
		//close the workbook
		wb.close();
	     
	}

}
