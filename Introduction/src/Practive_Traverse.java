import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practive_Traverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Tools\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		driver.get("https://www.salesforce.com/in/");
		
		driver.findElement(By.xpath("//div[@class='global-nav-login-flydown global-login']/div/div/div/a")).click();
		driver.findElement(By.xpath("//div[@id='username_container']/input[1]")).sendKeys("dasdscascs");
		driver.findElement(By.xpath("//form[@name='login']/input[2]")).sendKeys("sda45");
		driver.findElement(By.xpath("//form[@name='login']/input[3]")).click();
		
		System.out.println(driver.findElement(By.xpath("//form[@name='login']/div")).getText());
		
	}

}
