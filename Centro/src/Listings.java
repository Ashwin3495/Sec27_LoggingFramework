
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;


public class Listings extends Centro_1 {
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub		
		//driver = initializeDriver();
		Login();
		Listing();
		MetaData();
		
	}
	
		@Test
		public static void Listing() {			
			WebDriverWait wait=new WebDriverWait(driver,15);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("a[id='Listings']")));
			
			driver.findElement(By.cssSelector("a[id='Listings']")).click();		
	}
		@Test
		public static void MetaData() {
			WebDriverWait wait=new WebDriverWait(driver,15);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[id='Metadata']")));
			
			driver.findElement(By.cssSelector("[id='Metadata']")).click();
			driver.findElement(By.cssSelector("//div[@class='ui-dropdown-trigger ui-state-default ui-corner-right']")).click();
			
			List<WebElement> list=driver.findElements(By.xpath("//div[@class='ui-dropdown-items-wrapper']/ul"));
			
			for(int i=0;i<list.size();i++)
			{
				System.out.println(list.get(i).getText());
			}
			
		}

}
