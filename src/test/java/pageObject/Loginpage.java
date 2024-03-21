package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.appium.java_client.pagefactory.AndroidFindBy;
import utilities.Androidactions;

public class Loginpage extends Androidactions {
	
	public Loginpage(WebDriver driver) {
	super(driver);
	}
	
	@AndroidFindBy(id="com.android.permissioncontroller:id/permission_allow_foreground_only_button")
	private WebElement appPermission;
	
	@AndroidFindBy(id="com.android.permissioncontroller:id/permission_allow_button")
	private WebElement allowbutton;
	
	@AndroidFindBy(xpath="//android.widget.ImageView[@resource-id='com.tvsm.connect.srilanka:id/btn_next']")
	private WebElement nextBtn;
	
	@AndroidFindBy(id="com.tvsm.connect.srilanka:id/btn_explore")
	private WebElement loginBtn;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Terms']")
	private WebElement appTerms;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Privacy Policy']")
	private WebElement privacyPolicy;
	
	@AndroidFindBy(id="com.tvsm.connect.srilanka:id/edtmobilenmber")
	private WebElement emailAddress;
	
	@AndroidFindBy(id="com.tvsm.connect.srilanka:id/button_continue")
	private WebElement continuebtn;
	
	@AndroidFindBy(id="android:id/button1")
	private WebElement yesbtn;
	
	@AndroidFindBy(id="com.tvsm.connect.srilanka:id/button_continue")
	private WebElement continueBtn;
	
	@AndroidFindBy(id="android:id/button1")
	private WebElement yesClk;
	
	
	
	//Actions
	public void flashScreens()
	{
		appPermission.click();
		allowbutton.click();
		nextBtn.click();
		loginBtn.click();
	}
	
	public void appTermsPolicy() 
	{
		appTerms.click();
		BackIcon();
		privacyPolicy.click();
		BackIcon();
	}   

	public void emailField(String email)
	{
		emailAddress.sendKeys(email);
		continuebtn.click();
	}
	public void loginPage()
    {
    	yesClk.click();
    }

}
	
	


