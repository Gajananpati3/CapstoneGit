package Removecart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;


public class Addcart {
	WebDriver driver;
	Actions act;
	
	public Addcart (WebDriver driver)
	{
		this.driver=driver;
		this.act=new Actions(driver);
		PageFactory.initElements(driver, this);
	}

	
	
	@FindBy(xpath="//body/section[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/a[1]")
	public WebElement product1;
	
	@FindBy(xpath="//button[@class='btn btn-success close-modal btn-block']")
	public WebElement continueButton1;
	

	
	@FindBy(xpath="//body/section[2]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/a[1]")
	public WebElement product2;
	
	
	@FindBy(xpath="//body/section[2]/div[1]/div[1]/div[2]/div[1]/div[4]/div[1]/div[1]/div[1]/a[1]")
	public WebElement product3;
	
	
	@FindBy(xpath="//body/section[2]/div[1]/div[1]/div[2]/div[1]/div[5]/div[1]/div[1]/div[1]/a[1]")
	public WebElement product4;
	
	
	@FindBy(xpath="//body/section[2]/div[1]/div[1]/div[2]/div[1]/div[6]/div[1]/div[1]/div[1]/a[1]")
	public WebElement product5;
	
	
	@FindBy(xpath = "/html[1]/body[1]/header[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[3]/a[1]")
	public WebElement Adddcartclick;
	
	
	@FindBy(xpath = "//tr[@id='product-1']//i[@class='fa fa-times']")  
	public WebElement remove1;
	
	@FindBy(xpath = "//tr[@id='product-2']//i[@class='fa fa-times']")  
	public WebElement remove2;
	
	@FindBy(xpath = "//tr[@id='product-3']//i[@class='fa fa-times']")  
	public WebElement remove3;
	
	@FindBy(xpath = "//tr[@id='product-4']//i[@class='fa fa-times']")  
	public WebElement remove4;
	
	@FindBy(xpath = "//tr[@id='product-5']//i[@class='fa fa-times']")  
	public WebElement remove5;
	
	@FindBy(xpath = "//b[contains(text(),'Cart is empty!')]")
	public WebElement empty;
	
	public void Addcartclick() throws InterruptedException
	{
	
	Thread.sleep(3000);
		
		product1.click();
		continueButton1.click();
		
		product2.click();
		continueButton1.click();
		
		product3.click();
		continueButton1.click();
		
		product4.click();
		continueButton1.click();
		
		product5.click();
		continueButton1.click();
		
		Adddcartclick.click();
		
		remove1.click();
		remove2.click();
		remove3.click();
		remove4.click();
		remove5.click();
		
		System.out.println(empty.isDisplayed()+"Successfully Product is Removed From Cart ");
		
		Assert.assertFalse(empty.isDisplayed(), "Product is Not Removed From Cart ");

		
	}	
	
}
