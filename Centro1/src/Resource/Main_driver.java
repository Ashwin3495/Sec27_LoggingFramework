package Resource;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main_driver {
	public WebDriver driver;
	public Properties prop=new Properties();
	
	public WebDriver initializeDriver() throws IOException
	{
		//Properties prop=new Properties();
		FileInputStream fis=new FileInputStream("C:\\Users\\E245979\\eclipse-workspace\\Centro1\\src\\Resource\\data.properties");
	
		prop.load(fis);
		String browserName=prop.getProperty("browser");
		System.out.print(browserName);
		
		if(browserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Tools\\chromedriver1_win32\\chromedriver.exe");
			 driver = new ChromeDriver();
		}
		else if(browserName.equals("firefox"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Tools\\chromedriver1_win32\\chromedriver.exe");
			 driver = new ChromeDriver();
		}
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		return driver;
	}
}
