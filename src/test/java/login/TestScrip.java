package login;

import java.io.IOException;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericutility.BaseClass;
import genericutility.JavaUtility;
import genericutility.ListenerUtility;
import objectrepository.HomePage;

@Listeners(ListenerUtility.class)
public class TestScrip extends BaseClass
{
	@Test 
	public void click() throws IOException
	{
		
		Assert.fail();
		Reporter.log("Login to the application successfully",true);
		hp =new HomePage(driver);
		hp.getComputerTab().click();
		Reporter.log("Computer tab open ",true);
		JavaUtility ju = new JavaUtility();
		ju.getWebPageScreenShot(driver);
		ju.getWebElementScreenShot(hp.getComputerTab());
	}
	
	

}
