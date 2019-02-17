package com.qmetry.qaf.logoutcheck.test;

import org.testng.annotations.Test;

import com.qmetry.qaf.automation.ui.WebDriverTestCase;
import com.qmetry.qaf.logoutcheck.page.LoigInPage;

public class VerifyLoginTest extends WebDriverTestCase {
	
	@Test
	public void loginTest()
	{
		LoigInPage login = new LoigInPage();
		login.launchPage(null);
		login.verifyLogIn();
		
	}

}
