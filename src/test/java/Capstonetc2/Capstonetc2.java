package Capstonetc2;

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Capstoneconfiguration.Capstoneconfiguration;
import Loginuser.Homepage2;
import Loginuser.Loginpage;



public class Capstonetc2 extends Capstoneconfiguration {

	public Loginpage Loginpageobj;
    public Homepage2 Homepage2obj;


WebDriver driver;

@Parameters({"Port"})
@BeforeClass
public void setup1(String Port) throws MalformedURLException
{
	driver=setUp(Port);
	
	Loginpageobj = new Loginpage(driver);
	Homepage2obj= new Homepage2(driver);	
}

@Test
public void scenarioDemo() throws InterruptedException
   {
	Loginpageobj.Loginusers1();
	Homepage2obj.Loginuser2();
	
    }
}


