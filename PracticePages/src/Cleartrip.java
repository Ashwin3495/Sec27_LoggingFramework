import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Cleartrip {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Tools\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		driver.get("https://www.cleartrip.com/flights");
		
		driver.findElement(By.xpath("//div[@class='flex flex-between flex-middle px-4 mt-2 mb-4'] //*[text()='One way']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@class='flex flex-middle p-relative homeCalender']" )).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[contains(@div,'DayPicker-Day--today')]")).click();
	
		Thread.sleep(2000);
		WebElement dd=driver.findElement(By.xpath("//div[@class='mb-4'] //select[@class='bc-neutral-100 bg-transparent']"));
		Select d= new Select(dd);
		d.selectByIndex(5);
		
		WebElement dd1=driver.findElement(By.xpath(("(//select[@class='bc-neutral-100 bg-transparent'])[2]")));
		Select e=new Select(dd1);
		e.selectByValue("2");
		
		//More options
		driver.findElement(By.xpath("//div[@class='row pt-3 p-relative px-4'] //a[@class='td-none hover:td-underline px-4 mt-1 weak']")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//input[@placeholder='Airline name']")).sendKeys("Spice");
		Thread.sleep(2000);
		
		List<WebElement> option1= driver.findElements(By.xpath("//div[@class='bg-white br-4 elevation-5 p-1 p-absolute mt-1 z-50 l-0']"));
		for(WebElement option:option1) {
			if(option.getText().equals("SpiceJet (SG)"))
			{
				//click is not working
				System.out.println(option.getText());
				option.click();
				break;
			}
		}
		
		//Submit
		driver.findElement(By.xpath("//button[@class='px-7 bg-primary-500 hover:bg-primary-600 c-white bc-transparent c-pointer w-100p py-2 px-5 h-10 fs-4 fw-600 t-all button bs-solid tp-color td-500 bw-1 br-4 lh-solid box-border']")).click();
		//Get error message
		 System.out.print(driver.findElement(By.xpath("//div[@class='w-100p p-4 br-4 flex flex-middle flex-between elevation-3 bg-error-600 row']")).getText());
	
	}

}
