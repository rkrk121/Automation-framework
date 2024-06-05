package genericutility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class ExcelUtility 
{
	public String getStringDataFromExcel(String sheetname, int rowNum, int colNum)throws EncryptedDocumentException, IOException 
	{
		FileInputStream fis = new FileInputStream("./src\\test\\resources\\Testscriptdata.xlsx");
		Workbook wk = WorkbookFactory.create(fis);
		String url = wk.getSheet(sheetname).getRow(rowNum).getCell(colNum).getStringCellValue();
		return url;

	}
	public boolean getBooleanDataFromExcel(String sheetname, int rowNum, int colNum)throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream("./src\\test\\resources\\Testscriptdata.xlsx");
		Workbook wk = WorkbookFactory.create(fis);
		boolean b = wk.getSheet(sheetname).getRow(rowNum).getCell(colNum).getBooleanCellValue();
		return b;
	}

	public double getNumricDataFromExcel(String sheetname, int rowNum, int colNum)throws EncryptedDocumentException, IOException 
	{
		FileInputStream fis = new FileInputStream("./src\\test\\resources\\Testscriptdata.xlsx");
		Workbook wk = WorkbookFactory.create(fis);
		double num = wk.getSheet(sheetname).getRow(rowNum).getCell(colNum).getNumericCellValue();
		return num;
	}

	public LocalDateTime getDateAndtimeFromExcel(String sheetname, int rowNum, int colNum)throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream("./src\\test\\resources\\Testscriptdata.xlsx");
		Workbook wk = WorkbookFactory.create(fis);
		LocalDateTime dateAndTime = wk.getSheet(sheetname).getRow(rowNum).getCell(colNum).getLocalDateTimeCellValue();
		return dateAndTime;
	}

}
