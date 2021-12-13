import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AutoSuggestive_DropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Tools\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.cssSelector("input#autocomplete")).sendKeys("Ind");
		Thread.sleep(2000);
		
		List<WebElement> list= driver.findElements(By.xpath("//ul[@id='ui-id-1']/li/div"));
		Actions a=new Actions(driver);
		for(WebElement list1:list) {
			if(list1.getText().equalsIgnoreCase("India")) {
				a.moveToElement(list1).build().perform();
				break;
			}
		}
		
	}

}
