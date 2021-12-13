import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Tools\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		driver.get("https://www.facebook.com/");
		/*
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("abcasd");
		driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("486456156");
		driver.findElement(By.xpath("//*[@name='login']")).click();
		
		System.out.println(driver.findElement(By.xpath("//*[@id='loginform']/div[2]/div[2]")).getText());
		//Absolute path
		*/
		driver.findElement(By.cssSelector("input[id='email']")).sendKeys("abckos");
		driver.findElement(By.cssSelector("input[id='pass']")).sendKeys("484565");
		driver.findElement(By.cssSelector("[name='login']")).click();
		
		System.out.println(driver.findElement(By.xpath("//*[@id='loginform']/div[2]/div[2]")).getText());
		//System.out.println(driver.findElement(By.cssSelector("div._9ay7")).getText());
		
	}

}
