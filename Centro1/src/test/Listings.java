package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Listings{

	WebDriver driver;
	
	private By Listing=By.cssSelector("a[id='Listings']");
	private By List_visible=By.xpath("//a[@id='Listings']/i[2]");
	
	private By Metadata=By.cssSelector("a[id='Metadata']");
	private By Clients=By.cssSelector("a[id='Clients']");
	private By Contracts=By.cssSelector("a[id='Contracts']");
	private By Equipments=By.cssSelector("a[id='Equipments']");
	private By Locations=By.cssSelector("a[id='Locations']");
	private By Vendors=By.cssSelector("a[id='Vendors']");
	
	
	public Listings(WebDriver driver) {
		// TODO Auto-generated constructor stub
	this.driver=driver;
	}
	
	public WebElement List()
	{
		return driver.findElement(Listing);
	}
	
	public WebElement List_visible()
	{
		return driver.findElement(List_visible);
	}
	
	public WebElement Metadata()
	{
		return driver.findElement(Metadata);
	}
	
	public WebElement Clients()
	{
		return driver.findElement(Clients);
	}
	
	public WebElement Contracts()
	{
		return driver.findElement(Contracts);
	}
	
	public WebElement Equipments()
	{
		return driver.findElement(Equipments);
	}
	
	public WebElement Locations()
	{
		return driver.findElement(Locations);
	}
	
	public WebElement Vendors()
	{
		return driver.findElement(Vendors);
	}
	
}
