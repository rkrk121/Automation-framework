package genericutility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class FileUtility
{
	public String getDataFromProperty(String Key) throws IOException
	{
		FileInputStream fis = new FileInputStream("./src/test/resources/commandata.properties");
		Properties prop = new Properties();
		prop.load(fis);
		return prop.getProperty(Key);
	}

}
