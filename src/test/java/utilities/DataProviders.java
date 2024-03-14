package utilities;

import org.testng.annotations.DataProvider;

public class DataProviders {
	
	@DataProvider(name="emailData")
	public Object [][] getData()
	{
		return new Object[][] {{"srillankatest@yopmail.com"}};
		
	}
	

}
