package com.MyntraLoginPage.Runner;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.MyntraLoginPage.baseclass.BaseClass;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="Featurefile",glue="com.MyntraLoginPage.StepDefinition")
public class Runner {
	
	public static WebDriver driver ;

	@BeforeClass
	public static void setUp() throws Throwable {
		driver=BaseClass.openbrowser("chrome");
		
	}
}
