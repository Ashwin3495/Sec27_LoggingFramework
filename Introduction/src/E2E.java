import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class E2E {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Tools\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		driver.get("https://www.rediff.com/");
		System.out.println(driver.getTitle());
	/*
		//Regular expression
		driver.findElement(By.cssSelector("[title*='Sign in']")).click();
		driver.findElement(By.cssSelector("input[id*='login']")).sendKeys("Abcd"); //check in console
		driver.findElement(By.cssSelector("[id*='passwor']")).sendKeys("4515615");
		driver.findElement(By.cssSelector("[value*='Sign']")).click();
		*/
		
		driver.findElement(By.xpath("//*[contains(@title,'Sign in')]")).click();
		driver.findElement(By.xpath("//input[contains(@id,'login')]")).sendKeys("asddsadsa");
		driver.findElement(By.xpath("//*[contains(@id,'pass')]")).sendKeys("jdasik");
		driver.findElement(By.xpath("//*[contains(@value,'Sign')]")).click();
	}

}
