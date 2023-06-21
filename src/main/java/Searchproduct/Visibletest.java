package Searchproduct;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Visibletest {
	WebDriver driver;

	  public Visibletest (WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	 //verify All product test is visible
		@FindBy(xpath="//h2[contains(text(),'All Products')]")
		public WebElement Allproductvisible5;
		
		//verify Searched product test is visible
		@FindBy(xpath="//h2[contains(text(),'Searched Products')]")
		public WebElement Searchedproductvisible5;
		
		public void verifytestvisible5()
		{
			System.out.println(Allproductvisible5.isDisplayed());
			Assert.assertTrue(Allproductvisible5.isDisplayed(),"All product test is not Displayed");
			
			System.out.println(Searchedproductvisible5.isDisplayed());
			Assert.assertTrue(Searchedproductvisible5.isDisplayed(),"Searched product test is not Displayed");
		
		}
		
}
