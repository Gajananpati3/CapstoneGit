package Loginuser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Homepage2 {
	WebDriver driver;

	  public Homepage2 (WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	//Check the username is visible
    @FindBy(xpath = "//li[10]//a[1]")
	public WebElement Usernamevisible;
    
    //Click on delete account
    @FindBy(xpath = "//a[normalize-space()='Delete Account']")
   	public WebElement Deleteacc2;
    
    //Check the account is deleted text is visible
    @FindBy(xpath = "//a[normalize-space()='Delete Account']")
	public WebElement Deleteaccvisible;
    
    public void Loginuser2()
    {
    	System.out.println(Usernamevisible.isDisplayed());
		Assert.assertTrue(Usernamevisible.isDisplayed(),"Username text is not Displayed");
		
		Deleteacc2.click();
		
		System.out.println(Deleteaccvisible.isDisplayed());
		Assert.assertTrue(Deleteaccvisible.isDisplayed(),"Delete account text is not Displayed");
		
		
}
}