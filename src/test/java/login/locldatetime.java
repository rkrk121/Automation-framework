package login;

import org.testng.Reporter;
import org.testng.annotations.Test;

import genericutility.JavaUtility;

public class locldatetime
{
	@Test
	public void timeprint()
	{
		JavaUtility ju =new JavaUtility();
		String s=ju.getSystemTime();
		Reporter.log("Local date and time" + s ,true);
		
	
	}

}
