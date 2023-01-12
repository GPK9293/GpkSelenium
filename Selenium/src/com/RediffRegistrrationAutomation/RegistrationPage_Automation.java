package com.RediffRegistrrationAutomation;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class RegistrationPage_Automation extends Rediff_BaseTest{

	@Test(priority=1)
	public void FullNameAutomation() throws IOException
	{
		// /html/body/center/form/div/table[2]/tbody/tr[3]/td[3]/input
		// <input type="text" onblur="fieldTrack(this);" name="name970bf11c" value="" style="width:185px;" maxlength="61">
		String fileSource="E:\\GPK_WorkSpace\\Selenium\\src\\com\\RediffMail\\Rediff_RegistrationPropertiesFile.properties";
		FileInputStream proFile=new FileInputStream(fileSource);
		Properties pr=new Properties();
		pr.load(proFile);
		By FullNamePropertyByNameL=By.xpath(pr.getProperty("FullNamePropertyByXpath"));
		WebElement fullNameElement=driver.findElement(FullNamePropertyByNameL);
		fullNameElement.sendKeys("Hello");
		
		// <input type="text" name="login95210863" value="" style="width:185px;" maxlength="30" onclick="javascript:UncheckAllOptions();" onfocus="javascript:checkFullName(document.forms[0].name95210863.value);" onblur="fieldTrack(this);">
		
		
	}
}
