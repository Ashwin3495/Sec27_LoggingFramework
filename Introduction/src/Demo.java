import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\Tools\\chromedriver_win32\\chromedriver.exe");
WebDriver driver=new ChromeDriver();

driver.get("https://login.salesforce.com/?locale=in");
System.out.println(driver.getTitle());

System.out.println(driver.getCurrentUrl()); //validate whether the entered URL is correct or not

//System.out.println(driver.getPageSource()); //get the page source content

driver.navigate().to("https://google.com");
driver.navigate().back();
/*
driver.findElement(By.name("email")).sendKeys("Abc");
driver.findElement(By.name("pass")).sendKeys("123456");
driver.findElement(By.linkText("पासवर्ड विसरला?")).click();
*/

/*
driver.findElement(By.cssSelector("#username")).sendKeys("Abc");
driver.findElement(By.cssSelector("#password")).sendKeys("12354");
driver.findElement(By.xpath("//*[@id=\'Login\']")).click();
*/


System.out.println(driver.findElement(By.xpath("//*[@id=\'error\']")).getText());

driver.close(); // closes the current window
driver.quit(); // closes all the window related to driver

	}

}
