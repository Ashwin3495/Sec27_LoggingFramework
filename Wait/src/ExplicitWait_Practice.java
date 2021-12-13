import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait_Practice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Tools\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		WebDriverWait w=new WebDriverWait(driver, 5);
		driver.get("https://www.itgeared.com/demo/1506-ajax-loading.html");
		w.until(ExpectedConditions.visibilityOfElementLocated(By.id("content")));
		
		driver.findElement(By.xpath("//a[contains(text(),'Click here to return to the tutorial')]")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.id("lblSprocketTitle")));
		
		driver.navigate().back();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Click to load get data via Ajax!']")));
		
		driver.findElement(By.xpath("//a[text()='Click to load get data via Ajax!']")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.id("results")));
		
		System.out.println(driver.findElement(By.id("results")).getText());

	}

}
