import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Array_SeleniumCart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Tools\\chromedriver1_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");

		List<WebElement> list = driver.findElements(By.cssSelector("h4.product-name"));
		System.out.println(list);

		for (int i = 0; i < list.size(); i++) {
			// Store the name of products in string
			String name = list.get(i).getText();
			
			System.out.println(list.get(i).getText());

			if (name.contains("Cucumber")) {
				driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
				// get(i).click() - used to get the index/postion whereAdd to cart is clicked
				break;
			}
		}

	}

}
