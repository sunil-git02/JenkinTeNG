package Testcase;

import java.io.IOException;

import org.testng.annotations.Test;

import Browserpack.Base;
import Browserpack.GetData;

public class HomeTest extends Base

{
 
	 	
	  @Test
	  public void testcase() throws IOException
       {
	   OpenBrowser(GetData.getstring("Browsertype"));
       }
 
}
