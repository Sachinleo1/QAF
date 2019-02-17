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

public class LogoutPage extends WebDriverBaseTestPage<WebDriverTestPage> {
	
	
	@FindBy(locator="logoutcheck.username.txt")
	private QAFWebElement username;
	@FindBy(locator="logoutcheck.password.txt")
	private QAFWebElement pwd;
	@FindBy(locator="logoutcheck.signin.btn")
	private QAFWebElement login;
	@FindBy(locator="logoutcheck.ffContinue.link")
	private QAFWebElement findflightCont;
	@FindBy(locator="logoutcheck.sfcontinue.link")
	private QAFWebElement sourceFcontinue;
	@FindBy(locator="logoutcheck.sucurepayment.link")
	private QAFWebElement securePay;
	@FindBy(locator="logoutcheck.conformation.img")
	private QAFWebElement conformation;
	@FindBy(locator="logoutcheck.logout.btn")
	private QAFWebElement logout;
	
	
	public QAFWebElement getUsername() {
		return username;
	}
	public QAFWebElement getPwd() {
		return pwd;
	}
	public QAFWebElement getLogin() {
		return login;
	}
	public QAFWebElement getFindflightCont() {
		return findflightCont;
	}
	public QAFWebElement getSourceFcontinue() {
		return sourceFcontinue;
	}
	public QAFWebElement getSecurePay() {
		return securePay;
	}
	public QAFWebElement getConformation() {
		return conformation;
	}
	public QAFWebElement getLogout() {
		return logout;
	}

	public void verifyLogout()
	{
		String uname=ConfigurationManager.getBundle().getString("test.user.name");
		String pass=ConfigurationManager.getBundle().getString("test.password.pwd");
		getUsername().sendKeys(uname);
		getPwd().sendKeys(pass);
		getLogin().click();		
		Validator.assertTrue(getFindflightCont().isPresent(),"Find Flight Continue link is not Present", "Find Flight Continue link is Present");
		getFindflightCont().click();
		Validator.assertTrue(getSourceFcontinue().isPresent(),"Source Flight Continue link is not Present", "Source Flight Continue link is Present");
		getSourceFcontinue().click();
		Validator.assertTrue(getSecurePay().isPresent(),"Secure Payment page Continue link is not Present", "Secure Payment page Continue link is Present");
		getSecurePay().click();
		Validator.assertTrue(getConformation().isDisplayed(),"Conformation page is not Displayed", "Conformation page is Displayed");
		Validator.assertTrue(getLogout().isPresent(),"Logout link is not Present", "Logout link is Present");
		getLogout().click();
		Validator.assertThat("Logout Success",driver.getTitle(),Matchers.containsString("Sign-on: Mercury Tours"));
		Reporter.log("Logout succesfully");
		
		
	}

	@Override
	protected void openPage(PageLocator arg0, Object... arg1) {
		driver.get("/");
		driver.manage().window().maximize();
		
	}

	}

	
