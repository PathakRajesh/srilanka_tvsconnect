package testCases;

import org.testng.annotations.Test;

import pageObject.AddVehicle;
import pageObject.Login;
import testBase.BaseClass;

public class SriLanka extends BaseClass {

	/*@BeforeMethod	
 public void preSetup()
{
/*	Activity activity= new Activity("com.tvsm.connect.srilanka","com.tvsm.connect.user.AuthenticationActivity");
    
	//	driver.startActivity(activity);
	((JavascriptExecutor)driver).executeScript("mobile:startActivity",ImmutableMap.of("com.tvsm.connect.srilanka","com.tvsm.connect.user.AuthenticationActivity"));
	
}*/

 @Test(priority=1)
 public void applicationLogin()
 {
	 Login login=new Login(driver);
	 login.flashScreens();
	 login.appTermsPolicy();
	 login.emailField(p.getProperty("email"));
	 login.verifyOtp();
 }
 
 @Test(priority=2)
 public void addVehicle() throws InterruptedException
 {
	 AddVehicle addvehicle=new AddVehicle(driver);
	 addvehicle.addvehicles(); 
 }
 
 
}
