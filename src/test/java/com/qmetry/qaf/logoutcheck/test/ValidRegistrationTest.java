package com.qmetry.qaf.logoutcheck.test;

import org.testng.annotations.Test;

import com.qmetry.qaf.automation.ui.WebDriverTestCase;
import com.qmetry.qaf.logoutcheck.page.ValidRegistrationPage;

public class ValidRegistrationTest extends WebDriverTestCase {

	
	@Test
	public void registration() throws InterruptedException {
		ValidRegistrationPage reg=new ValidRegistrationPage();
		Thread.sleep(3000);
		reg.getReg_link().click();
		//reg.fill_data();
	}

}
