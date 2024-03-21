package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.appium.java_client.pagefactory.AndroidFindBy;
import utilities.Androidactions;

public class ReSeRideDetails extends Androidactions{

	public ReSeRideDetails(WebDriver driver) {
		super(driver);
		
	}
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Ride Details']")
	private WebElement RideDetails;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Overview']")
	private WebElement vehicleoverview;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Last Ride Information']")
	private WebElement LastRideInformation;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='VIEW PAST RIDES']")
	private WebElement viewpastrides;
		
//Actions
	
	public void ridedetail()
	{
		RideDetails.click();
		viewpastrides.click();
		BackIcon();
		LastRideInformation.click();
		vehicleoverview.click();
		BackIcon();
	}

}


