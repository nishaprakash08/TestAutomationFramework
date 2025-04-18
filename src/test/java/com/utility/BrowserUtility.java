package com.utility;

import java.io.File;
import java.io.IOException;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import com.constants.Browser;

import freemarker.template.SimpleDate;

public abstract class BrowserUtility {

	private static ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>();

	public WebDriver getDriver() {
		return driver.get();
	}

	public BrowserUtility(WebDriver driver) {
		super();
		this.driver.set(driver);;
	}
	public BrowserUtility(String browserName) {
		if(browserName.equalsIgnoreCase("Chrome")){
			driver.set(new ChromeDriver());
		}
		else if(browserName.equalsIgnoreCase("Edge")){
			driver.set(new EdgeDriver());;
		}
		else {
			System.err.print("Invalid Broswer Name !!");
		}
	}

	public BrowserUtility(Browser browserName) {
		if(browserName==Browser.CHROME){
			driver.set(new ChromeDriver());
		}
		else if(browserName==Browser.EDGE){
			driver.set(new EdgeDriver());
		}

	}
	public BrowserUtility(Browser browserName, boolean isHeadless) {
		if(browserName==Browser.CHROME){
			if(isHeadless) {
				ChromeOptions options= new ChromeOptions();
				options.addArguments("--Headless=old");
				options.addArguments("--window-size=1920,1080");
				driver.set(new ChromeDriver(options));
			}
		}
		else if(browserName==Browser.EDGE){
			if(isHeadless) {
				EdgeOptions options= new EdgeOptions();
				options.addArguments("--Headless=old");
				options.addArguments("display-gpu");
				driver.set(new EdgeDriver(options));
				}	
			}

	}
	public void goToWebsite(String url) {
		driver.get().get(url);
	}
	public void maximizeWindow() {
		driver.get().manage().window().maximize();
	}	
	public void clickOn(By Locator) {
		WebElement element = driver.get().findElement(Locator);
		element.click();
	}
	public void enterText(By locator, String textToEnter) {
		WebElement element = driver.get().findElement(locator);
		element.sendKeys(textToEnter);
	}

	public String getVisibleText(By Locator) {
		WebElement element = driver.get().findElement(Locator);
		return element.getText();
	}
	public String takeScreenShot(String name) {
		TakesScreenshot screenshot= (TakesScreenshot)driver.get();
		Date date = new Date();
		SimpleDateFormat format = new SimpleDateFormat("HH-mm-ss");	
		String timestamp =format.format(date);
		String path= "./screenshots/"+name+" - "+timestamp+".png";
		//test
		File screenshotData = screenshot.getScreenshotAs(OutputType.FILE);
		File screenshotFile = new File(path);
		try {
			FileUtils.copyFile(screenshotData, screenshotFile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return path;
	}
}
