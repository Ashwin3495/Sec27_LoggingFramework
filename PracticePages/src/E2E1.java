import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class E2E1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Tools\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.spicejet.com/");
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();
		Assert.assertTrue(driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).isSelected());
		//Arrival
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='MAA']")).click();
		
		Thread.sleep(2000);
		//Destination
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='DAC']")).click();
		
		//Date
		driver.findElement(By.xpath("//a[@class='ui-state-default ui-state-highlight ui-state-active ui-state-hover']")).click();
		
		//Return Date enabled
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5"))
		{
			System.out.println("Return Disabled");
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertFalse(false);
		}
		
		Thread.sleep(2000);
		//Select Adult
		driver.findElement(By.id("divpaxinfo")).click();
		
		WebElement dd= driver.findElement(By.xpath("//div[@id='divpaxOptions'] //select[@name='ctl00$mainContent$ddl_Adult']"));
		Select dd1=new Select(dd);
		dd1.selectByValue("2");
		//Chcekbox
		driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click();
		System.out.print(driver.findElements(By.xpath("//input[@type='checkbox']")).size());
		
		//Select currency
		WebElement a=driver.findElement(By.xpath("//select[@id='ctl00_mainContent_DropDownListCurrency']"));
		Select b=new Select(a);
		b.selectByValue("USD");
		
		//Submit
		driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
		
		
	}

}
