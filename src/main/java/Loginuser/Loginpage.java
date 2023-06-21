package Loginuser;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Loginpage {
	WebDriver driver;

	  public Loginpage (WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	 
	// Click on sign up/login button 
	@FindBy(xpath="//a[normalize-space()='Signup / Login']")
	public WebElement clickbutton1;
	
	// verify "Login to your account" visible
	@FindBy(xpath="//h2[normalize-space()='Login to your account']")
	public WebElement loginvisible;

	
  // Enter correct email address and password [that was used for creating the registration flow]
	@FindBy(xpath="//input[@name='email']")
	public WebElement Enteremail;
	
	@FindBy(xpath="//input[@placeholder='Password']")
	public WebElement Enterpass;

	
  // Click 'login' button
	@FindBy(xpath= "//button[normalize-space()='Login']")
	public WebElement Clickloginbutton;
	 
	
  public void Loginusers1()
	{
	  
  	clickbutton1.click();
	
  	System.out.println(loginvisible.isDisplayed());
  	Assert.assertTrue(loginvisible.isDisplayed(),("Login to your account"));
  
  	Enteremail.sendKeys("lokkip791@gmail.com");
  	Enterpass.sendKeys("Lokki@1234");
  	
  	//Lokkip792@gamail.com
  	//Lokki@1234
  	
  	//Lokkip793@gamail.com
  	//Lokki@1234
  	
  	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("const elements = document.getElementsByClassName('adsbygoogle adsbygoogle-noablate'); while (elements.length > 0) elements[0].remove()");
  
  	Clickloginbutton.click();
  	
  }
}
