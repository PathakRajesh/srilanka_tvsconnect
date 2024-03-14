package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.appium.java_client.pagefactory.AndroidFindBy;
import utilities.Androidactions;

public class AddVehicle extends Androidactions {

	public AddVehicle(WebDriver driver) {
		super(driver);
	}
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Standard Edition']/..[@resource-id='com.tvsm.connect.srilanka:id/rel']/following-sibling::android.widget.ImageView[@resource-id='com.tvsm.connect.srilanka:id/up_down_arrows']")
	private WebElement addVehicle;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Standard Edition']/..[@resource-id='com.tvsm.connect.srilanka:id/rel']/following-sibling::android.widget.ImageView[@resource-id='com.tvsm.connect.srilanka:id/up_down_arrows']")
	private WebElement downArrow;
	
	//Actions
	public void addvehicles() throws InterruptedException
	{
		
		addVehicle.click();
	    addVehicle();
	//    downArrow.click();
		
	}

	}
	
	


