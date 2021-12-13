package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Contracts {

	WebDriver driver;
	
	By Contracts=By.cssSelector("a[id='Contracts']");
	By btnadd=By.cssSelector("button[icon='ui-icon-add-box']");
	By name=By.cssSelector("[id='name']");
	By status=By.xpath("(//span[@class='ui-dropdown-trigger-icon ui-clickable pi pi-chevron-down'])[1]");
	By client=By.xpath("(//span[@class='ui-dropdown-trigger-icon ui-clickable pi pi-chevron-down'])[2]");	
	By startdate=By.cssSelector("input[name='startDate']");
	By currentday=By.xpath("//*[@class='ng-tns-c25-132 ui-datepicker-today ng-star-inserted']");
	By enddate=By.cssSelector("input[name='endDate']");
	By BillingEntity=By.xpath("(//div[@class='ui-dropdown-label-container'])[3]");
	By ProductLine=By.xpath("(//div[@class='ui-dropdown-label-container'])[4]");
	
	
	public Contracts(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

	public WebElement CurrentDay()
	{
		return driver.findElement(currentday);
	}
	public WebElement ButtonAdd()
	{
		return driver.findElement(btnadd);
	}
	public WebElement Name()
	{
		return driver.findElement(name);
	}	
	public WebElement Status()
	{
		return driver.findElement(status);
	}
	
	
	public WebElement Client()
	{
		return driver.findElement(client);
	}
	public WebElement Startdate()
	{
		return driver.findElement(startdate);
	}
	public WebElement Enddate()
	{
		return driver.findElement(enddate);
	}
	public WebElement Billing()
	{
		return driver.findElement(BillingEntity);
	}
	public WebElement ProductLine()
	{
		return driver.findElement(ProductLine);
	}
	
	
	
}
