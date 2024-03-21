package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.appium.java_client.pagefactory.AndroidFindBy;
import utilities.Androidactions;

public class ReSeknowYourBike extends Androidactions {

	public ReSeknowYourBike(WebDriver driver) {
		super(driver);
		
	}
	@AndroidFindBy(xpath="//*[contains(@text,'Know')]")
	private WebElement KnowYourBike;
	
	
	//Actions
    public void knowyourbike()
{
	KnowYourBike.click();
	tips();
	specification();
	usermanual();
	BackIcon();
}

}
