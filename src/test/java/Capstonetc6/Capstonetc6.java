package Capstonetc6;



import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



import Capstoneconfiguration.Capstoneconfiguration;
import Reviewproduct.AllProducts;

import Reviewproduct.Review;

public class Capstonetc6 extends Capstoneconfiguration {
	
	
	public AllProducts allobj;
	public Review reviewobj;
    WebDriver driver;
	
	@Parameters({"Port"})
	@BeforeClass
	public void setup2(String Port) throws MalformedURLException
	{
		driver=setUp(Port);
		
		
		allobj=new AllProducts(driver);
		reviewobj=new Review(driver);
		
	}

	
	@Test
	public void DemoScenario() 
	{
		
		allobj.PerformReview();
		reviewobj.EnterReview();
	}


}
