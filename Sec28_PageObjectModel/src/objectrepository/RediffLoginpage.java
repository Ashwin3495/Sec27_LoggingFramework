package objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RediffLoginpage {

	WebDriver driver;
	public RediffLoginpage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	
	By username=By.xpath("//*[@id='login1']");
	By password=By.xpath("//*[@id='password']");
	By signin=By.xpath("//*[@name='proceed']");
	By Home=By.xpath("//*[text()='rediff.com']");
	
	public WebElement EmailID()
	{
		return driver.findElement(username);
	}
	
	public WebElement Password()
	{
		return driver.findElement(password);
	}
	
	public WebElement Submit()
	{
		return driver.findElement(signin);
	}
	
	public WebElement Home()
	{
		return driver.findElement(Home);
	}
	
}
