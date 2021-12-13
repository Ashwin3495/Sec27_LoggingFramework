import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GooglePractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Tools\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		WebDriverWait wait= new WebDriverWait(driver,11);
		driver.findElement(By.id("alert")).click();
		
		wait.until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert().accept();
		
		driver.findElement(By.id("populate-text")).click();
		
		//When the 
		WebElement countdownTime=driver.findElement(By.cssSelector("h2[id='h2']"));		
		wait.until(ExpectedConditions.not(ExpectedConditions.textToBePresentInElement(countdownTime,"site")));
		
		System.out.println(driver.findElement(By.cssSelector("h2[id='h2']")).getText());
		
		driver.findElement(By.id("display-other-button")).click();
		System.out.println(driver.findElement(By.id("hidden")).isEnabled());
		
		

	}

}
