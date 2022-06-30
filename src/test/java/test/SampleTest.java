package test;

import org.testng.annotations.Test;

import functions.Login;
import utility.BaseClass;


public class SampleTest extends BaseClass {

	
	@Test
	public void sampleTest() {
		
		Login.verifyLoginPage("Facebook - log in or sign up");
	
	}
	
	

}