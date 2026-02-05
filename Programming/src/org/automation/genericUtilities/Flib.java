package org.automation.genericUtilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Flib implements FrameworkConstraints {
	
	public static  String getPropertyValue(String key) 
	{
		File file = new File(PATH_PROPERTIES);
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
		
		
		public static String getWorkbookCellValue(String sheetName, int rowIndex, int cellIndex) {
			File file = new File(PATH_EXCEL);
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

}
