package testCases;

import org.testng.annotations.Test;

import pageObject.AddVehicle;
import pageObject.Loginpage;
import pageObject.ReSeHowToVideos;
import pageObject.ReSeLastParkedLocation;
import pageObject.ReSeMyRides;
import pageObject.ReSeRideDetails;
import pageObject.ReSeSettings;
import pageObject.ReSeknowYourBike;
import pageObject.SignupPage;
import pageObject.VerifyOtp;
import testBase.BaseClass;

public class SriLanka extends BaseClass {
	
	
	
 @Test(priority=1)
 public void applicationLogin()
 {
	 Loginpage login=new Loginpage(driver);
	 login.flashScreens();
	 login.appTermsPolicy();
	 login.emailField(randomeString()+"@gmail.com");
	 login.loginPage();
	 
 }
     @Test(priority=2)
	 public void signupDetails()
	 {
	 SignupPage signupdetails=new SignupPage(driver);
	 signupdetails.setFullName(randomeString().toUpperCase());
	 signupdetails.setMobileNumber(randomeNumber());
	 signupdetails.setCity(randomeString().toUpperCase());
	 signupdetails.checkBox();
	 
	 }
     @Test(priority=3)
     public void verifyOtp() 
     {
    	 VerifyOtp verifyotp= new VerifyOtp(driver);
    	 verifyotp.verifyOtp();
     }
 
     @Test(priority=4)
     public void addSEVehicle() throws InterruptedException
   {
	 AddVehicle addvehicle=new AddVehicle(driver);
	 addvehicle.addStandardEdition(); 
    }
     @Test(priority=5)
     public void SerideDetails()
     {
    	 ReSeRideDetails ridedetails=new ReSeRideDetails(driver);
    	 ridedetails.ridedetail();
    	 
     }
     @Test(priority=6)
     public void SemyRides()
     {
    	ReSeMyRides myrides=new  ReSeMyRides(driver);
    	myrides.myRides();
     }
     @Test(priority=7)
     public void Seknowyourbike()
     {
    	 ReSeknowYourBike knowyourbike=new ReSeknowYourBike(driver);
    	 knowyourbike.knowyourbike();
     }
     @Test(priority=8)
     public void Sesettings()
     {
    	 ReSeSettings settings=new ReSeSettings(driver);
    	 settings.settings();
    	 settings.setRegistrationNumber(randomeString().toUpperCase());
     }
     @Test(priority=9)
     public void SelastParkLocation()
     {
    	 ReSeLastParkedLocation lastparkedlocation= new ReSeLastParkedLocation(driver);
    	 lastparkedlocation.lastparkLocation();
     }
     @Test(priority=10)
     public void SehowToVideos()
     {
    	 ReSeHowToVideos howtovideos=new ReSeHowToVideos(driver);
    	 howtovideos.howtovideos();
     }
     @Test(priority=11)
     public void addReBike()
     {
    	 AddVehicle addvehicle=new AddVehicle(driver);
    	 addvehicle.addRacingEdition("ADD VEHICLE");
     }
    @Test(priority=12)
     public void reridedetails()
     {
    	ReSeRideDetails ridedetails=new ReSeRideDetails(driver);
    	ridedetails.ridedetail();
     }
      @Test(priority=13)
     public void remyrides()
     {
    	  ReSeMyRides myrides=new  ReSeMyRides(driver);
    	  myrides.myRides();
     }
     @Test(priority=14)
     public void reknowyourbike() 
     {
    	 ReSeknowYourBike knowyourbike=new ReSeknowYourBike(driver);
    	 knowyourbike.knowyourbike();
     }
     @Test(priority=15)
     public void resettings()
     {
    	 ReSeSettings settings=new ReSeSettings(driver);
    	 settings.settings();
    	 settings.setRegistrationNumber(randomeString().toUpperCase());
     }
     @Test(priority=16)
     public void lastparkedlocation()
     {
    	 ReSeLastParkedLocation lastparkedlocation= new ReSeLastParkedLocation(driver);
    	 lastparkedlocation.relastparklocation();
     }
     @Test(priority=17)
     public void howtovideos()
     {
    	 ReSeHowToVideos howtovideos=new ReSeHowToVideos(driver);
    	 howtovideos.howtovideos(); 
     } 
     
 
 
}

