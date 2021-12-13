import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ArrayList2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Tools\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		String[] name = { "Cucumber", "Brocolli", "Beetroot", "Carrot", "Carrot" };

		addItems(name, driver);
		ArrayList2_1 b = new ArrayList2_1();
		b.addItems(name, driver);
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		driver.findElement(By.xpath("//div[@class='action-block']/button")).click();

		// Implicit wait - Will apply for all the elements present in the page
		// Implicit used in main is a global variable
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		WebDriverWait w=new WebDriverWait(driver,5);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.promoCode")));
		driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("button.promoBtn")).click();

		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
		System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());

		driver.findElement(By.xpath("//button[contains(text(),'Place Order')]")).click();

	}

	public static void addItems(String[] name, WebDriver driver) {
		int j = 0;
		List<WebElement> item = driver.findElements(By.cssSelector("h4.product-name"));

		for (int i = 0; i < item.size(); i++) {
			// Entire steps needs to be practiced
			String[] name1 = item.get(i).getText().split("-");
			String formattedname = name1[0].trim();

			List a = Arrays.asList(name);

			if (a.contains(formattedname)) {
				j++;
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				System.out.println(formattedname.length());
				if (j == formattedname.length()) {
					System.out.print(formattedname.length());
					break;
				}
			}

		}

	}

}
