package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.appium.java_client.pagefactory.AndroidFindBy;
import utilities.Androidactions;

public class ReSeLastParkedLocation extends Androidactions {

	public ReSeLastParkedLocation(WebDriver driver) {
		super(driver);
		
	}
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Last Parked Location']")
	private WebElement LastParkLocation;
	
	//Actions
	
	public void lastparkLocation()
	{
	LastParkLocation.click();
	heremappermissionclk();
	BackIcon();
	}
	
	public void relastparklocation()
	{
		LastParkLocation.click();
		BackIcon();
	}
	
}


