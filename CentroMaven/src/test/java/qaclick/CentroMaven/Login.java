package qaclick.CentroMaven;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
public class Login {
	
	public static WebDriver driver;
@Test
public void SignIn() {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Tools\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("http://usdcoswapppd015/RTDM/#/");
		driver.findElement(By.id("name")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("Admin@1234");
		driver.findElement(By.cssSelector("[class='centro-sign-in']")).sendKeys(Keys.ENTER);
}

@AfterTest
public void DH()
{
	driver.findElement(By.cssSelector("a[id='USDCOSWAPPPD015']")).click();
}
}
