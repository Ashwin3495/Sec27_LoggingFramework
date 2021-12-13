package Academy.Sec29_E2E;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import HomePage.ForgotPassword;
import HomePage.HomePage;
import HomePage.LoginPage;
import Resources.base;

public class Home extends base{
	public WebDriver driver;
	public static Logger log=LogManager.getLogger(base.class.getName());

	@BeforeTest
	public void initalize() throws IOException
	{
		driver=initializeDriver();
		log.info("Initialized");
	}
	
	@Test(dataProvider="getData")
	public void HomePage(String username, String password) throws IOException
	{

		driver.get(prop.getProperty("url"));
		
		HomePage hp=new HomePage(driver);
		LoginPage lp=hp.login();	//Can be used when there is next page navigation
		
		//LoginPage lp=new LoginPage(driver);		//Optimizing code Lec 212
		lp.getemail().sendKeys(username);
		lp.getpass().sendKeys(password);
		lp.getSignin().click();
		log.info("Login clicked");
		
		ForgotPassword fp=lp.forgotpassword();    //Can be used when there is next page navigation
		fp.getemail().sendKeys("Abcmxm");
		fp.sendinstructions().click();
		
	}
	
	@AfterTest
	public void teardown()
	{
		driver.close();
	}

	
	@DataProvider
	public Object[][] getData()
	{
		Object[][] data=new Object[2][2];
		
		data[0][0]="abc@gm.com";
		data[0][1]="845151";
		
		data[1][0]="dasded@dasdas.com";
		data[1][1]="4515615";
		
		return data;
	
	}


	
}
