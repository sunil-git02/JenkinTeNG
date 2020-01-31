package stepdefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class test {

	public static WebDriver driver; 
	@Given("^user is on homepage$")
	public void user_is_on_homepage() throws Throwable { System.setProperty("webdriver.chrome.driver","I:/chromedriver.exe");
	driver = new ChromeDriver(); driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); driver.get("http://facebook.com");
	}

	@When("^user navigates to Login Page$")
	public void user_navigates_to_Login_Page() throws Throwable {
	
	driver.findElement(By.xpath("//*[@id=\'blueBarDOMInspector\']/div/div/div/div[1]/h1/a "));
	}

	@When("^user enters username and Password$")
	public void user_enters_username_and_Password() throws Throwable {
	 
	driver.findElement(By.id("email")).sendKeys("jsunil_02@yahoo.co.in"); driver.findElement(By.id("pass")).sendKeys("sunilarchana"); driver.findElement(By.id("u_0_b")).click();
	}

	@Then("^success message is displayed$")
	public void success_message_is_displayed() throws Throwable {
//		String exp_message = "Welcome to your account. Here you can manage all	of your personal information and orders.";
//		String actual = driver.findElement(By.cssSelector(".info-account")).getText();
//		Assert.assertEquals(exp_message, actual);
	driver.quit();
	}

	
	
	
	
}
