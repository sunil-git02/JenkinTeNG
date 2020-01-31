package Testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action 
{

	public static void main(String[] args) 
	{
		
				
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://amazon.com");
		driver.manage().window().maximize();
		Actions a=new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("//*[@id=\'nav-link-accountList\']/span[2]"))).build().perform();
		WebElement searchbox=driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']"));
		a.moveToElement(searchbox).click().sendKeys("shoes").doubleClick().contextClick().sendKeys(Keys.ENTER).build().perform();

	}

}
