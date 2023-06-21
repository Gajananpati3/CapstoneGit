package Registeruser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Homepage {
	WebDriver driver;// base class reference

	public Homepage (WebDriver driver) {// assign the value to variable on line 11 with the value that i will give from
										// test case
		this.driver = driver;
		PageFactory.initElements(driver, this);// initialise the elements
	}
	//To check account created text is visible
	@FindBy (xpath= "//b[normalize-space()='Account Created!']")
	 public WebElement Accountvisible;
	
	//to click on continue button
    @FindBy(xpath = "//a[@class='btn btn-primary']")
	public WebElement Continue;
    
    //To check Username is visible
    @FindBy(xpath = "//li[10]//a[1]")
	public WebElement Usernamevisible;
    
    //Click on delete account
    @FindBy(xpath = "//a[normalize-space()='Delete Account']")
	public WebElement Deleteaccbutton;
    
    //To check delete accoun is deleted text is visible
    @FindBy(xpath = "//a[normalize-space()='Delete Account']")
	public WebElement Deleteaccvisible;
    

    
    public void signupValues2()
    {
    	Continue.click();
    	Deleteaccbutton.click();
    	
    	System.out.println(Accountvisible.isDisplayed());
		Assert.assertTrue(Accountvisible.isDisplayed(),"Signup button is not Displayed");
		  	
    	System.out.println(Usernamevisible.isDisplayed());
		Assert.assertTrue(Usernamevisible.isDisplayed(),"Signup button is not Displayed");
		
		System.out.println(Deleteaccvisible.isDisplayed());
		Assert.assertTrue(Deleteaccvisible.isDisplayed(),"Signup button is not Displayed");
		
    }
}

		
