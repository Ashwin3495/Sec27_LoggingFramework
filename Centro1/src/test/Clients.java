package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Clients {

	WebDriver driver;
	
	By btnadd=By.cssSelector("button[icon='ui-icon-add-box']");
	By name=By.cssSelector("input[id='name']");
	By shortname=By.cssSelector("input[id='shortname']");
	By address=By.cssSelector("textarea[id='address']");
	By business =By.cssSelector("textarea[id='buisnessunit']");
	By active=By.cssSelector("p-checkbox[id='Active']");
	By save=By.cssSelector("button[label='Save']");
	
	public Clients(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	
	public WebElement ButtonAdd()
	{
		return driver.findElement(btnadd);
	}
	public WebElement Name()
	{
		return driver.findElement(name);
	}
	public WebElement ShortName()
	{
		return driver.findElement(shortname);
	}
	public WebElement Address()
	{
		return driver.findElement(address);
	}
	public WebElement Business()
	{
		return driver.findElement(business);
	}
	public WebElement Active()
	{
		return driver.findElement(active);
	}
	public WebElement Save()
	{
		return driver.findElement(save);
	}
}
