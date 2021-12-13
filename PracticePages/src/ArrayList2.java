import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ArrayList2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Tools\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		String name="Cucumber";
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		
		List<WebElement> item= driver.findElements(By.cssSelector("h4.product-name"));
		
		for(int i=0;i<item.size();i++)
		{
			String name1=item.get(i).getText();
			if(name1.contains(name)) 
			{
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
			}
		}

		
	}

}
