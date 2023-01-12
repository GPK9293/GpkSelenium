package com.Grid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class OHRM_LogInTitle {

	@Parameters("Browser")
	@Test
	public void loginTest(String browserName) throws MalformedURLException
	{
		System.out.println("The name of the Browser is "+browserName);
		DesiredCapabilities cap=null;
		if(browserName.equals("chrome")) //NODE
		{
			cap=DesiredCapabilities.chrome();
			cap.setPlatform(Platform.WINDOWS);
			cap.setPlatform(Platform.WINDOWS);
		}
		else
		{
			if(browserName.equals("firefox"))
			{
				cap=DesiredCapabilities.firefox();
				cap.setBrowserName("firefox");
				cap.setPlatform(Platform.WINDOWS);
			}
			String applicationUrlAddresss="http://OrangeHRM";
			RemoteWebDriver driver=new RemoteWebDriver(new URL("http://192.168.179.90:4444/wd/hub"),cap);
			driver.get(applicationUrlAddresss);
			
			}
	}
}

	
	
	
	
	
	
	
	
	
	
	
	
	

