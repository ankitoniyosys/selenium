package com.qtpselenium.core.ddf.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest {
	
	public WebDriver driver;
	public Properties prop;
	
	public void openBrowser(String bType)
	{
		if(bType.equals("Mozilla"))
			driver=new FirefoxDriver();
		else if(bType.equals("Chrome"))
		{	
			System.setProperty("webdriver.chrome.driver", prop.getProperty("chromedriver_exe"));
			driver=new ChromeDriver();
		}
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		//init the prop file
		if(prop==null)
		{
			prop=new Properties();
			try {
				FileInputStream fs= new FileInputStream(System.getProperty("user.dir")+"//src//test//resources//projectconfig.properties//");
				prop.load(fs);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public void navigate(String urlkey)
	{
		driver.get(prop.getProperty(urlkey));
	}
	
	public void click(String xpathkey)
	{
		driver.findElement(By.xpath(prop.getProperty(xpathkey))).click();
	}
	
	public void type(String xpathkey, String data)
	{
		driver.findElement(By.xpath(prop.getProperty(xpathkey))).sendKeys(data);
	}
	
	/***************************************Validations*****************************************************/
	public boolean verifyTitle()
	{
		return false;
	}
	
	public boolean isElementPresent()
	{
		return false;
	}
	
	public boolean verifyText()
	{
		return false;
	}
	/***************************************Reporting*****************************************************/
	public void reportPass(String msg)
	{
		
	}
	public void reportFail(String msg)
	{
		
	}
	public void takeScreenshot(String msg)
	{
		
	}
}
