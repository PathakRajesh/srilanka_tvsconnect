package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.PageFactory;

import com.google.common.collect.ImmutableMap;

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
	public void addNewBike()
	{
		driver.findElement(By.id("com.tvsm.connect.bangladesh:id/menu_add_new_bike")).click();
	}
	public void addVehicle()
	{
		driver.findElement(By.xpath("//android.widget.TextView[@text='ADD VEHICLE']")).click();
	}
	

}
