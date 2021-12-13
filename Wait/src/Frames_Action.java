import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Frames_Action {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Tools\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe.demo-frame")));
		//driver.switchTo().frame(0);   move using index
		Actions a=new Actions(driver);
		
		WebElement source =driver.findElement(By.id("draggable"));
		WebElement target =driver.findElement(By.id("droppable"));
		a.dragAndDrop(source, target).build().perform();
		//driver.switchTo().defaultContent();
		
	}

}
