package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadMultipleDataFromExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("C:\\Users\\HP\\OneDrive\\Desktop\\CRM_TestScriptdata.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("Practice");
		int rowcount = sh.getLastRowNum();
		System.out.println(rowcount);
		for(int row=1;row<=rowcount;row++) {
			
			String productID = sh.getRow(row).getCell(0).getStringCellValue();
			String productName = sh.getRow(row).getCell(1).getStringCellValue();
			
			System.out.println(productID+"-->"+productName);
		}
		
	}

}
