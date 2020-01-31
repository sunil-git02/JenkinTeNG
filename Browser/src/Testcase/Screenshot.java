package Testcase;

import java.io.File;

import org.openqa.selenium.WebDriver;

public class Screenshot 
{

	private static final String Fileutils = null;

	public static WebDriver Getphoto(WebDriver driver,String Photoname) 
	{
		Screenshot ts=(TS)driver;
		File scr=ts.getscreenshot AS()
		Fileutils.copyfile(scr,new File("") +phonename".png");
		return driver;
		
h
	}

}
