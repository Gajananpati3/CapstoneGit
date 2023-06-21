package Registeruser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Signup {
	WebDriver driver;// base class reference

	public Signup (WebDriver driver) {// assign the value to variable on line 11 with the value that i will give from
										// test case
		this.driver = driver;
		PageFactory.initElements(driver, this);// initialise the elements
	}
	
	//Sign up button
	@FindBy(xpath=("//header/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[4]/a[1]"))
	public WebElement Signup;
	
	@FindBy (xpath= "//h2[contains(text(),'New User Signup!')]")
	 public WebElement Signuptext;

	

	public void verifyHomeLaunchSuccess()
	{
		System.out.println(Signup.isDisplayed());
		Assert.assertTrue(Signup.isDisplayed(),"Signup button is not Displayed");
	
	}
	
	public void Homeclick()
	{
		Signup.click();
		Signuptext.click();
		
	}	

}
