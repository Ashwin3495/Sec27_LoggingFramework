package test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Resource.Main_driver;

public class Login extends Main_driver {
	public  WebDriver driver;
	@BeforeTest 
	public void SignIn() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Tools\\chromedriver1_win32\\chromedriver.exe");
		driver = new ChromeDriver();
	
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		Thread.sleep(2000);	
		
	}
	
	@Test(dependsOnMethods= {"SignIn"}) 
	public void logon() throws InterruptedException
	{
		WebDriverWait wait=new WebDriverWait(driver,300);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[id='name']")));
		
		driver.findElement(By.cssSelector("input[id='name']")).sendKeys("Admin");
		driver.findElement(By.cssSelector("input[name='password']")).sendKeys("Visean");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@class='centro-sign-in']")).sendKeys(Keys.ENTER);
		Thread.sleep(18000);
		System.out.println(driver.findElement(By.cssSelector("a[id='Listings']")).getText());

	}
	
	@Test (dependsOnMethods= {"logon"})
	public void List() throws InterruptedException
	{
//		System.out.print("dfdfdfsdsf");
		//Thread.sleep(5000);
		//driver.findElement(By.xpath("//a[@id='Listings']/i[2]")).click();
		WebDriverWait wait=new WebDriverWait(driver,300);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='Listings']/i[2]")));
		driver.findElement(By.cssSelector("a[id='Listings']")).click();
	}

	@AfterTest
	public void close()
	{
		driver.close();
	}
	
	
	
}
