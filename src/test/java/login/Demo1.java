package login;


import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import genericutility.ExcelUtility;

public class Demo1 {
	@Test
	public void test() throws EncryptedDocumentException, IOException 
	{
		ExcelUtility efile = new ExcelUtility();
		String url = efile.getStringDataFromExcel("Sheet1", 1, 0);
		boolean b = efile.getBooleanDataFromExcel("Sheet1", 1, 1);
		double x = efile.getNumricDataFromExcel("Sheet1", 1, 2);
		  String date = efile.getStringDataFromExcel("Sheet1", 1, 3);
		System.out.println(url+b+x+date);
		
		//WebDriver driver = new ChromeDriver();
		//driver.get(url);
	}

}
