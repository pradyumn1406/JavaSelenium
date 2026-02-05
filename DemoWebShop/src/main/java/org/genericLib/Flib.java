package org.genericLib;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Random;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Flib implements FrameworkConstraints {
	
	public static  String getPropertyValue(String propertyPath,String key) 
	{
		File file = new File(propertyPath);
		FileInputStream fis = null ;
		try
		{
			fis = new FileInputStream(file);
		}
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}
		
		
		Properties prop = new Properties();
		try
		{
			prop.load(fis);
		}
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		return prop.getProperty(key);
		
	}
		
		
		public static String getWorkbookCellValue(String excelPath,String sheetName, int rowIndex, int cellIndex) {
			File file = new File(excelPath);
			FileInputStream fis = null;
			Workbook wb = null;
			try {
					fis = new FileInputStream(file);
					wb = WorkbookFactory.create(fis);
			}
			
			catch(FileNotFoundException e)
			{
				e.printStackTrace();	
			}
			
			catch (IOException e) 
			{
				e.printStackTrace();
			}
			
			catch(EncryptedDocumentException e)
			{
				e.printStackTrace();
			}
			
			String value = wb.getSheet(sheetName).getRow(rowIndex).getCell(cellIndex).toString();
			
			return value;
		
	}
		
		public static String getNumericCellValue( String excelPath, String sheetName, int rowNo, int cellNo) throws EncryptedDocumentException, IOException
		{
			FileInputStream fis = new FileInputStream(excelPath);
			 Workbook wb = WorkbookFactory.create(fis);
			 Sheet sheet = wb.getSheet(sheetName);
			 Row row = sheet.getRow(rowNo);
			 Cell cell = row.getCell(cellNo);
			 
//			 Method 1 
			 DataFormatter formate = new DataFormatter();
			 String value1 = formate.formatCellValue(cell);
			 return value1;
			 
//			  Method 2
//			  double data = cell.getNumericCellValue();
//			  int data1=(int)data;
//			  String value = String.valueOf(data1);
//            return value; 			 		
		}
		
		public static int generateRandomNo() {
			Random random= new Random();
			int rn = random.nextInt(1000,9999);
			return rn;
		}

}
