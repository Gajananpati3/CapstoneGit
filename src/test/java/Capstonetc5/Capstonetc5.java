package Capstonetc5;

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Capstoneconfiguration.Capstoneconfiguration;
import Searchproduct.Loginpage5;
import Searchproduct.Searchdress;
import Searchproduct.Visibletest;

public class Capstonetc5 extends Capstoneconfiguration{
	
	public Loginpage5 Loginpage5obj;
	public Searchdress Searchdress5obj;
	public Visibletest Visibletest5obj;
	
	
	WebDriver driver;
	
	@Parameters({"Port"})
	@BeforeClass
	public void setup1(String Port) throws MalformedURLException
	{
		driver=setUp(Port);
		
		Loginpage5obj = new Loginpage5(driver);
		Searchdress5obj= new Searchdress(driver);
		Visibletest5obj=new Visibletest(driver);
			
	}
	
	@Test
	public void scenarioDemo() throws InterruptedException
	{
		
		Searchdress5obj.clickProduct5();	
		Searchdress5obj.searchProductVisible5();
		Searchdress5obj.addToCart5();
		Loginpage5obj.Loginuserss5();
		Visibletest5obj.verifytestvisible5();
		
		
	}

	

}
