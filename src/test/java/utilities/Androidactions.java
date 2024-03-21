package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.PageFactory;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Androidactions {
	
    public WebDriver driver;
	
	public Androidactions(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	public void BackIcon()
	{
		driver.findElement(By.id("com.tvsm.connect.srilanka:id/imgBack")).click();
	}
	public void SwipeAction()
	{
		((JavascriptExecutor) driver).executeScript("mobile: swipeGesture", ImmutableMap.of(
			    "left", 100, "top", 100, "width", 200, "height", 200,
			    "direction", "left",
			    "percent", 0.75
			));
	}
	public void dragndrop(WebElement ele)
	{
		((JavascriptExecutor) driver).executeScript("mobile: dragGesture", ImmutableMap.of(
			    "elementId", ((RemoteWebElement) ele).getId(),
			    "endX", 656,
			    "endY", 1184
			));
	}
	public void addNewBike()
	{
		driver.findElement(By.id("com.tvsm.connect.srilanka:id/menu_add_new_bike")).click();
	}
	public void addVehicle()
	{
		driver.findElement(By.xpath("//android.widget.TextView[@text='ADD VEHICLE']")).click();
	}
	
	public void allowAppPermission()
	{
	while (driver.findElements(By.xpath("//android.widget.Button[@resource-id=\"com.android.permissioncontroller:id/permission_allow_button\"]")).size()>0) {
	    driver.findElement(By.xpath("//android.widget.Button[@resource-id=\"com.android.permissioncontroller:id/permission_allow_button\"]")).click();
	} 
	}
	public void tips()
	{
		driver.findElement(By.xpath("//android.widget.TextView[@text='Tips']")).click();
	}
	public void specification()
	{
		driver.findElement(By.xpath("//android.widget.TextView[@text='Specifications']")).click();
	}
	public void usermanual()
    {
        driver.findElement(AppiumBy.accessibilityId("User Manual")).click();
    }
    public void donotdisturb()
    {
    	driver.findElement(By.id("com.tvsm.connect.srilanka:id/iv_do_not_disturb")).click();
    }
    public void autoreply()
    {
    	driver.findElement(By.id("com.tvsm.connect.srilanka:id/iv_auto_reply_sms")).click();
    }
    public void overspeedalert()
    {
    	driver.findElement(By.id("com.tvsm.connect.srilanka:id/iv_over_speed")).click();
    }
    public void Ok()
	{
		driver.findElement(By.xpath("//android.widget.Button[@text='OK']")).click();
	}
    public void heremappermissionclk()
	{
		driver.findElement(By.id("com.tvsm.connect.srilanka:id/button_grant")).click();
	}
    public void addnewbike()
	{
		driver.findElement(By.id("com.tvsm.connect.srilanka:id/menu_add_new_bike")).click();
	}
    public void ScrollToText(String Text)
	{
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\""+Text+"\"));"));
	}
}

	
	

	


