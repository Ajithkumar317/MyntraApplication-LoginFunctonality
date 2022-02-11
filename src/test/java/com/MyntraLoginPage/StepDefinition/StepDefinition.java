package com.MyntraLoginPage.StepDefinition;

import org.openqa.selenium.WebDriver;
import com.MyntraLoginPage.Runner.Runner;
import com.MyntraLoginPage.baseclass.BaseClass;
import com.MyntraLoginPage.baseclass.LoginPagePOM;
import io.cucumber.java.en.*;

public class StepDefinition extends BaseClass {
	public static WebDriver driver=Runner.driver;
	LoginPagePOM lpPOM=new LoginPagePOM(driver);

	@Given("User enters the URL")
	public void user_enters_the_url() {
		driver.get("https://www.myntra.com/login/password?referer=https%3A%2F%2Fwww.myntra.com%2F&show=false");
	}


    @And("user enters the {string} Valid Username.")
	public void user_enters_the_valid_username(String string) {
    	sendkeys(LoginPagePOM.getUsername(), string);
	}

	@When("user enters the {string} Valid Password")
	public void user_enters_the_valid_password(String string) {
		sendkeys(LoginPagePOM.getPasswordfield(), string);
	}
	@When("user click on the login button")
	public void user_click_on_the_login_button() {
		clickelement(LoginPagePOM.getLoginbutton());
		waitClass();
	}
	@Then("User Succesfully login to the Home page")
	public void user_succesfully_login_to_the_home_page() {

	}



}
