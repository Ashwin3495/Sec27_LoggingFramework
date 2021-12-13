package Academy.Sec29_E2E;

import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import HomePage.HomePage;
import Resources.base;
import junit.framework.Assert;

public class Validatetitle extends base{
	public WebDriver driver;
	public static Logger log=LogManager.getLogger(base.class.getName());
	
	
	@BeforeTest
	public void initalize() throws IOException
	{
		driver=initializeDriver();
		log.info("Driver initialized");
		
		driver.get(prop.getProperty("url"));
		log.info("Home Page");
	}
	
	@Test
	public void ValidateTitle() throws IOException
	{
		
		
		
		HomePage hp=new HomePage(driver);
		hp.login1().getText();
		Assert.assertEquals(hp.title().getText().toLowerCase(),"featured courses"); 
		
	Assert.assertTrue(hp.navbar().isDisplayed());  //To check navigation bar present or not
	log.info("Successful");		
		
	}
	
	@Test
	public void ValidateHeader() throws IOException
	{
		HomePage h=new HomePage(driver);
		System.out.println(h.header().getText());

		Assert.assertEquals(h.header().getText().toLowerCase(),"an academy to learn everything about testing"); 
		//Assert.assertEquals(hp.header().getText(),"AN ACADEMY TO LEARN EVERYTHING ABOUT TESTING");
		
	}
	
	
	@AfterTest
	public void teardown()
	{
		driver.close();
	}
	
	
}
