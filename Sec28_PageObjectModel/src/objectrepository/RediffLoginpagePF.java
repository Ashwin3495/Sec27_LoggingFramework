package objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RediffLoginpagePF {

	WebDriver driver;
	public RediffLoginpagePF(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
/*	By username=By.xpath("//*[@id='login1']");
	By password=By.xpath("//*[@id='password']");
	By signin=By.xpath("//*[@name='proceed']");
	By Home=By.xpath("//*[text()='rediff.com']");
	*/
	
	@FindBy(xpath="//*[@id='login1']")
	WebElement username;
	
	@FindBy(xpath="//*[@id='password']")
	WebElement password;
	
	@FindBy(xpath="//*[@name='proceed']")
	WebElement signin;
	
	@FindBy(xpath="//*[text()='rediff.com']")
	WebElement Home;
	
	
	public WebElement EmailID()
	{
		return username;
	}
	
	public WebElement Password()
	{
		return password;
	}
	
	public WebElement Submit()
	{
		return signin;
	}
	
	public WebElement Home()
	{
		return Home;
	}
	
}
