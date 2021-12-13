import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Tools\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		driver.get("https://www.facebook.com/");
		System.out.println(driver.getTitle());

		System.out.println(driver.getCurrentUrl());
	/*// Using CssSelector- tagName[attribute='value']
		driver.findElement(By.cssSelector("input[name='email']")).sendKeys("Abc");
		driver.findElement(By.cssSelector("input[name='pass']")).sendKeys("455");
		driver.findElement(By.cssSelector("[name='login']")).click();
		//driver.findElement(By.cssSelector("#royal_login_button")).click();
	*/
		// CssSelector - tagName#value
		driver.findElement(By.cssSelector("input#email")).sendKeys("Abc");
		driver.findElement(By.cssSelector("input#pass")).sendKeys("455");
		//driver.findElement(By.cssSelector("[name='login']")).click();
		driver.findElement(By.cssSelector("div[class='_6ltj']>a")).click(); //Forgot Password
		
		//Regular expression used when the element id changes - tagName[attribute*='value']
		//driver.findElement(By.cssSelector("[id*='u_0_d']")).click(); // Regular expression used *
		
		
		//driver.close();	
		
		
		
		
	/*	//Using Xpath - * and @ are important  //tagName[@attribute='value']
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("Def");
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("5262");
		driver.findElement(By.xpath("//*[@name='login']")).click();
		*/
	}

}
