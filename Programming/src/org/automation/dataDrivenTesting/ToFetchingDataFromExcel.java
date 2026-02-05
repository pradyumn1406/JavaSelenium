package org.automation.dataDrivenTesting;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import static org.automation.genericUtilities.FrameworkConstraints.*;


public class ToFetchingDataFromExcel {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		File file = new File(PATH_EXCEL);
		FileInputStream fis = new FileInputStream(file);
		
		
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet("Register");
		Row row = sheet.getRow(1);
		Cell cell= row.getCell(3);
		System.out.println(cell.toString());
		
		
	}

}
