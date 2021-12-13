import java.net.MalformedURLException;

import java.net.URL;

import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;



public class SauceLabsTest {

public static final String USERNAME = "oauth-ashwin3495-0c98f";

  public static final String ACCESS_KEY = "39647a30-8314-48ab-b8f8-bb2b0f58124c";
  

  public static final String URL = "https://ondemand.us-west-1.saucelabs.com/wd/hub";



public static void main(String[] args) throws MalformedURLException {

// TODO Auto-generated method stub



	ChromeOptions browserOptions = new ChromeOptions();
	browserOptions.setCapability("platformName", "Windows 10");
	browserOptions.setCapability("browserVersion", "94");
	MutableCapabilities sauceOptions = new MutableCapabilities();
	browserOptions.setCapability("sauce:options", sauceOptions);
	
WebDriver driver=new RemoteWebDriver(new URL(URL), browserOptions);

driver.get("http://google.com");

System.out.println(driver.getTitle());

}



}

