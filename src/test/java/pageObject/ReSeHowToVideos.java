package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.appium.java_client.pagefactory.AndroidFindBy;
import utilities.Androidactions;

public class ReSeHowToVideos extends Androidactions{

	public ReSeHowToVideos(WebDriver driver) {
		super(driver);
		
	}
	@AndroidFindBy(xpath="//android.widget.TextView[@text='How To Videos']")
	private WebElement HowtoVideos;
	
	//Action
	
	public void howtovideos()
	{
		HowtoVideos.click();
		BackIcon();
	}
}


