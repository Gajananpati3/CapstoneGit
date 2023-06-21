package Searchproduct;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Loginpage5 {
	WebDriver driver;

	  public Loginpage5 (WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	 
	// Click on sign up/login button 
	@FindBy(xpath="//a[normalize-space()='Signup / Login']")
	public WebElement clickbutton5;
	
	// verify "Login to your account" visible
	@FindBy(xpath="//h2[normalize-space()='Login to your account']")
	public WebElement loginvisible5;

	
// Enter correct email address and password [that was used for creating the registration flow]
	@FindBy(xpath="//input[@name='email']")
	public WebElement Enteremail5;
	
	@FindBy(xpath="//input[@placeholder='Password']")
	public WebElement Enterpass5;

	
// Click 'login' button
	@FindBy(xpath= "//button[normalize-space()='Login']")
	public WebElement Clickloginbutton5;
	 
	// Click 'Add cart
		@FindBy(xpath= "//header/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[3]/a[1]")
		public WebElement Adddcart5;
	
public void Loginuserss5()
	{
	  
	clickbutton5.click();
	
	System.out.println(loginvisible5.isDisplayed());
	Assert.assertTrue(loginvisible5.isDisplayed(),("Login to your account"));

	Enteremail5.sendKeys("gaja100@gmail.com");
	Enterpass5.sendKeys("Gaja@1234");

	Clickloginbutton5.click();
	Adddcart5.click();
	
}

}
