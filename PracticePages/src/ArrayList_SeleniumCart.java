import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ArrayList_SeleniumCart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Tools\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		int j=0;
		String[] items1 = { "Cucumber", "Brocolli", "Brinjal","Carrot","Beetroot" };
		List<WebElement> items = driver.findElements(By.cssSelector("h4.product-name"));

		for (int i = 0; i < items.size(); i++) 
		{
			String[] name = items.get(i).getText().split("-");
			String formattedName=name[0].trim();

			//format it to actual vegetable name by removing spaces or trimming the name(- 1 kg)
			// Convert Array to ArrayList
			//check name extracted is present in array list or not
			List items2 = Arrays.asList(items1);
			
			
			if (items2.contains(formattedName)) 
			{
				j++;
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				if(j==formattedName.length())
				{
					break;
				}
			}

		}

	}

}
