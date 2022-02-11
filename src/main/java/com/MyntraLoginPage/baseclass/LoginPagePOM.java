package com.MyntraLoginPage.baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPagePOM {
	public static WebDriver driver;
//	@FindBy(xpath ="https://www.myntra.com/")
//	private static WebElement url;
//	
	@FindBy(xpath ="//span[contains(text(),'Profile')]")
	private static WebElement Profilebutton;
	
//	@FindBy(xpath ="//a[contains(text(),'login / Signup')]")
//	private static WebElement Loginorsignup;
//	
	@FindBy(xpath="//*[@id='mobileNumberPass']")
			
	private static WebElement username;
	
	
//	@FindBy(xpath="//div[contains(text(),'CONTINUE')]")
//	private static WebElement Continuebutton;
//	
//	@FindBy(xpath ="//span[contains(text(),'Password')]")
//	private static WebElement usingpasswordlink;
//	
	@FindBy(xpath ="(//*[@autocomplete='new-password'])[3]")
	private static WebElement passwordfield;
	
	@FindBy(xpath ="//*[@id=\"reactPageContent\"]/div/div/form/div/div[3]/button")
	private static WebElement loginbutton;
//	public LoginPagePOM(WebDriver driver) {
////		this.driver=driver;
	
	
//	}
	@FindBy(xpath="//*[@id=\"desktop-header-cnt\"]/div[2]/div[3]/input")
	private static WebElement searchproductbar;
	public LoginPagePOM(WebDriver driver4) {
		LoginPagePOM.driver=driver4;
		PageFactory.initElements(driver4, this);
	}

//	public static WebElement getUrl() {
//		return url;
//	}
//
	public static WebElement getProfilebutton() {
		return Profilebutton;
	}
	public static WebElement getsearchproductbar() {
		return searchproductbar;
		}

//
//	public static WebElement getLoginorsignup() {
//		return Loginorsignup;
//	}

	public static WebElement getUsername() {
		return username;
	}

//	public static WebElement getContinuebutton() {
//		return Continuebutton;
//	}
//
//	public static WebElement getUsingpasswordlink() {
//		return usingpasswordlink;
//	}

	public static WebElement getPasswordfield() {
		return passwordfield;
	}

	public static WebElement getLoginbutton() {
		return loginbutton;
	}
//	

}
