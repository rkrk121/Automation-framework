package genericutility;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import objectrepository.HomePage;
import objectrepository.LoginPage;
import objectrepository.WelcomePage;

public class BaseClass 
{
	public static WebDriver driver;
	public FileUtility futil;
	public WelcomePage wp;
	public LoginPage lp;
	public HomePage hp;
	
	
	@BeforeClass
	public void launchBrowser() throws IOException
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		futil = new FileUtility();
		String url = futil.getDataFromProperty("url");
		driver.get(url);
		
	}
	@BeforeMethod
	public void login() throws IOException
	{
		wp =new WelcomePage(driver);
		wp.getLoginlink().click();
		
		lp = new LoginPage(driver);
		String EMAIL = futil.getDataFromProperty("email");
		lp.getEmialTextfield().sendKeys(EMAIL);
		String PASS = futil.getDataFromProperty("password");
		lp.getPasswordTextfield().sendKeys(PASS);
		lp.getLoginButton().click();
		
		}
	
	
	@AfterMethod
	public void logout() 
	{
		
		hp.getLogoutlink().click();
	}
	
	@AfterClass
	public void closebrowser()
	{
		driver.quit();
	}

}
