import java.util.Calendar;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Tools\\chromedriver1_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		  Calendar cal = Calendar.getInstance();
		  int a=cal.get(Calendar.YEAR);
		  int b=(cal.get(Calendar.MONTH) + 1);
		  int c=cal.get(Calendar.DATE);
	      System.out.println("Year = " + cal.get(Calendar.YEAR));
	      System.out.println("Month = " + (cal.get(Calendar.MONTH) + 1));
	      System.out.println("Date = " + cal.get(Calendar.DATE));
	      
		driver.get("https://www.path2usa.com/travel-companions/");
		driver.manage().window().maximize();
		driver.findElement(By.id("travel_date")).click();
		//driver.findElements(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']"));
		
		while(driver.findElement(By.cssSelector("[class='datepicker-months'] [class='datepicker-switch']")).getText().contains("2022"))
		{
			driver.findElement(By.cssSelector("[class='datepicker-months'] [class='next']")).click();
		}
		
		while(!driver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']")).getText().contains("April"))
		{
			driver.findElement(By.cssSelector("[class='datepicker-days'] [class='next']")).click();
		}
		
		
		List<WebElement> dates =  driver.findElements(By.className("day"));

		int count=driver.findElements(By.className("day")).size();
		
		for(int i=0;i<count;i++) {
			
			String text=driver.findElements(By.className("day")).get(i).getText();
			if(text.equalsIgnoreCase("27")) {
				driver.findElements(By.className("day")).get(i).click();
				break;
				
			}
		}
		 
		
	}

}
