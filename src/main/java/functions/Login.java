package functions;

import pages.FacebookHomePage;
import utility.BaseClass;

public class Login extends BaseClass {
	
	public static FacebookHomePage facebookHomePge = new FacebookHomePage(driver);
	
	public static void verifyLoginPage(String pageTitle) {
		//log("[START] verifyLoginPage execution");
		System.out.println("[START] verifyLoginPage execution");
		String homePageTitle = getPageTitle();
		log("Page Title: %s", homePageTitle);
		assert(homePageTitle.equalsIgnoreCase(pageTitle));
		log("[END] verifyLoginPage execution");
	}
}