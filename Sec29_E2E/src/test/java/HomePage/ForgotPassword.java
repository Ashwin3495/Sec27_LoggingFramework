package HomePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ForgotPassword {
	WebDriver driver;
	By email=By.cssSelector("[id='user_email']");
	By sendinstructions=By.cssSelector("input[type='submit']");
	
	public ForgotPassword(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

	
	
	public WebElement getemail()
	{
		return driver.findElement(email);
	}
	
	public  WebElement sendinstructions()
	{
		return driver.findElement(sendinstructions);
	}
	
}
