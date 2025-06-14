package fileUtility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {
	
   public String ReadDataFromExcelFile(String sheetName,int rowNum,int cellNum) throws EncryptedDocumentException, IOException {
	   
 
   
// Reading the data from Excel file
		FileInputStream fis1 = new FileInputStream("./configAppData/CRM_TestScriptData.xlsx");
		Workbook wb = WorkbookFactory.create(fis1);
		String data = wb.getSheet(sheetName).getRow(rowNum).getCell(cellNum).getStringCellValue();
		wb.close();
		return data;
   
   }
   
   public int getRowCount(String sheetName) throws EncryptedDocumentException, IOException {
	   FileInputStream fis1 = new FileInputStream("C:\\Users\\HP\\OneDrive\\Desktop\\CRM_TestScriptdata.xlsx");
		Workbook wb = WorkbookFactory.create(fis1);
	   int rowCount = wb.getSheet(sheetName).getLastRowNum();
	return rowCount;
	   
   }
}
