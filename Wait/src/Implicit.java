import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Implicit {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Tools\\chromedriver1_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		Thread.sleep(5000);
		String[] name = { "Cucumber", "Brocolli", "Beetroot", "Carrot", "Carrot" };
		
		Implicit b= new Implicit();
		b.addItem1(name, driver);
		
		addItem1(name,driver);
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		driver.findElement(By.cssSelector("div[class='action-block'] button")).click();
		
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);  //Implicit Wait
		
		driver.findElement(By.cssSelector("input[class='promoCode']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("button[class='promoBtn']")).click();
		System.out.println(driver.findElement(By.cssSelector("span[class='promoInfo']")).getText());
		driver.findElement(By.xpath("//button[text()='Place Order']")).click();
	}
	
	public static void addItem1(String[] name,WebDriver driver){
		
		List<WebElement> items=driver.findElements(By.cssSelector("h4.product-name"));
		
		for(int i=0;i<items.size();i++)
		{
			List a=Arrays.asList(name); // Conversion of Array to array list
			String[] name1=items.get(i).getText().split("-"); //spliting and storing name in string from items list
			String formattedname= name1[0].trim();
			
			if(a.contains(formattedname)) {
				
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
			}
			
		}
		
	}

}
