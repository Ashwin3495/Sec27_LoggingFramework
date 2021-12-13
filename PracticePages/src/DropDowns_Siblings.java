import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class DropDowns_Siblings {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Tools\\chromedriver1_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/dropdownsPractise/#");
		
		driver.findElement(By.cssSelector("input[id='ctl00_mainContent_rbtnl_Trip_2']")).click();
		driver.findElement(By.cssSelector("a[id='MultiCityModelAlert']")).click();
		
		driver.findElement(By.cssSelector("input#ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//div[@id='dropdownGroup1']/div/ul[1]/li[1]/following-sibling::li[1]")).click();
		
		driver.findElement(By.cssSelector("input#ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR']/table/tbody/tr[2]/td[2]/div[3]/div[2]/div/ul[1]/li[1]")).click();
	
		driver.findElement(By.xpath("//div[@id='flightSearchContainer']/div[6]/div[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("hrefIncAdt")).click();
	
		
		/*driver.findElement(By.xpath("//div[@class='paxinfo']")).click();
		  WebElement plusicon =  driver.findElement(By.xpath("//span[@id='hrefIncAdt']"));
		  WebElement drpele =driver.findElement(By.xpath("//span[@id='hrefIncAdt']"));
		  Select Adltdrp = new org.openqa.selenium.support.ui.Select(drpele);
		  Adltdrp.selectByValue("plusicon");
		  driver.findElement(By.xpath("//input[@id='btnclosepaxoption']")).click();
*/

	
	}

}
