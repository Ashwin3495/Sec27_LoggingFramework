package Testcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import objectrepository.RediffHomepage;
import objectrepository.RediffLoginpage;

public class LoginPage {
	
	@Test
	public void Login()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Tools\\chromedriver1_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		//RediffLoginpage execute with old Page Model
		RediffLoginpage rd=new RediffLoginpage(driver);
		
		rd.EmailID().sendKeys("hello");
		rd.Password().sendKeys("hello");
		rd.Submit().click();
		rd.Home().click();
		
		//RediffHomepage is executed with Page Factory
		RediffHomepage rh=new RediffHomepage(driver);
		rh.search().sendKeys("phone");
		rh.submit().click();
	}

}
