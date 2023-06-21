package Registeruser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Sendkeys {
	WebDriver driver;// base class reference

	public Sendkeys (WebDriver driver) {// assign the value to variable on line 11 with the value that i will give from
										// test case
		this.driver = driver;
		PageFactory.initElements(driver, this);// initialise the elements
	}
	//Name field fill information
     @FindBy(xpath = "//input[@placeholder='Name']")
	 public WebElement name;
     
	//Email field fill email
	@FindBy(xpath = "//input[@data-qa='signup-email']")	
	public WebElement email;
	
	//Click on Sign up button to sign up 
	@FindBy(xpath = "//button[normalize-space()='Signup']")
	public WebElement button;
	
	
	public void signupValues()
	{
		
		name.sendKeys("Gajanan");
		
		email.sendKeys("kiran1000@gmail.com");
		
		button.click();			
	}
    @FindBy(xpath = "//b[normalize-space()='Enter Account Information']")
	
	public WebElement account;

	public void informationVisible()
	{
		
		System.out.println("Enter Account Information is Visible - "+account.isDisplayed());
		
		Assert.assertTrue(account.isDisplayed(), "Account Information is  Not Visible ");
	
		
	}
		
}
