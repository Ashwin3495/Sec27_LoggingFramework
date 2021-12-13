package HomePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	//Encapsulation acheived by converting variable to private
	WebDriver driver;
	private By email=By.cssSelector("[id='user_email']");
	private By password=By.cssSelector("[id='user_password']");
	private By signin=By.cssSelector("input[name='commit']");
	private By forgotpassword=By.cssSelector("[href*='password/new']");
	
	public LoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

	public ForgotPassword forgotpassword()
	{
		driver.findElement(forgotpassword).click();
		ForgotPassword fp=new ForgotPassword(driver);
		return fp;
	}
	
	public WebElement getemail()
	{
		return driver.findElement(email);
	}
	
	public WebElement getpass()
	{
		return driver.findElement(password);
	}
	
	public WebElement getSignin()
	{
		return driver.findElement(signin);
	}

	public void getText() {
		// TODO Auto-generated method stub
		
	}

}
