package com.qmetry.qaf.logoutcheck.page;

import org.hamcrest.Matchers;

import com.qmetry.qaf.automation.core.ConfigurationManager;
import com.qmetry.qaf.automation.ui.WebDriverBaseTestPage;
import com.qmetry.qaf.automation.ui.annotations.FindBy;
import com.qmetry.qaf.automation.ui.api.PageLocator;
import com.qmetry.qaf.automation.ui.api.WebDriverTestPage;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebElement;
import com.qmetry.qaf.automation.util.Reporter;
import com.qmetry.qaf.automation.util.Validator;

public class LoigInPage extends WebDriverBaseTestPage<WebDriverTestPage> {
	
	
	@FindBy(locator="logoutcheck.username.txt")
	private QAFWebElement username;
	@FindBy(locator="logoutcheck.password.txt")
	private QAFWebElement pwd;
	@FindBy(locator="logoutcheck.signin.btn")
	private QAFWebElement login;
	
	public QAFWebElement getUsername() {
		return username;
	}
	public QAFWebElement getPwd() {
		return pwd;
	}
	public QAFWebElement getLogin() {
		return login;
	}
	
	public void verifyLogIn()
	{
		Validator.assertThat("LogIn Page",driver.getTitle(),Matchers.containsString("Welcome: Mercury Tours"));
		String uname=ConfigurationManager.getBundle().getString("test.user.name");
		String pass=ConfigurationManager.getBundle().getString("test.password.pwd");
		getUsername().sendKeys(uname);
		getPwd().sendKeys(pass);
		getLogin().click();	
		Validator.assertThat("LogIn successful Page",driver.getTitle(),Matchers.containsString("Find a Flight: Mercury Tours:"));
		Reporter.log("LogIn succesfully");
		
		
	}

	@Override
	protected void openPage(PageLocator arg0, Object... arg1) {
		driver.get("/");
	}

}
