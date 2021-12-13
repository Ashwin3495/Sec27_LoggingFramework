import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.Select;

public class Static_DropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Tools\\chromedriver1_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/dropdownsPractise/#");
		
		WebElement staticdd = driver.findElement(By.cssSelector("select#ctl00_mainContent_DropDownListCurrency"));
		
		Select dropdown=new Select(staticdd);
		dropdown.selectByValue("USD");
		System.out.println(dropdown.getFirstSelectedOption().getText());
		
		dropdown.selectByIndex(2);
		System.out.println(dropdown.getFirstSelectedOption().getText());
		
		
		
	}

}
