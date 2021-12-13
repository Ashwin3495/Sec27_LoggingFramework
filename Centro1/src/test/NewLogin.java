package test;

import java.io.IOException;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Resource.Main_driver;

public class NewLogin extends Main_driver {
	
	@BeforeTest
	public void initialize() throws IOException, InterruptedException
	{
		driver=initializeDriver();
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		Thread.sleep(2000);	
	}
	
	@Test(dataProvider="getData")
	public void basePage(String username, String password) throws IOException, InterruptedException
	{
		
		
		SignIn si=new SignIn(driver);
		si.name().sendKeys(username);
		si.passsword().sendKeys(password);
		si.signin().click();
		
		Listings li=new Listings(driver);
		Thread.sleep(15000);
		System.out.println(li.List().getText());
		//SSystem.out.println(li.List_visible().getText());
		
		WebDriverWait wait=new WebDriverWait(driver,300);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@id='Listings']/i[2]")));
		
		li.List_visible().click();
		
		//li.Metadata().click();
		//li.Clients().click();
		//li.Contracts().click();
		//li.Equipments().click();
		//li.Vendors().click();
		//li.Locations().click();
		Thread.sleep(2000);
		
		//------------Select Metadata type------------------
		//wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("span[class='ui-dropdown-trigger-icon ui-clickable pi pi-chevron-down']")));
		//driver.findElement(By.cssSelector("span[class='ui-dropdown-trigger-icon ui-clickable pi pi-chevron-down']")).click();
		//driver.findElement(By.cssSelector("li[aria-label='Billing Entities']")).click();
		
		//--------------Collect list of values from dropdown
		//List<WebElement> list=driver.findElements(By.xpath("//div[@class='ui-dropdown-items-wrapper']/ul"));

		/*Thread.sleep(2000);
		
		Metadata md=new Metadata(driver);
		md.ButtonAdd().click();
		md.Name().sendKeys("Abc");
		md.active().click();
		md.sequence().sendKeys("8");
		md.save().click();*/
		
/*
		Clients c=new Clients(driver);
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button[icon='ui-icon-add-box']")));
		c.ButtonAdd().click();
		Thread.sleep(2000);
		c.Name().sendKeys("Client2");
		c.ShortName().sendKeys("CL-2");
		c.Business().sendKeys("Motor1");
		c.Address().sendKeys("Malaysia");
		//c.Active().click();
		c.Save().click();
		Thread.sleep(3000);
		*/
		
		li.Contracts().click();
		Contracts ct=new Contracts(driver);
		ct.ButtonAdd().click();
		Thread.sleep(2000);
		ct.Name().sendKeys("Contracts1");
		
		ct.Status().click();
		List<WebElement> list= driver.findElements(By.xpath("//li[@class='ui-dropdown-item ui-corner-all']"));
		for(WebElement option : list)
		{
			if(option.getText().equals("Completed"))
			{
				option.click();
				break;
			}
		}
		
		ct.Client().click();
		List<WebElement> list1= driver.findElements(By.xpath("//li[@class='ui-dropdown-item ui-corner-all']"));
		for(WebElement option : list1)
		{
			if(option.getText().equals("Client1"))
			{
				option.click();
				break;
			}
		}
		
		ct.Startdate().click();
		ct.CurrentDay().click();
		System.out.print(ct.CurrentDay().getText());
		
	}
	
	@DataProvider
	public Object[][] getData()
	{
		Object[][] data=new Object[1][2];
		data[0][0]="Admin";
		data[0][1]="Visean";
		
		return data;
	}
	
	@AfterTest
	public void quit() throws InterruptedException
	{
		Thread.sleep(2000);
		//driver.close();
	}

}
