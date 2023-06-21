package Reviewproduct;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Review {
	WebDriver driver;

	  public Review(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	  
	  @FindBy(xpath="//*[text()='Write Your Review']")
	  public WebElement ReviewMsg;
	  
	  @FindBy(id="name")
	  public WebElement NameReview;
	  
	  @FindBy(id="email")
	  public WebElement EmailReview;
	  
	  @FindBy(id="review")
	  public WebElement WriteReview;
	  
	  @FindBy(id="button-review")
	  public WebElement SubmitReview;
	  
	  @FindBy(xpath = "//span[contains(text(),'Thank you for your review.')]")
	  public WebElement Thankyou;
	  
	  
	  
	  public void EnterReview()
	  {
		  ReviewMsg.isDisplayed();
		  driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		  
		  NameReview.sendKeys("Gajanan");
		  driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		  
		  EmailReview.sendKeys("gaja@gmail.com");
		  driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		  
		  WriteReview.sendKeys("karvenagar");
		  driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		  
		  SubmitReview.click();
		  driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		  
		  System.out.println(Thankyou.isDisplayed());
		  Assert.assertTrue(Thankyou.isDisplayed(),"Thank you for your review text is not Displayed");
	  }
}
