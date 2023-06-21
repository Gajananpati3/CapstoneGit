package Capstonetestc;

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import Capstoneconfiguration.Capstoneconfiguration;
import Registeruser.Accountinformation;
import Registeruser.Homepage;
import Registeruser.Sendkeys;
import Registeruser.Signup;


public class Capstonetestc extends Capstoneconfiguration{
	
	public Signup Signupobj;
	public Sendkeys Sendkeysobj;
	public Accountinformation Accountobj;
	public Homepage Homepageobj;
	
	WebDriver driver;
	
	@Parameters({"Port"})
	@BeforeClass
	public void setup1(String Port) throws MalformedURLException
	{
		driver=setUp(Port);
		
		Signupobj = new Signup(driver);
		Sendkeysobj= new Sendkeys(driver);
		Accountobj=new Accountinformation(driver);
		Homepageobj=new Homepage(driver);
		
	}
	
	@Test
	public void scenarioDemo() throws InterruptedException
	{
		Signupobj.Homeclick();
		Sendkeysobj.signupValues();	
		Sendkeysobj.informationVisible();
		Accountobj.signupValues1();
		Homepageobj.signupValues2();
		Signupobj.verifyHomeLaunchSuccess();
		
	}
}
