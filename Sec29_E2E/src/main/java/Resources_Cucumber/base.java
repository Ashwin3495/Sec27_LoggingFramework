package Resources_Cucumber;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class base {
	
	public WebDriver driver;
	public Properties prop=new Properties();
	
	public WebDriver initializeDriver() throws IOException
	{
		//prop=new Properties();
		FileInputStream fis=new FileInputStream("C:\\Users\\E245979\\eclipse-workspace\\Sec29_E2E\\src\\test\\java\\Resources\\data.properties");
	
		prop.load(fis);
		String browserName=prop.getProperty("browser");
		//String url=prop.getProperty("url");
		System.out.print(browserName);
		
		if(browserName.contains("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Tools\\chromedriver1_win32\\chromedriver.exe");
			ChromeOptions options=new ChromeOptions();
			if(browserName.contains("headless"))	//If browser name contains headless
			{
				options.addArguments("--headless");
			}
			driver = new ChromeDriver(options);
		}
		else if(browserName.equals("firefox"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Tools\\chromedriver1_win32\\chromedriver.exe");
			 driver = new ChromeDriver();
		}
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		return driver;
	}
	
	public String getScreenShotPath(String testMethodName,WebDriver driver) throws IOException
	{
		TakesScreenshot ts= (TakesScreenshot) driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		String destinationFile=System.getProperty("user.dir")+"\\reports\\"+testMethodName+".png";
		FileUtils.copyFile(source,new File(destinationFile));
		return destinationFile;
	
	}
	

}
