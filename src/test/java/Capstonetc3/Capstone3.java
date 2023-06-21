package Capstonetc3;

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Capstoneconfiguration.Capstoneconfiguration;
import Invalidlogin.Invalidlogi;
import Invalidlogin.Loginpage3;


public class Capstone3 extends Capstoneconfiguration{
	
	public Loginpage3 Loginpage3obj;
    public Invalidlogi Invalidlogiobj;


WebDriver driver;

@Parameters({"Port"})
@BeforeClass
public void setup1(String Port) throws MalformedURLException
{
	driver=setUp(Port);
	
	Loginpage3obj = new Loginpage3(driver);
	Invalidlogiobj= new Invalidlogi(driver);	
}

@Test
public void scenarioDemo() throws InterruptedException
   {
	Loginpage3obj.Homeclick3();
	Invalidlogiobj.signupValues3();
	
    }

}
