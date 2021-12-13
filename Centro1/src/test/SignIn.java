package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class SignIn {

	WebDriver driver;
	public SignIn(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	
	By name=By.id("name");
	By password=By.name("password");
	By signin=By.xpath("//*[@class='centro-sign-in']");
	
	public WebElement name()
	{
		return driver.findElement(name);
	}
	
	public WebElement passsword()
	{
		return driver.findElement(password);
	}
	
	public WebElement signin()
	{
		return driver.findElement(signin);
	}
	
}
