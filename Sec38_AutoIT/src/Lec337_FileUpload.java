import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Lec337_FileUpload {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		String downloadpath=System.getProperty("user.dir");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Tools\\chromedriver1_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.ezyzip.com/convert-pdf-to-zip.html");
		driver.findElement(By.xpath("//label[text()='Select PDF files to convert']")).click();
		Thread.sleep(3000);
		//Runtime to execute the script for selecting file and opening it
		Runtime.getRuntime().exec("C:\\Tools\\AutoIT\\Upload.exe");
		
		//TO download the file
		WebDriverWait wait=new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Convert to ")));		
		driver.findElement(By.linkText("Convert to ")).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Save ZIP File")));
		driver.findElement(By.linkText("Save ZIP File")).click();
		
		//To check if downloaded file exist in the path
		File f=new File(downloadpath+"/ezyzip.zip");
		if(f.exists())
		{
			System.out.print("Found");
		}
	}

}
