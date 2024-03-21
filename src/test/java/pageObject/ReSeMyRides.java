package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.appium.java_client.pagefactory.AndroidFindBy;
import utilities.Androidactions;

public class ReSeMyRides extends Androidactions {

	public ReSeMyRides(WebDriver driver) {
		super(driver);
		
	}
	@AndroidFindBy(xpath="//android.widget.TextView[@text='My Rides']")
	private WebElement MyRidesList;
	
	//Actions
	
	public void myRides()
	{
		MyRidesList.click();
		BackIcon();
		
		}

}
