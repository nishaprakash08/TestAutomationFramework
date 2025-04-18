package com.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.utility.BrowserUtility;

public class LoginPage extends BrowserUtility {
	private static final By EMAIL_TEXTBOX_LOACTOR = By.id("email");
	private static final By PASSOWRD_TEXTBOX_LOACTOR = By.id("passwd");
	private static final By SIGN_IN_BUTTON_LOCATOR = By.id("SubmitLogin");
	
	
	public LoginPage(WebDriver driver) {
		super(driver);
	}

	public MyAccountPage doLoginWith(String emailAddress, String password) {
		enterText(EMAIL_TEXTBOX_LOACTOR, emailAddress);
		enterText(PASSOWRD_TEXTBOX_LOACTOR, password);
		clickOn(SIGN_IN_BUTTON_LOCATOR);
		MyAccountPage myAccountPage = new MyAccountPage(getDriver());
		return myAccountPage;
	}
	
}
