import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Dynamic_DropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Tools\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		driver.get("https://www.spicejet.com/");
		
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		
		driver.findElement(By.xpath("//a[@value='MAA']")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("(//a[@value='BKK'])[2]")).click();  //indexing used when two id/value is same
		
		//Parent child relationship  1st use parent id and along with child id/value, it will only search in parent id.
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='BKK']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();  //Select current date

		System.out.println(driver.findElement(By.cssSelector("[id='Div1']")).getAttribute("style")); //Get attribute for return date
		driver.findElement(By.cssSelector("[id='ctl00_mainContent_rbtnl_Trip_1']")).click();	//click on ROund trip
		System.out.println(driver.findElement(By.cssSelector("[id='Div1']")).getAttribute("style"));
		
		if(driver.findElement(By.cssSelector("[id='Div1']")).getAttribute("style").contains("1"))
		{
			System.out.println("Return Date Enabled");
			Assert.assertTrue(true);
						
		}
		else {
			Assert.assertFalse(false);
		}

		
		
		
		
		
	}

}
