package genericutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class WebDriverUtility
{
	public void doubleclick(WebDriver driver,WebElement element)
	{
		Actions act = new Actions(driver);
		act.doubleClick(element).perform();
	}

	public void dragAndDrop(WebDriver driver, WebElement src,WebElement dest)
	{
		Actions act =  new Actions(driver);
		act.dragAndDrop(src, dest).perform();
	}
	
	public void  mouseHover(WebDriver driver, WebElement ele)
	{
		Actions act = new Actions(driver);
		act.moveToElement(ele);
	}
	
	public WebDriver switchToFrame(WebDriver driver, int index)
	{
		return driver.switchTo().frame(index);
	}
	
	public WebDriver switchToFrame(WebDriver driver, String nameorid)
	{
		return driver.switchTo().frame(nameorid);
	}
	
	public WebDriver switchToFrame(WebDriver driver, WebElement ele)
	{
		return driver.switchTo().frame(ele);
	}
}
