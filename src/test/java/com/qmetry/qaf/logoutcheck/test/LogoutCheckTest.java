package com.qmetry.qaf.logoutcheck.test;


import org.testng.annotations.Test;
import com.qmetry.qaf.automation.ui.WebDriverTestCase;
import com.qmetry.qaf.logoutcheck.page.LogoutPage;

public class LogoutCheckTest extends WebDriverTestCase {

	
	@Test
	public void logoutTest()
	{
		LogoutPage logout = new LogoutPage();
		logout.launchPage(null);
		logout.verifyLogout();
		
	}
}
