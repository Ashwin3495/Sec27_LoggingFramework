import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

public class AutoSuggest_DD {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Tools\\chromedriver1_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/dropdownsPractise/#");
		driver.findElement(By.xpath("//input[@id='autosuggest']")).sendKeys("Ar");
		Thread.sleep(2000);

		// List<WebElement> options=
		// driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));

		List<WebElement> options1 = driver.findElements(By.xpath("//li[@class='ui-menu-item'] //a"));

		for (WebElement option : options1) {
			if (option.getText().equalsIgnoreCase("Aruba")) {
				option.click();
				break;
			}
		}

	}

}
