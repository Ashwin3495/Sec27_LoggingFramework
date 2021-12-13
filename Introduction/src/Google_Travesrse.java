import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_Travesrse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Tools\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
/*
		driver.get("https://login.salesforce.com/?locale=in");
		
		driver.findElement(By.xpath("//div[@id='username_container']/input[1]")).sendKeys("kskdks");
	*/
		
		driver.get("https://www.google.co.in/");
		driver.findElement(By.xpath("//div[@class='RNNXgb']/div/div[2]/input[1]")).sendKeys("4561");
		
	}

}
