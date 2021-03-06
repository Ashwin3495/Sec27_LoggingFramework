import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JdbcConnection {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub

		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Tools\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/?locale=eu");
		
		String host="localhost";
		String port="3306";
		Connection con=DriverManager.getConnection("jdbc:mysql://"+host+":"+port+"/QADBT", "root", "root");
	
		Statement s=con.createStatement();
		ResultSet rs=s.executeQuery("select * from Employee where age=27;");
		
		while(rs.next())
		{
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(rs.getString("name"));
		System.out.println(rs.getString("name"));
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(rs.getString("location"));
		System.out.println(rs.getString("location"));
		}
	}

}
