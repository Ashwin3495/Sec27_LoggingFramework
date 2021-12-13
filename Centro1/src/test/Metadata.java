package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Metadata {
	
	WebDriver driver;

	By btnadd=By.cssSelector("button[icon='ui-icon-add-box']");
	By name=By.cssSelector("input[id='name']");
	By active=By.cssSelector("div[class='ui-chkbox-box ui-widget ui-corner-all ui-state-default ui-state-active']");
	By sequence=By.cssSelector("input[id='sequenceID']");
	By save=By.cssSelector("span[class='ui-button-icon-left ui-clickable fa fa-check']");
	
	public Metadata(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

	public WebElement ButtonAdd()
	{
		return driver.findElement(btnadd);
	}
	
	public WebElement Name()
	{
		return driver.findElement(name);
	}
	public WebElement active()
	{
		return driver.findElement(active);
	}
	public WebElement sequence()
	{
		return driver.findElement(sequence);
	}
	public WebElement save()
	{
		return driver.findElement(save);
	}
}