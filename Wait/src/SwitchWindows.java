import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchWindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Tools\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
		driver.findElement(By.cssSelector(".blinkingText")).click();
		Set<String> windows=driver.getWindowHandles(); //No of instances running
		System.out.println(windows);
		
		Iterator<String> it=windows.iterator();
		String parentID=it.next();
		String childID=it.next();
		driver.switchTo().window(childID);
		
		System.out.println(driver.findElement(By.cssSelector(".im-para.red")).getText());
		String email=driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split(" ")[0];
		driver.switchTo().window(parentID);
		driver.findElement(By.id("username")).sendKeys(email);
	
	}

}
