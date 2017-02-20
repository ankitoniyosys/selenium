 
import org.apache.poi.util.SystemOutLogger;

import org.openqa.selenium.By;
 
import org.openqa.selenium.WebDriver;
 
import org.openqa.selenium.WebElement;
 
import org.openqa.selenium.firefox.FirefoxDriver;
 
public class FindAllLinks {
 
	public static void main(String[] args) throws InterruptedException {
 
		WebDriver driver = new FirefoxDriver();
 
		driver.get("http://oniyosys.com/");
 
		java.util.List<WebElement> links = driver.findElements(By.tagName("a"));
 
		System.out.println(links.size());
 
		
		try
		{
			for (int i = 1; i<=links.size(); i=i+1)
			{
	 
				System.out.println(links.get(i).getText());
				Thread.sleep(100);
	 
			}
		}
		catch (Exception e)
		{
			System.out.println("---------End---------");
			driver.close();
			driver.quit();
		}
	}
 
}