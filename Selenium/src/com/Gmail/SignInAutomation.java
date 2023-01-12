package com.Gmail;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class SignInAutomation extends BaseTestGmail{
	@Test
	public void signIn() throws IOException, InterruptedException
	{
		String fileSource="E:\\GPK_WorkSpace\\Selenium\\src\\GmailProperrties\\Gmail.properties";
		FileInputStream proFile=new FileInputStream(fileSource);
		Properties pr=new Properties();
		pr.load(proFile);
		//a[@class='button']
		
		By signinL=By.linkText(pr.getProperty("SignINPropertyByLinkText"));
		WebElement signin=driver.findElement(signinL);
		signin.click();

		/*<input type="email" class="whsOnd zHQkBf" jsname="YPqjbf" autocomplete="username" spellcheck="false" tabindex="0" aria-label="Email or phone" name="identifier" value="" autocapitalize="none" id="identifierId" dir="ltr" data-initial-dir="ltr" data-initial-value="">
		*/
		// input[@autocomplete='username']
		 By email_phoneL=By.id(pr.getProperty("Email_PhoneNumberPropertyById"));
		 WebElement email_phone=driver.findElement(email_phoneL);
		 email_phone.sendKeys("9399974499");
		 /*
// <div class="VfPpkd-RLmnJb"></div>
		 
		 // /html/body/div[1]/div[1]/div[2]/div/c-wiz/div/div[2]/div/div[2]/div/div[1]/div/div/button/div[3]
		 
		 // <div class="VfPpkd-RLmnJb"></div>
		  /* /html/body/div[1]/div[1]/div[2]/div/c-wiz/div/div[2]/div/div[2]/div/div[1]/div/div/button/div[3]
				  // <span jsname="V67aGc" class="VfPpkd-vQzf8d">Next</span>
				  
				 
		 
		 // using keyboard operations
		 Actions act=new Actions(driver);

		 act.sendKeys(Keys.TAB).build().perform();

		 act.sendKeys(Keys.TAB).build().perform();

		 act.sendKeys(Keys.TAB).build().perform();
		 Thread.sleep(5000);
		 act.sendKeys(Keys.ENTER).build().perform();;
		 Thread.sleep(10000);
		 
		 */
		 // <div jscontroller="Xq93uf" jsaction="click:cOuCgd;JIbuQc:JIbuQc;" jsname="Njthtb" class="FliLIb FmFZVc" id="identifierNext"><div class="VfPpkd-dgl2Hf-ppHlrf-sM5MNb" data-is-touch-wrapper="true"><button class="VfPpkd-LgbsSe VfPpkd-LgbsSe-OWXEXe-k8QpJ VfPpkd-LgbsSe-OWXEXe-dgl2Hf nCP5yc AjY5Oe DuMIQc LQeN7 qIypjc TrZEUc lw1w4b" jscontroller="soHxf" jsaction="click:cOuCgd; mousedown:UX7yZ; mouseup:lbsD7e; mouseenter:tfO1Yc; mouseleave:JywGue; touchstart:p6p2H; touchmove:FwuNnf; touchend:yfqBxc; touchcancel:JMtRjd; focus:AHmuwe; blur:O22p3e; contextmenu:mg9Pef;mlnRJb:fLiPzd;" data-idom-class="nCP5yc AjY5Oe DuMIQc LQeN7 qIypjc TrZEUc lw1w4b" jsname="LgbsSe"><div class="VfPpkd-Jh9lGc"></div><div class="VfPpkd-J1Ukfc-LhBDec"></div><div class="VfPpkd-RLmnJb"></div><span jsname="V67aGc" class="VfPpkd-vQzf8d">Next</span></button></div></div>
		By nextPropertyByIdL=By.id("SignInNextPropertyById");

		WebElement signInNextElement=driver.findElement(nextPropertyByIdL);
		signInNextElement.click();
		 
	}
	

}
