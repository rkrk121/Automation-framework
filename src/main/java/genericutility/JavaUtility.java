package genericutility;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavaUtility {
	String timeStamp;

	public String getSystemTime() {

		String timeStamp = LocalDateTime.now().toString().replace(":", "-");
		return timeStamp;

	}

	public void getWebElementScreenShot(WebElement ele) throws IOException {
		JavaUtility ju = new JavaUtility();
		timeStamp=ju.getSystemTime();
		String eleName = ele.getText();
		File TemporaryFile = ele.getScreenshotAs(OutputType.FILE);
		File PermanentFile = new File("./ERROR_SHOT/" + timeStamp + "_WebPage_"+eleName + ".png");
		FileUtils.copyFile(TemporaryFile, PermanentFile);
	}

	public void getWebPageScreenShot(WebDriver driver) throws IOException {
		JavaUtility ju = new JavaUtility();
		timeStamp=ju.getSystemTime();
		String title = driver.getTitle();
		TakesScreenshot ts = (TakesScreenshot) driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File perma = new File("./ERROR_SHOT/"+ timeStamp + "_WebElement_"+title + ".png");
		FileUtils.copyFile(temp, perma);
	}

}
