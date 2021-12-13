import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SwitchWIndowsPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Tools\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.linkText("Multiple Windows")).click();
		driver.findElement(By.cssSelector("a[href*='windows']")).click();
		Set<String> window= driver.getWindowHandles();
		Iterator<String>it= window.iterator();
		String parentID=it.next();
		String childID=it.next();
		
		driver.switchTo().window(childID);
		String win2=driver.findElement(By.cssSelector("div[class='example'] h3")).getText();
		driver.switchTo().window(parentID);
		String win1=driver.findElement(By.cssSelector("div[class='example'] h3")).getText();
		
		System.out.println(win2);
		System.out.println(win1);
		
		
		
	}

}
