package testCases;

import org.testng.annotations.Test;


import pageObject.Login;
import pageObject.SignUpPage;
import testBase.BaseClass;

public class SignUp extends BaseClass {
	
	@Test()
	 public void verifySignUpPage()
	 {
	 SignUpPage signupdetails = new SignUpPage(driver);
	 signupdetails.flashScreens();
	 signupdetails.loginPage(randomeString()+"@gmail.com");
	 signupdetails.setFullName(randomeString().toUpperCase());
	 signupdetails.setMobileNumber(randomeNumber());
	 signupdetails.setCity(randomeString().toUpperCase());
	 signupdetails.checkBox();
	}
	 
}
