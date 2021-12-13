package HomePage_Cucumber;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	
	public WebDriver driver;
	
	private By login=By.cssSelector("a[href*='sign_in']");
	private By title=By.xpath("(//div[@class='text-center'])[1]");
	private By NavBar=By.xpath("//ul[@class='nav navbar-nav navbar-right']/li");
	private By header=By.cssSelector("div[class='col-sm-6 col-md-8 hidden-xs video-banner']>h3");
	private By popup=By.xpath("//button[text()='NO THANKS']");
	
	public HomePage(WebDriver driver) {
		// TODO Auto-generated constructor stub
	this.driver=driver;
	}

	public LoginPage login()
	{
	
		driver.findElement(login).click();
		LoginPage lp=new LoginPage(driver);
		return lp;
		
	}
	
	public WebElement login1()
	{
		return driver.findElement(login);
	}
	
	public List<WebElement> popupsize()
	{
		return driver.findElements(popup);
	}
	
	public WebElement popup()
	{
		return driver.findElement(popup);
	}
	
	public WebElement title()
	{
		return driver.findElement(title);
	}

	public WebElement navbar()
	{
		return driver.findElement(NavBar);
	}
	
	public WebElement header()
	{
		return driver.findElement(header);
	}
	
}
