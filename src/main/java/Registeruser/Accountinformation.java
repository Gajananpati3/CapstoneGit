package Registeruser;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Accountinformation {

	WebDriver driver;// base class reference

	public Accountinformation (WebDriver driver) {// assign the value to variable on line 11 with the value that i will give from
										// test case
		this.driver = driver;
		PageFactory.initElements(driver, this);// initialise the elements
	}
	//Fill all the details which required  
    @FindBy(xpath = "//input[@id='password']")
	public WebElement Password;
    
  //Birthdate
    @FindBy(xpath= "//select[@id='days']")
	public WebElement enterDay;
	
	@FindBy(xpath= "//select[@id='months']")
	public WebElement entermMonths;
	
	@FindBy(xpath= "//select[@id='years']")
	public WebElement enterYears;
	
    @FindBy(xpath = "//input[@id='id_gender1']")
	public WebElement Title;
    
    @FindBy(xpath = "//input[@id='newsletter']")
	public WebElement Checkbox1;
    
    @FindBy(xpath = "//input[@id='optin']")
	public WebElement Checkbox2;
	
    @FindBy(xpath = "//input[@id='first_name']")
	public WebElement Firstname;
    
    @FindBy(xpath = "//input[@id='last_name']")
	public WebElement Lastname;
    
    @FindBy(xpath = "//input[@id='company']")
   	public WebElement Company;
    
    @FindBy(xpath = "//input[@id='address1']")
   	public WebElement Address1;
    
    @FindBy(xpath = "//input[@id='address2']")
   	public WebElement Address2;
    
    @FindBy(xpath = "//input[@id='state']")
   	public WebElement State;
    
    @FindBy(xpath = "//input[@id='city']")
   	public WebElement city;
    
    @FindBy(xpath = "//input[@id='zipcode']")
   	public WebElement Zipcode;
    
    @FindBy(xpath = "//input[@id='mobile_number']")
   	public WebElement Mobilenumber;
    
    @FindBy(xpath = "//button[normalize-space()='Create Account']")
   	public WebElement Createaccount;
    
    public void signupValues1()
    {
    	Title.click();
    	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    	
    	Password.sendKeys("Gajananpatil@12");
    	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    	
    	Select day = new Select(enterDay);
		day.selectByVisibleText("29");
		  
		Select month = new Select(entermMonths);
		month.selectByVisibleText("August");
		  
		Select year = new Select(enterYears);
		year.selectByVisibleText("1999");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    	
    	Checkbox1.click();
    	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    	
    	Checkbox2.click();
    	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    	
    	Firstname.sendKeys("Gajanan");
    	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    	
    	Lastname.sendKeys("Patil");
    	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    	
    	Company.sendKeys("Axis");
    	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    	
    	Address1.sendKeys("Gajargaon");
    	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    	
    	Address2.sendKeys("Kolhapur");
    	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    	
    	State.sendKeys("Maharashtra");
    	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    	
    	city.sendKeys("Kolhapur");
    	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    	
    	Zipcode.sendKeys("416502");
    	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    	
    	Mobilenumber.sendKeys("9767800761");
    	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    	
    	Createaccount.click();
    	
    	   	
    }
         
}


