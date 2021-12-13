import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Lec93_Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Tools\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/#!");

		driver.findElement(By.id("checkBoxOption3")).click();
		String b = driver.findElement(By.xpath("//input[@id='checkBoxOption3']/parent::label")).getText();
		System.out.println(b);

		WebElement dd = driver.findElement(By.id("dropdown-class-example"));
		Select d1 = new Select(dd);
		d1.selectByVisibleText(b);

		driver.findElement(By.id("name")).sendKeys(b);
		driver.findElement(By.id("alertbtn")).click();

		String c = driver.switchTo().alert().getText();
		System.out.println(c);
		if (c.contains(b)) {
			driver.switchTo().alert().accept();
		} else {
			Assert.assertFalse(false);
		}

	}

}

/*
 *   driver.get("https://rahulshettyacademy.com/AutomationPractice/#!");

		        driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[2]/input")).click();

		        String opt=driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[2]")).getText();

		        WebElement dropdown=driver.findElement(By.id("dropdown-class-example"));

		        Select s=new Select(dropdown);

		        s.selectByVisibleText(opt);

		        driver.findElement(By.name("enter-name")).sendKeys(opt);

		        driver.findElement(By.id("alertbtn")).click();

		     String text=  driver.switchTo().alert().getText();

		     if(text.contains(opt))

		     {

		    System.out.println("Alert message success");

		     }

		     else

		    System.out.println("Something wrong with execution");

		}

 * */
