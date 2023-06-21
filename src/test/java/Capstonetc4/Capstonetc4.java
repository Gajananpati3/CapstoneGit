package Capstonetc4;

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Capstoneconfiguration.Capstoneconfiguration;
import Removecart.Addcart;



public class Capstonetc4 extends Capstoneconfiguration {
	
	
	public Addcart Addcartobj;

	
	
	WebDriver driver;
	
	@Parameters({"Port"})
	@BeforeClass
	public void setup1(String Port) throws MalformedURLException
	{
		driver=setUp(Port);
		
		
		Addcartobj= new Addcart(driver);
	
			
	}
	
	@Test
	public void scenarioDemo() throws InterruptedException
	{
		
		Addcartobj.Addcartclick();	
		
	
	}

}
