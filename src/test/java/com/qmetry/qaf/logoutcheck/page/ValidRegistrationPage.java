package com.qmetry.qaf.logoutcheck.page;

import com.qmetry.qaf.automation.ui.WebDriverBaseTestPage;
import com.qmetry.qaf.automation.ui.annotations.FindBy;
import com.qmetry.qaf.automation.ui.api.PageLocator;
import com.qmetry.qaf.automation.ui.api.WebDriverTestPage;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebElement;
import com.qmetry.qaf.databeans.RegistrationFormBean;

public class ValidRegistrationPage extends WebDriverBaseTestPage<WebDriverTestPage> {
	
	@FindBy(locator="form.registration.register.link")
	private QAFWebElement reg_link;
	@FindBy(locator="form.registration.register.first_name")
	private QAFWebElement first_name;
	@FindBy(locator="form.registration.register.last_name")
	private QAFWebElement last_name;
	@FindBy(locator="form.registration.register.phone")
	private QAFWebElement phone;
	@FindBy(locator="form.registration.register.email")
	private QAFWebElement email;
	@FindBy(locator="form.registration.register.address")
	private QAFWebElement address;
	@FindBy(locator="form.registration.register.city")
	private QAFWebElement city;
	@FindBy(locator="form.registration.register.state")
	private QAFWebElement state;
	@FindBy(locator="form.registration.register.postalcode")
	private QAFWebElement postal_code;
	@FindBy(locator="form.registration.register.country")
	private QAFWebElement country;
	@FindBy(locator="form.registration.register.user_name")
	private QAFWebElement user_name;
	@FindBy(locator="form.registration.register.password")
	private QAFWebElement password;
	@FindBy(locator="form.registration.register.conform_pwd")
	private QAFWebElement conform_pwd;
	@FindBy(locator="form.registration.register.register_btn")
	private QAFWebElement register_btn;
	
	
	
	public QAFWebElement getReg_link() {
		return reg_link;
	}
	public QAFWebElement getFirst_name() {
		return first_name;
	}
	public QAFWebElement getLast_name() {
		return last_name;
	}
	public QAFWebElement getPhone() {
		return phone;
	}
	public QAFWebElement getEmail() {
		return email;
	}

	public QAFWebElement getAddress() {
		return address;
	}
	public QAFWebElement getCity() {
		return city;
	}
	public QAFWebElement getState() {
		return state;
	}
	public QAFWebElement getPostal_code() {
		return postal_code;
	}
	public QAFWebElement getCountry() {
		return country;
	}
	public QAFWebElement getUser_name() {
		return user_name;
	}
	public QAFWebElement getPassword() {
		return password;
	}
	public QAFWebElement getConform_pwd() {
		return conform_pwd;
	}
	public QAFWebElement getRegister_btn() {
		return register_btn;
	}



	public void fill_data()
	{
		RegistrationFormBean baseDataBean = new RegistrationFormBean ();
		baseDataBean.fillFromConfig("form.registration.user");
	}



	@Override
	protected void openPage(PageLocator arg0, Object... arg1) {
		driver.get("http://newtours.demoaut.com/");
		
	}

}
