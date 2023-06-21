package Searchproduct;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Searchdress {
    WebDriver driver;
    
    public Searchdress(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
    
    // Create the Page Object Model 
    
    @FindBy(xpath = "//a[@href='/products']")
	public WebElement products_Search;
    
    @FindBy(xpath = "//*[@id = 'search_product']")
    public WebElement Search;
   
    @FindBy(xpath = "//*[@id = 'submit_search']")
    public WebElement Search_Submit;

    @FindBy(xpath = "//*[text() = 'Searched Products']")
    public WebElement Visible;
    
    @FindBy(xpath = "//*[text() = 'Continue Shopping']")
    public WebElement conti;
    
    @FindBy(xpath = "(//*[text() = 'Add to cart'])[1]")
    public WebElement add1;
    
    @FindBy(xpath = "(//*[text() = 'Add to cart'])[3]")
    public WebElement add2;
    
    @FindBy(xpath = "(//*[text() = 'Add to cart'])[5]")
    public WebElement add3;
    
    @FindBy(xpath = "(//*[text() = 'Add to cart'])[7]")
    public WebElement add4;
    
    @FindBy(xpath = "(//*[text() = 'Add to cart'])[9]")
    public WebElement add5;
    
    @FindBy(xpath = "(//*[text() = 'Add to cart'])[11]")
    public WebElement add6;
    
    @FindBy(xpath = "(//*[text() = 'Add to cart'])[13]")
    public WebElement add7;
    
    @FindBy(xpath = "(//*[text() = 'Add to cart'])[15]")
    public WebElement add8;
    
    @FindBy(xpath = "(//*[text() = 'Add to cart'])[17]")
    public WebElement add9;
    
    @FindBy(xpath = "//*[text() = ' Cart']")
    public WebElement cart;
    
    public void clickProduct5()
    {
    	products_Search.click();
    
    	JavascriptExecutor js = (JavascriptExecutor) driver;
    	js.executeScript("const elements = document.getElementsByClassName('adsbygoogle adsbygoogle-noablate'); while (elements.length > 0) elements[0].remove()");
    	Search.sendKeys("dress");
    	Search_Submit.click();
    	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

    	
    }
   public void searchProductVisible5()
   {
	   Assert.assertTrue(Visible.isDisplayed(), "The Search Product is enabled");
   }
    public void addToCart5()
    {
    	add1.click();
    	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    	conti.click();
    	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

    	
    	add2.click();
    	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    	conti.click();
    	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

    	
    	add3.click();
    	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    	conti.click();
    	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

    	
    	add4.click();
    	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    	conti.click();
    	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

    	
        add5.click();
    	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        conti.click();
    	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        
        add6.click();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        conti.click();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        
        add7.click();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        conti.click();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        
        add8.click();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        conti.click();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        
        add9.click();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        conti.click();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        

    	JavascriptExecutor js = (JavascriptExecutor) driver;
    	js.executeScript("const elements = document.getElementsByClassName('adsbygoogle adsbygoogle-noablate'); while (elements.length > 0) elements[0].remove()");
  
    	cart.click();
    	
    }
    

}
