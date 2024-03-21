package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.appium.java_client.pagefactory.AndroidFindBy;
import utilities.Androidactions;

public class ReSeSettings extends Androidactions{

	public ReSeSettings(WebDriver driver) {
		super(driver);
		
	}
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Settings']")
	private WebElement VehicleSettings;
	
	@AndroidFindBy(id="com.tvsm.connect.srilanka:id/distance_seekbar")
	private WebElement seekbar;

	@AndroidFindBy(xpath="//android.widget.TextView[@text='SAVE']")
    private WebElement Savebtn;
	
	@AndroidFindBy(xpath="//android.widget.EditText[@text='Add registration number']")
	private WebElement setRegistrationNumber;
	
	//Actions
	
	public void settings()
	{
		VehicleSettings.click();
		donotdisturb();
		autoreply();
		overspeedalert();
		dragndrop(seekbar);
		Ok();
		
	}
	public void setRegistrationNumber(String number)
	{
		setRegistrationNumber.sendKeys(number);
		Savebtn.click();
		
	}

}


