package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.appium.java_client.pagefactory.AndroidFindBy;
import utilities.Androidactions;

public class Login extends Androidactions {
	
	public Login(WebDriver driver) {
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
	
	@AndroidFindBy(id="com.tvsm.connect.srilanka:id/button_otp_continue")
	private WebElement otpContinuebtn;
	
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

	public void emailField(String Field)
	{
		emailAddress.sendKeys(Field);
		continuebtn.click();
	}
    public void verifyOtp()
	{
		driver.findElement(By.id("com.tvsm.connect.srilanka:id/otp_one_email")).sendKeys("8");
		driver.findElement(By.id("com.tvsm.connect.srilanka:id/otp_two_email")).sendKeys("4");
		driver.findElement(By.id("com.tvsm.connect.srilanka:id/otp_three_email")).sendKeys("2");
		driver.findElement(By.id("com.tvsm.connect.srilanka:id/otp_four_email")).sendKeys("6");
		driver.findElement(By.id("com.tvsm.connect.srilanka:id/otp_five_email")).sendKeys("9");
		driver.findElement(By.id("com.tvsm.connect.srilanka:id/otp_six_email")).sendKeys("1"); 
		otpContinuebtn.click();
		
		
	}

	
		
	}
	
	


