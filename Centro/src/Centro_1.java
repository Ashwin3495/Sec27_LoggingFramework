import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.util.function.Function;

public class Centro_1 {

	public static WebDriver driver;
	private static WebElement foo;
	
	
	public static void main(String[] args) throws InterruptedException 
	{
		Login();
		Listing();
		MetaData();
		
	}
	
	public static void Login() throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Tools\\chromedriver1_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("http://usdcoswappdv046/RTDM/#/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebDriverWait wait=new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[id='name']")));
		
		driver.findElement(By.cssSelector("input[id='name']")).sendKeys("Admin");
		driver.findElement(By.cssSelector("input[name='password']")).sendKeys("Admin@1234");
		driver.findElement(By.xpath("//*[@class='centro-sign-in']")).sendKeys(Keys.ENTER);
		
		//Thread.sleep(5000);
	}
	
	public static void Listing() throws InterruptedException 
	{			
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebDriverWait wait=new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("a[id='Listings']")));
		new WebDriverWait(driver, 20).until(
			       ExpectedConditions.jsReturnsValue(
			                   "return document.getElementById('Listings') == 'complete' ? true : false"));

		System.out.println(driver.findElement(By.cssSelector("a[id='Listings']")).getText());
		driver.findElement(By.cssSelector("a[id='Listings']")).click();	
	}
	
	public static void MetaData() throws InterruptedException 
	{
		new WebDriverWait(driver, 20).until(
			       ExpectedConditions.jsReturnsValue(
			                   "return document.readyState === 'complete' ? true : false"));
		//WebDriverWait wait=new WebDriverWait(driver,30);
		//wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[id='Metadata']")));
		
		driver.findElement(By.cssSelector("[id='Metadata']")).click();
		
		//wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("span[class='ui-dropdown-trigger-icon ui-clickable pi pi-chevron-down']")));
		driver.findElement(By.cssSelector("span[class='ui-dropdown-trigger-icon ui-clickable pi pi-chevron-down']")).click();
		
		List<WebElement> list=driver.findElements(By.xpath("//div[@class='ui-dropdown-items-wrapper']/ul"));
		
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i).getText());
		}
		
	}

}
