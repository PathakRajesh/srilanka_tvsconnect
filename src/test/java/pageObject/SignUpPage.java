package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.appium.java_client.pagefactory.AndroidFindBy;
import utilities.Androidactions;

public class SignupPage extends Androidactions{

	public SignupPage(WebDriver driver) {
		super(driver);
		
	}
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
    
    @AndroidFindBy(id="com.tvsm.connect.srilanka:id/edtmobilenmber")
	private WebElement setmobileNo;
    
    
    //Actions
    
    public void setFullName(String name)
    {
    	setFullName.sendKeys(name);
    }
    public void setMobileNumber(String mobilenumber)
    {
    	setmobileNo.sendKeys(mobilenumber);
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
