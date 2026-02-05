package org.automation.testNG.dataProvider;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ToReadMultipleDataExcel {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("C:\\Users\\HP\\eclipse-workspace\\Programming\\jars\\DataDriven\\DWS.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet("Logins");
		int rowCount = sheet.getPhysicalNumberOfRows()-1;
		System.out.println(rowCount);
		int cellCount = sheet.getRow(1).getPhysicalNumberOfCells();//2
		System.out.println(cellCount);
		
		String [] [] data = new String [rowCount] [cellCount];
		
	}

}
