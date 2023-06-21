package Invalidlogin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Loginpage3 {
	WebDriver driver;// base class reference

	public Loginpage3 (WebDriver driver) {// assign the value to variable on line 11 with the value that i will give from
								// test case
		this.driver = driver;
		PageFactory.initElements(driver, this);// initialise the elements
	}
	
	//Login button
	@FindBy(xpath=("//header/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[4]/a[1]"))
	public WebElement Loginp;
	
	//Login to your account text visible
	@FindBy (xpath= "//h2[normalize-space()='Login to your account']")
	 public WebElement Logintext;

	
	public void Homeclick3()
	{
		Loginp.click();
		
		System.out.println(Loginp.isDisplayed());
		Assert.assertTrue(Logintext.isDisplayed(),"Login to your account text is not Displayed");
	
		
	}	


}
