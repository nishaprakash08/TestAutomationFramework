package com.ui.tests;

import static com.constants.Browser.*;

import static org.testng.Assert.*;

import org.apache.logging.log4j.Logger;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.ui.pages.HomePage;
import com.ui.pojo.User;
import com.utility.LoggerUtility;

@Listeners(com.ui.listeners.TestListeners.class)
public class LoginTest extends TestBase{

	Logger logger= LoggerUtility.getLogger(this.getClass());
	
	@Test(description ="Verify the valid user", groups= {"e2","sanity"},dataProviderClass = com.ui.dataproviders.LoginDataProvider.class,
			dataProvider = "LoginTestDataProvider",retryAnalyzer = com.ui.listeners.MyRetryAnalyzer.class)
	public void login (User user) {
		assertEquals(homePage.goToLoginPage().doLoginWith(user.getEmailAddress(), user.getPassword())
				.getUserName(), "Nisha PRAKASH");	
	}

	@Test(description ="Verify the valid user", groups= {"e2","sanity"},dataProviderClass = com.ui.dataproviders.LoginDataProvider.class,
			dataProvider = "LoginTestCSVDataProvider")
	public void loginCSVTest (User user) {
		assertEquals(homePage.goToLoginPage().doLoginWith(user.getEmailAddress(), user.getPassword())
				.getUserName(), "Nisha PRAKASH");	
	}
	@Test(description ="Verify the valid user", groups= {"e2","sanity"},dataProviderClass = com.ui.dataproviders.LoginDataProvider.class,
			dataProvider = "LoginTestExcelDataProvider")
	public void loginExcelTest (User user) {
		
		assertEquals(homePage.goToLoginPage().doLoginWith(user.getEmailAddress(), user.getPassword())
				.getUserName(), "Nisha PRAKASH1");
	}
}
