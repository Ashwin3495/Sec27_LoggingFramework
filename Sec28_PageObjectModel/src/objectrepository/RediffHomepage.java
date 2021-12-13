package objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RediffHomepage {

	WebDriver driver;
	public RediffHomepage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	/*By search=By.id("srchword");
	By submit=By.xpath("//input[@aria-label='Search']");
	*/
	
	@FindBy(id="srchword")
	WebElement search;
	
	@FindBy(xpath="//input[@aria-label='Search']")
	WebElement submit;
	
	public WebElement search()
	{
		return search;
	}
	
	public WebElement submit()
	{
		return submit;
	}
	
}
