package login;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import genericutility.FileUtility;

public class Demo 
{
	@Test
	public void test () throws IOException, InterruptedException
	 {
		FileUtility futil = new FileUtility();
		String url = futil.getDataFromProperty("url");
		 System.out.println(url);
		 WebDriver driver = new ChromeDriver();
		 driver.get(url);
		 Thread.sleep(5);
		 driver.quit();
		
	 }

}
