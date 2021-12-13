import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Connection;

public class jdbcConnection {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub

		String host="localhost";
		String port="3306";
		
		Connection con=DriverManager.getConnection("jdbc:mysql://"+host+":"+port+"/QADBT", "root", "root");
		
		// url - "jdbc:mysql://"+host+":"+port+"/databasename";
		
		Statement s=con.createStatement();
		ResultSet rs=s.executeQuery("select * from Employee where name='Ashwin'");
		while(rs.next())  //rs.next - to move to next index position
		{
			System.out.println(rs.getString("age"));
			System.out.println(rs.getString("location"));
			
			System.setProperty("webdriver.chrome.driver", "C:\\Tools\\chromedriver1_win32\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();		
			driver.get("https://login.salesforce.com/");
		
			//Input for Login page
			driver.findElement(By.id("username")).sendKeys(rs.getString("age"));
			driver.findElement(By.id("password")).sendKeys(rs.getString("location"));
		}
	}

}
