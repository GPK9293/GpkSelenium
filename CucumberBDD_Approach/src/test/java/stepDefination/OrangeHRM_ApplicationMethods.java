package stepDefination;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OrangeHRM_ApplicationMethods {

	WebDriver driver;
	String ApplicationUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/dashboard";
	@SuppressWarnings("deprecation")
	@Given("User Should Open a Browser on the System")
	public void user_should_open_a_browser_on_the_system()
	{
		System.setProperty("webdriver.chrome.driver","./BrowsersDriverFiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
	   }

	@When("User Enters OrangeHRM Application URL Address")
	public void user_enters_orange_hrm_application_url_address() 
	{
	  driver.get(ApplicationUrlAddress);
	  
	}

	@Then("User Should be Able to Navigate to OrangeHRM Application Login Page")
	public void user_should_be_able_to_navigate_to_orange_hrm_application_login_page() {
	  String expectedOHRMLogInPageTitle="OrangeHRM";
	  String actuaOHRMLogInPageTitle=driver.getTitle();
	  Assert.assertEquals("OrangeHRM Application Title not matched",expectedOHRMLogInPageTitle,actuaOHRMLogInPageTitle);
	  System.out.println("Landed at OrangeHRM LogIn Page");
	}

	@Then("User Should Close the OrangeHRM Application")
	public void user_should_close_the_orange_hrm_application_e() 
	{
		driver.close();
	   }


@Then("User Should enter {string} and {string} and click on LogInButton")
public void user_should_enter_and_and_click_on_log_in_button(String UserName, String Password) {
	// <input name="txtUsername" id="txtUsername" type="text">
	
	WebElement usernameElement=driver.findElement(By.id("txtUsername"));
	usernameElement.clear();
	usernameElement.sendKeys(UserName);
	
	// <input name="txtPassword" id="txtPassword" autocomplete="off" type="password">
	WebElement passwordElement=driver.findElement(By.id("txtPassword"));
	passwordElement.clear();
	passwordElement.sendKeys(Password);
	
	// <input type="submit" name="Submit" class="button" id="btnLogin" value="LOGIN">
	
	WebElement loginButtonElement=driver.findElement(By.id("btnLogin"));
	loginButtonElement.click();
   
}
@Then("User Should be able to Navigate HomePage")
public void user_should_be_able_to_navigate_home_page() {
	// <a href="#" id="welcome" class="panelTrigger">Welcome Admin</a>
	
	WebElement welcomAdminElement=driver.findElement(By.id("welcome"));
	String actualHomePageText=welcomAdminElement.getText();
	String expectedHomePageText="Welcome Admin";
    Assert.assertEquals("Fail to land at Home Page",expectedHomePageText, actualHomePageText);
    System.out.println("landed at Home Page");
}


		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
