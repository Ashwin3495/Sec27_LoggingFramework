import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Scroll {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Tools\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

			driver.get("https://rahulshettyacademy.com/AutomationPractice/");
			
			JavascriptExecutor js=(JavascriptExecutor) driver;
			
			js.executeScript("window.scroll(0,500)");
			Thread.sleep(3000);
			js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");
			
			List<WebElement> list=driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
			int sum=0;
			for(int i=0;i<list.size();i++) {
			
			sum=sum+Integer.parseInt(list.get(i).getText());
			
			}
			System.out.println(sum);
			String s=driver.findElement(By.cssSelector(".totalAmount")).getText().split(":")[1].trim();

			Assert.assertEquals(sum, Integer.parseInt(s));
			
			List<WebElement> rows=driver.findElements(By.xpath("//table[@class='table-display'] //tbody/tr"));
			System.out.println(rows.size());
			
			List<WebElement> cols=driver.findElements(By.xpath("//table[@class='table-display'] //tbody/tr/th"));
			System.out.println(cols.size());
			
			System.out.println(driver.findElement(By.xpath("//table[@class='table-display'] //tbody/tr[3]")).getText());
			driver.findElement(By.xpath("//table[@class='table-display'] //tbody/tr[3]/td(0)")).getText();
	}

}
