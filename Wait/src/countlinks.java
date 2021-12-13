import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class countlinks {

	public static void main(String[] args){
		System.setProperty("webdriver.chrome.driver", "C:\\Tools\\chromedriver1_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/#!");
		
		System.out.println(driver.findElements(By.tagName("a")).size());
		WebElement a= driver.findElement(By.id("gf-BIG"));
		System.out.println(a.findElements(By.tagName("a")).size());
		
		WebElement b=driver.findElement(By.xpath("//div[@id='gf-BIG']/table/tbody/tr/td[1]/ul"));
		System.out.println(b.findElements(By.tagName("a")).size());
		
		//Click on each link present in the box and open it in new window
		for(int i=1 ;i<b.findElements(By.tagName("a")).size();i++)
		{
			//String click1=Keys.chord(Keys.CONTROL,Keys.ENTER);
			b.findElements(By.tagName("a")).get(i).sendKeys(Keys.CONTROL,Keys.ENTER);
		}
		//Get Title of each window that is open
		Set<String>abc= driver.getWindowHandles();
		Iterator<String> it= abc.iterator();
		
		while(it.hasNext()) 
		{
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
			driver.close();	// closes tab one by one
			//driver.quit();	//closes entire application
			
		}
		
	}

}
