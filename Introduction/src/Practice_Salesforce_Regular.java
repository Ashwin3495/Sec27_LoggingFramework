import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice_Salesforce_Regular {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Tools\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		driver.get("https://login.salesforce.com/?locale=in");
/*
		driver.findElement(By.xpath("//input[contains(@id,'username')]")).sendKeys("asdmmdsk#dai");
		driver.findElement(By.xpath("//input[contains(@type,'pass')]")).sendKeys("892das");
		driver.findElement(By.xpath("//*[contains(@id,'Log')]")).click();
	*/	
		//System.out.println(driver.findElement(By.xpath("//*[contains(@id,'error')]")).getText());

		driver.findElement(By.cssSelector("input[id*='username']")).sendKeys("4sda6");
		driver.findElement(By.cssSelector("[type*='pass']")).sendKeys("sadds");
		driver.findElement(By.cssSelector("[id*='Log']")).click();
		
//		System.out.println(driver.findElement(By.cssSelector("[id*='error']")).getText());
	
	
	}

}
