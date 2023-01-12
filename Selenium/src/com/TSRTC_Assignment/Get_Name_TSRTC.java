package com.TSRTC_Assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Name_TSRTC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		String applicationUrlAddress="https://www.tsrtconline.in/oprs-web/";
		System.setProperty("webdriver.chrome.driver","./BrowsersDriverFiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(applicationUrlAddress);
		/*<div class="menu-wrap">
		<div class="menu">
					<a class="selectedtabcopy" href="/oprs-web/guest/home.do?h=1" target="_top" title="Home">
							Home</a>
						<a class="tabcopy blinking" href="/oprs-web/guest/specialHire.do" target="_top" title="Bus on Contract">Bus on Contract</a>
						<a class="tabcopy" href="/oprs-web/ticket/waitlist.do" target="_top" title="Enquiry">Enquiry</a>
						<a class="tabcopy" href="/oprs-web/guest/ticket/cancel.do" target="_top" title="Cancel Tickets">Cancel Tickets</a>
						<a class="tabcopy" href="/oprs-web/services/cancel.do" target="_top" title="Cancelled Services">Cancelled Services</a>
						<a class="tabcopy" href="/oprs-web/home/aboutus.do" target="_top" title="About Us">About Us</a>
						<a class="tabcopy blinking" href="/oprs-web/services/packagetours.do" target="_top" title="Tourism">Tourism</a>
						<a class="tabcopy" href="/oprs-web/services/driverInfo.do" target="_top" title="Driver Info">Driver Info</a>
						<!-- <a class="tabcopy" href="https://forms.gle/BVVhmKJ8gnd7rWvr8" target="_blank" title="Customer Survey Form" style="float: right !important;">Customer Survey Form</a> -->
		</div>
		</div> 
			*/
WebElement menuTSRTC=driver.findElement(By.className("menu-wrap"));
List<WebElement>menuTSRTC_Links=menuTSRTC.findElements(By.tagName("a"));
	int menu_TSRTC_Size=menuTSRTC_Links.size();
	System.out.println("The Total count of the Names in Header is : "+menu_TSRTC_Size);

 	for(int i=0;i<menu_TSRTC_Size;i++)
 	
 	{
 	   if(menuTSRTC_Links.get(i).isDisplayed())
 	    {
 		String  name_TSRTC=menuTSRTC_Links.get(i).getText();
 	System.out.println(i +" "+name_TSRTC);
 	}
 	}
	
	driver.close();
	
	}

}
