package Invalidlogin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;


public class Invalidlogi {
	WebDriver driver;// base class reference

	public Invalidlogi (WebDriver driver) {// assign the value to variable on line 11 with the value that i will give from
										// test case
		this.driver = driver;
		PageFactory.initElements(driver, this);// initialise the elements
	}
	
	    //Email field fill email
		@FindBy(xpath = "//input[@data-qa='login-email']")	
		public WebElement email3;
	
	    //Name field fill information
        @FindBy(xpath = "//input[@placeholder='Password']")
	    public WebElement password3;
     
	
	
	    //Click on Sign up button to sign up 
	    @FindBy(xpath = "//button[normalize-space()='Login']")
	    public WebElement Loginbutton3;
	    
	    //Your email or password is incorrect!
	    @FindBy(xpath = "//p[normalize-space()='Your email or password is incorrect!']")
	    public WebElement Invalidpassvisible;
	    
	
	    public void signupValues3()
	{
	    email3.sendKeys("gajanan@gmail.com");
	    
		
	    password3.sendKeys("Gajana");
			
	    Loginbutton3.click();	
	   
	    System.out.println(Invalidpassvisible.isDisplayed());
		Assert.assertTrue(Invalidpassvisible.isDisplayed(),"Invalid password is not Displayed");
	
	}
	    }


