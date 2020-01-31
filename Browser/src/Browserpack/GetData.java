package Browserpack;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class GetData 
{

	
	
	public static String getstring(String whatweneed) throws IOException
	{
		FileInputStream file=new FileInputStream("C:\\Users\\sunil\\eclipse-workspace\\Browser\\src\\Browserpack\\data.properties");
		Properties prop=new Properties();
		prop.load(file);
		//String s=new String();
		String s=prop.getProperty(whatweneed);
		return s;
		
		
		
	}
}
