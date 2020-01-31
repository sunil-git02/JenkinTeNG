package Browserpack;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base 
{
   public WebDriver driver;
	public void OpenBrowser(String Browsertype) throws IOException
	{
		if(Browsertype.equalsIgnoreCase("Chrome"))
				{
			     System.setProperty("webdriver.gecko.driver", "E:\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		         WebDriver driver=new FirefoxDriver();
		        driver.get("http://www.google.com");
			
		        GetData.getstring("url");
				}
			else if(Browsertype.equalsIgnoreCase("mozila"))
		{

		     System.setProperty("webdriver.gecko.driver", "E:\\geckodriver-v0.24.0-win64\\geckodriver.exe");
	         WebDriver driver=new FirefoxDriver();
	        driver.get("http://www.google.com");
		}
	
		else
		{
			System.out.println("not required");
		}
	
	}

}
