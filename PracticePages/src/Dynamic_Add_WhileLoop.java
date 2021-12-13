import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Dynamic_Add_WhileLoop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Tools\\chromedriver1_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/dropdownsPractise/#");
		
		//System.out.println(driver.findElement(By.cssSelector("[name*='friendsandfamily']")).isSelected());
		Assert.assertFalse(driver.findElement(By.cssSelector("[name*='friendsandfamily']")).isSelected());
		
		driver.findElement(By.xpath("//input[contains(@name,'friendsandfamily')]")).click();
		
		//System.out.println(driver.findElement(By.cssSelector("[name*='friendsandfamily']")).isSelected());
		Assert.assertTrue(driver.findElement(By.cssSelector("[name*='friendsandfamily']")).isSelected());
		
		//findElements - used to get all the data present in list 
		//Count no of check box which has type checkbox
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000);
		
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		
		//Adding Adult
		int i=1;
		while(i<5)
		{
			driver.findElement(By.id("hrefIncAdt")).click();
			i++;
		}
		
		int x=4;
		while(x>2)
		{
			driver.findElement(By.id("hrefDecAdt")).click();
			x--;
		}
		
		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "3 Adult");
		Thread.sleep(1000);
		//Adding Child
		for(int a=1;a<5;a++) 
		{
			driver.findElement(By.id("hrefIncChd")).click();			
		}
		for(int b=4;b>2;b--)
		{
			driver.findElement(By.id("hrefDecChd")).click();
		}
		
		Thread.sleep(1000);
		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "3 Adult, 2 Child");
		//Adding infant
		for(int y=1;y<5;y++)
		{
			driver.findElement(By.id("hrefIncInf")).click();
		}
		for(int z=4;z>2;z--)
		{
			driver.findElement(By.id("hrefDecInf")).click();
		}
		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "3 Adult, 2 Child, 2 Infant");
		driver.findElement(By.id("btnclosepaxoption")).click();
		
		//System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
	}

}
