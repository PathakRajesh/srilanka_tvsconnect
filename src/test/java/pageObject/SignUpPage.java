package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.appium.java_client.pagefactory.AndroidFindBy;
import utilities.Androidactions;

public class SignUpPage extends Androidactions {

	public SignUpPage(WebDriver driver) {
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
    
	@AndroidFindBy(id="com.tvsm.connect.srilanka:id/edtmobilenmber")
	private WebElement emailfield;
	
	@AndroidFindBy(id="com.tvsm.connect.srilanka:id/button_continue")
	private WebElement continueBtn;
	
	@AndroidFindBy(id="android:id/button1")
	private WebElement yesClk;
	
	@AndroidFindBy(id="com.tvsm.connect.srilanka:id/edt_fullname")
	private WebElement setFullName;
    
    @AndroidFindBy(id="com.tvsm.connect.srilanka:id/edtcity")
    private WebElement setcityName;
    
    @AndroidFindBy(id="com.tvsm.connect.srilanka:id/cb_pickndrop")
    private WebElement firstChkBox;
    
    @AndroidFindBy(id="com.tvsm.connect.srilanka:id/cb_country")
    private WebElement secondChkBox;
    
    @AndroidFindBy(id="com.tvsm.connect.srilanka:id/btn_submit")
    private WebElement submitBtn;
    
    //Actions
    
    public void flashScreens()
	{
		appPermission.click();
		allowbutton.click();
		nextBtn.click();
		loginBtn.click();
	}
    
    public void loginPage(String email)
    {
    	emailfield.sendKeys(email);
    	continueBtn.click();
    	yesClk.click();
    }

    public void setFullName(String name)
    {
    	setFullName.sendKeys(name);
    }
    public void setMobileNumber(String mobilenumber)
    {
    	emailfield.sendKeys(mobilenumber);
    }
    public void setCity(String city)
    {
    	setcityName.sendKeys(city);
    }
    public void checkBox()
    {
    	firstChkBox.click();
    	secondChkBox.click();
    	submitBtn.click();
    }
    
    

}


