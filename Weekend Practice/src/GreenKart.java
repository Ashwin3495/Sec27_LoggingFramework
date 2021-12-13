import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GreenKart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Tools\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		String[] items= {"Nuts Mixture","Brocolli","Carrot","Brinjal"};
		addItems(items,driver);
		WebDriverWait wait=new WebDriverWait(driver,10);
		driver.findElement(By.cssSelector("[alt='Cart']")).click();
		driver.findElement(By.cssSelector("div[class='action-block'] button")).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.promoCode")));
		driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("button.promoBtn")).click();
		
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("button.promoBtn")));
		driver.findElement(By.cssSelector("button.promoBtn")).isDisplayed();
		
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("span.promoInfo")));
		System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).isDisplayed());
		//driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[text()='Place Order']")).click();
		
		
		
		
	}
		
		public static void addItems(String[] items,WebDriver driver)
		{
		List<WebElement> list=driver.findElements(By.cssSelector("h4.product-name"));
		//System.out.println(list);
		for(int i=0;i<list.size();i++)
		{
			
			String[] items1=list.get(i).getText().split("-");
			String formatedname = items1[0].trim();
			
			List formattedname=Arrays.asList(items);
			
			
			if(formattedname.contains(formatedname))
			{
				driver.findElements(By.cssSelector("[class='product-action'] [type='button']")).get(i).click();
				
					
					
				
			}
			
			
		}	
	}
}
